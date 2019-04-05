import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Board {
	// The width of the board.
	private int width;
	// The depth of the board.
	private int depth;
	private String[][] board = new String[6][8];
	private FileReader brd;
	// The list of pieces in the board
	private List<Piece> pieces;
	public Board(String fileBrd){
		brd= new FileReader(fileBrd);
		pieces= new ArrayList<Piece>();
	}
	public void processBoard(){       
		boolean end=false;
		int j=0;
		depth=0;
		while(!end){
			String line =brd.getInput();
			String[] s = brd.trimLine(line);
			if(s[0].equals("")){
				end=true;
			}
			else {
				depth++;
				width=line.length();
				for(int i=0;i<width;i++) {
					//Location l=new Location(i,j);
					//System.out.print(s[i]);
					board[j][i]=s[i];
					/*if(s[i].equals("[a-zA-Z]+")){
						Robot r = new Robot(null,l);
						pieces.add(r);
						board[j][i]= r;
					}
					else if(s[i].equals("[0-9]+")){
						Flag f = new Flag(l);
						pieces.add(f);
						board[j][i]= f;
					}else {
						board[j][i]=null;
					}*/
				}
				j++;
			}
		}
	}
	public int getWidth() { return width;}
	public int getDepth() { return depth;}
	public void print() {
		for(int j=0;j<depth;j++) {
			for(int i=0; i<width;i++) {
				System.out.print(board[j][i]);
			}
			System.out.println("");
		}
	}
}
