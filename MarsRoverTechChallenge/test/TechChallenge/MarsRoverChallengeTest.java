package TechChallenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarsRoverChallengeTest {

	@Test
	void testPrintPosition() {
		String result = "";
		
		MarsRoverChallenge mrc = new MarsRoverChallenge("1 2 N");
		mrc.process("LMLMLMLMM");
		result = mrc.printRoverPosition();
		assertEquals("1 3 N", result);
		
		mrc = new MarsRoverChallenge("3 3 E");
		mrc.process("MMRMMRMRRM");
		result = mrc.printRoverPosition();
		assertEquals("5 1 E", result);
	}
}
