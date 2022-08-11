const listaCompra = ["huevos", "pan", "agua", "vino", "leche"];
listaCompra.push("Aceite de girasol");
listaCompra.pop();

const peliculas = [
    {
        titulo: "Matrix",
        director: "Hermanos Watchoski",
        anio: new Date(2000, 6, 15)
    },
    {
        titulo:"La naranja mecanica",
        director:"Stanley Kubrick",
        anio: new Date(1971, 11, 19)
    },
    {
        titulo:"Los vengadores endgame",
        director:"Joe Russo",
        anio: new Date(2019, 3, 22)
    }
];
const nuevas=peliculas.filter(film=>film.anio>=new Date(2010,0,1));
const directores=peliculas.map(pelicula=>pelicula.director);
const titulos=peliculas.map(peli=>peli.titulo);

const director_pelicula=directores.concat(titulos);
const director_pelicula_fp=[...directores,...titulos];


