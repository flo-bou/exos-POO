package src.voiture;

import java.util.List;

public class VerificationVoitureVisitor {
    // visiter tous les composants d'une voiture
    public void visit(Chassis chassis){
        // traitement

    }
    public boolean verifierVoiture(Voiture v){
        boolean result = true;
        List<ElementVoitureInterface> elems = v.getVoitureElements();
        for(ElementVoitureInterface elem : elems){
            if (! elem.isElementVoitureOk()){
                result = false;
                break;
            }
        }
        return result;
    }
}
