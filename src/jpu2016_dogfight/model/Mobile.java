package jpu2016_dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile{
	private int speed;
	private Position position ;
	private Dimension dimension;
	private String image;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String Image){
		this.position = position;
		this.dimension = dimension;
		this.image = Image;
		this.speed = speed;
		
	}
	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setDirection() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Position getPosition() {
		// TODO Auto-generated method stub
		return this.position;
	}
	
	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean IsPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}
	public Color getColor() {
		return null;
	}
	
	public void moveUp() {
		
	}
	public void moveDown() {
		
	}
	public void moveLeft() {
		
	}
	public void moveRight() {
		
	}
}
