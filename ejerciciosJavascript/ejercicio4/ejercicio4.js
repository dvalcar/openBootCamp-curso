const nombre = "David";
const apellido = "Valcarcel";
const estudiante = nombre.concat(" ", apellido);

const estudianteMayus = estudiante.toUpperCase();
const estudianteMinus = estudiante.toLowerCase();

const tamanio = estudiante.length;

const inicial = nombre[0];

const final = apellido[apellido.length - 1];

const estudianteSinEspacios = estudiante.replace(/ /g, "");

const contieneNombre = estudiante.includes(nombre);