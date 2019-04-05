/**
 * Represent a location in a rectangular grid.
 * 
 * @author Prabjot Ram
 * @version 1.0
 */
public class Location {
	// Row and column positions.
	int col,row;
	/**
     * Represent a row and column.
     * @param row The row.
     * @param col The column.
     */
	public Location(int col, int row){
		this.col=col;
		this.row=row;
	}
	/**
     * @return The column.
     */
	public int getCol() {
		return col;
	}
	/**
     * @return The row.
     */
	public int getRow() {
		return row;
	}
	public void setCol(int col) {
		this.col=col;
	}
	public void setRow(int row) {
		this.row=row;
	}
}
