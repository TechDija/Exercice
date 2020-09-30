import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        runMenu();
    }

    public static void runMenu() {
        printMenu();
        int selection = getMenuChoice();
        performAction(selection);
    }

    public static void printMenu() {
        System.out.println("""
                    MENU PRINCIPAL   \s
                       ---------------    \s
                1. Exercice 1 (choix d'un nombre entre 1 et 5)
                2. Exercice 2 (choix d'un nombre entre 10 et 20)
                3. Exercice 3 (afficher les 10 nombres suivants)
                4. Exercice 4 (afficher les 10 nombres suivants)
                5. Exercice 5 (afficher une table de multiplication)
                6. Exercice 6 (afficher la somme des entiers jusqu'au nombre)
                7. Exercice 7 (afficher la factorielle d'un nombre)
                8. Exercice 8 (afficher le nombre le plus grand parmi 20 nombres)
                9. Exercice 9 (afficher le nombre le plus grand parmi vos nombres)
                10. Exercice 10 (afficher la monnaie après la lecture du prix de 5 articles)
                11. Exercice 11 (afficher les chances de gagner aux courses)

                Entrez le numéro correspondant à votre choix ou 'O' pour quitter le programme:""");
    }

    public static int getMenuChoice() {
        Scanner input = new Scanner(System.in);
        int selection;

        selection = input.nextInt();
        return selection;
    }

    public static void performAction(int selection) {

        switch (selection) {
            case 0 -> {
                System.out.println("Merci d'avoir employé notre application !");
                System.exit(0);
            }
            case 1 -> Ex1();
            case 2 -> Ex2();
            case 3 -> Ex3();
            case 4 -> Ex4();
            case 5 -> Ex5();
            case 6 -> Ex6();
            case 7 -> Ex7();
            case 8 -> Ex8();
            case 9 -> Ex9();
            case 10 -> Ex10();
            case 11 -> Ex11();
            default -> System.out.println("Saisie invalide, rééssayez.");
        }
    }

    public static void Ex1() {
        int n = 0;
        while (n < 1 || n > 5) {
            System.out.println("Entrez un nombre entre 1 et 5: ");

            Scanner input = new Scanner(System.in);
            n = input.nextInt();

            if (n > 0 && n < 6) {
                System.out.println("Bravo, vous avez entré " + n);
            } else {
                System.out.println("Hélas, c'est faux.");
            }
        }
        // choix entre retour au menu et reprise de l'exercice
        System.out.println(" ");
        System.out.println("Souhaitez-vous retenter l'exercice ? Entrez '1' pour oui et '0' pour non: ");

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        if (n == 0) {
            runMenu();
        }
        if (n == 1) {
            Ex1();
        }
    }

    public static void Ex2() {
        int n;

        System.out.println("Entrez un nombre entre 10 et 20: ");

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        if (n < 10) {
            System.out.println("Plus grand !");
        } else if (n > 20) {
            System.out.println("Plus petit !");
        } else {
            System.out.println("Bien !");
        }
        // choix entre retour au menu et reprise de l'exercice
        System.out.println(" ");
        System.out.println("Souhaitez-vous retenter l'exercice ? Entrez '1' pour oui et '0' pour non: ");

        n = input.nextInt();

        if (n == 0) {
            runMenu();
        }
        if (n == 1) {
            Ex2();
        }
    }

    public static void Ex3() {
        int n;
        int i;
        System.out.println("Entrez un nombre pour en connaître les dix suivants: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (i = n + 1; i < n + 11; i++) {
            System.out.println(i + " ");
        }
        // choix entre retour au menu et reprise de l'exercice
        System.out.println(" ");
        System.out.println("Souhaitez-vous retenter l'exercice ? Entrez '1' pour oui et '0' pour non: ");

        n = input.nextInt();

        if (n == 0) {
            runMenu();
        }
        if (n == 1) {
            Ex3();
        }
    }

    public static void Ex4() {
        int n;
        int i;

        System.out.println("Entrez un nombre pour en connaître les dix suivants: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (i = n + 1; i < n + 11; i++) {
            System.out.println(i + " ");
        }
        // choix entre retour au menu et reprise de l'exercice
        System.out.println(" ");
        System.out.println("Souhaitez-vous retenter l'exercice ? Entrez '1' pour oui et '0' pour non: ");

        n = input.nextInt();

        if (n == 0) {
            runMenu();
        }
        if (n == 1) {
            Ex4();
        }
    }

    public static void Ex5() {
        int n;
        int i;
        int result;

        System.out.println("Entrez un nombre pour en connaître sa table de multiplication: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (i = 1; i < 11; i++) {
            result = n * i;
            System.out.println(n + "*" + i + "=" + result);
        }
        // choix entre retour au menu et reprise de l'exercice
        System.out.println(" ");
        System.out.println("Souhaitez-vous retenter l'exercice ? Entrez '1' pour oui et '0' pour non: ");

        n = input.nextInt();

        if (n == 0) {
            runMenu();
        }
        if (n == 1) {
            Ex5();
        }
    }

    public static void Ex6() {
        int n;
        int i;
        int result = 0;

        System.out.println("Entrez un nombre pour connaître la somme des entiers positifs qui le précède: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (i = 1; i < n; i++) {
            result = result + i;
        }
        System.out.println(result);

        // choix entre retour au menu et reprise de l'exercice
        System.out.println(" ");
        System.out.println("Souhaitez-vous retenter l'exercice ? Entrez '1' pour oui et '0' pour non: ");

        n = input.nextInt();

        if (n == 0) {
            runMenu();
        }
        if (n == 1) {
            Ex6();
        }
    }

    public static void Ex7() {
        int n;
        int i;
        int result = 1;

        System.out.println("Entrez un nombre pour en connaître la factorielle: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (i = 1; i < n; i++) {
            result = result * i;
        }
        System.out.println(result);

        // choix entre retour au menu et reprise de l'exercice
        System.out.println(" ");
        System.out.println("Souhaitez-vous retenter l'exercice ? Entrez '1' pour oui et '0' pour non: ");

        n = input.nextInt();

        if (n == 0) {
            runMenu();
        }
        if (n == 1) {
            Ex7();
        }
    }

    public static void Ex8() {
        int n;
        int i;
        int I = 0;
        int result = 0;

        for (i = 1; i < 20; i++) {
            System.out.println("Entrez le nombre " + i + " :");

            Scanner input = new Scanner(System.in);
            n = input.nextInt();

            if (i == 0 || n > result) {
                result = n;
                I = i;
            }
        }
        System.out.println("Le plus grand nombre entré est " + result + " sa position est " + I);

        // choix entre retour au menu et reprise de l'exercice
        System.out.println(" ");
        System.out.println("Souhaitez-vous retenter l'exercice ? Entrez '1' pour oui et '0' pour non: ");

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        if (n == 0) {
            runMenu();
        }
        if (n == 1) {
            Ex8();
        }
    }

    public static void Ex9() {
        int n = 1;
        int i = 0;
        int I = 0;
        int result = 0;

        while (n != 0) {
            System.out.println("Entrez le nombre " + i + " :(entrez '0' pour arrêter la séquence");

            Scanner input = new Scanner(System.in);
            n = input.nextInt();

            i = i + 1;

            if (i == 0 || n > result) {
                result = n;
                I = i;
            }
        }
        System.out.println("Le plus grand nombre entré est " + result + " sa position est " + I);

        // choix entre retour au menu et reprise de l'exercice
        System.out.println(" ");
        System.out.println("Souhaitez-vous retenter l'exercice ? Entrez '1' pour oui et '0' pour non: ");

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        if (n == 0) {
            runMenu();
        }
        if (n == 1) {
            Ex9();
        }
    }

    public static void Ex10() {
        int p;
        int n;
        int i = 5;
        int nfinal = 0;
        int N;
        int r10 = 0;
        int r5 = 0;
        int r1 = 0;
        int Nreste;

        while (i != 0) {
            i = i - 1;
            System.out.println("Entrez le prix de l'article n°" + i);

            Scanner input = new Scanner(System.in);
            p = input.nextInt();

            nfinal = nfinal + p;
        }
        System.out.println(nfinal + " euros dûs.");
        // l'usager paie :
        System.out.println(" ");
        System.out.println("Entrez la somme remise :");

        Scanner input = new Scanner(System.in);
        N = input.nextInt();

        Nreste = N - nfinal;

        while (Nreste >= 10) {
            r10 = r10 + 1;
            Nreste = Nreste - 10;
        }
        System.out.println("Nous allons vous rendre " + r10 + " billet(s) de 10 euros.");

        while (Nreste >= 5) {
            r5 = r5 + 1;
            Nreste = Nreste - 5;
        }
        System.out.println("Nous allons vous rendre " + r5 + " billet(s) de 5 euros.");

            r1 = Nreste;
        System.out.println("Nous allons vous rendre " + r1 + " pièce(s) de 1 euros.");

        // choix entre retour au menu et reprise de l'exercice
        System.out.println(" ");
        System.out.println("Souhaitez-vous retenter l'exercice ? Entrez '1' pour oui et '0' pour non: ");

        n = input.nextInt();

        if (n == 0) {
            runMenu();
        }
        if (n == 1) {
            Ex10();
        }
    }

    public static void Ex11() {
        int n;
        int i;
        int p;
        int factn = 1;
        int factp = 1;
        int factnp = 1;
        int X = 1 ;
        int Y= 1 ;

        System.out.println("Entrez le nombre de chevaux partants");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        System.out.println("Entrez le nombre de chevaux joués");
        p = input.nextInt();

        for (i = 1; i < n + 1; i++) {
            factn = n * i;
        }
        for (i = 1; i < p + 1; i++) {
            factn = p * i;
        }
        for (i = 1; i<(n-p)+1; i++) {
            factnp = (n-p)*i;
        }
        X = factn/factnp;
        Y = factn/(factp * factnp);

        System.out.println("Vous avez une chance sur " +X+ " de gagner dans l'ordre.");
        System.out.println("Vous avez une chance sur " + Y + " de gagner dans le désordre.");

        // choix entre retour au menu et reprise de l'exercice
        System.out.println(" ");
        System.out.println("Souhaitez-vous retenter l'exercice ? Entrez '1' pour oui et '0' pour non: ");

        n = input.nextInt();

        if (n == 0) {
            runMenu();
        }
        if (n == 1) {
            Ex11();
        }
    }
}


