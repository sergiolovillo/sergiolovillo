import java.io.*;
public class DobleoNada {

	public static void main(String[] args) throws IOException {
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		
		int cantidad=0;
		int moneda;
		int premio;
		int seguirjugando=0;
		int contador=0;
		int premiototal=0;
		do{
			boolean seguir=true;
			do {
				try {
					System.out.println("Apueste una cantidad.");
					cantidad=Integer.parseInt(teclado.readLine());
					seguir=false;
				} catch (NumberFormatException e) {
					System.out.println("Debe introducir un número.");
				}	
			} while (seguir);
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
			seguir=true;
			do {
				try {
					System.out.println("Escriba 1 si desea seguir jugando o cualquier otro caracter para salir.");
					seguirjugando=Integer.parseInt(teclado.readLine());
					seguir=false;
				} catch (NumberFormatException e) {
					System.out.println("Debe introducir un número.");
				}	
			} while (seguir);
		}while(seguirjugando==1);
		System.out.println("En total ha ganado: "+premiototal+" €. Ha jugado "+contador+" veces.");
	}

}