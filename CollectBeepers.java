

import stanford.karel.*;

public class CollectBeepers extends SuperKarel {
		public void run() {
			collectAllBeepers();
			dropAllBeepers();
			returnHome();
		}
	 
		private void collectAllBeepers() {
			while (frontIsClear()) {
			collectOneTower();
			move();
			}
			collectOneTower();
		}
		
		private void collectOneTower() {
			turnLeft();
			collectLineOfBeepers();
			turnAround();
			moveToWall();
			turnLeft();
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
	
		private void returnHome() {
			turnAround();
			moveToWall();
			turnAround();
		}
	 
		private void moveToWall() {
			while (frontIsClear()) {
				move();
			}
		}
	}