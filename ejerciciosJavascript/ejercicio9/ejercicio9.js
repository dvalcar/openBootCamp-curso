const logger=require('./logger')

function mostrarError() {
    throw new Error("Error personalizado")
}

try{
    mostrarError();
}catch (e){
    logger.error(`ERROR ${e.toString()}`)
}