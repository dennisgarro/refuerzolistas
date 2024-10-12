import java.util.LinkedList;

public class Principal {
    public static void main(String[] args) {
        Computador c = new Computador();
        
        LinkedList<Computador> e= new LinkedList<>();
        e=c.llenarlista();
        c.mostrarlista(e);
        Computador n = new Computador();
        n = c.Mostrarregistro(e);
        System.out.println("Marca: " + n.getMarca());
        System.out.println("Color: " + n.getColor());
        System.out.println("Precio: " + n.getPrecio());
    }
}
