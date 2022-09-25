package com.encriptadoAES;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * Clase para encriptar un fichero siguiendo protocolo AES
 *
 * @author DValcar
 * TODO: PODER PREGUNTAR EL TIPO DE CODIFICACION QUE SE VA A USAR COMO SHA U OTRA
 */

public class EncriptadorAES {

    // Generamos una clave de 128 bits adecuada para AES
    //EN PRINCIPIO NO LO USAMOS
//        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
//        keyGenerator.init(128);
//        Key key = keyGenerator.generateKey();

    // Alternativamente, una clave que queramos que tenga al menos 16 bytes
    // y nos quedamos con los bytes 0 a 15.
    //EN PRINCIPIO USAMOS ESTE PUESTO QUE SINO TENDRÍAMOS UN FICHERO POR CADA CONVERSION Y NOS TENDREMOS
    //QUE ACORDAR
    private SecretKeySpec crearClave(String clave) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        byte[] claveEncriptacion = clave.getBytes("UTF-8");

        MessageDigest sha = MessageDigest.getInstance("SHA-1");

        claveEncriptacion = sha.digest(claveEncriptacion);

        return new SecretKeySpec(claveEncriptacion, 0, 16, "AES");
    }

    // Texto a encriptar
    //TODO:ESTO SE SUSTITUYE POR UN FICHERO DEL QUE COMO EVOLUCION TENEMOS QUE PREGUNTAR LA RUTA
    public String encriptar(String datos, String claveSecreta) throws
            IOException, NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException,
            IllegalBlockSizeException, BadPaddingException {
        SecretKeySpec secretKey = this.crearClave(claveSecreta);

        // Se obtiene un cifrador AES
        Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");

        // Se inicializa para encriptacion y se encripta el texto,
        // que debemos pasar como bytes.
        //TODO:INIT LANZA UN THROW
        aes.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] bytesEncriptados = aes.doFinal(datos.getBytes("UTF-8"));

        String encriptado = Base64.getEncoder().encodeToString(bytesEncriptados);

        /* Output stream for encrypted file */
        PrintStream ps = new PrintStream("cifrado.dat");
        ps.write(encriptado.getBytes("UTF-8"));
        ps.close();
        return encriptado;
    }

    public String desencriptar(String datosEncriptados, String claveSecreta) throws UnsupportedEncodingException,
            NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException,
            BadPaddingException {
        SecretKeySpec secretKey = this.crearClave(claveSecreta);
        // Se iniciliza el cifrador para desencriptar, con la
        // misma clave y se desencripta
        Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
        aes.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] bytesEncriptados = Base64.getDecoder().decode(datosEncriptados);
        byte[] datosDesencriptados = aes.doFinal(bytesEncriptados);
        String datos = new String(datosDesencriptados);

        return datos;
    }
}