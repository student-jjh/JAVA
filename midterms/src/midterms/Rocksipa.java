package midterms;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;
public class Rocksipa {

	public static void main(String[] args) {
		ArrayList<BufferedImage> images = new ArrayList<BufferedImage>();
		JFrame frame= new JFrame("RockSiPa");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(200,200);
		frame.setPreferredSize(new Dimension(600,600));
		
		Font font=new Font("serif",Font.BOLD,30);
		
		JPanel primary= new JPanel();
		primary.setPreferredSize(new Dimension(600,600));
		primary.setLayout(null);
		frame.getContentPane().add(primary);
		frame.setVisible(true);
		
		
		File paperip=new File("/Users/junjoonheak/Desktop/java1/paper.png");
		File rockip=new File("/Users/junjoonheak/Desktop/java1/rock.jpeg");
		File siip=new File("/Users/junjoonheak/Desktop/java1/sissor.jpeg");
		BufferedImage paper = null;
		BufferedImage si = null;
		BufferedImage rock = null;
		try {
			paper=ImageIO.read(paperip);
			si=ImageIO.read(siip);
			rock=ImageIO.read(rockip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel leftli=new JLabel("User 1");
		JLabel rightli=new JLabel("User 2");
		
		leftli.setBounds(0,50,300,50);
		rightli.setBounds(300,50,300,50);
		
		images.add(rock);
		images.add(si);
		images.add(paper);
		
		leftli.setFont(font);
		rightli.setFont(font);
		
		primary.add(leftli);
		primary.add(rightli);
		
		double random1=Math.random();
		double random2=Math.random();
		int user1num=(int)(random1*3);
		int user2num=(int)(random2*3);
		
		JLabel leftbo =new JLabel(new ImageIcon(images.get(user1num)));
		JLabel rightbo=new JLabel(new ImageIcon(images.get(user2num)));
		JLabel versus=new JLabel("VS");
		
		versus.setFont(font);
		
		versus.setBounds(350,300,50,50);
		leftbo.setBounds(0,150,300,300);
		rightbo.setBounds(300,150,300,300);
		
		primary.add(leftbo);
		primary.add(rightbo);
		primary.add(versus);
		
		JLabel result;
		if (user1num==user2num) {
			result =new JLabel("DRAW");
			
		}
		else if((user1num==0 && user2num==1) || (user1num ==1 && user2num == 2) ||(user1num ==2 && user2num ==0) ){
			result =new JLabel("USER 1 win");
		}
		else {
			result = new JLabel("USER 2 win");
		}
		
		result.setFont(font);
		result.setBounds(210,500,200,200);
		primary.add(result);
		leftbo.setHorizontalTextPosition(JLabel.CENTER);
		rightbo.setHorizontalTextPosition(JLabel.CENTER);
		versus.setHorizontalTextPosition(JLabel.CENTER);
		result.setHorizontalAlignment(JLabel.CENTER);
		result.setVerticalAlignment(JLabel.TOP);
		leftli.setHorizontalAlignment(JLabel.CENTER);
		rightli.setHorizontalAlignment(JLabel.CENTER);
		
		
		
		
		
	}
	

}
