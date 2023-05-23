/*
* File: MainFrame.java
* Author: Molnár Csenge Anna
* Copyright: 2023, Molnár Csenge Anna
* Group: Szoft I-1 N
* Date: 2023-05-23
* Github: https://github.com/Verfarkas02/s1n_Dolgozat_3
* Licenc: GUI GPL
*/
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame  extends JFrame{
        JPanel buttonPanel;
        JButton prevButton;
        JButton nextButton;
        inputPanel namePanel;
        inputPanel cityPanel;
        inputPanel addressPanel;
        inputPanel birthPanel;
        inputPanel salaryPanel;
        
    public MainFrame() {
        this.initComponent();
        this.setComponent();
        this.setFrame();
    }
    
    
    private void initComponent(){
        this.buttonPanel =new JPanel();
        this.prevButton =new JButton("Előzö");
        this.nextButton =new JButton("Next");
        this.namePanel =new inputPanel("Név");
        this.cityPanel =new inputPanel("Település");
        this.addressPanel =new inputPanel("Címet");
        this.birthPanel =new inputPanel("Születési");
        this.salaryPanel =new inputPanel("Fizetési");

    }
    private void setFrame(){
        this.setLayout( new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));

        this.add(this.buttonPanel);
        this.add(this.namePanel);
        this.add(this.cityPanel);
        this.add(this.addressPanel);
        this.add(this.birthPanel);
        this.add(this.salaryPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 250);
        this.setVisible(true);
    }
    private void setComponent(){
        this.buttonPanel.add(this.prevButton);
        this.buttonPanel.add(this.nextButton);
    }


    public JPanel getButtonPanel() {
        return buttonPanel;
    }


    public JButton getPrevButton() {
        return prevButton;
    }


    public JButton getNextButton() {
        return nextButton;
    }

}
    
