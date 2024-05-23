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
    }
}