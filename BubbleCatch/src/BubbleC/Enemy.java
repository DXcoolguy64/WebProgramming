package BubbleC;

import java.awt.Graphics;
import java.awt.Rectangle;

import BubbleC_Entity.EntityB;

public class Enemy extends GameObject implements EntityB {
	
	private Textures tex;
	
	public Enemy(double x, double y, Textures tex) {
		super(x,y);
		this.tex = tex;
	}
	
	public void tick() {
		y += 3;
	}
	
	public void render(Graphics g) {
		g.drawImage(tex.enemy, (int)x, (int)y, null);
	}
	
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 32, 32);
	}

	
	public double getX() {
		return x;
	}

	
	public double getY() {
		return y;
		
	}
}
