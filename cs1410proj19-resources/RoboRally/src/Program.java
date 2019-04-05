import java.util.ArrayList;

public class Program {
	private FileReader prg;
	private ArrayList<Robot> players;
	public Program(String filePrg) {
		prg= new FileReader(filePrg);
		players= new ArrayList<Robot>();
	}
	public void processProgram(){
		boolean end=false;
		String s =prg.getInput();
		s =prg.getInput();
		String[] names= s.split(" ");
		for(int i=0; i<names.length;i++) {
			Robot r = new Robot(names[i],null);
			players.add(r);
		}
		while(!end){
			s =prg.getInput();
			if(s.equals("")){
				end=true;
			}
			else {
				int k=0;
				for(int i=0;i<s.length();i+=5) {
					String[] action = s.split(" ");
					for(int j=0;j<action.length;j++){
						players.get(k).addAction(action[j]);;
					}
					k++;
				}
			}
		}
	}
}
