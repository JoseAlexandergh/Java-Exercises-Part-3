

public class Perro extends Mamifero {
   public String lugarEntrenamiento;

   public Perro(String nombre, String raza, String fechaNacimiento, float peso, String lugarEntrenamiento) {
      super(nombre, raza, fechaNacimiento, peso);
      this.nombre = nombre;
      this.lugarEntrenamiento = lugarEntrenamiento;
   }

   public void comunicarse() {
      System.out.println("Guau guau");
   }

   public void comer() {
      System.out.println("El perro esta comiendo");
   }
}
