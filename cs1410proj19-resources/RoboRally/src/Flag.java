import java.util.List;

public class Flag extends Piece {
	private boolean flagActivated;
	
	public Flag(Location location) {
		super(location);
		flagActivated=false;
	}
	
	public void flagTouched() {
		/*Field field = getField();
		Object piece = field.getObjectAt(getLocation());
			if(piece instanceof Robot) {
				//a
			}*/
	}

	@Override
	public void act(Field currentField, Field updatedField, List<Piece> newPieces) {
		// TODO Auto-generated method stub
		
	}
	

}
