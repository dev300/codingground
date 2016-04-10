import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.applet.Applet;

public class TicTacToe extends Applet implements MouseListener 
{
	Board board = new Board(0,0,300,300,true, 2);
	public void init()
	{
		setSize(410,310);
		addMouseListener(this);
		setFocusable(true);
		//sets the default
	}
	public void paint(Graphics g)
	{
		board.display(g);
	}
	//displays the board
	public void mouseClicked(MouseEvent e)
	{
		
	}
	public void mouseEntered(MouseEvent e)
	{
		
	}
	public void mouseExited(MouseEvent e)
	{
		
	}
	public void mousePressed(MouseEvent e)
	{
	
		board.updateBoard(e.getX(), e.getY());
		//if(turn.equals("x")) turn=x;
		board.wonnered();
		//else turn="o";
		repaint();
		//checks if the piece is placeable and if the game has been won and then repaints the board
	}
	public void mouseReleased(MouseEvent e)
	{
		
	}

}
