// Functional Robot class for Workshop 6: Object-Oriented Programming

public class OutlineClass {
	public static void main(String[] args) {

		class Robot {
			private String name;
			private boolean isPoweredOn;

			public Robot(String inputName) {
				name = inputName;
				isPoweredOn = true;
			}

			public String getName() {
				return name;
			}

			public void setName(String newName) {
				name = newName;
			}

			public boolean isPoweredOn() {
				return isPoweredOn;
			}

			public void powerUp() {
				isPoweredOn = true;
			}

			public void powerDown() {
				isPoweredOn = false;
			}

			public void liftRightArm() {
				if (isPoweredOn) {
					System.out.println(name + " lifts its right arm.");
				} else {
					System.out.println(name + " is powered off!");
				}
			}

		}

		Robot robot1 = new Robot("Sparky");

		System.out.println(robot1.getName());

		Robot robot2 = new Robot("Bop");

		System.out.println(robot2.getName());

		robot2.setName("Zap");

		System.out.println(robot1.getName());
		System.out.println(robot2.getName());

		robot2.powerDown();

		robot2.liftRightArm();

		Robot robot3 = new Robot("Scrapper");

		robot3.liftRightArm();

		if (robot3.isPoweredOn()) {
			robot3.powerDown();
		} else {
			robot3.powerUp();
		}

		robot3.liftRightArm();

	}
}