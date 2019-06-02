import java.util.Scanner;

public class MarsRoverChallenge {
	Integer N = 1;
	Integer E = 2;
	Integer S = 3;
	Integer W = 4;
	
	Integer x = 0;
	Integer y = 0;
	Integer direction = N;
	
	public MarsRoverChallenge(){
	}
	
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
	
	public static void main(String [] args){
		
		MarsRoverChallenge mrc = new MarsRoverChallenge();
		/*
		if(args.length < 3 || args.length > 3){
			System.out.println("Please only pass 3 values.");
		}
		else{
			mrc.x = Integer.valueOf(args[0]);
			mrc.y = Integer.valueOf(args[1]);
			
			if(args[2].equals("N")) {
				mrc.direction = 1;
			}
			else if(args[2].equals("E")) {
				mrc.direction = 2;
			}
			else if(args[2].equals("S")) {
				mrc.direction = 3;
			}
			else if(args[2].equals("W")) {
				mrc.direction = 4;
			}
		}*/
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter first line: ");
		String roverPosition = userInput.nextLine(); 
		String [] commands = roverPosition.split(" ");
		
		if(commands.length < 3 || commands.length > 3){
			System.out.println("Please only pass 3 values seperated by spaces.");
		}
		else{
			mrc.x = Integer.valueOf(commands[0]);
			mrc.y = Integer.valueOf(commands[1]);
			
			if(commands[2].equals("N")) {
				mrc.direction = 1;
			}
			else if(commands[2].equals("E")) {
				mrc.direction = 2;
			}
			else if(commands[2].equals("S")) {
				mrc.direction = 3;
			}
			else if(commands[2].equals("W")) {
				mrc.direction = 4;
			}
		}
		
		System.out.println("Please enter second line: ");
		String roverMovement = userInput.nextLine(); 
		
		mrc.process(roverMovement);
		
		System.out.println("Rover Position: " + mrc.printRoverPosition());
	}
}