
import stanford.karel.*;

public class pickBeepers extends SuperKarel {
	
	public void turnAround() {
		turnLeft();
		turnLeft();
	}
	
	private void collectOneTower() {
		turnLeft();
		collectLineOfBeepers();
		turnAround();
		moveToWall();
		turnLeft();
		}
	
	private void collectAllBeepers() {
		while (frontIsClear()) {
		collectOneTower();
		move();
		}
		collectOneTower();
		}
	
	private void collectLineOfBeepers() {
		while (beepersPresent()) {
			pickBeeper();
			if (frontIsClear()) {
				move();
				}
			}
		}
	
	private void dropAllBeepers() {
		while (beepersInBag()) {
			putBeeper();
		}
	}
	
	private void moveToWall() {
		while (frontIsClear()) {
			move();
		}
	}

	private void returnHome() {
		turnAround();
		moveToWall();
		turnAround();
	}
	
	public void run() {
		collectAllBeepers();
		dropAllBeepers();
		returnHome();
	}

}
