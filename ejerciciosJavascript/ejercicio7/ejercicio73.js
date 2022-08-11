const hoy = new Date();

const nacimiento = new Date(1981, 4, 27);

const masTarde = hoy > nacimiento;

const diaNacimiento = nacimiento.getDate();
const mesNacimiento = nacimiento.getMonth() + 1;
const anyoNacimiento = nacimiento.getFullYear();