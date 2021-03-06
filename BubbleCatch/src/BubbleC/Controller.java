package BubbleC;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Random;

import BubbleC_Entity.EntityA;
import BubbleC_Entity.EntityB;


public class Controller {
	
	private LinkedList<EntityA> ea = new LinkedList<EntityA>();
	private LinkedList<EntityB> eb = new LinkedList<EntityB>();
	
	EntityA enta;
	EntityB entb;
	private Textures tex;
	Random r = new Random();
	public Controller(Textures tex) {
		this.tex = tex;
		for(int i =0; i < 20; i++)
			addEntity(new Enemy(r.nextInt(640),100, tex));
			
		
	}
	
	public void tick() {
		for(int i = 0; i < ea.size(); i++) {
			enta = ea.get(i);
			
			enta.tick();
		}
			for(int i = 0; i < eb.size(); i++) {
				entb = eb.get(i);
				
				entb.tick();
			}
	}
		
		public void render(Graphics g) {
			for(int i = 0; i < ea.size(); i++) {
				enta = ea.get(i);
				
				enta.render(g);
	
		 }
			for(int i = 0; i < eb.size(); i++) {
				entb = eb.get(i);
				
				entb.render(g);
		}
 }
		public void addEntity(EntityA block) {
			ea.add(block);
		}
		public void removeEntity(EntityA block) {
			ea.remove(block);
		}
		public void addEntity(EntityB block) {
			eb.add(block);
		}
		public void removeEntity(EntityB block) {
			eb.remove(block);
		}
		public LinkedList<EntityA> getEntityA(){
			return ea;
		}
		public LinkedList<EntityB> getEntityB(){
			return eb;
		}
}
