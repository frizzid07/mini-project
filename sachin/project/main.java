package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AddRoute extends JFrame
{
	public static void Add()
	{
		JFrame an = new JFrame("ADD ROUTE");
		an.setBounds(300,100,600,500);
		an.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		an.setVisible(true);
		
		Container c1 =an.getContentPane();
        c1.setLayout(null);
		
		Font font = new Font("Trebuchet",Font.BOLD,15);
		Font font1 = new Font("Butler",Font.BOLD,15);
		
		JLabel b1 = new JLabel("Bus Number");
		b1.setBounds(30,50,200,40);
		c1.add(b1);
		JLabel b2 = new JLabel("Source");
		b2.setBounds(30,130,200,40);
		c1.add(b2);
		JLabel b3 = new JLabel("Destination");
		b3.setBounds(300,130,200,40);
		c1.add(b3);
		JLabel b4 = new JLabel("Bus Type");
		b4.setBounds(30,210,200,40);
		c1.add(b4);
		JLabel b5 = new JLabel("Fare(INR)");
		b5.setBounds(300,210,200,40);
		c1.add(b5);	
		
		
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		
		JTextField t1 = new JTextField();
        t1.setBounds(30,80,200,30);
		c1.add(t1);
		JTextField t2 = new JTextField();
        t2.setBounds(30,160,200,30);
		c1.add(t2);
		JTextField t3 = new JTextField();
        t3.setBounds(300,160,200,30);
		c1.add(t3);
		JTextField t4 = new JTextField();
        t4.setBounds(30,240,200,30);
		c1.add(t4);
		JTextField t5 = new JTextField();
        t5.setBounds(300,240,200,30);
		c1.add(t5);

		JButton bb1 = new JButton("ENTER");
		bb1.setBounds(140,325,200,30);
		bb1.setFont(font);
		c1.add(bb1);
		c1.revalidate();  
	}
    
    /*public static void main(String args[])
	{
      AddRoute a = new AddRoute();
	  a.Add();
	}
	*/
}		

class DeleteRoute extends JFrame
{
	public static void Delete()
	{
		JFrame cn =new JFrame("DELETE ROUTE");
		cn.setBounds(150,150,500,600);
		cn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		cn.setVisible(true);
		
		Container c3 = cn.getContentPane();
		c3.setLayout(null);
		
		Font font = new Font("Trebuchet",Font.BOLD,15);
		JLabel cl = new JLabel("ENTER THE BUS NUMBER");
		cl.setBounds(20,50,300,40);
		cl.setFont(font);
        c3.add(cl);
		
		JTextField ctext = new JTextField();
        ctext.setBounds(20,100,300,40);
		ctext.setForeground(Color.BLACK);
		c3.add(ctext);

		JLabel next = new JLabel();
   		next.setBounds(50,250,500,30);
		next.setFont(font);
		c3.add(next);

		JButton bb1 = new JButton("NEXT");
		bb1.setBounds(120,175,200,30);
		bb1.setFont(font);
        c3.add(bb1);

		bb1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event)
		{			
			next.setEnabled(true);
			String data1 = "The Deleted Bus is " + ctext.getText();
			next.setText(data1);
			
		}
		});
		c3.revalidate();
		
	}
	
	/*public static void main(String argd[])
	{
		DeleteRoute d = new DeleteRoute();
		d.Delete();
	}
    */
}	

class ViewBookings extends JFrame
{
	public static void Book()
	{
		JFrame bn =new JFrame("VIEW BOOKINGS");
		bn.setBounds(150,150,500,400);
		bn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		bn.setVisible(true);
		
		Container c2 = bn.getContentPane();
		c2.setLayout(null);
		
		Font font = new Font("Trebuchet",Font.BOLD,15);
		JLabel cl = new JLabel("ENTER THE BUS NUMBER");
		cl.setBounds(20,50,300,40);
		cl.setFont(font);
		c2.add(cl);

		JTextField ctext = new JTextField();
        ctext.setBounds(20,100,300,40);
		ctext.setForeground(Color.BLACK);
		c2.add(ctext);

		JButton p1 = new JButton("VIEW");
		p1.setBounds(40,150,300,40);
		c2.add(p1);
		c2.revalidate();
	}
	
	public static void main(String args[])
	{
		ViewBookings v = new ViewBookings();
		v.Book();
		
	}
}
