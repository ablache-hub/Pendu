package ab;

import java.util.*;

public class Pendu {

    // Retourne un mot aléatoire à partir d'une liste
    public static String generationMot() {
        String[] listeMots = { "Terminator", "Slicer", "Ninja", "cow", "Robot", "littlegirl", "test", "hasard",
                "France", "Simplon", "etc" };

        String motAleatoire = listeMots[(int) (Math.random() * listeMots.length)];
        motAleatoire = motAleatoire.toLowerCase();
        return motAleatoire;
    }

    // Décomposition du mot dans une ArrayList
    public static List<String> motEnArray(String mot) {
        String str[] = mot.split("");
        List<String> lettres = new ArrayList<String>();
        lettres = Arrays.asList(str);
        return lettres;
    }

    // Retourne le squellette du mot en "_" et le décompose dans une ArrayList
    public static List<String> generationSqueletteMot(String mot) {
        String squelette = "";

        for (int i = 0; i < mot.length(); i++) {
            squelette += "_ ";
        }

        String str[] = squelette.split(" ");
        List<String> lettres = new ArrayList<String>();
        lettres = Arrays.asList(str);

        return lettres;
    }

    // Verifie si il reste une/des lettres à trouver (reste un "_" dans le
    // squelette)
    public static boolean checkerSiLettresRestantes(List<String> squelette) {
        boolean var = false;
        for (int i = 0; i < squelette.size(); i++) {
            if ((squelette.get(i)).equals("_")) {
                var = true;
            }
        }
        return var;
    }

    // Verifie si la lettre entrée existe dans le mot, si oui la faire apparaitre
    // dans le squelette
    public static List<String> checkLettre(List<String> mot, List<String> squelette, String lettre) {
        for (int i = 0; i < mot.size(); i++) {
            if ((mot.get(i)).equals(lettre)) {
                squelette.set(i, lettre);
            }
        }
        return squelette;
    }

    public static void main(String[] args) {
        // Déclaration variables requises
        boolean check = true;
        char input = 'y';
        int score = 1000;
        List<String> squelette = new ArrayList<String>();
        List<String> liste = new ArrayList<String>();

        do { // Tant que "continuer" = "Y"
            int coup = 0;

            // Génération mot aléatoire puis décomposition en ArrayList
            String reponse = generationMot();
            liste = motEnArray(reponse);

            // Génération squelette du mot
            squelette = generationSqueletteMot(reponse);
            System.out.println(squelette.toString());

            do { // Tant qu'il reste des lettres inconnues
                Scanner scanner = new Scanner(System.in); // Scanner lettre
                System.out.print("\nVeuillez saisir une lettre : ");
                char a = scanner.next().charAt(0);
                String b = Character.toString(a);

                squelette = checkLettre(liste, squelette, b); // Check si lettre dans le mot
                System.out.println(squelette.toString());

                check = checkerSiLettresRestantes(squelette); // Check si reste des lettres

                coup++;

            } while (check == true);

            if (coup < score) { // Si meilleur score, on le garde
                score = coup;
            }

            System.out.println("Bravo! Vous êtes parvenus à deviner le mot en " + coup
                    + " coups \nVotre meilleur score est de: " + score + " coups");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Voulez-vous rejouer? Y/N ");
            char a = scanner.next().charAt(0);
            input = a;

        } while (input == 'y');

    }
}
