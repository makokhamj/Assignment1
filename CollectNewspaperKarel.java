/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

//public class CollectNewspaperKarel extends Karel {
	
	// You fill in this part
	/*private void turnRight(){
		turnLeft();
		turnLeft();
		turnLeft();
	}
	private void turnAround(){
		turnLeft();
		turnLeft();
	}
	
	private void pick(){
		move();
		pickBeeper();
		move();
	}
	private void drop(){
		if (noBeepersPresent()){
			if (beepersInBag()) {
				move();		
				putBeeper();
			}
		}
	}
	private void move3steps(){
		move();
		move();
		move();
	}
	private void invertBeeperState() {
		if (beepersPresent()) {
			pickBeeper();
			} else {
				putBeeper();
			}
		}
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
		
		for (int i = 0; i < 5; i++) {
		move();
		fillPothole();
		move();
		}
		turnAround();
		move3steps();
		turnRight();
		move3steps();
	}
	*/
 	public class CollectNewspaperKarel extends SuperKarel {
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
	
	private void checkForPothole() {
		if (rightIsClear()) {
			fillPothole();
		}
	}
	public void run() {
		while (frontIsClear()) {
			checkForPothole();
			move();
			}
			checkForPothole();
		}
		

	 /* 
	 * public void run() {
		if (frontIsClear()) {
			fillPothole();
			turnAround();
			move();
			move();
			} 
		
		turnRight();
		move();
		turnLeft();
		move();
		pick();
		//invertBeeperState();
		turnLeft();
		move();
		turnRight();
		invertBeeperState();
		turnLeft();
		move3steps();
		drop();
		turnLeft();
		move3steps();
		//invertBeeperState();
		}*/
}
