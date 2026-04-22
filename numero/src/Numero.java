import java.util.*;
import java.util.stream.*;

public class Numero {

    public static void multiplicarLista(ArrayList<Integer> lista, int factor) {
        if (lista == null) return;
        lista.replaceAll(n -> n * factor);
    }

    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> lista) {
        if (lista == null) return new HashSet<>();

        return lista.stream()
                .filter(n -> n % 2 == 0)
                .distinct()
                .map(n -> n * n)
                .collect(Collectors.toCollection(HashSet::new));
    }
}