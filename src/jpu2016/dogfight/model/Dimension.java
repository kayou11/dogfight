package jpu2016.dogfight.model;

public class Dimension {
	private int width;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	int height;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Dimension(int width, int height){
		this.width = width;
		this.height = height;
		
	}
	public Dimension(Dimension dimension) {
		
	}

}
