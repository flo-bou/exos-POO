package src.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Controller implements ActionListener {
    private View vue;
    private Model model;

    public Controller(){
        vue = new View();
        vue.init(6);
        model = new Model();
        this.vue.getButton().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        // copyFieldToLabel();
        copyFieldToLabels();
    }

    public void copyFieldToLabel(){
        String txt = vue.getField().getText();
        model.setValeur(txt);
        vue.getLabel().setText(model.getValeur());
    }

    public void copyFieldToLabels(){
        String txt = vue.getField().getText();
        model.setValeur(txt);
        for(JLabel l : vue.getLabels()){
            l.setText(model.getValeur());
        }
    }
}
