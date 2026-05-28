

public class Gato extends Mamifero {
   public double alturaSalto;

   public Gato(String nombre, String raza, String fechaNacimiento, float peso, double alturaSalto) {
      super(nombre, raza, fechaNacimiento, peso);
      this.nombre = nombre;
      this.alturaSalto = alturaSalto;
   }

   public void comer() {
      System.out.println("El gato esta comiendo");
   }

   public void comunicarse() {
      System.out.println("Meow meowwww");
   }
}
