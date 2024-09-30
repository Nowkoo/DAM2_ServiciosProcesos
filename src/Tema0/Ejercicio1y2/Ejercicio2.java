package Tema0.Ejercicio1y2;

public class Ejercicio2 {
    public static void main(String[] args) {
        PersonaConEdad personaConEdad = new PersonaConEdad("Pepito", 50);
        System.out.printf("Me llamo %s y tengo %d años", personaConEdad.getNombre(), personaConEdad.getEdad());
    }
}
