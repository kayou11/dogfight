package jpu2016_dogfight.model;

public class Plane extends Mobile{
	private static int SPEED = 2;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	private int player;
	
	public Plane(int player, Direction direction, Position position, String Image ) {
		
		super(direction, position, new Dimension(WIDTH,HEIGHT), SPEED, Image);
		this.player = player;
	}
	
	public boolean isPlayer(int player){
		return (Boolean) null;
		
	}
	public boolean hit() {
		return false;
		
	}
}
