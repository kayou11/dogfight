package jpu2016_dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel{
	public DogfightModel() {
		
	}
	
	@Override
	public IArea getArea() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void buildArea(Dimension dimension) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void addMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void removeMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public ArrayList<IMobile> getMobile() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public IMobile getMobileByPlayer(int player) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void setMobilesHavesMoved() {
		// TODO Auto-generated method stub
		
	}

}
