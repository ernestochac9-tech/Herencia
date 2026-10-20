public class Test {
    public static void main(String[] args) {
        Alumno a = new Alumno();
        Profesor p = new Profesor(10000000);
        System.out.println(a);
        System.out.println(p);
    }
}

class Persona {
    protected String nombre;
    protected int edad;

    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }
}

class Alumno extends Persona {
    public Alumno() {
        System.out.println("Se crea Alumno...");
    }

    @Override
    public String toString() {
        return "Un alumno llamado: " + nombre;
    }
}

class Profesor extends Persona {
    private int numEmpleado;

    public Profesor(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    @Override
    public String toString() {
        return "Un profesor de edad " + edad + ", con clave " + numEmpleado;
    }
}