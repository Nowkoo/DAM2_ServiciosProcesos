package Tema0.Ejercicio1y2;

public class PersonaConEdad extends Persona {
    private int edad;

    public PersonaConEdad(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
