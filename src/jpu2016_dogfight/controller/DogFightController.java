package jpu2016_dogfight.controller;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.view.IViewSystem;

public class DogFightController implements IOrderPerformer{
	
	protected int TME_SPLEEP = 30;
	private IViewSystem viewSystem;
	private IDogfightModel dogfightModel;
	
	public  DogFightController(IDogfightModel dogfightModel) {
		
	}
	
	@Override
	public void orderPerform(UserOrder userOrder) {
		
	}

	public void play() {

	}
	
	public void setViewSystem(IViewSystem viewSystem) {
		this.viewSystem = viewSystem;
	}
	
	private void lauchMissile(int player){
		
	}
	
	private void gameLoop(){
		
	}
}