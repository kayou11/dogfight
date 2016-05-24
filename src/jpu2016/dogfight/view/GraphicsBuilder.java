package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import java.awt.image;

public class GraphicsBuilder {

	private IDogfightModel dogfightModel; 
	
	public GraphicsBuilder(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}
	
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {
		
	}
	
	private void buildEmptySky() {	
		
	}
	
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {
		
	}
	
	public int getGlobalWidth() {
		return 0;
		
	}
	
	public int getGlobalHeigth() {
		return 0;
		
	}
}
