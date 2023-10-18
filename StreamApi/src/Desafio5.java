import java.util.Arrays;
import java.util.List;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int resultado = numeros.stream().reduce(0, (a, b) -> a + b) / numeros.size();

        System.out.println(resultado);
    }
}
