public class Ejercicio_Part_3 {
   public static void main(String[] args) {
      Perro perro1 = new Perro("Saurus", "Bulldog", "10/02/2020", 25.5F, "Centro especial para caninos");
      Gato gato1 = new Gato("Kitty", "Siames", "05/01/2022", 4.2F, (double)4.5F);
      System.out.println("El nombre de este perro es: " + perro1.nombre);
      System.out.println("Su raza es: " + perro1.raza);
      System.out.println("Nacio el: " + perro1.fechaNacimiento);
      System.out.println(perro1.nombre + " pesa " + perro1.peso + " kg ");
      System.out.println(perro1.nombre + " fue entrenado en " + perro1.lugarEntrenamiento);
      perro1.comer();
      perro1.comunicarse();
      System.out.println("El nombre de mi gato es: " + gato1.nombre);
      System.out.println("Su raza es: " + gato1.raza);
      System.out.println("Nacio el: " + gato1.fechaNacimiento);
      System.out.println(gato1.nombre + " pesa " + gato1.peso + " kg ");
      System.out.println(gato1.nombre + " ha logrado saltar a una altura de: " + gato1.alturaSalto + " metros");
      gato1.comer();
      gato1.comunicarse();
   }
}
