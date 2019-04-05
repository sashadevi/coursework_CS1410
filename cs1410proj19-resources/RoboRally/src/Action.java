
public enum Action {
	FORWARD{ 
		public void run(Robot r) { r.goForward();} 
	}, 
	BACKWARD{
		public void run(Robot r) { r.goBackward();}
	}, 
	LEFT{
		public void run(Robot r) { r.rotateLeft();}
	},
	RIGHT{
		public void run(Robot r) { r.rotateRight();}
	}, 
	UTURN{
		public void run(Robot r) { r.makeUturn();}
	},
	WAIT{
		public void run(Robot r) { r.makeWait();}
	}; 
		
	public abstract void run(Robot r);
}
