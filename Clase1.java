
package practica3;

public class Clase1 {
    public int factorial;
    public int tabla;
    
    public static int factorial(  int ingresar ) {
      int fact = 1;
      for( int i = 1; i <= ingresar; i++ ) {
         fact *= i;
      }
 
      return fact;
      
}
    public static int tabla (int ingresar) {
        int tap =ingresar;
        for(int i = 1; i<=10; i++){
          System.out.println(tap + " * " + i + " = " + tap*i); 
        }
        return tap;
}
}
 
  
