import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class MyProject extends JFrame 
{
	public void vbs()
	{
		BookNow book = new BookNow();
		CancelNow cnl = new CancelNow();

		
		JFrame f =new JFrame("Virtaul Bus System");
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
		
		JLabel label4 = new JLabel("Plans changed,Cancel your ticket easily");
		label4.setBounds(100,340,600,40);

		Font f1 = new Font("Arial",Font.BOLD,30);
		label1.setFont(f1);
		Font f2 = new Font("Courier",Font.BOLD,20);
		label2.setFont(f2);
		//label3.setFont(f2);
		label4.setFont(f2);
	
		c.add(label1);
		c.add(label2);
		//c.add(label3);
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
	
		ImageIcon i2 =new ImageIcon("cancel.jpg");
		Image img1 = i2.getImage();  
		Image newimg1 = img1.getScaledInstance( 150, 40,  java.awt.Image.SCALE_SMOOTH ) ;  
		i2 = new ImageIcon( newimg1 );
		JButton b3 = new JButton(i2);
		b3.setBounds(150,380,150,40);
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event)
		{
			cnl.cancelframe();
		}
		});
		Cursor cur = new Cursor(Cursor.HAND_CURSOR);
		b1.setCursor(cur);
		b3.setCursor(cur);

		c.add(b1);
		c.add(b3);
		c.setBackground(Color.WHITE);
		f.setResizable(true);

	}

		public static void main(String args[])
{
	MyProject obj=new MyProject();
	obj.vbs();
}
	}

class BookNow
{   
    public static void bookframe()
	{
		//ShowBuses sbs = new ShowBuses();
		JFrame bn =new JFrame("BOOK TICKETS!");
		bn.setBounds(150,100,500,480);
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
		for(int i=1;i<32;i++)
			day_arr[i-1]=Integer.toString(i);
		JComboBox day = new JComboBox(day_arr);
		day.setBounds(120,150,50,30);
		String[] m={"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEPT","OCT","NOV","DEC"};
		JComboBox month = new JComboBox(m);
		month.setBounds(220,150,100,30);
		
		JLabel seats2 = new JLabel("Choose number of seats:");
		seats2.setBounds(50,280,300,40);
		c1.add(seats2);
		
		String[] seats = new String[20];
		for(int i=1;i<11;i++)
			seats[i-1]=Integer.toString(i);
		JComboBox seats1 = new JComboBox(seats);
		seats1.setBounds(220,300,50,30);
		c1.add(seats1);

		JButton conti = new JButton("Continue");
		conti.setBounds(150,355,150,40);
		conti.setFont(font);
		conti.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event)
		{
			JOptionPane.showMessageDialog(next,seats1.getItemAt(seats1.getSelectedIndex())+" seats booked");
			/*try
			{
				Connection conn=null;
			Statement st = null;
			ResultSet rs = null;
			
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			String msAccDB = "C:/Users/Admin/Desktop/OOPM/MiniProjectFiles/BusManagementSystemDatabase.accdb";
             String dbURL = "jdbc:ucanaccess://" + msAccDB; 
             conn = DriverManager.getConnection(dbURL); 
			 String s1,s2,s3,s4;
			 
			 String sql = "INSERT INTO BOOKTICKET VALUES('"+s.getSelectedItem().toString()+"','"+d.getSelectedItem().toString()+"','"+day.getSelectedItem().toString()+"','"+month.getSelectedItem().toString()+"','"+seats1.getSelectedItem().toString()+"');";
			st.executeUpdate(sql);
			}
			catch(Exception e)
			{
				
			}*/
		}
		});
		
		c1.add(b1);
		c1.add(s);
		c1.add(b2);
		c1.add(bb1);
		c1.add(next);
		c1.add(d);
		c1.add(day);
		c1.add(month);
		c1.add(od);
		c1.add(conti);
		c1.revalidate
		();
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
		JLabel cl = new JLabel("PLEASE ENTER YOUR TICKET ID(Username)");
		cl.setBounds(20,50,500,40);
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
		
		JButton next = new JButton("Confirm");
		next.setBounds(200,400,200,30);
		next.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event)
		{
				JOptionPane.showMessageDialog(next,"Ticket Cancelled"); 
		}
		});
		
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
		c3.add(next);
	}
} 



/*class ShowBuses{
	public static void showBuses()
	{
		JFrame sbf = new JFrame("Available Buses");
		sbf.setBounds(150,100,600,500);
		sbf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		sbf.setVisible(true);
		
		Container c4 =sbf.getContentPane();
        c4.setLayout(null);
		c4.setBackground(Color.WHITE);
		
		Font font = new Font("Arial",Font.ITALIC,15);
		
		JLabel sb1 = new JLabel("The available Buses are:");
		sb1.setBounds(30,5,400,20);
		c4.add(sb1);
		sb1.setFont(font);
		
		JLabel sb2 = new JLabel("BUS NUMBER                 BUS TYPE               TIME                AVAILABLE SEATS   ");
		sb2.setBounds(40,30,600,18);
		c4.add(sb2);

	
		Object data[][] ={{"MH123","AC","11","35"},{"MH123","AC","11","45"},{"MH123","AC","11","56"}};
		String column[] ={"Bus number","Bus Type","Time","Available seats"};
		JTable jt = new JTable(data,column);

		jt.setBounds(10,50,500,300);
		c4.add(jt);
		ButtonGroup buttonGroup = new ButtonGroup();
		int n=9;
		for(int i=0,y=50;i<n/3;i++,y=y+18)
		{
			JRadioButton js=new JRadioButton();
			buttonGroup.add(js);
			js.setBounds(525,y,18,17);
			c4.add(js);
		}
		
		JLabel sb3 = new JLabel("choose number of seats :");
		sb3.setBounds(40,400,300,30);
		c4.add(sb3);
		String[] seats = new String[20];
		for(int i=1;i<11;i++)
			seats[i-1]=Integer.toString(i);
		JComboBox seats1 = new JComboBox(seats);
		seats1.setBounds(220,400,50,30);
		c4.add(seats1);
		JButton next = new JButton("Next");
		next.setBounds(320,400,100,30);
		c4.add(next);
		next.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event)
		{
				JOptionPane.showMessageDialog(next,seats1.getItemAt(seats1.getSelectedIndex())+" seats booked"); 
		}
		});
	}
}*/