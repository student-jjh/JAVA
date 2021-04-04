package studyGUI;
import java.awt.*;
import javax.swing.*;
public class GUItest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("안녕하세요");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel primary= new JPanel();
		primary.setBackground(Color.yellow);
		primary.setPreferredSize(new Dimension(600,300));
		primary.setLayout(null);
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
		
		JLabel li1,li2,li3,li4;
		li1=new JLabel("SKKU University");
		li2=new JLabel("Business Administration");
		li3=new JLabel("2017313950");
		li4=new JLabel("Jun Joon Hyeok");
		
		Font fo = new Font("Verdana",Font.BOLD,25);
		li1.setFont(fo);
		li2.setFont(fo);
		li3.setFont(fo);
		li4.setFont(fo);
		
		li1.setBounds(50,50,300,50);
		li2.setForeground(Color.magenta);
		li2.setBounds(50,150,500,50);
		li3.setBounds(50,100,500,50);
		li4.setBounds(50,200,300,50);
		primary.add(li1);
		primary.add(li2);
		primary.add(li3);
		primary.add(li4);
	}

}
