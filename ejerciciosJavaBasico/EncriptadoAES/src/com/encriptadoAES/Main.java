package com.encriptadoAES;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("/etc/passwd");
            //Convertir a String
            byte[] datosIn = in.readAllBytes();
            final String clave = "secret!";
            String originalData = new String(datosIn);

            EncriptadorAES aes = new EncriptadorAES();

            String crypt = aes.encriptar(originalData, clave);
            in.close();

            //Desencriptado
            InputStream inEncriptado = new FileInputStream("cifrado.dat");
            //Convertir a String
            byte[] datosInEncriptado = inEncriptado.readAllBytes();
            String cryptData = new String(datosInEncriptado);

            String decrypt = aes.desencriptar(cryptData, clave);
            inEncriptado.close();

            System.out.println("Cadena Original: " + originalData);
            System.out.println("Encriptado     : " + crypt);
            System.out.println("Desencriptado  : " + decrypt);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException |
                 NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException e) {
            Logger.getLogger(EncriptadorAES.class.getName()).log(Level.SEVERE, null, e);
        } catch (InvalidKeyException e) {
            System.out.println("Invalid key: " + e.getMessage());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
