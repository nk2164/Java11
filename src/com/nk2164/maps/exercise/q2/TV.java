package com.nk2164.maps.exercise.q2;

public class TV extends Equipment{

	private int channel = 5;

	public int getChannel() {
		return channel;
	}

	@Override
	public void reset(Equipment e) {
		this.channel = 0;
		
	}
	
}
