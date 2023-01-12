package src.voiture;

import java.util.ArrayList;
import java.util.List;

public class Voiture {
    public Roue roueAvGa;
    public Roue roueAvDr;
    public Roue roueArGa;
    public Roue roueArDr;
    public Moteur moteur;
    public Chassis chassis;
    public List<ElementVoitureInterface> voitureElements;

    public Voiture(Roue roueAvGa, Roue roueAvDr, Roue roueArGa, Roue roueArDr, Moteur moteur, Chassis chassis){
        this.roueAvGa = roueAvGa;
        this.roueAvDr = roueAvDr;
        this.roueArGa = roueArGa;
        this.roueArDr = roueArDr;
        this.moteur = moteur;
        this.chassis = chassis;
        this.voitureElements = new ArrayList<ElementVoitureInterface>();
        this.voitureElements.add(roueAvGa);
        this.voitureElements.add(roueAvDr);
        this.voitureElements.add(roueArGa);
        this.voitureElements.add(roueArDr);
        this.voitureElements.add(moteur);
        this.voitureElements.add(chassis);
    }

    public List<ElementVoitureInterface> getVoitureElements() {
        return voitureElements;
    }

}
