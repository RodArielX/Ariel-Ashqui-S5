public class Main {
    public static void main(String[] args){
        Padre padre = new Padre("Edwin","Asqui",43);
        padre.mostrarInfo();
        Hijo hijo = new Hijo("Ariel","Ashqui",21, 1751086628,1.78);
        hijo.mostrarInfo();
    }
}
