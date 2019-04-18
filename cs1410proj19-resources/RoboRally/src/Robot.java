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
	public void goForward(){
		int row = super.getLocation().getRow();
		int col = super.getLocation().getCol();
		switch(d) {
			case NORTH:
				row = row + 1;
				super.setLocation(row, col);
				break;

			case SOUTH:
				row = row - 1;
				super.setLocation(row, col);
				break;

			case EAST:
				col = col + 1;
				super.setLocation(row, col);
				break;

			case WEST:
				col = col - 1;
				super.setLocation(row, col);
				break;
		}
	}
	public void goBackward(){
		int row = super.getLocation().getRow();
		int col = super.getLocation().getCol();
		switch(d) {
			case NORTH:
				row = row - 1;
				super.setLocation(row, col);
				break;

			case SOUTH:
				row = row + 1;
				super.setLocation(row, col);
				break;

			case EAST:
				col = col - 1;
				super.setLocation(row, col);
				break;

			case WEST:
				col = col + 1;
				super.setLocation(row, col);
				break;
		}
	}
	public void rotateLeft(){
		switch(d) {
			case NORTH:
				d = NORTH.turnCounterClockwise();
				break;

			case EAST:
				d = EAST.turnCounterClockwise();
				break;

			case SOUTH:
				d = SOUTH.turnCounterClockwise();
				break;

			case WEST:
				d = WEST.turnCounterClockwise();
				break;
		}
	}
	public void rotateRight(){
		switch(d) {
			case NORTH:
				d = NORTH.turnClockwise();
				break;

			case EAST:
				d = EAST.turnClockwise();
				break;

			case SOUTH:
				d = SOUTH.turnClockwise();
				break;

			case WEST:
				d = WEST.turnClockwise();
				break;
		}
	}
	public void makeUturn(){
		switch (d) {
			case NORTH:
				d = NORTH.makeUturn();
				break;

			case EAST:
				d = EAST.makeUturn();
				break;

			case SOUTH:
				d = SOUTH.makeUturn();
				break;

			case WEST:
				d = WEST.makeUturn();
				break;
		}
	}
	public void makeWait(){
		int row = super.getLocation().getRow();
		int col = super.getLocation().getCol();
		super.setLocation(row, col);
	}
	@Override
	public void act(Field currentField, Field updatedField, List<Piece> newPieces) {
		// TODO Auto-generated method stub

	}

}
