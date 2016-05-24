package jpu2016_dogfight.view;

import java.util.Observable;
import jpu2016_dogfight.controller.IOrderPerformer;
import jpu2016_dogfight.model.IDogfightModel;

public abstract class DogfightView implements Runnable, IViewSystem{

	private IOrderPerformer orderPerformer;
	private IDogfightModel dogfightModel;
	
	public DogfightView(IOrderPerformer orderPerformer,IDogfightModel dogfightModel, Observable observable) {
		this.dogfightModel = dogfightModel;
		this.orderPerformer = orderPerformer;
	}

	@Override
	public void displayMesage(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
