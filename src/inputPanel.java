/*
* File: InputPanel.java
* Author: Molnár Csenge Anna
* Copyright: 2023, Molnár Csenge Anna
* Group: Szoft I-1 N
* Date: 2023-05-23
* Github: https://github.com/Verfarkas02/s1n_Dolgozat_3
* Licenc: GUI GPL
*/
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class inputPanel extends JPanel{
    JLabel label;
    JTextField field;
    public inputPanel(){
        this.initComponent();
        this.setPanel();
    }
    public inputPanel(String text){
        this.initComponent();
        this.label.setText(text);
        this.setPanel();
    }
    private void initComponent(){
        this.label =new JLabel();
        this.field = new JTextField();

    }
    private void setPanel(){
        this.add(this.label);
        this.add(this.field);
        this.setLayout(new GridLayout(1,2));
        this.setBorder(new EmptyBorder(5, 10, 5, 10));
    }
    public void setLabel(String text) {
        this.label.setText(text);
    }
    public String getLabel() {
        return this.label.getText();
    }
    public void setValue(String text) {
        this.field.setText(text);
    }
    public String getValue() {
        return this.field.getText();
    }
}