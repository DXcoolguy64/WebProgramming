package BubbleC;

import java.util.LinkedList;

import BubbleC_Entity.EntityA;
import BubbleC_Entity.EntityB;

public class Physics {
public static boolean Collision(EntityA enta, LinkedList<EntityB> entb) {
	
	for(int i = 0; i < entb.size(); i++) {
		if(enta.getBounds().intersects(entb.get(i).getBounds()));
			return true;
	}
	
	return false;
	
}
}
