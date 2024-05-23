//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Mi equipo es el club deportivo nacional
public class Padre {
    String nombre;
    String apellido;
    int edad;

    public Padre(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido );
        System.out.println("Edad: " + edad );
    }
}
class Hijo extends Padre{
    int cedula;
    double tamaño;

    public Hijo(String nombre, String apellido, int edad, int cedula, double tamaño){
        super(nombre, apellido, edad);
        this.cedula = cedula;
        this.tamaño = tamaño;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Informacion Hijo");
        super.mostrarInfo();
        System.out.println("Cedula: " + cedula);
        System.out.println("Tamaño:" + tamaño);
    }
}
class Nieto extends Hijo{
    double peso;
    String titulo;
    double sueldo;

    public Nieto(String nombre, String apellido, int edad,
                 int cedula, double tamaño, double peso, String titulo, double sueldo){
        super(nombre, apellido, edad, cedula, tamaño);
        this.peso = peso;
        this.titulo = titulo;
        this.sueldo = sueldo;
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Informacion Nieto");
        super.mostrarInfo();
        System.out.println("Peso: " + peso);
        System.out.println("Titulo: " + titulo);
        System.out.println("Sueldo: " + sueldo);
    }
}