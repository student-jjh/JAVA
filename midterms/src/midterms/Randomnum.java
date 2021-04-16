package midterms;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Randomnum {

	public static void main(String[] args) {
		JFrame frame= new JFrame("RANDOM_NUMBER");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(200,200);
		frame.setPreferredSize(new Dimension(420,420));
		

		JPanel main= new JPanel();
		main.setPreferredSize(new Dimension(420,420));
		main.setLayout(null);
		frame.getContentPane().add(main);
		frame.setVisible(true);
		
		int col1,col2,col3,col4,col5,col6,col7,col8,col9;
		col1=(int)(Math.random()*256);
		col2=(int)(Math.random()*256);
		col3=(int)(Math.random()*256);
		col4=(int)(Math.random()*256);
		col5=(int)(Math.random()*256);
		col6=(int)(Math.random()*256);
		col7=(int)(Math.random()*256);
		col8=(int)(Math.random()*256);
		col9=(int)(Math.random()*256);
		Color backcolor =new Color(col1,col2,col3);
		
		int num1,num2;
		num1=(int)(Math.random()*6)+1;
		num2=(int)(Math.random()*6)+1;
		String num1s,num2s;
		num1s=Integer.toString(num1);
		num2s=Integer.toString(num2);
		JLabel num11,num22;
		num11=new JLabel();
		num22=new JLabel();
		num11.setText(num1s);
		num22.setText(num2s);
		
		Font big =new Font("serif",Font.BOLD,60);
		Font small=new Font("serif",Font.BOLD,30);
		JLabel mainlabel = new JLabel();
		
		if (num1==num2) {
			num11.setFont(big);
			num22.setFont(big);
		}
		else if (num1>num2) {
			num11.setFont(big);
			num22.setFont(small);
		}
		else {
			num11.setFont(small);
			num22.setFont(big);
		}
		num11.setBounds((int)(Math.random()*360),(int)(Math.random()*360),60,60);
		num22.setBounds((int)(Math.random()*360),(int)(Math.random()*360),60,60);
		num11.setHorizontalAlignment(JLabel.CENTER);
		num22.setHorizontalAlignment(JLabel.CENTER);
		num11.setForeground(new Color(col4,col5,col6));
		num22.setForeground(new Color(col7,col8,col9));
		
		mainlabel.setBounds(0,0,420,420);
		mainlabel.add(num11);
		mainlabel.add(num22);
		mainlabel.setOpaque(true);
		mainlabel.setBackground(backcolor);
		main.add(mainlabel);
		
	}

}
