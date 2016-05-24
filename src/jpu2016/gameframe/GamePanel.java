package jpu2016.gameframe;

import java.awt.Graphics;

import javax.swing.JPanel;

import java.util.Observable;
import java.util.Observer;

public abstract class GamePanel extends JPanel implements Observer {
	
	private IGraphicsBuilder graphicBuilder;
	
	public GamePanel(IGraphicsBuilder graphicBuilder) {
		this.graphicBuilder = graphicBuilder;
	}
	
	public void update(Observable observable) {
		return;
	}
	
	public void paintComponent(Graphics graphic) {
		
	}
}
