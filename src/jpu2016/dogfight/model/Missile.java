package jpu2016.dogfight.model;

public class Missile {
private int SPEED = 4;
private int WIDTH = 100;
private int HEIGHT = 30;
private int MAX_DISTANCE_TRAVELED = 1400;
private String IMAGE = "Missile";
private int distanceTraveled = 0;
public Missile(Direction direction, Dimension dimension){
	
}
public int getWidthADirection(Direction direction) {
	return WIDTH;
	
}
public int getHeightADirection(Direction direction) {
	return HEIGHT;
	
}
void move() {
	
}
boolean isWeapon() {
	return false;
	
}
}
