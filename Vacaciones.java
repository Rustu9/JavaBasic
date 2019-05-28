import java.util.Scanner;

public class Vacaciones{
  public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   String nombre = "";
   int clave = 0;
   int antiguedad = 0;

   System.out.println("*******************************************************");
   System.out.println("*Bienvenido al sistema vacacional de Coca-Cola Company*");
   System.out.println("*******************************************************");
   System.out.println("");
   System.out.println("");

   nombre = in.nextLine();

   System.out.println("¿Cuál es el nombre del trabajador?: ");
   nombre = in.nextLine();
   System.out.println("");

   System.out.println("¿Cuantos años de servicio tiene el trabajador?: ");
   antiguedad = in.nextInt();
   System.out.println("");

   System.out.println("¿Cuál es la clave de su departamento?: ");
   clave = in.nextInt();
   System.out.println("");

   if(clave == 1){
   System.out.println("De acuerdo a tu clave perteneces al departamento de Atención al Ciente");

      if(antiguedad == 1){
      System.out.println("El trabajador " + nombre + " tiene derecho a 6 días"); 
      }else if(antiguedad >= 2 && antiguedad <=6){
      System.out.println("El trabajador " + nombre + "  tiene derecho a 14 días");
      }else if(antiguedad >= 7){
      System.out.println("El trabajador " + nombre + " tiene derecho a 21 días");
      }
        }else if(clave == 2){
        System.out.println("De acuerdo a tu clave perteneces al departamento de Logistica");

          if(antiguedad == 1){
          System.out.println("El trabajador " + nombre + "  tiene derecho a 7 días"); 
          }if(antiguedad >= 2 && antiguedad <=6){
          System.out.println("El trabajador " + nombre + "  tiene derecho a 15 días");
          }if(antiguedad >= 7){
          System.out.println("El trabajador " + nombre + " tiene derecho a 22 días");
      }

        }else if(clave == 3){
        System.out.println("De acuerdo a tu clave perteneces a la Gerencia");

           if(antiguedad == 1){
           System.out.println("El trabajador " + nombre + "  tiene derecho a 10 días"); 
           }if(antiguedad >= 2 && antiguedad <=6){
           System.out.println("El trabajador " + nombre + "  tiene derecho a 20 días");
           }if(antiguedad >= 7){
           System.out.println("El trabajador " + nombre + " tiene derecho a 30 días");
           }
  
     }else{
     System.out.println("La clave de departamento no es valida");
     }

     System.out.println("Gracias por usar el sistema de vacaciones empresarial, \nDisfruta tus      vacaciones.");
 }
}