
import stanford.karel.*;


public class RoadRepairKarel extends SuperKarel {
	private void fillPothole() {
		turnRight();
		move();
		if (noBeepersPresent()) {
		putBeeper();
		} 
		turnAround();
		move();
		turnRight();
		}
	
	public void run() {
		while (frontIsClear()) {
		move();
		fillPothole();
		move();
		}
		}
}