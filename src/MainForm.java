import javax.swing.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;

public class MainForm {
    private JPanel mainPanel;
    private JTextField surnameField;
    private JTextField nameField;
    private JTextField patronymicField;
    private JLabel surnameLable;
    private JLabel nameLable;
    private JLabel patronymicLable;
    private JPanel fullNamePanel;
    private JPanel SNPPanel;
    private JPanel buttonPanel;
    private JLabel snpLable;
    private JButton button;
    private JTextField snpField;


    public MainForm(){

        fullNamePanel.setLayout(new BoxLayout(fullNamePanel, BoxLayout.Y_AXIS));


        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (!surnameField.getText().equals("") && !nameField.getText().equals("")){

                    snpField.setText(surnameField.getText() + " " + nameField.getText() + " " + patronymicField.getText());
                    surnameField.setText("");
                    nameField.setText("");
                    patronymicField.setText("");
                    button.setLabel("Expand");


                }
                else if (!snpField.getText().equals("")){
                    String[] snp = snpField.getText().split("\\s+");
                    surnameField.setText(snp[0]);
                    nameField.setText(snp[1]);
                    if (snp.length == 3){
                    patronymicField.setText(snp[2]);
                    }
                    snpField.setText("");
                    button.setLabel("Collapse");
                }
            }
        });
    }


    public JPanel getMainPanel() {
        return mainPanel;
    }



}
