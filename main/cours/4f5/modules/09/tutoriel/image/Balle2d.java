import javafx.scene.image.Image;

public class Balle2d extends ObjetPong2d {

	private Image image = new Image("/balle.png");

	@Override
	public void draw(GraphicsContext gc) {
		
		/* retirer
		gc.fillArc(getTopLeftX(),
				   getTopLeftY(),
				   getWidth(), 
				   getHeight(), 
				   0, 
				   360, ArcType.CHORD);
				   */
		
		// ajouter
		gc.drawImage(image,
				     getTopLeftX(),
				     getTopLeftY(),
				     getWidth(),
				     getHeight());
		
	}
