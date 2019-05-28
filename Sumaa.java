import java.util.Scanner;

public class Sumaa{
  public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   String nombre = "";
   int num_uno = 0, num_dos = 0, resultado = 0;

   System.out.println("¿Cuál es tu nombre?");
   nombre = in.nextLine();

   System.out.println("Ingresa el primer valor para tu suma:");
   num_uno = in.nextInt();

   System.out.println("Ingresa el segundo valor para tu suma:");
   num_dos = in.nextInt();

   resultado = num_uno + num_dos;
   System.out.println("Hola " + nombre + " El resultados de tu suma es: " + resultado);

 }
}