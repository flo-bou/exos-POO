import java.io.*;
import java.util.*;
import src.chemin.Case;

public class AppChemin {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("src/chemin/problem2.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sc);
        Map<String, Case> mapCase = new HashMap<String, Case>();

        int i = 0;
        String arrive = "";
        int min = Integer.MAX_VALUE;
        LinkedList<Case> testCaseInit = null;
        List<LinkedList<Case>> departCase = new ArrayList<>();
        LinkedList<Case> cheminCourt;

        // on va stocker les valeurs du fichier dans ma variable mapCase. Pour chaque case, on initialise le poid à Integer.MAX_VALUE sauf pour 'S' et 'a' qui valent 0
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            for (int j = 0; j < line.length(); j++) {
                String charr = String.valueOf(line.charAt(j)); // la lettre
                if (charr.equals("S") || charr.equals("a")) {
                    Case maCase = new Case();
                    maCase.valeur = "a";
                    maCase.pois = 0;
                    maCase.coordonne = i + "," + j;
                    testCaseInit = new LinkedList<>();
                    testCaseInit.add(maCase);
                    departCase.add(testCaseInit);
                    mapCase.put(i + "," + j,maCase);
                } else if (charr.equals("E")) {
                    arrive = i + "," + j;
                    Case maCase = new Case();
                    maCase.valeur = "z";
                    maCase.pois = Integer.MAX_VALUE;
                    maCase.coordonne = arrive;
                    mapCase.put(i + "," + j,maCase);
                } else {
                    Case maCase = new Case();
                    maCase.valeur = charr;
                    maCase.pois = Integer.MAX_VALUE;
                    maCase.coordonne = i + "," + j;
                    mapCase.put(i + "," + j,maCase);
                }
            }
            i++;
        }

        for(LinkedList<Case> testCase : departCase) { // chemin
            while (testCase.size() > 0) {

                cheminCourt = testCase;
                testCase = new LinkedList<>();
                for (Case caseEnCours : cheminCourt) {
                    // pour chaque case testée, on va la comparer à chacune de ses 4 cases adjacente pour savoir si on modifie son poid.
                    int x = Integer.valueOf(caseEnCours.coordonne.split(",")[0]);
                    int y = Integer.valueOf(caseEnCours.coordonne.split(",")[1]);

                    //haut
                    String direction = (x - 1) + "," + y;
                    testCase(mapCase,caseEnCours,direction,testCase,arrive);

                    //bas
                    direction = (x + 1) + "," + y;
                    testCase(mapCase,caseEnCours,direction,testCase,arrive);

                    //gauche
                    direction = x + "," + (y - 1);
                    testCase(mapCase,caseEnCours,direction,testCase,arrive);

                    //droite
                    direction = x + "," + (y + 1);
                    testCase(mapCase,caseEnCours,direction,testCase,arrive);
                }
            }
            if(mapCase.get(arrive).pois < min){
                min = mapCase.get(arrive).pois;
            }
        }
        System.out.println("Le chemin le plus court comporte " + min + " étapes.");
    }

    // Écrit le poid d'une case selon sa case adjacente
    private static void testCase(Map<String, Case> mapCases, Case caseEnCours, String adjCase, LinkedList<Case> testCase, String caseArrive) {
        if (mapCases.get(adjCase) != null && mapCases.get(adjCase).valeur.charAt(0) - caseEnCours.valeur.charAt(0) < 2) {
            if (mapCases.get(adjCase).pois > caseEnCours.pois + 1) {
                mapCases.get(adjCase).pois = caseEnCours.pois + 1;
                if (!adjCase.equals(caseArrive)) {
                    testCase.add(mapCases.get(adjCase));
                }
            }
        }
    }

}
