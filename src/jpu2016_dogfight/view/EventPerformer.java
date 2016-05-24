package jpu2016_dogfight.view;

import com.sun.glass.events.KeyEvent;

import jpu2016.gameframe.IEventPerformer;
import jpu2016_dogfight.controller.IOrderPerformer;
import jpu2016_dogfight.controller.UserOrder;

public class EventPerformer implements  IEventPerformer{

	private IOrderPerformer orderPerformer; 
	
	public EventPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode) {
		return null;
		
	}

	@Override
	public void eventPerformer(KeyEvent keycode) {
		// TODO Auto-generated method stub
		
	}
}

