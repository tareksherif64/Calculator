import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Calculator extends JFrame implements ActionListener {

    private DecimalFormat df = new DecimalFormat("#,###.00");

    private String[] symbols = {

            "AC", "+/-", "%", "÷",
            "7", "8", "9", "x",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "0", ".", "Adv", "="
    };
    private int operator = 0;
    private JPanel panel = new JPanel(new BorderLayout(5,5));
    private JPanel btnPanel = new JPanel(new GridLayout(5,3,2,2));
    private JButton[] btns = new JButton[20];
    private JTextArea screen = new JTextArea(5,40);
    private double firtsNum = 0;
    private JTextField calculatingTf = new JTextField(40);

    public Calculator(){
        init();
    }

    public void init(){

        setTitle("Calculator");
        screen.setBackground(Color.BLACK);
        panel.setBackground(Color.BLACK);
        btnPanel.setBackground(Color.BLACK);
        screen.setForeground(Color.WHITE);


        for (int i = 0; i< btns.length; i++){
            btns[i] = new JButton(symbols[i]);

            btns[i].setOpaque(false);
            btns[i].setBorderPainted(false);
            btns[i].setBackground(Color.BLACK);
            btns[i].setForeground(Color.WHITE);
            btns[i].addActionListener(this);
            btnPanel.add(btns[i]);
        }

        panel.add(calculatingTf, BorderLayout.SOUTH);
        panel.add(btnPanel, BorderLayout.CENTER);
        panel.add(screen, BorderLayout.NORTH);
        add(panel);
        setSize(340, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String cmd = e.getActionCommand().toString();

        switch (cmd){
            case ".":
                if (!screen.getText().contains(".")){
                    screen.setText(screen.getText() + ".");
                }
                break;
            default:
        }






    }
}
