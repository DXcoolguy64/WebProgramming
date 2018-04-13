package BubbleC;

import java.awt.image.BufferedImage;

public class Textures {
	
	public BufferedImage player, enemy;
	
	private SpriteSheet ss;

	public Textures(Game game) {
		ss = new SpriteSheet(game.getSpriteSheet());
		
		getTextures();
	}
	private void getTextures() {
		player = ss.grabImage(1, 1, 32, 32);
		enemy = ss.grabImage(2, 1, 32, 32);
	}
}
