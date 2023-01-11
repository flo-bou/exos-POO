package src.dessert;

public abstract class DecorateurIngredient extends Dessert{
    protected Dessert dessert;

//    DecorateurIngredient(String libelle, double prix) {
//        super(libelle, prix);
//    }

    public abstract String getLibelle();
    public abstract double getPrix();
}
