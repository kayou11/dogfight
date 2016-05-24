package jpu2016.dogfight.view;

import javafx.beans.Observable;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016_dogfight.controller.IOrderPerformer;

public abstract class DogfightView implements Runnable, IViewSystem{

	public DogfightView(IOrderPerformer orderPerformer,IDogfightModel dogfightModel, Observable observable) {
		
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
