package src.bank;

import java.time.LocalDateTime;

public class Logging {
    private static Logging instance = new Logging(); // instanciation lors du chargement de la classe
    private String logStr = new String();

    private Logging() {
//        if(logStr == null){
//            logStr = new String();
//        }
    } // Constructeur privé

    public void ajoutLog(String message) {
        logStr += "[" + LocalDateTime.now().toString() + "] " + message + "\n";
    }

    public void afficherLog(){
        System.out.println(logStr);
    }
    // Point d'accès pour l'instance unique du singleton
    public static Logging getInstance(){
        return instance;
    }
}