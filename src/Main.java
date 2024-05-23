public class Main {
    public static void main(String[] args){
        Padre padre = new Padre("Edwin","Asqui",43);
        padre.mostrarInfo();
        Hijo hijo = new Hijo("Ariel","Asqui",21, 1751086628,1.78);
        hijo.mostrarInfo();
        Nieto nieto = new Nieto("Dereck","Asqui", 26,16463623,1.75
                ,75.6,"DJ", 1000);
        nieto.mostrarInfo();
    }
}
