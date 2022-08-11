from django.shortcuts import render
from django.views import generic
from .models import Pelicula, Director
from django.utils import timezone

#Esto sólo funciona si en urls.py ponemos el otro re_path
def index(request):
    num_directores=Director.objects.all().count()
    num_peliculas=Pelicula.objects.all().count()

    return render(
        request,
        'index.html',
        context={
            'num_directores':num_directores,
            'num_peliculas':num_peliculas,

        }
    )

#Para que funcione el listado
class IndexView(generic.ListView):
    template_name = 'index.html'
    model = Director

class DirectorView(generic.DetailView):
    template_name = 'director.html'
    model = Director

class PeliculaView(generic.DetailView):
    template_name = 'pelicula.html'
    model = Pelicula

class PeliculasView(generic.ListView):
    template_name = 'peliculas.html'
    model = Pelicula
