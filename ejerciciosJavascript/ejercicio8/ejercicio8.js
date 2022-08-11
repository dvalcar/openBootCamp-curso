function funcionTrue(){
    return true;
};

async function iniciarPromesa() {
    return setTimeout(() => console.log("Hola soy una promesa"), 5000);
};

function* generaIdPar(){
    let id=-2;
    while(true){
        yield id+=2;
    }
};
