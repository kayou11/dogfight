package jpu2016_dogfight.model;

import java.util.ArrayList;

public interface IDogfightModel {
	IArea getArea();
	void buildArea(Dimension dimension);
	void addMobile(Mobile mobile);
	void removeMobile(Mobile mobile);
	ArrayList<IMobile> getMobile();
	IMobile getMobileByPlayer(int player);
	void setMobilesHavesMoved();
}
