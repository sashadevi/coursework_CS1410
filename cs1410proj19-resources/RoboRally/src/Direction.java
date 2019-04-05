
public enum Direction {	
	NORTH{ 
		public Direction turnClockwise() { return EAST; } 
		public Direction turnCounterClockwise() { return WEST; } 
	},
	SOUTH{
		public Direction turnClockwise() { return WEST; } 
		public Direction turnCounterClockwise() { return EAST; }
	},
	EAST{
		public Direction turnClockwise() { return SOUTH; } 
		public Direction turnCounterClockwise() { return NORTH; }
	},
	WEST{
		public Direction turnClockwise() { return NORTH; } 
		public Direction turnCounterClockwise() { return SOUTH; }
	};
		
	public abstract Direction turnClockwise(); 
	public abstract Direction turnCounterClockwise();
}
