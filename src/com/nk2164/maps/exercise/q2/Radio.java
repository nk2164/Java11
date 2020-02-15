package com.nk2164.maps.exercise.q2;

public class Radio extends Equipment {

	private double frequency = 1.1;

	public double getFrequency() {
		return frequency;
	}

	@Override
	public void reset(Equipment e) {
		this.frequency = 0.0;
	}

	
}
