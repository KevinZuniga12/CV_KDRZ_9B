package mx.edu.utez.cvkdrz9b.Controller;

public class ControllerUser1 {
//saludar y mostrar información para el usuario 1
    public void saludar() {
        System.out.println("¡Hola! Soy el controlador de User1.");
    }

    public void mostrarInformacion() {
        System.out.println("User1 tiene acceso al módulo de gestión de usuarios.");
    }

    public static void main(String[] args) {
        ControllerUser1 controlador = new ControllerUser1();
        controlador.saludar();
        controlador.mostrarInformacion();
    }
}
