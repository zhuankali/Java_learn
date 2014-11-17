package kali_1;
import java.awt.Graphics;
import javax.swing.JApplet;

public class Hello_2 extends JApplet
{
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g){
		g.clearRect(0,0,getWidth(), getHeight());
		g.drawString("",10,20);
	}
}
