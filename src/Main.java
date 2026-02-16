import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        String archivo = "producto.dat";

        ArrayList<Producto> lista = new ArrayList<>();
        lista.add(new Producto("Manzana", 4.50,6));
        lista.add(new Producto("Leche", 30.50, 1));

        Escritor escritor = new Escritor();
        Lector lector = new Lector();

        try{
            escritor.guardar(lista,archivo);
            System.out.println("Productos guardados");

            ArrayList<Producto> productos= lector.leer(archivo);

            System.out.println("Productos leidos del archivo");
            for (Producto producto:productos){
                System.out.println(producto);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}