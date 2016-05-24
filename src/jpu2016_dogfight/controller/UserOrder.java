package jpu2016_dogfight.controller;

public class UserOrder implements IUserOrder{
	
	private int player;

	public  UserOrder(int player, Order order) {
		
	}
	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}
	
	public Order getOrder() {
		return null;
	}
}