package jpu2016_dogfight.model;

public class Missile extends Mobile{
	
	private static int SPEED = 4;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "Missile";
	private int distanceTraveled = 0;
	
	public Missile(Direction direction, Position position){
		
		super(direction, position, new Dimension(WIDTH,HEIGHT), SPEED, IMAGE);
	}
	public static int getWidthADirection(Direction direction) {
		return WIDTH;
		
	}
	public static int getHeightADirection(Direction direction) {
		return HEIGHT;
		
	}
	public void move() {
		
	}
	public boolean isWeapon() {
		return false;
		
	}
}
