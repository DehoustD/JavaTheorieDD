import java.util.List;
import java.util.ArrayList;

/**
 * Boucle foreach.
 */
public class ForEach {

    public static void main(String[] args) {

        // Création d'une liste pour l'exemple.

        List<Integer> myNumbersList = new ArrayList<Integer>();

        // Ajout de quelques données pour l'exemple.

        myNumbersList.add(2);
        myNumbersList.add(4);
        myNumbersList.add(6);
        myNumbersList.add(8);

        // La boucle foreach.
        // Litteralement, for each signifie "pour chaque".
        // En gros, les instrctions de la boucle vont s'appliquer à chaques éléments du tabeau ou liste que l'on renseigne.

        for (int _list : myNumbersList) {

            System.out.println(_list);

        }

        // Il y a 3 éléments dans les paranthèses.
        // Le premier est le type de variable, ici une int.
        // Le second est le nom de la variable locale. La portée de la variable se limite au for.
        // le troisième est le nom du tableau qui comprend les éléments qui vont suivre la ou les instructions du for.

    }

}