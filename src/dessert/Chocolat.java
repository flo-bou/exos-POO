package src.dessert;

public class Chocolat extends DecorateurIngredient {
    // le Deorateur compose
//    protected Dessert dessert;
    public Chocolat(Dessert d){
        this.dessert = d;
    }
    public String getLibelle(){
        return dessert.getLibelle()+" chocolat";
    }
    public double getPrix(){
        return dessert.getPrix()+0.2;
    }

}
