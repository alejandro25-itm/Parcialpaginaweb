import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PilaNavegador navegador = new PilaNavegador();

        int opcion = -1;

        while (opcion != 0) {

            System.out.println("\n--- MENU NAVEGADOR ---");
            System.out.println("1. Visitar nueva página");
            System.out.println("2. Retroceder");
            System.out.println("3. Mostrar historial");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese URL: ");
                    String enlace = sc.nextLine();

                    System.out.print("Ingrese titulo: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese fecha: ");
                    String fecha = sc.nextLine();

                    PaginaWeb pagina = new PaginaWeb(enlace, nombre, fecha);

                    navegador.push(pagina);
                    break;

                case 2:
                    PaginaWeb eliminada = navegador.pop();

                    if (eliminada != null) {
                        PaginaWeb actual = navegador.peek();

                        if (actual != null) {
                            System.out.println("Página actual:");
                            System.out.println(actual.getNombrePagina() + " - " + actual.getEnlace());
                        } else {
                            System.out.println("No hay páginas abiertas");
                        }
                    } else {
                        System.out.println("No hay páginas para retroceder");
                    }
                    break;

                case 3:
                    navegador.mostrarHistorial();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}