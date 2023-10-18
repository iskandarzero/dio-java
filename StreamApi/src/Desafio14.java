import java.util.Arrays;
import java.util.List;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Integer resultado = numeros.stream().filter(n -> isPrimeNumber(n)).max(Integer::compare).get();

        System.out.println(resultado);
    }

    public static boolean isPrimeNumber(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
