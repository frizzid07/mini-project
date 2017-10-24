import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyProject extends JFrame 
{
	public static void main(String args[])
	{
		BookNow book = new BookNow();
		PrintNow prt = new PrintNow();
		CancelNow cnl = new CancelNow();
		
		JFrame f =new JFrame("Vassapa Bus System");
		f.setBounds(100,100,1000,600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		ImageIcon i = new ImageIcon("download.jpg");	
	
		Container c = f.getContentPane();
		c.setLayout(null);
	
		/*Creating labels */
		JLabel label1 = new JLabel("Welcome to VBS!",i,JLabel.LEFT);
		label1.setBounds(200,20,700,150);
		
		JLabel label2 = new JLabel("BOOK YOUR TICKETS NOW !!");
		label2.setBounds(100,200,500,40);
	
		JLabel label3 = new JLabel("Print your tickets");
		label3.setBounds(100,300,500,40);
	
		JLabel label4 = new JLabel("Plans changed,Cancel your ticket easily");
		label4.setBounds(100,400,600,40);

		Font f1 = new Font("Arial",Font.BOLD,30);
		label1.setFont(f1);
		Font f2 = new Font("Courier",Font.BOLD,20);
		label2.setFont(f2);
		label3.setFont(f2);
		label4.setFont(f2);
	
	//f.setBackground(Color.WHITE);
	
		c.add(label1);
		c.add(label2);
		c.add(label3);
		c.add(label4);
	
		ImageIcon i1 =new ImageIcon("booknow.jpg");
		Image img = i1.getImage();  
		Image newimg = img.getScaledInstance( 150, 40,  java.awt.Image.SCALE_SMOOTH ) ;  
		i1 = new ImageIcon( newimg );
		JButton b1 = new JButton(i1);
		b1.setBounds(150,240,150,40);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event)
		{
			book.bookframe();
		}
		});
	
		JButton b2 = new JButton("PRINT TICKETS");
		b2.setBounds(150,340,150,40);
		b2.setBackground(Color.YELLOW);
		b2.setForeground(Color.RED);
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event)
		{
			prt.printframe();
		}
		});
	
	
		ImageIcon i2 =new ImageIcon("cancel.jpg");
		Image img1 = i2.getImage();  
		Image newimg1 = img1.getScaledInstance( 150, 40,  java.awt.Image.SCALE_SMOOTH ) ;  
		i2 = new ImageIcon( newimg1 );
		JButton b3 = new JButton(i2);
		b3.setBounds(150,440,150,40);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event)
		{
			cnl.cancelframe();
		}
		});
		Cursor cur = new Cursor(Cursor.HAND_CURSOR);
		b1.setCursor(cur);
		b2.setCursor(cur);
		b3.setCursor(cur);

		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.setBackground(Color.WHITE);
		f.setResizable(true);

	}
}

class BookNow
{   
    public static void bookframe()
	{
		JFrame bn =new JFrame("BOOK TICKETS!");
		bn.setBounds(150,100,500,600);
		bn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		bn.setVisible(true);
		
		Container c1 =bn.getContentPane();
        c1.setLayout(null);		
		
		Font font = new Font("Arial",Font.ITALIC,15);
		Font font1 = new Font("Butler",Font.BOLD,15);
		
		JLabel b1 = new JLabel("Choose your Source");
		b1.setBounds(30,10,200,40);
		
		JLabel b2 = new JLabel("Choose your Destination");
		b2.setBounds(300,10,200,40);
		
		b1.setFont(font);
		b2.setFont(font);
		String[] source ={"MUMBAI","KOLKATA","PUNE","BANGALORE","DELHI"};
		JComboBox s = new JComboBox(source);
		s.setBounds(50,50,100,30);
		
		String[] dest ={"MUMBAI","KOLKATA","PUNE","BANGALORE","DELHI"};
		JComboBox d = new JComboBox(dest);
		d.setBounds(320,50,100,30);
		
		JLabel next = new JLabel();
   		next.setBounds(50,250,500,30);
		next.setFont(font1);
		
		JButton bb1 = new JButton("NEXT");
		bb1.setBounds(120,200,200,30);
		bb1.setFont(font);
		bb1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event)
		{
			
			
			if( s.getItemAt(s.getSelectedIndex())== d.getItemAt(d.getSelectedIndex()))
			{
				JOptionPane.showMessageDialog(bb1,"Source and Destination cannot be same. "); 
				next.setEnabled(false);
			}
			else
			{
				next.setEnabled(true);
				String data1 = "The Route you entered is from " + s.getItemAt(s.getSelectedIndex()) + " to " + d.getItemAt(d.getSelectedIndex());
				next.setText(data1);
			}
		}
		});
		
		JLabel od = new JLabel("Journey Date:");
		od.setBounds(50,80,100,100);
		od.setFont(font);
		
		String[] day_arr = new String[31];
		for(int i=1;i<31;i++)
			day_arr[i-1]=Integer.toString(i);
		JComboBox day = new JComboBox(day_arr);
		day.setBounds(120,150,50,30);
		String[] m={"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEPT","OCT","NOV","DEC"};
		JComboBox month = new JComboBox(m);
		month.setBounds(220,150,100,30);
		
		c1.add(b1);
		c1.add(s);
		c1.add(b2);
		c1.add(bb1);
		c1.add(next);
		c1.add(d);
		c1.add(day);
		c1.add(month);
		c1.add(od);
		c1.revalidate
		();
	}
}


class PrintNow
{   
    public static void printframe()
	{
		
		JFrame pn =new JFrame("PRINT TICKETS");
		pn.setBounds(150,150,500,400);
		pn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		pn.setVisible(true);
		
		Container c2 =pn.getContentPane();
		c2.setLayout(null);
		
		JLabel ptr = new JLabel("PLEASE ENTER YOUR TICKET ID");
		ptr.setBounds(20,50,300,40);
		
		JTextField ptext = new JTextField();
        ptext.setBounds(20,100,300,40);
		
		JButton p1 = new JButton("GET TICKET!!");
		p1.setBounds(40,150,300,40);
		
		c2.add(ptr);
		c2.add(ptext);
		c2.add(p1);
	}
}


class CancelNow
{
	public static void cancelframe()
	{
		JFrame cn =new JFrame("CANCEL TICKETS");
		cn.setBounds(150,150,500,600);
		cn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		cn.setVisible(true);
		
		Container c3 = cn.getContentPane();
		c3.setLayout(null);
		
		Font font = new Font("Courier",Font.BOLD,15);
		JLabel cl = new JLabel("PLEASE ENTER YOUR TICKET ID");
		cl.setBounds(20,50,300,40);
		cl.setFont(font);
		
		JTextField ctext = new JTextField();
        ctext.setBounds(20,100,300,40);
		
		JLabel cl1 = new JLabel("Reason for cancellation");
		cl1.setBounds(20,150,300,40);
		cl1.setFont(font);
		
		
		JLabel cl2 = new JLabel("Got ticket for better price");
		cl2.setBounds(10,200,300,40);
		JLabel cl3 = new JLabel("Was booked bymistake");
		cl3.setBounds(10,250,300,40);
		JLabel cl4 = new JLabel("Plans Changed");
		cl4.setBounds(10,300,300,40);
		JLabel cl5 = new JLabel("Others");
		cl5.setBounds(10,350,300,40);
		
		JCheckBox cb1 = new JCheckBox();
		cb1.setBounds(300,200,30,30);
		
		JCheckBox cb2 = new JCheckBox();
		cb2.setBounds(300,250,30,30);
		
		JCheckBox cb3 = new JCheckBox();
		cb3.setBounds(300,300,30,30);
		
		JCheckBox cb4 = new JCheckBox();
		cb4.setBounds(300,350,30,30);
		
		c3.add(cl);
		c3.add(ctext);
		c3.add(cl1);
		c3.add(cl2);
		c3.add(cl3);
		c3.add(cl4);
		c3.add(cl5);
		c3.add(cb1);
		c3.add(cb2);
		c3.add(cb3);
		c3.add(cb4);	
	}
} 