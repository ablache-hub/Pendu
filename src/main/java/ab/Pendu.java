package ab;

import java.util.*;

/**
 * Hello world!
 */
public class Pendu {

    public static String generationMot() { // Sortie d'un mot aléatoire à partir d'une liste
        String[] listeMots = { "Terminator", "Slicer", "Ninja", "cow", "Robot", "littlegirl", "test", "hasard",
                "France", "Simplon", "etc" };

        String motAleatoire = listeMots[(int) (Math.random() * listeMots.length)];
        motAleatoire = motAleatoire.toLowerCase();
        // System.out.println(reponse);
        // System.out.println(reponse.length());
        return motAleatoire;
    }

    public static String generationModeleMot(String mot) {
        String var = "";

        for (int i = 0; i < mot.length(); i++) {
            var += "_ ";
        }

        return var;

    }

    public static void main(String[] args) {

        System.out.println(generationMot());
        System.out.println(generationModeleMot(generationMot()));
        // // Création champ vide de la longueur du mot
        // String var = "";

        // for (int i = 0; i < reponse.length(); i++) {
        // var += "_ ";
        // }

        // // Décomposition du mot dans une ArrayList
        // String str[] = reponse.split("");
        // List<String> al = new ArrayList<String>();
        // al = Arrays.asList(str);
        // for (String s : al) {
        // System.out.println(s);
        // }
    }
}
