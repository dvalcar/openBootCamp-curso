function fibo(num) {
    var fibonacci = [0,1];
    if (num<=0) return "El número debe ser mayor que 0"
    if(num===1) return [0];
    if(num===2) return [0, 1];
    for (var i = 2; i < num; i++) {
        fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
    }
    return fibonacci;
}
let resultado=fibo(3);
console.log(resultado);
