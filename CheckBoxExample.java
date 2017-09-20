import javax.swing.*;  
import java.awt.event.*;  
public class CheckBoxExample extends JFrame implements ActionListener{  
    JLabel l;  
    JCheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10;  
    JButton b;  
    CheckBoxExample(){  
        l=new JLabel("CHOOSE YOUR SEAT");  
        l.setBounds(200,50,300,20);  
        cb1=new JCheckBox("S1");  
        cb1.setBounds(100,100,150,20);  
        cb2=new JCheckBox("S2");  
        cb2.setBounds(100,150,150,20);  
        cb3=new JCheckBox("S3");  
        cb3.setBounds(100,200,150,20);
	 cb4=new JCheckBox("S4");  
        cb4.setBounds(100,250,150,20);
	 cb5=new JCheckBox("S5");  
        cb5.setBounds(100,300,150,20);
	 cb6=new JCheckBox("S6");  
        cb6.setBounds(300,100,150,20);
	 cb7=new JCheckBox("S7");  
        cb7.setBounds(300,150,150,20); 
	 cb8=new JCheckBox("S8");  
        cb8.setBounds(300,200,150,20);	
	 cb9=new JCheckBox("S9");  
        cb9.setBounds(300,250,150,20);
	 cb10=new JCheckBox("S10");  
        cb10.setBounds(300,300,150,20); 
        b=new JButton("SUBMIT");  
        b.setBounds(200,450,90,40);  
        b.addActionListener(this);  
        add(l);
	add(cb1);add(cb2);add(cb3);add(cb4);add(cb5);
	add(cb6);add(cb7);add(cb8);add(cb9);add(cb10);
	add(b);  
        setSize(600,600);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  

    public void actionPerformed(ActionEvent e)
    {  
        int seats=0;  
        String msg=""; 
 
        if(cb1.isSelected())
	{  	seats+=1;
              msg+="SEAT S1 IS BOOKED\n";  
        }  
        if(cb2.isSelected())
	{  	seats+=1;
              msg+="SEAT S2 IS BOOKED\n";  
        }  
        if(cb3.isSelected())
	{  	seats+=1;
              msg+="SEAT S3 IS BOOKED\n";  
        }  
        if(cb4.isSelected())
	{  	seats+=1;
              msg+="SEAT S4 IS BOOKED\n";  
        }  
        if(cb5.isSelected())
	{  	seats+=1;
              msg+="SEAT S5 IS BOOKED\n";  
        }  
        if(cb6.isSelected())
	{  	seats+=1;
              msg+="SEAT S6 IS BOOKED\n";  
        }  
        if(cb7.isSelected())
	{  	seats+=1;
              msg+="SEAT S7 IS BOOKED\n";  
        }  
        if(cb8.isSelected())
	{  	seats+=1;
              msg+="SEAT S8 IS BOOKED\n";  
        }  
        if(cb9.isSelected())
	{  	seats+=1;
              msg+="SEAT S9 IS BOOKED\n";  
        }  
        if(cb10.isSelected())
	{  	seats+=1;
              msg+="SEAT S10 IS BOOKED\n";  
        }  
        
/*        if(cb3.isSelected()){  
            amount+=10;  
            msg+="Tea: 10\n";  
        }
*/  
        msg+="----------------------------------\n";  
        JOptionPane.showMessageDialog(this,msg+"Total SEATS BOOKED "+seats);  
    }
  

    public static void main(String[] args) {  
        new CheckBoxExample();  
    }  
}  