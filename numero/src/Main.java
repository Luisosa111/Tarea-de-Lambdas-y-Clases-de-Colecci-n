import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Antes: " + nums);
        Numero.multiplicarLista(nums, 3);
        System.out.println("Después: " + nums);

        Numero.multiplicarLista(new ArrayList<>(), 2);

        ArrayList<String> palabras = new ArrayList<>(Arrays.asList("Pollo", "Loro", "gato", "taza", "amigo"));
        System.out.println("\nAntes filtro: " + palabras);
        Cadena.filtrarCadenas(palabras, 't', 4);
        System.out.println("Después filtro: " + palabras);

        System.out.println("¿Contiene 'Pollo'? " + Cadena.contienePollo(palabras));

        ArrayList<String> mayus = Cadena.convertirMayusculas(palabras);
        System.out.println("\nMayúsculas: " + mayus);

        ArrayList<Integer> listaNums = new ArrayList<>(Arrays.asList(2, 2, 3, 4, 6));
        System.out.println("\nCuadrados únicos: " + Numero.cuadradosUnicos(listaNums));

        HashMap<String, Integer> mapaLong = Cadena.mapaLongitudes(palabras);
        System.out.println("\nMapa longitudes: " + mapaLong);

        HashMap<String, Double> inventario = new HashMap<>();
        inventario.put("Platano", 10.0);
        inventario.put("Pan", 20.0);
        System.out.println("\nInventario con descuento:");
        Cadena.imprimirInventarioConDescuento(inventario);

        ArrayList<String> repetidas = new ArrayList<>(Arrays.asList("hola", "hola", "hol"));
        HashMap<String, Integer> freq = Cadena.contarFrecuencias(repetidas);
        System.out.println("\nFrecuencias: " + freq);

        System.out.println("Frecuencia < 2: " + Cadena.clasificarPalabras(freq, 2));

        String frase = "Hola hola mundo mundo Java";
        System.out.println("\nDeduplicado: " + Cadena.deduplicar(frase, 4));

        System.out.println("\nAntes límite: " + freq);
        Cadena.limitarFrecuencias(freq, 1);
        System.out.println("Después límite: " + freq);

        Cadena.contarFrecuencias(null);
        Cadena.deduplicar(null, 3);
    }
}