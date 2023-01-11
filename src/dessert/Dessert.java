package src.dessert;

import java.text.NumberFormat;

public abstract class Dessert {
    private String libelle;
    private double prix;

    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String toString(){
        NumberFormat format = NumberFormat.getInstance();
        format.setMinimumFractionDigits(2);
        return "libelle : " + getLibelle() + " prix : " + format.format(getPrix()) + " €.";
    }
}
