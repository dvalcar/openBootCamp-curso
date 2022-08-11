from django.db import models


class Pelicula(models.Model):
    titulo = models.CharField(max_length=128)
    fecha_filmada = models.DateField(null=True, blank=True)
    descripcion = models.TextField(max_length=255)

    def __str__(self):
        return self.titulo


class Director(models.Model):
    nombre = models.CharField(max_length=64)
    fecha_nacimiento = models.DateField(null=True, blank=True)
    fecha_muerte = models.DateField(null=True, blank=True)
    peliculas = models.ManyToManyField(Pelicula)

    def __str__(self):
        return self.nombre


