package src.voiture;

public class Roue implements ElementVoitureInterface {
    private boolean isCreve;

    public boolean getIsCreve(){
        return this.isCreve;
    }
    public void setIsCreve(boolean isCreve){
        this.isCreve = isCreve;
    }
    public boolean isElementVoitureOk(){
        return this.isCreve;
    }

//    public Roue accept(VerificationVoitureVisitor v){
//        v.visit(this);
//    }
}
