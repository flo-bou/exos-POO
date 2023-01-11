package src.dessert;

public class Chantilly extends DecorateurIngredient {
//    protected Dessert dessert;
    public Chantilly(Dessert d){
        this.dessert = d;
    }
    public String getLibelle(){
        return dessert.getLibelle()+" chantilly";
    }
    public double getPrix(){
        return dessert.getPrix()+0.5;
    }
}
