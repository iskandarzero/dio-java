import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> resultado = numeros.stream().distinct().collect(Collectors.toList());

        if(resultado.size() == numeros.size()) {
            System.out.println("Não há números repetidos.");
        } else {
            System.out.println("Existem números repetidos.");
        }
    }
}
