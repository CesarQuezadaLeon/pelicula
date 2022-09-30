## API REST de peliculas
1. Se creo la clase entidad con los valores de la base de datos.
2. Se creo la interfaz de repositorio
3. Se creo el controlador de peliculas

## API

para acceder a la api se manejo la siguiete ruta

http://localhost:8080/api/pelicula/ 

cada metodo con sus respectivas indicaciones para que no colisionaran entre ellos

## Controlador

El controlador tiene los siguientes metodos

1. Mostrar Datos
   1. Este metodo devuelve el resgistro de la base de datos
   2. Adicional se puede buscar el registro indicando el id correspondiente
2. Guardar Datos
   1. Permite guardar los datos omitiendo el ID ya que este se genera de manera automatica y serial
3. Actualizar Datos
   1. Permite actualizar por medio del id un registro
4. Elimiar Datos
   1. Permite elimiar por medio de id

## comprobación

Las comprobaciones se realizaron por medio de postman, se anexara un archivo con el nombre de
Peliculas.postman_collection.json.

## Script de Base de Datos

El escript se ecuentra dentro de la capeta del proyecto
