
package practica3;
import java.io.*;
public class Clase2 {
        public int dia;
        public double numeros;
    public static int dia( int ingresar){
        
        int num =ingresar;

         switch(num){
    case 1 -> System.out.println("lunes es un dia laboral");
    case 2 -> System.out.println("martes es un dia laboral");
    case 3 -> System.out.println("miercoles es un dia laboral");
    case 4 -> System.out.println("jueveses un dia laboral");
    case 5 -> System.out.println("viernes es un dia laboral");
    case 6 -> System.out.println("sabado no es un dia laboral");
    case 7 -> System.out.println("domingo no es un dia laboral");
    default -> System.out.println("ingreso otro numer0");
  }
  
        return num;
    }
    
public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double csumin;
		double csumpar;
		double n;
		double s;
		double suma;
		double sumar;
		System.out.println("bienvenidos");
		System.out.println("determine cuantos de sus numeros son pares");
		sumar = 0;
		suma = 0;
		csumin = 0;
		csumpar = 0;
		for (s=1;s<=10;s++) {
			System.out.println("ingrese numero "+s+"");
			n = Double.parseDouble(bufEntrada.readLine());
			if (n%2==0) {
				csumpar = csumpar+1;
				sumar = sumar+n;
			} else {
				csumin = csumin+1;
				suma = suma+n;
			}
		}
}
}
    

  