const nombre = "David";
const apellido = "Valcarcel";

const datos = {
    nombre,
    apellido,
};
//Si definimos lo que viene ahora comentado, cerramos el navegador y lo volvemos a comentar estará persistente
//menos el sessionStorage
//localStorage.setItem("yo-local", JSON.stringify(datos))
//sessionStorage.setItem("yo-session", JSON.stringify(datos))
const ahora = new Date();
//document.cookie = `yo-cookie=${JSON.stringify(datos)};expires=${new Date(ahora.getTime() + 2 * 60000)}`
