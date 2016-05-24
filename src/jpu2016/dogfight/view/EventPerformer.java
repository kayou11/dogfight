package jpu2016.dogfight.view;

import com.sun.glass.events.KeyEvent;

import jpu2016.gameframe.IEventPerformer;
import jpu2016_dogfight.controller.IOrderPerformer;
import jpu2016_dogfight.controller.UserOrder;

public abstract class EventPerformer implements  IEventPerformer{

	private IOrderPerformer orderPerformer; 
	
	public EventPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}

	public void eventPerform(KeyEvent keyCode) {

	}
	
	private UserOrder keyCodeToUserOrder(int keyCode) {
		
	}
}

