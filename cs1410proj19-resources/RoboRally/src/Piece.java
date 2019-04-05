import java.util.List;

public abstract class Piece {
	
	private Location location;
	
	public Piece(Location l) {
		this.location=l;
	}
	public void setLocation(int row, int col)
	{
		this.location = new Location(row, col);
	}
	
	public void setLocation(Location location)
	{
		this.location = location;
	}
	
	public Location getLocation() { return location; }
	
	public abstract void act(Field currentField, Field updatedField,List<Piece> newPieces);
}