package statics.entity.desert;

import java.awt.Graphics;

import entity.StaticEntity;
import gfx.Assets;
import main.Handler;

public class StoneDesert3 extends StaticEntity {
	public StoneDesert3(Handler handler, float x, float y) {
		super(handler, x, y, 256, 256);
		
		bounds.x = 0;
		bounds.y = 100;
		bounds.width = 212;
		bounds.height = 120;
		
	}
	
	@Override
	public void tick() {
		
	}
	
	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.stoneDesert[2], (int)(x - handler.getGameCamera().getxOffset()), 
				(int)(y - handler.getGameCamera().getyOffset()), width, height, null);
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}
}

