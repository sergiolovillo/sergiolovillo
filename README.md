Este repositorio incluye una clase java para jugar al doble o nada: El usuario apuesta una cantidad y el programa le devuelve el doble de lo apostado o pierde toda la cantidad que apostó. El usuario puede decidir entonces si dejar de jugar o seguir apostando. Si decide seguir jugando, en las siguientes jugadas irá acumulando todo el dinero que gane o pierda y al final de la partida el programa le mostrará cuánto dinero ha ganado (o perdido) y el número de veces que ha jugado.

Ejecución en consola:
- Primero tenemos que tener instalados maven y java.
- Debemos hacer un git clone en el directorio donde está el pom.xml.
- Desde aquí utilizamos el comando "mvn package" para construitr el proyecto.
- Una vez construido procederemos a ejecutarlo con el siguiente comando: java -cp target/1Practica2Trimestre-0.0.1-SNAPSHOT.jar DobleoNada.
