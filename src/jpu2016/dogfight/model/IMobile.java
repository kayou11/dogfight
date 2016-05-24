package jpu2016.dogfight.model;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;

import com.sun.javafx.scene.traversal.Direction;

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
//void placeInArea(area : IArea);
//IsPlayer();
// setDogfightModel;
//boolean hit();
//boolean isWeapon();
}

