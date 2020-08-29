# Taller de Arquitecturas de Servidores de Aplicaciones, Meta protocolos de objetos, Patrón IoC, Reflexión

## Descripción

Para este taller los estudiantes deberán construir un servidor Web (tipo Apache) en Java. El servidor debe ser capaz de entregar páginas html e imágenes tipo PNG. Igualmente el servidor debe proveer un framework IoC para la construcción de aplicaciones web a partir de POJOS. Usando el servidor se debe construir una aplicación Web de ejemplo y desplegarlo en Heroku. El servidor debe atender múltiples solicitudes no concurrentes.

Para este taller desarrolle un prototipo mínimo que demuestre capcidades reflexivas de JAVA y permita por lo menos cargar un bean (POJO) y derivar una aplicación Web a partir de él. Debe entregar su trabajo al final del laboratorio.


### Prerrequisitos
+ Java 8 SE JDK 
+ Maven
+ Git

### Instalación
Primero debemos clonar este repositorio con el siguiente comando:

`````
git clone https://github.com/D4v0r/AREP-Taller-Anotaciones-Reflexion
`````

Ahora debemos dirigirnos al directorio donde fue clonado el respositorio ejecutar una consola de comandos y compilar el proyecto con el siguiente comando:

````
mvn package
````

### Automatización

Integración continua usando la tecnología de CircleCi:

[![CircleCI](https://circleci.com/gh/D4v0r/AREP-Taller-Anotaciones-Reflexion.svg?style=svg)](https://circleci.com/gh/D4v0r/AREP-Taller-Anotaciones-Reflexion)


### Despliegue

La aplicación web se encuentra desplegada en Heroku:

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://fathomless-sea-17853.herokuapp.com/Apps/hola)


## Autor

>Davor Javier Cortés Cardozo
>
>Estudiante de la Escuela Colombiana de Ingeniería Julio Garavito


## Licencia

Este proyecto está licenciado bajo la GNU General Public License v3.0, para más información ver la [LICENCIA](LICENSE.txt).



