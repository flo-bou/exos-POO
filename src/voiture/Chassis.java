package src.voiture;

public class Chassis implements ElementVoitureInterface {
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
}
