
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Tictac extends JFrame implements ActionListener {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	public int count=0;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	Container c;
	public String player="player";
	public String winner="";
	public String player1=JOptionPane.showInputDialog("what is player1 name :");
	public String player2 =JOptionPane.showInputDialog("what is player2 name :");
	public void disable(JButton b1,JButton b2,JButton b3,JButton b4,JButton b5,JButton b6,JButton b7,JButton b8,JButton b9)
	{
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
	}
	public void check(){
		
			if(b1.getText()=="X" && b2.getText()=="X" && b3.getText()=="X"){
				winner="player";
				JOptionPane.showMessageDialog(this, player1+" won The Match");
				disable(b1,b2,b3,b4,b5,b6,b7,b8,b9);
				//new Tictac();
			}
			if(b4.getText()=="X" && b5.getText()=="X" && b6.getText()=="X"){
				winner="player";
				JOptionPane.showMessageDialog(this, player1+" won The Match");
				disable(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			}
			if(b7.getText()=="X" && b8.getText()=="X" && b9.getText()=="X"){
				winner="player";
				JOptionPane.showMessageDialog(this, player1+" won The Match");
				disable(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			}
			if(b1.getText()=="X" && b5.getText()=="X" && b9.getText()=="X"){
				winner="player";
				JOptionPane.showMessageDialog(this, player1+" won The Match");
				disable(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			}
			if(b3.getText()=="X" && b5.getText()=="X" && b7.getText()=="X"){
				winner="player";
				JOptionPane.showMessageDialog(this, player1+" won The Match");
				disable(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			}
			if(b1.getText()=="X" && b4.getText()=="X" && b7.getText()=="X"){
				winner="player";
				JOptionPane.showMessageDialog(this, player1+" won The Match");
				disable(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			}
			if(b2.getText()=="X" && b5.getText()=="X" && b8.getText()=="X"){
				winner="player";
				JOptionPane.showMessageDialog(this, player1+" won The Match");
				disable(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			}
			if(b3.getText()=="X" && b6.getText()=="X" && b9.getText()=="X"){
				winner="player";
				JOptionPane.showMessageDialog(this, player1+" won The Match");
				disable(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			}
			
			
			if(b1.getText()=="O" && b2.getText()=="O" && b3.getText()=="O"){
				winner="computer";
				JOptionPane.showMessageDialog(this, player2+" won The Match");
				disable(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			}
			if(b4.getText()=="O" && b5.getText()=="O" && b6.getText()=="O"){
				winner="computer";
				JOptionPane.showMessageDialog(this, player2+" won The Match");
				disable(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			}
			if(b7.getText()=="O" && b8.getText()=="O" && b9.getText()=="O"){
				winner="computer";
				JOptionPane.showMessageDialog(this, player2+" won The Match");
				disable(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			}
			if(b1.getText()=="O" && b5.getText()=="O" && b9.getText()=="O"){
				winner="computer";
				JOptionPane.showMessageDialog(this, player2+" won The Match");
				disable(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			}
			if(b3.getText()=="O" && b5.getText()=="O" && b7.getText()=="O"){
				winner="computer";
				JOptionPane.showMessageDialog(this, player2+" won The Match");
				disable(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			}
			if(b1.getText()=="O" && b4.getText()=="O" && b7.getText()=="O"){
				winner="computer";
				JOptionPane.showMessageDialog(this, player2+" won The Match");
				disable(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			}
			if(b2.getText()=="O" && b5.getText()=="O" && b8.getText()=="O"){
				winner="computer";
				JOptionPane.showMessageDialog(this, player2+" won The Match");
				disable(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			}
			if(b3.getText()=="O" && b6.getText()=="O" && b9.getText()=="O"){
				winner="computer";
				JOptionPane.showMessageDialog(this, player2+" won The Match");
				disable(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			}
			
				//winner="tie";
			if( count==9 && b1.isEnabled()==false && b2.isEnabled()==false &&b3.isEnabled()==false && b4.isEnabled()==false &&b5.isEnabled() == false && b6.isEnabled()==false &&b7.isEnabled()==false && b8.isEnabled()==false &&b9.isEnabled()==false){
				JOptionPane.showMessageDialog(this, "TIE TIC TAC");
				disable(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			}
			
			
			
		
	}
	Tictac(int width,int hight){
		//addMouseListener(this);
		
		this.setTitle("Tic Tac Toe by Alok Bhowmik");
		this.setVisible(true);
		this.setBounds(50,50,width,hight);
		//ImageIcon image =new ImageIcon("wikipedia5.jpg");
		//this.setIconImage(image.getImage());
		int x=150, y=50;
		b1=new JButton();
		b1.setText("");
		b1.setBounds(x, y, 50, 50);
		
		x+=50;
		b2=new JButton();
		b2.setText("");
		b2.setBounds(x, y, 50, 50);
		x+=50;
		b3=new JButton();
		b3.setText("");
		b3.setBounds(x, y, 50, 50);
		y+=50;
		x=150;
		b4=new JButton();
		b4.setText("");
		b4.setBounds(x, y, 50, 50);
		x+=50;
		b5=new JButton();
		b5.setText("");
		b5.setBounds(x, y, 50, 50);
		x+=50;
		b6=new JButton();
		b6.setText("");
		b6.setBounds(x, y, 50, 50);
		
		y+=50;
		x=150;
		b7=new JButton();
		b7.setText("");
		b7.setBounds(x, y, 50, 50);
		x+=50;
		b8=new JButton();
		b8.setText("");
		b8.setBounds(x, y, 50, 50);
		x+=50;
		b9=new JButton();
		b9.setText("");
		b9.setBounds(x, y, 50, 50);
		x+=50;
		y+=150;
		b10=new JButton();
		b10.setText("Restart");
		b10.setBounds(x, y, 100, 50);
		
		b10.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		c =this.getContentPane();
		c.setLayout(null);
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		c.add(b6);
		c.add(b7);
		c.add(b8);
		c.add(b9);
		c.add(b10);
	
	}

	public static void main(String args[]){
		Tictac t=new Tictac(500,500);
		
	}
	Font font =new Font("Arial",Font.BOLD,20);
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		if(e.getSource()==b1 && b1.getText()==""){
			if(player=="player"){
			b1.setText("X");
			b1.setEnabled(false);
			b1.setFont(font);
			b1.setBackground(Color.RED);
			player="computer";
			}
			else{
				b1.setText("O");
				b1.setEnabled(false);
				b1.setFont(font);
				b1.setBackground(Color.GREEN);
				player="player";
			}
			check();
		}
		if(e.getSource()==b2 && b2.getText()==""){
			count++;
			if(player=="player"){
			b2.setText("X");
			b2.setEnabled(false);
			b2.setFont(font);
			b2.setBackground(Color.RED);
			player="computer";
			}
			else{
				b2.setText("O");
				b2.setEnabled(false);
				b2.setFont(font);
				b2.setBackground(Color.GREEN);
				player="player";
			}
			check();
		}
		if(e.getSource()==b3 && b3.getText()==""){
			count++;
			if(player=="player"){
			b3.setText("X");
			b3.setEnabled(false);
			b3.setFont(font);
			b3.setBackground(Color.RED);
			player="computer";
			}
			else{
				b3.setText("O");
				b3.setEnabled(false);
				b3.setFont(font);
				b3.setBackground(Color.GREEN);
				player="player";
			}
			check();
		}
		if(e.getSource()==b4 && b4.getText()==""){
			count++;
			if(player=="player"){
			b4.setText("X");
			b4.setEnabled(false);
			b4.setFont(font);
			b4.setBackground(Color.RED);
			player="computer";
			}
			else{
				b4.setText("O");
				b4.setEnabled(false);
				b4.setFont(font);
				b4.setBackground(Color.GREEN);
				player="player";
			}
			check();
		}
		if(e.getSource()==b5 && b5.getText()==""){
			count++;
			if(player=="player"){
			b5.setText("X");
			b5.setEnabled(false);
			b5.setFont(font);
			b5.setBackground(Color.RED);
			player="computer";
			}
			else{
				b5.setText("O");
				b5.setEnabled(false);
				b5.setFont(font);
				b5.setBackground(Color.GREEN);
				player="player";
			}
			check();
		}
		if(e.getSource()==b6 && b6.getText()==""){
			count++;
			if(player=="player"){
			b6.setText("X");
			b6.setEnabled(false);
			b6.setFont(font);
			b6.setBackground(Color.RED);
			player="computer";
			}
			else{
				b6.setText("O");
				b6.setEnabled(false);
				b6.setFont(font);
				b6.setBackground(Color.GREEN);
				player="player";
			}
			check();
		}
		if(e.getSource()==b7 && b7.getText()==""){
			count++;
			if(player=="player"){
			b7.setText("X");
			b7.setEnabled(false);
			b7.setFont(font);
			b7.setBackground(Color.RED);
			player="computer";
			}
			else{
				b7.setText("O");
				b7.setEnabled(false);
				b7.setFont(font);
				b7.setBackground(Color.GREEN);
				player="player";
			}
			check();
		}
		if(e.getSource()==b8 && b8.getText()==""){
			count++;
			if(player=="player"){
			b8.setText("X");
			b8.setEnabled(false);
			b8.setFont(font);
			b8.setBackground(Color.RED);
			player="computer";
			}
			else{
				b8.setText("O");
				b8.setEnabled(false);
				b8.setFont(font);
				b8.setBackground(Color.GREEN);
				player="player";
			}
			check();
		}
		if(e.getSource()==b9 && b9.getText()==""){
			count++;
			if(player=="player"){
			b9.setText("X");
			b9.setEnabled(false);
			b9.setFont(font);
			b9.setBackground(Color.RED);
			player="computer";
			}
			else{
				b9.setText("O");
				b9.setEnabled(false);
				b9.setFont(font);
				b9.setBackground(Color.GREEN);
				player="player";
			}
			check();
		}
		if(e.getSource()== b10){
			count=0;
			
			b1.setText("");
			b2.setText("");
			b3.setText("");
			b4.setText("");
			b5.setText("");
			b6.setText("");
			b7.setText("");
			b8.setText("");
			b9.setText("");
			b1.setEnabled(true);
			b2.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
			b5.setEnabled(true);
			b6.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(true);
			b9.setEnabled(true);
			b1.setBackground(null);
			b2.setBackground(null);
			b3.setBackground(null);
			b4.setBackground(null);
			b5.setBackground(null);
			b6.setBackground(null);
			b7.setBackground(null);
			b8.setBackground(null);
			b9.setBackground(null);
			 player1=JOptionPane.showInputDialog("what is player1 name :");
			 player2 =JOptionPane.showInputDialog("what is player2 name :");
		}
	}
}
	