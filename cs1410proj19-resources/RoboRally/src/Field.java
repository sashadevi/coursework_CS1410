
public class Field {
	// The depth and width of the field.
	private int depth, width;
	
	// Storage for the piece.
	private Piece[][] field;

	/**
	 * Represent a field of the given dimensions.
	 * @param depth The depth of the field.
	 * @param width The width of the field.
	 */

	public Field(int depth, int width) {
		this.depth = depth;
		this.width = width;
		field = new Piece[depth][width];
	}
	/**
	 * Empty the field.
	 */
	public void clear()
	{
		for(int row = 0; row < depth; row++) {
			for(int col = 0; col < width; col++) {
				field[row][col] = null;
			}
		}
	}
	
    public void place(Piece piece, int row, int col)
    {
        place(piece, new Location(row, col));
    }
    
    public void place(Piece piece, Location location)
    {
        field[location.getRow()][location.getCol()] = piece;
    }
    
    public Piece getObjectAt(Location location)
    {
        return getObjectAt(location.getRow(), location.getCol());
    }
    
    public Piece getObjectAt(int row, int col)
    {
        return field[row][col];
    }
    /**
	 * @return The depth of the field.
	 */
	public int getDepth()
	{
		return depth;
	}
	
	/**
	 * @return The width of the field.
	 */
	public int getWidth()
	{
		return width;
	}
	

}
