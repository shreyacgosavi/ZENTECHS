import java.awt.*;  
import java.awt.event.*;

import javax.swing.JFrame;  

public class TASK3 implements ActionListener
{  
TextField tf1,tf2,tf3;
Button b1,b2,b3,b4,b5;
Label l1,l2,l3;

 /**
 * 
 */
TASK3()
 {  
    Frame f=new Frame("SIMPLE CALCULATOR");  

    l1=new Label("NUMBER 1");
    l1.setBounds(50, 40, 100, 10);
    l2=new Label("NUMBER 2");
    l2.setBounds(50, 85, 100, 10);
    l3=new Label("RESULT");
    l3.setBounds(50, 130, 100, 10);
    
    tf1=new TextField();  
    tf1.setBounds(50,60, 150,20); 
    tf2=new TextField();  
    tf2.setBounds(50,100, 150,20);
    tf3=new TextField();  
    tf3.setBounds(50,150, 150,20);
    tf3.setEditable(false);

    b1=new Button("Add");  
    b1.setBounds(50,200,60,30);    
    b2=new Button("Subtract");  
    b2.setBounds(50,250,60,30); 
    b3=new Button("Multiply");  
    b3.setBounds(50,300,60,30); 
    b4=new Button("Divide");  
    b4.setBounds(50,350,60,30); 
    b5=new Button("Exit");  
    b5.setBounds(50,400,60,30); 

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);

     f.add(b1);
     f.add(b2);
     f.add(b3);
     f.add(b4);
     f.add(b5);

     f.add(l1);
     f.add(tf1);  
     f.add(l2);
	 f.add(tf2);  
     f.add(l3);
     f.add(tf3);

     Color backgroundColor = new Color(130, 171, 161);
     Color backgroundColorb = new Color(232, 174, 183);
  

     f.setSize(300,500);  
     f.setLayout(null);  
     f.setVisible(true); 
     f.setBackground(backgroundColor);
     l1.setBackground(backgroundColor);
     l2.setBackground(backgroundColor);
     l3.setBackground(backgroundColor);
     b1.setBackground(backgroundColorb);
     b2.setBackground(backgroundColorb);
     b3.setBackground(backgroundColorb);
     b4.setBackground(backgroundColorb);
     b5.setBackground(backgroundColorb);
     

 }

 public void actionPerformed(ActionEvent e)
 {  
    double number1 =0.0;
    double number2=0.0;
    number1 = Double.parseDouble(tf1.getText());
    number2 = Double.parseDouble(tf2.getText());
    if(e.getSource()==b1)
    {
        double ans=number1+number2;
        String num = Double.toString(ans);
        tf3.setText(num);
    }
    else if(e.getSource()==b2)
    {
        double answ=number1-number2;
        String num1 = Double.toString(answ);
        tf3.setText(num1);
    }
    else if(e.getSource()==b3)
    {
        double answe=number1*number2;
        String num2 = Double.toString(answe);
        tf3.setText(num2);
    }
    else if(e.getSource()==b4)
    {
        double answer=number1/number2;
        String num3 = Double.toString(answer);
        tf3.setText(num3);
    }  
    else if(e.getSource()==b5)
    {
        System.exit(0);
    }
 }

 public static void main(String args[])
 {

        new TASK3();

 }
}

