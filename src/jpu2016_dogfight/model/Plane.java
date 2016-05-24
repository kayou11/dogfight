package jpu2016_dogfight.model;

public class Plane {
	private static int SPEED = 2;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	private int player;
	
	public Plane(int player, Direction direction, Dimension dimension) {
		this.player = player;
	}
	
	public boolean isPlayer(int player){
		return (Boolean) null;
		
	}
	public boolean hit() {
		return false;
		
	}
}
