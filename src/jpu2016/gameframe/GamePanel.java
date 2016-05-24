package jpu2016.gameframe;

import java.awt.Graphics;

import javax.swing.JPanel;

import java.util.Observable;
import java.util.Observer;

public class GamePanel extends JPanel implements Observer {
	
	private IGraphicsBuilder graphicBuilder;
	
	public GamePanel(IGraphicsBuilder graphicBuilder) {
		this.graphicBuilder = graphicBuilder;
	}

	public void paintComponent(Graphics graphic) {
		
	}


	@Override
	public void update(Observable observable, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
