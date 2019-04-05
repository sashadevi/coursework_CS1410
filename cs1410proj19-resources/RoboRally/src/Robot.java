import java.util.ArrayList;
import java.util.List;

public class Robot extends Piece{
	private String name;
	private ArrayList<String> actions;
	private Direction d;
	private Action a;
	public Robot(String name,Location l) {
		super(l);
		this.name=name;
		actions= new ArrayList<String>();
		d= Direction.NORTH;
	}
	public void addAction(String action) {
		actions.add(action);
	}
	public void goForward(){}
	public void goBackward(){}
	public void rotateLeft(){}
	public void rotateRight(){}
	public void makeUturn(){}
	public void makeWait(){}
	@Override
	public void act(Field currentField, Field updatedField, List<Piece> newPieces) {
		// TODO Auto-generated method stub
		
	}
	
}
