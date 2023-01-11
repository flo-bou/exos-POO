package src.animal;

public class Chien implements InterfaceCrier {
    public String cri = "Wouf !";

    public void crier(){
        System.out.println(this.cri);
    }
}
