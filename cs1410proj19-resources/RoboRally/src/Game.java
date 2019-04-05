import java.util.ArrayList;
import java.util.List;

public class Game {
	// The width of the board.
	private int width;
	// The depth of the board.
	private int depth;
	// The list of pieces in the field
	private List<Piece> pieces;
	// The current state of the field.
	private Field field;
	// A second field, used to build the next stage of the simulation.
	private Field updatedField;
	//The board file
	private Board brd;
	//The program file
	private Program prg;
	public static void main(String[] args) {
		Game g = new Game("games/01-90degturn/alice-wins.prg","games/01-90degturn/board.brd");
		g.brd.processBoard();
		g.brd.print();
	}
	public Game(String filePrg,String fileBrd) {
		brd= new Board(fileBrd);
		prg= new Program(filePrg);
		pieces= new ArrayList<Piece>();
		field = new Field(brd.getDepth(), brd.getWidth());
		updatedField = new Field(brd.getDepth(), brd.getWidth());
	}
	
}
