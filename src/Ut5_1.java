import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ut5_1 {
    public static void main(String[] args) {
        Set<String> numeros = new TreeSet<>();
        int i;
        for (i = 1; i < 50; i++) {
            System.out.print(i + " ");
            if (i == 10 || i == 20 || i == 30 || i == 40) {
                System.out.println();
            }
        }
    }
}
