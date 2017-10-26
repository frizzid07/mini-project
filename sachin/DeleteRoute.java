

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DeleteRoute extends JFrame
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