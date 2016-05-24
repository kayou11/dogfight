package jpu2016.dogfight.model;

public class Position {
int x;
int y;
double maxX;
double maxY;


public Position(double x, double y, double maxX, double maxY){
	
}
public Position(Position position){
	
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public double getMaxX() {
	return maxX;
}
private void setMaxX(double maxX) {
	this.maxX = maxX;
}
private double getMaxY() {
	return maxY;
}
public void setMaxY(double maxY) {
	this.maxY = maxY;
}

}
