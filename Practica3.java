/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;

import java.util.Scanner;

public class Practica3 {
     static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
	static int select = -1; //opción elegida del usuario
	static int num1 = 0, num2 = 0; //Variables
    private static double numero;
    
    public static void main(String[] args) {
		//Mientras la opción elegida sea 0, preguntamos al usuario
		while(select != 0){
			//Try catch para evitar que el programa termine si hay un error
			try{
				System.out.println("""
                                  Elige opcion de la Clase 1:
                                  1- Factorial
                                  2- Taba de Multiplicacion
                                  Elige opcion de la Clase 2:
                                  3- 10 Digitos
                                  4- Dia de Semana""");
				//Recoger una variable por consola
				select = Integer.parseInt(scanner.nextLine()); 
	
				//Ejemplo de switch case en Java
				switch(select){
				case 1 -> {
                                    ingresar();
                                    System.out.println( Clase1.factorial(num1));
                                }
				case 2 -> {
                                    ingresar();
                                    System.out.println(Clase1.tabla(num1));
                                }
				
                                case 4 -> {
                                    ingresar();
                                    System.out.println(Clase2.dia(num1));
                                }
				
				}
				
				System.out.println("\n");
				
			}catch(NumberFormatException e){
				System.out.println("Error");
			}
		}

	}
	
	//Método para recoger variables por consola
	public static void ingresar(){
		System.out.println("Introduce el Primer digito:");
		num1 = Integer.parseInt(scanner.nextLine());
		

		//Mostrar un salto de línea en Java
		System.out.println("\n");
    }
	 
    }
    

