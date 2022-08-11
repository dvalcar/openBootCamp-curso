const datosPersonales = {
    nombre: "David",
    apellido: "Valcarcel",
    edad: 40,
    altura: 183,
    eresDesarrollador: true
};

const edad = datosPersonales.edad;
const lista_datos_personales = [
    {
        ...datosPersonales
    },{
        nombre: "Isaac",
        apellido: "Andres",
        edad: 41,
        altura: 179,
        eresDesarrollador: true
    },{
        nombre: "Pilar",
        apellido: "Santamaria",
        edad: 40,
        altura: 169,
        eresDesarrollador: true
    }
];

const listaOrdenada = lista_datos_personales.sort((a, b) => b.edad - a.edad);

console.log(listaOrdenada)