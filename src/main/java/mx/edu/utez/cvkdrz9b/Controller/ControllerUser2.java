package mx.edu.utez.cvkdrz9b.Controller;

public class ControllerUser2 {
    public void saludar() {
        System.out.println("¡Hola! Este es el controlador de User2.");
    }

    public void mostrarInformacion() {
        System.out.println("User2 administra el módulo de reportes del sistema.");
    }

    public static void main(String[] args) {
        ControllerUser2 controlador = new ControllerUser2();
        controlador.saludar();
        controlador.mostrarInformacion();
    }
}
