from django.urls import re_path, path
from . import views


urlpatterns=[
    #re_path(r'^$', views.index, name='index')
    path('directores', views.IndexView.as_view(), name='index'),
    path('directores/<pk>', views.DirectorView.as_view(), name='detalle_director'),
    path('directores/pelicula/<pk>', views.PeliculaView.as_view(), name='detalle_pelicula'),
    path('peliculas', views.PeliculasView.as_view(), name='listado_peliculas'),
]