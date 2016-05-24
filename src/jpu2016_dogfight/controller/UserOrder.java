package jpu2016_dogfight.controller;

public class UserOrder implements IUserOrder{
	
	private int player;
	private Order order;
	
	public  UserOrder(int player, Order order) {
	
		this.order = order;
		this.player = player;
	}
	
	@Override
	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}
	
	@Override
	public Order getOrder() {
		return this.order;
	}
}