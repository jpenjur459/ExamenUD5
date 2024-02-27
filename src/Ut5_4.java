import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ut5_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List <String>producto = new ArrayList<>();
        int contadorRepe = 0;
       String productos = "";
        do {
            productos = entrada.nextLine();
            if (productos.toLowerCase().equals("fin")){
                break;
            }else{
                producto.add(productos);
            }
            if (producto.contains(productos)){
                contadorRepe ++;
            }
        }while (!(productos.toLowerCase().equals("fin")));
        int produ = producto.size();
        System.out.println("hay: "+ produ);

    }
}
