import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ut5_2 {
    static final Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        insertarEdad();

    }
    public static void insertarEdad (){
        List<String>numeros = new ArrayList<>();
        int edad = 0;
        float media = 0;
        int contA = 0;
        int contB = 0;
        do {

            System.out.println("introduce la edad");
            edad = entrada.nextInt();

            if(edad > 0) {
                numeros.add(String.valueOf(edad));
                media =+ edad;
            }
        }while (edad > 0);

            media = media /numeros.size();
        System.out.println("la edad media es: " + String.valueOf(media));


    }
}
