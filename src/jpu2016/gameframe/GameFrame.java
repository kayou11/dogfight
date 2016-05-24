package jpu2016.gameframe;

import java.awt.event.KeyListener;

import javax.swing.JFrame;

import com.sun.glass.events.KeyEvent;

import javafx.beans.Observable;

public abstract class GameFrame extends JFrame implements KeyListener{

	private IEventPerformer eventPerformer; 
		
	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable) {	
		this.eventPerformer = performer;
	}
	
	public void keyPressed(KeyEvent keyEvent) {
		
	}
	
	public void keyReleased(KeyEvent keyEvent) {
		
	}
	
	public void keyTyped(KeyEvent keyEvent) {
		
	}
	
}
