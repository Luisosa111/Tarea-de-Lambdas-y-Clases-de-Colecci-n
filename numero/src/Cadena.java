import java.util.*;
import java.util.stream.*;

public class Cadena {

    public static void filtrarCadenas(ArrayList<String> lista, char letra, int minLength) {
        if (lista == null) return;

        lista.removeIf(s -> s == null ||
                s.toLowerCase().startsWith(String.valueOf(letra).toLowerCase()) ||
                s.length() < minLength);
    }

    public static boolean contienePollo(ArrayList<String> lista) {
        if (lista == null) return false;

        return lista.stream()
                .anyMatch(s -> s != null && s.toLowerCase().contains("taco"));
    }

    public static ArrayList<String> convertirMayusculas(ArrayList<String> lista) {
        if (lista == null) return new ArrayList<>();

        return lista.stream()
                .map(s -> s == null ? "" : s.toUpperCase())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static HashMap<String, Integer> mapaLongitudes(ArrayList<String> lista) {
        if (lista == null) return new HashMap<>();

        return lista.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toMap(
                        s -> s,
                        s -> s.length(),
                        (a, b) -> a,
                        HashMap::new
                ));
    }
    public static void imprimirInventarioConDescuento(HashMap<String, Double> inventario) {
        if (inventario == null) return;

        inventario.forEach((producto, precio) -> {
            double descuento = precio * 0.9;
            System.out.println(producto + " -> $" + descuento);
        });
    }

    public static HashMap<String, Integer> contarFrecuencias(ArrayList<String> lista) {
        HashMap<String, Integer> mapa = new HashMap<>();
        if (lista == null) return mapa;

        for (String palabra : lista) {
            if (palabra != null) {
                mapa.merge(palabra, 1, Integer::sum);
            }
        }
        return mapa;
    }

    public static ArrayList<String> clasificarPalabras(HashMap<String, Integer> mapa, int limite) {
        if (mapa == null) return new ArrayList<>();

        return mapa.entrySet()
                .stream()
                .filter(e -> e.getValue() < limite)
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static HashSet<String> deduplicar(String frase, int minLength) {
        if (frase == null) return new HashSet<>();

        return Arrays.stream(frase.split("\\s+"))
                .map(String::toLowerCase)
                .filter(p -> p.length() >= minLength)
                .collect(Collectors.toCollection(HashSet::new));
    }

    public static void limitarFrecuencias(HashMap<String, Integer> mapa, int max) {
        if (mapa == null) return;

        mapa.replaceAll((k, v) -> v > max ? max : v);
    }
}