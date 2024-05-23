//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Mi equipo es el club deportivo nacional
public class EquipoFavorito {
    String nombre;
    String color;
    int años;

    public EquipoFavorito(String nombre, String color, int años){
        this.nombre = nombre;
        this.color = color;
        this.años = años;
    }
    public void mostrarInfo(){
        System.out.println("Equipo favorito");
        System.out.println("Nombre: " + nombre);
        System.out.println("Color del uniforme: " + color);
        System.out.println("Años de Fundacion: " + años);
    }
}