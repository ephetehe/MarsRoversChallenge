package TechChallenge;

public class MarsRoverChallenge {
	Integer N = 1;
	Integer E = 2;
	Integer S = 3;
	Integer W = 4;
	
	Integer x = 0;
	Integer y = 0;
	Integer direction = N;
	
	public MarsRoverChallenge(String roverCommand) {
		String [] commands = roverCommand.split(" ");
		this.x = Integer.valueOf(commands[0]);
		this.y = Integer.valueOf(commands[1]);
		
		if(commands[2].equals("N")) {
			this.direction = 1;
		}
		else if(commands[2].equals("E")) {
			this.direction = 2;
		}
		else if(commands[2].equals("S")) {
			this.direction = 3;
		}
		else if(commands[2].equals("W")) {
			this.direction = 4;
		}
	}
	
	public String printRoverPosition() {
		char dir = 'N';
		
		if (direction == 1) {
			dir = 'N';
		} else if (direction == 2) {
			dir = 'E';
		} else if (direction == 3) {
			dir = 'S';
		} else if (direction == 4) {
			dir = 'W';
		}
		
		System.out.println(x  + " " +  y  + " " +  dir);
		return (x  + " " +  y  + " " +  dir);
	}
	
	public void process(String movementCmd) {
		for (int i = 0; i < movementCmd.length(); i++ ) {
			if (String.valueOf(movementCmd.charAt(i)).equals("L")) {
				turnRoverLeft();
			} else if (String.valueOf(movementCmd.charAt(i)).equals("R")) {
				turnRoverRight();
			} else if (String.valueOf(movementCmd.charAt(i)).equals("M")) {
				moveRover();
			}
		}
	}
	
	private void moveRover() {
		if (direction == N) {
			this.y++ ;
		} else if (direction == E) {
			this.x++;
		} else if (direction == S) {
			this.y--;
		} else if (direction == W) {
			this.x--;
		}
	}
	
	private void turnRoverLeft() {
		direction = (direction - 1) < N ? W : direction - 1;
	}
	
	private void turnRoverRight() {
		direction = (direction  + 1) > W ? N : direction  + 1;
	}
}
