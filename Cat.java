public class Cat{

   String name;
   String color;

   public String talk() {
   		return "miau";
   }


   public void eat(String food){
                System.out.println("El gato come: " + food);
   }

   public String toString(){
                return "El gato se llama: " + name + " y es de color: " + color;

   }

   public static void main(String[] args){
          Cat rayo = new Cat();
          //Asignar valores a variables
          rayo.name = args[0];
          rayo.color = args[1];
          //Imprimir los atributos de rayo
          System.out.println(rayo.talk());
          System.out.println(rayo.toString());
          rayo.eat("Pescado");
}
}