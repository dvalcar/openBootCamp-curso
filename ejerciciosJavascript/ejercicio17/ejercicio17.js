let marker, map;

function initMap() {
    // console.log("Inicializando mapa")
    const posicion = {
        lat: -25.363,
        lng: 131.044,
    };

    map = new google.maps.Map(document.getElementById("map"), {
        zoom: 4,
        center: posicion,
    });

    marker = new google.maps.Marker({
        position: posicion,
        map,
        title: "Posición Inicial",
    });
    // Obtener la geolocalización
    // marker.setPosition({ lat, lng })
    geoPosiciona();
    addMarcas();
}

function geoPosiciona() {
    if (navigator.geolocation) {
        const geoLoc = navigator.geolocation;
        const options = { timeout: 60000 };
        const watchPos = geoLoc.watchPosition(centraMapa, onError, options);
    } else {
        alert("Tu navegador no admite geolocalización");
    }
}

function centraMapa(position) {
    const nuevaPos = {
        lat: position.coords.latitude,
        lng: position.coords.longitude,
    };
    marker.setPosition(nuevaPos);
    map.setCenter(nuevaPos);
}

function onError(error) {
    console.log("Se ha producido un error y lo hemos gestionado");
    console.error(error);
}
function addMarcas() {
    const marca2 = {
        lat: 40.41954,
        lng: -3.6918,
    };
    marker2 = new google.maps.Marker({
        position: marca2,
        map,
        title: "Madrid",
    });
    const marca3 = {
        lat: 40.403755,
        lng: -3.843866,
    };
    marker3 = new google.maps.Marker({
        position: marca3,
        map,
        title: "Pilar",
    });
}
