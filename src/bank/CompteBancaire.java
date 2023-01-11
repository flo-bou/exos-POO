package src.bank;

/*
Permet de déposer ou retirer de l'argent sur une compte bancaire


 */
public class CompteBancaire {
    private double solde;
    private int numCompte;

    public CompteBancaire(int numCompte){
        this.numCompte = numCompte;
    }
    public boolean deposerArgent(double montant){
        boolean result = true;
        if (montant >= 0){
            this.solde += montant;
        } else{
            result = false;
            Logging log = Logging.getInstance();
            log.ajoutLog("Error, vous ne pouvez pas déposer des sommes négatives. Soyez positif.");
        }
        return result;
    }

    public boolean retirerArgent(double montant){
        boolean result = true;
        if(montant > this.solde){
            result = false;
            Logging log = Logging.getInstance();
            log.ajoutLog("Error, vous ne pouvez pas retirer plus d'argent que vous ne possédez pas. Soyez plus riche.");
        } else{
            this.solde -= montant;
        }
        return result;
    }
}
