package jpu2016.dogfight.model;


import java.awt.Image;
import java.awt.Point;



public interface IMobile {
	Direction getDirection();
	void setDirection();
	Point getPosition();
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

