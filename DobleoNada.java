
public class DobleoNada {

	public static void main(String[] args) {
		/* Este es un programa para jugar al doble o nada: El usuario apuesta una cantidad
		 * y el programa le devuelve el doble de lo apostado o pierde toda la cantidad que
		 * apostó. El usuario puede decidir entonces si dejar de jugar o seguir apostando.
		 * Si decide seguir jugando, en las siguientes jugadas irá acumulando todo el dinero 
		 * que gane o pierda y al final de la partida el programa le mostrará cuánto dinero 
		 * ha ganado (o perdido) y el número de veces que ha jugado.*/
		
		int cantidad;
		int moneda;
		int premio;
		int seguirjugando;
		int contador=0;
		int premiototal=0;
		do{
			cantidad=PedirDatos.leerEntero("Apueste una cantidad.");
			premio=cantidad*2;
			moneda=(int)(Math.random()*2);
			if(moneda==0){
				System.out.println("Cara: Enhorabuena, ha doblado su dinero: "+premio);
				contador++;
				premiototal=premiototal+premio;
			}else{
			System.out.println("Cruz: Lo sentimos, lo ha perdido todo.");
			contador++;
			premiototal=premiototal-cantidad;
			}
			seguirjugando=PedirDatos.leerEntero("Escriba 1 si desea seguir jugando o cualquier otro número para salir.");
		}while(seguirjugando==1);
		System.out.println("En total ha ganado: "+premiototal+" €. Ha jugado "+contador+" veces.");
	
	}
	
}
