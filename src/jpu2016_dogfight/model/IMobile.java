package jpu2016_dogfight.model;


import java.awt.Image;



public interface IMobile {
	Direction getDirection();
	void setDirection();
	Position getPosition();
	Dimension getDimension();
	int getWidth();
	int getHeight();
	int getSpeed();
	Image getImage();
	void move();
	void placeInArea(IArea area);
	boolean IsPlayer(int player);
	void setDogfightModel(DogfightModel dogfightModel);
	boolean hit();
	boolean isWeapon();
}

