
const boton = document.querySelector("button")

boton.addEventListener("click", () => alert("click en el botón"))


//Hasta que no cerramos la alerta no se sigue ejecutando el resto de codigo
$("button").click(function() {
    console.log("Hola, estoy utilizando jQuery")
})