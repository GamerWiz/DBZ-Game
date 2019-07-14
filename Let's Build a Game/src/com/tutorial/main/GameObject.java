package com.tutorial.main;

import java.awt.Graphics;

public abstract class GameObject { //abstract means this class can't be an object, only inherited classes 

	protected int x, y; //protected means only classes that extend GameObject can use these 
	protected ID id;
	protected int velX, velY; 
	
	public GameObject(int x, int y, ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public abstract void tick();    //Abstract will force me to use these methods in a GameObject Extension
	public abstract void render(Graphics g);
	
	//"this" makes sure that var being used is the one in THIS file (at the top) and not the one in the parameter
	//All of these methods are available in an extension
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y; 
	}
	
	public int getX() {	
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setID(ID id) {
		this.id = id;
	}
	
	public ID getID() {
		return id;
	}
	
	public void setVelX(int velX) {
		this.velX = velX;
	}
	
	public void setVelY(int velY) {
		this.velY = velY;
	}
	
	public int getVelX() {
		return velX;
	}
	
	public int getVelY() {
		return velY;
	}
}
