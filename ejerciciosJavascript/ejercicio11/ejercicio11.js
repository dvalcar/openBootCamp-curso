class Estudiante{
    nombre;
    asignaturas=["HTML", "CSS", "Javascript"];
    constructor(nombre){
        this.nombre=nombre;
    };
    obtenDatos(){
        return {
            nombre:this.nombre,
            asignaturas:this.asignaturas
        };
    };
};

const alumno=new Estudiante("Pepe");
console.log(alumno.obtenDatos());