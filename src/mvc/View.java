package src.mvc;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class View {
    JFrame frame;
    JButton button;
    JTextField field;
    JLabel label;
    ArrayList<JLabel> labels;

    public void init(int nbLabel) {
        this.frame = new JFrame("Titre");
        this.button = new JButton("Copier dans le Label");
        this.field = new JTextField(16);
        this.label = new JLabel("Default text");
        this.frame.setLayout(new FlowLayout());
        this.frame.add(field);
        this.frame.add(button);
        // this.frame.add(label);
        createLabels(nbLabel);
        addLabelsToFrame();
        this.frame.setSize(500,300);
        this.frame.setVisible(true);
    }

    public void createLabels(int nbLabel) {
        this.labels = new ArrayList<JLabel>();
        for(int i = 0; i < nbLabel; i++){
            this.labels.add(new JLabel("Label " + String.valueOf(i)));
        }
    }

    public void addLabelsToFrame(){
        for(JLabel l : this.labels){
            this.frame.add(l);
        }
    }

    public JFrame getFrame(){
        return frame;
    }

    public JButton getButton() {
        return button;
    }

    public JLabel getLabel() {
        return label;
    }

    public ArrayList<JLabel> getLabels() {
        return labels;
    }

    public JTextField getField() {
        return field;
    }

}
