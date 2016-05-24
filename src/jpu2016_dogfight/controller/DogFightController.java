package jpu2016_dogfight.controller;

import jpu2016_dogfight.controller.UserOrder;
import jpu2016_dogfight.model.IDogfightModel;
import jpu2016_dogfight.model.IMobile;
import jpu2016_dogfight.model.Missile;
import jpu2016_dogfight.view.IViewSystem;

public class DogFightController implements IOrderPerformer{
	
	protected static int TME_SPLEEP = 30;
	private IViewSystem viewSystem;
	private IDogfightModel dogfightModel;
	
	public  DogFightController(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}
	
	@Override
	public void orderPerform(UserOrder userOrder) {
		
	}

	public void play() {

		this.gameLoop();
		this.setViewSystem(viewSystem);
	}
	
	public void setViewSystem(IViewSystem viewSystem) {
		this.viewSystem = viewSystem;
	}
	
	private void lauchMissile(int player){
		
		Missile missile = new Missile(dogfightModel.getMobileByPlayer(player).getDirection(), dogfightModel.getMobileByPlayer(player).getPosition());
	}
	
	private void manageColision(final IMobile mobile, final IMobile weapon){
		
		if (isWeaponOnMobile(mobile, weapon)){
			
		}
	}
	
	private boolean isWeaponOnMobile(final IMobile mobile, final IMobile weapon) {
		if (((weapon.getPosition().getX() / weapon.getWidth()) >= (mobile.getPosition().getX() / weapon.getWidth()))
				&& ((weapon.getPosition().getX() / weapon.getWidth()) <= ((mobile.getPosition().getX() + mobile.getWidth()) / weapon.getWidth()))) {
			if (((weapon.getPosition().getY() / weapon.getHeight()) >= (mobile.getPosition().getY() / weapon.getHeight())) 
					&& ((weapon.getPosition().getY() / weapon.getHeight()) <= ((mobile.getPosition().getY() + mobile.getHeight()) / weapon.getHeight()))) {
		                  return true;
			} 
		}
		return false;
	}
	
	private void gameLoop(){
		
	}
	

		 
}