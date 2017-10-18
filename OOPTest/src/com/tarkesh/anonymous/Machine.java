package com.tarkesh.anonymous;

public class Machine implements Plant{
	public void start() {
		System.out.println("Started");
	}

    @Override
    public void grow() {
        System.out.println("Grow Machine"); }
}
