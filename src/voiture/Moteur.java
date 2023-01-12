package src.voiture;

public class Moteur implements ElementVoitureInterface {
    private double niveauHuile;

    public double getNiveauHuile(){
        return this.niveauHuile;
    }
    public void setNiveauHuile(double niveauHuile){
        this.niveauHuile = niveauHuile;
    }
    public boolean isElementVoitureOk(){
        return (this.niveauHuile > 10.0);
    }
}
