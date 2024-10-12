import java.util.LinkedList;
import java.util.Scanner;

public class Computador {
    String Marca;
    String Color;
    int precio;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public LinkedList<Computador> llenarlista() {
        LinkedList<Computador> fray = new LinkedList<>();
        boolean bandera = true;
        int opt = 0;
        while (bandera) {
            Computador o = new Computador();
            Scanner sc = new Scanner(System.in);
            System.out.println("ingrese la marca");
            o.setMarca(sc.nextLine());
            System.out.println("ingrese el color");
            o.setColor(sc.nextLine());
            System.out.println("ingrese el precio");
            o.setPrecio(sc.nextInt());

            fray.add(o);
            System.out.println("¿quiere seguir ingresando datos? (1= si, 2= no)");
            opt = sc.nextInt();
            if (opt == 2) {
                bandera = false;
            }

        }

        return fray;
    }
    public void mostrarlista(LinkedList<Computador> a)
    {
        for (Computador i : a) {
            System.out.println("marca " + i.getMarca());
            System.out.println("precio " + i.getPrecio());
            System.out.println("color " + i.getColor());
        }
    }
public Computador Mostrarregistro(LinkedList<Computador>a){
    Computador M = new Computador();
    String Marca;
    System.out.println("Ingrese la Marca: ");
    Scanner sc = new Scanner(System.in);
    Marca = sc.next();
    for (Computador l : a) {
        if ( l.getMarca().equalsIgnoreCase(Marca))
        {
           M.setMarca(l.getMarca()); 
           M.setColor(l.getColor());
           M.setPrecio(l.getPrecio());
        }
    }
    return M;

}
}