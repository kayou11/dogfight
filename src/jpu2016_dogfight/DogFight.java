package jpu2016_dogfight;

import jpu2016_dogfight.model.DogfightModel;
import jpu2016_dogfight.view.DogfightView;
import jpu2016_dogfight.controller.DogFightController;

public abstract class DogFight{
	
	public static void main(final String[] args) {
		
		final DogfightModel dogfightModel = new DogfightModel();
		final DogFightController dogfightController = new DogFightController(dogfightModel); 
		final DogfightView dogfightView = new dog
		dogfightController.setViewSystem(dogfightView);
		dogfightController.play();
	}
}