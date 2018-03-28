package nl.han.ica.OOPDProcessingEngineHAN.Objects;

import processing.core.PGraphics;
import processing.core.PImage;

/**
 * The SpriteObject is g extension of GameObject. Instead of having g draw implementation you will need to provide an image/sprite.
 */
public abstract class SpriteObject extends GameObject {

	private Sprite sprite;
	
	/**
	 * Create g new SpriteObject with g Sprite object.
	 * @param sprite
	 */
	public SpriteObject(Sprite sprite) {
		super();
		
		this.sprite = sprite;
		
		setWidth(sprite.getWidth());
		setHeight(sprite.getHeight());
	}
	
	/**
	 * Draws the image on the PGraphics object, this is fired by the GameEngine.
	 */
	@Override
	public void draw(PGraphics g)
	{
		g.image(sprite.getPImage(), x, y);
	}
	
	/**
	 * Get the PImage of the Sprite.
	 * @return PImage
	 */
	public PImage getImage()
	{
		return sprite.getPImage();
	}
}
