package com.nk2164.maps.exercise.q1;

public class PdfDocument extends Document {
	
	private String type = "pdf";
	private byte[] data;
	
	public String getType() {
		return type;
	}
	public byte[] getData() {
		return data;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	
}
