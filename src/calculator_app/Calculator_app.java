
package calculator_app;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import static java.lang.Compiler.disable;
import static java.lang.Compiler.enable;

public class Calculator_app implements ActionListener{
    double number,answer;
    int calculation;
    
    JFrame frame = new JFrame("Calculator");
    JLabel label = new JLabel();
    JTextField textfield = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("X");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonClear = new JButton("C");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");
    
    
    Calculator_app(){
        
        prepareGui();
        addComponents();
        addActionEvent();
    }
    public void prepareGui(){
        frame.setSize(305, 510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void addComponents(){
        //Setting property of label
        label.setBounds(250,0,50,50);
        label.setForeground(Color.white);
        frame.add(label);
        
        //setting property of text filed
        textfield.setBounds(10, 40, 270, 40);
        textfield.setFont(new Font("Arial",Font.BOLD,20));
        textfield.setEditable(false);
        textfield.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textfield);
        
        //setting on/off button
        onRadioButton.setBounds(10,95,60,40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        onRadioButton.setForeground(Color.white);
        onRadioButton.setBackground(Color.black);
        frame.add(onRadioButton);
        
        offRadioButton.setBounds(10,120,60,40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        offRadioButton.setForeground(Color.white);
        offRadioButton.setBackground(Color.black);
        frame.add(offRadioButton);
        
        //to toggle between on and off
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);
        
        //setting property of buttons
        buttonSeven.setBounds(10,230,60,40);
        buttonSeven.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonSeven);
        
        buttonEight.setBounds(80,230,60,40);
        buttonEight.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonEight);
        
        buttonNine.setBounds(150,230,60,40);
        buttonNine.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonNine);
        
        buttonFour.setBounds(10,290,60,40);
        buttonFour.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonFour);
        
        buttonFive.setBounds(80,290,60,40);
        buttonFive.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonFive);
        
        buttonSix.setBounds(150,290,60,40);
        buttonSix.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonSix);
        
        buttonOne.setBounds(10,350,60,40);
        buttonOne.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonOne);
        
        buttonTwo.setBounds(80,350,60,40);
        buttonTwo.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonTwo);
        
        buttonThree.setBounds(150,350,60,40);
        buttonThree.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonThree);
        
        buttonEight.setBounds(80,230,60,40);
        buttonEight.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonEight);
        
        buttonDot.setBounds(150,410,60,40);
        buttonDot.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonDot);
        
        buttonZero.setBounds(10,410,130,40);
        buttonZero.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonZero);
        
        buttonEqual.setBounds(220,350,60,100);
        buttonEqual.setFont(new Font("Arial",Font.BOLD,20));
        buttonEqual.setBackground(new Color(239, 188, 2));
        frame.add(buttonEqual);
        
        buttonDiv.setBounds(220, 110, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(new Color(239, 188, 2));
        frame.add(buttonDiv);
 
        
        buttonSqrt.setBounds(10, 170, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(buttonSqrt);
 
        
        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(new Color(239, 188, 2));
        frame.add(buttonMul);
 
        
        buttonMinus.setBounds(220, 170, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(new Color(239, 188, 2));
        frame.add(buttonMinus);
        
        
        buttonPlus.setBounds(220, 290, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(new Color(239, 188, 2));
        frame.add(buttonPlus);
 
        
        buttonSquare.setBounds(80, 170, 60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSquare);
 
        
        buttonReciprocal.setBounds(150, 170, 60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonReciprocal);
 
        
        buttonDelete.setBounds(150, 110, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setBackground(Color.red);
        buttonDelete.setForeground(Color.white);
        frame.add(buttonDelete);
 
        buttonClear.setBounds(80, 110, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setBackground(Color.red);
        buttonClear.setForeground(Color.white);
        frame.add(buttonClear);
        
    }
    
    public void addActionEvent(){
        //Registering ActionListener to buttons
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
    }
    
    //overriding actionPerformed() method
    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source == onRadioButton){
            enable();
        }
        else if(source == offRadioButton)
        {
            disable();
        }
        else if(source == buttonClear)
        {
            label.setText("");
            textfield.setText("");
        }
        else if(source == buttonDelete)
        {
            int length = textfield.getText().length();
            int num = length-1;
            
            if(length>0){
                StringBuilder back = new StringBuilder(textfield.getText());
                back.deleteCharAt(num);
                textfield.setText(back.toString());
            }
            if(textfield.getText().endsWith("")){
                label.setText("");
            }
        }
            else if(source == buttonZero){
                if(textfield.getText().equals("0"))
                    return;
                else
                    textfield.setText(textfield.getText()+"0");
            } else if (source == buttonOne) {
            textfield.setText(textfield.getText() + "1");
        } else if (source == buttonTwo) {
            textfield.setText(textfield.getText() + "2");
        } else if (source == buttonThree) {
            textfield.setText(textfield.getText() + "3");
        } else if (source == buttonFour) {
            textfield.setText(textfield.getText() + "4");
        } else if (source == buttonFive) {
            textfield.setText(textfield.getText() + "5");
        } else if (source == buttonSix) {
            textfield.setText(textfield.getText() + "6");
        } else if (source == buttonSeven) {
            textfield.setText(textfield.getText() + "7");
        } else if (source == buttonEight) {
            textfield.setText(textfield.getText() + "8");
        } else if (source == buttonNine) {
            textfield.setText(textfield.getText() + "9");
        } else if (source == buttonDot) {
            if (textfield.getText().contains(".")) {
                return;
            } else {
                textfield.setText(textfield.getText() + ".");
            }
              } else if (source == buttonPlus) {
            String str = textfield.getText();
            number = Double.parseDouble(textfield.getText());
            textfield.setText("");
            label.setText(str + "+");
            calculation = 1;
        } else if (source == buttonMinus) {
            String str = textfield.getText();
            number = Double.parseDouble(textfield.getText());
            textfield.setText("");
            label.setText(str + "-");
            calculation = 2;
        } else if (source == buttonMul) {
            String str = textfield.getText();
            number = Double.parseDouble(textfield.getText());
            textfield.setText("");
            label.setText(str + "X");
            calculation = 3;
        } else if (source == buttonDiv) {
            String str = textfield.getText();
            number = Double.parseDouble(textfield.getText());
            textfield.setText("");
            label.setText(str + "/");
            calculation = 4;
        } else if (source == buttonSqrt) {
            number = Double.parseDouble(textfield.getText());
            Double sqrt = Math.sqrt(number);
            textfield.setText(Double.toString(sqrt));
 
        } else if (source == buttonSquare) {
            String str = textfield.getText();
            number = Double.parseDouble(textfield.getText());
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textfield.setText(string.replace(".0", ""));
            } else {
                textfield.setText(string);
            }
            label.setText("(sqr)" + str);
        } else if (source == buttonReciprocal) {
            number = Double.parseDouble(textfield.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textfield.setText(string.replace(".0", ""));
            } else {
                textfield.setText(string);
            }
        } else if (source == buttonEqual) {
           //Setting functionality for equal(=) button
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(textfield.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textfield.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textfield.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(textfield.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textfield.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textfield.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(textfield.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textfield.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textfield.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(textfield.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textfield.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textfield.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
 
            }
        }
 
 
    }
    
 
    public void enable() {
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textfield.setEnabled(true);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);
 
    }
 
    public void disable() {
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        textfield.setText("");
        label.setText(" ");
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);
    }

    
}
