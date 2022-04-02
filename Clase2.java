
package practica3;

import static practica3.Practica3.ingresar;

public class Clase2 {
        public int dia;
    public static int dia( int ingresar){
     
        System.out.println("""
             Dime un número que día de la semana quieres revisar:
              Lunes = 1\nMartes = 2\nMiércoles = 3\nJueves = 4\nViernes = 5\nSábado = 6\nDomingo = 7""");
        int num =ingresar;

        if (num >= 1 && num <= 5) {
           System.out.println("Es día laboral.");
        } else if (num <= 7) {
           System.out.println("Es fin de semana.");
        } else {
           System.out.println("Error");
        }
        return num;
    }
}
    

