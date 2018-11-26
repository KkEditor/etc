package db_view;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
public class skim_coding {
	public static void main(String[] args) {
		JFrame a = new JFrame("Phan mem quan ly bai gui xe");
		JTabbedPane b =new JTabbedPane();
		JPanel mainP = new JPanel();
		ImageIcon z =new ImageIcon();
		b.addTab("Admin",z,mainP);		
		JLabel c = html.ret();
		mainP.add(c);
		JButton submit1 = new JButton("Submit");
		a.add(submit1);
		submit1.setBounds(170, 280, 100, 50);
		a.add(b);
		a.setVisible(true);
		a.setSize(500, 400);
	}
}
