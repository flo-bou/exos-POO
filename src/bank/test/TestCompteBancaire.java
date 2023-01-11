package src.bank.test;

import src.bank.CompteBancaire;

public class TestCompteBancaire {
    // compte 1
    public void test(){
        CompteBancaire cb1 = new CompteBancaire(123456789);
        cb1.deposerArgent(100.0);
        cb1.retirerArgent(80.0);

        // compte 2
        CompteBancaire cb2 = new CompteBancaire(987654321);
        cb2.deposerArgent(10.0);
        cb2.retirerArgent(80.0);
    }

}
