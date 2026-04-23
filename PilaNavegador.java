import java.util.Stack;

public class PilaNavegador {

    private Stack<PaginaWeb> pila;

    public PilaNavegador() {
        pila = new Stack<>();
    }

    public boolean push(PaginaWeb pagina) {
        pila.push(pagina);
        return true;
    }

    public PaginaWeb pop() {
        if (!pila.isEmpty()) {
            return pila.pop();
        } else {
            return null;
        }
    }

    public PaginaWeb peek() {
        if (!pila.isEmpty()) {
            return pila.peek();
        } else {
            return null;
        }
    }

    public void mostrarHistorial() {
        if (pila.isEmpty()) {
            System.out.println("Historial vacío");
        } else {
            for (int i = pila.size() - 1; i >= 0; i--) {
                System.out.println("Pagina: " + pila.get(i).getNombrePagina());
                System.out.println("Enlace: " + pila.get(i).getEnlace());
                System.out.println("Fecha: " + pila.get(i).getFechavisita());
                System.out.println("----------------------");
            }
        }
    }
}
