import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RuletaRusa juego = new RuletaRusa();
        Scanner scanner = new Scanner(System.in);
        boolean juegoTerminado = false;

        System.out.println("¡Bienvenido a la Ruleta Rusa!");

        while (true) {
            juegoTerminado = false;
            while (!juegoTerminado) {
                System.out.println("¿Listo para disparar? (s/n)");
                String respuesta = scanner.nextLine();

                if (respuesta.equalsIgnoreCase("s")) {
                    if (juego.disparar()) {
                        System.out.println("Has perdido.");
                        juegoTerminado = true;
                    } else {
                        System.out.println("Sobreviviste.");
                    }
                } else if (respuesta.equalsIgnoreCase("n")) {
                    System.out.println("Cobarde");
                    juegoTerminado = true;
                } else {
                    System.out.println("Respuesta inválida. Intenta de nuevo.");
                }
            }

            System.out.println("¿Quieres jugar otra vez? (s/n)");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("s")) {
                juego.reiniciarJuego();
                System.out.println("Nuevo juego iniciado.");
            } else {
                System.out.println("¡Gracias por jugar!");
                break; // Sale del bucle principal y termina el programa
            }
        }

        scanner.close();
    }
}