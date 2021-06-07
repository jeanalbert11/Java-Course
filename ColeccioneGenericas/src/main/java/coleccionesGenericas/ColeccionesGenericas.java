package coleccionesGenericas;

import java.util.*;

/**
 *
 * @author Jean Albert
 */
public class ColeccionesGenericas {

    public static void main(String[] args) {
        //Colecciones genericas
        List<String> listaString = new ArrayList();
        listaString.add("Jean");
        listaString.add("Ian");
        listaString.add("Albert");
        listaString.add("Jean");
        imprimir(listaString);

        //Coleccion de tipo Set
        Set<String> miSet = new HashSet<>();//Para inicializar por defecto HashSet
        miSet.add("50");
        miSet.add("100");
        miSet.add("50");//No se agrga por ser repetido por tipo set
        imprimir(miSet);

        //Colecciones de tipo Mapa
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("1", "Jean");
        miMapa.put("2", "Ian");
        miMapa.put("3", "Romane");
        miMapa.put("3", "Juliet");
        imprimir(miMapa.keySet());//Iteramos keys y despues el valor 
        imprimir(miMapa.values());
        
        System.out.println(miMapa.get("3"));//Recuperando el primer valor con esa key
    }

    //Recibe una Coleccion por que es el padre de todas las listas De tipo String
    private static void imprimir(Collection<String> collection) {
        for (String elemento : collection) {
            System.out.println("elemento: " + elemento);
        }
        System.out.println("");
    }

}
