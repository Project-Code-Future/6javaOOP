//Java Workshop 6: Object-Oriented Programming
/*KEY
+ Concept -> Make sure to read these out loud
@ Code Explanation -> Paraphrase these as necessary
& Interaction with Students -> These are suggestions, interact with students based on your best judgement
! Run the Code -> Press the run button and examine the output with students
() Anything within parentheses are notes for the INSTRUCTOR
*/

// (This workshop has several steps, each of which you should add on to the previous in your code. The way this file is written can't run because it has redundant repeating syntax in order to easily show step progression. Instead have one Class definition at the top of your file and keep coming back to it)

public class Workshop {
	public static void main(String[] args) {

		//+ Java is an object-oriented programming language. This means, if you're not working with your standard types like booleans, doubles, and ints, you're working with objects.
		//+	Objects are instances of anything you can think of. 

		/* Step 1 - create the class */
		class Robot {

		}
		//@ Here we create a class called Robot. Right now it doesn't have any properties or functionality 
    //+ You can think of a class as a blueprint used to create objects

		Robot ourRobot;
		//+ Just like with variables, when we create objects in Java, we state the type and then the name.
		//@ in this case, the name is 'ourRobot' and the type is Robot.
    //@ Notice how the type of the variable is the same as the name of our class

		ourRobot = new Robot();
		//+ When we initialize an object in Java, we need to use the 'new' keyword followed by a constructor
		//@ We will cover constructors in the next step

		Robot ourOtherRobot = new Robot();
		//@ Like with primitive types, we can declare and initialize objects on the same line.
		//@ On the left side, we create our Robot variable named 'ourOtherRobot' and on the right side we initialize it to a new instance of a Robot.

		/* Step 2 - add an empty constructor */
		class Robot {
			public Robot() {}
			//+ This is the constructor method. It's a special method because it has the same name as the class it's in. This is how we can create an instance of our Robot class. Think of it as the instructions on how to build your object
      //+ Even if you don't write a constructor, Java just uses an empty constructor to make your object like we were able to on lines 34 and 38.
			//@ Remember that the constructor is a method, albeit a special one. Currently it is taking no parameters
		}

		// Step 3 - add a private variable and initialize it through constructor
		class Robot {
			private String name;
			//+ Here we give our Robot class its first variable, the robot's name.
			//@ Notice that we use the keyword 'private' before creating our String, PRIVATE access to a variable means it can only be accessed inside the class, while PUBLIC access means it can be accessed from outside.
  
			public Robot(String inputName) {
        //+ When we create our Robot, we want to be able to give it a name by assigning a String to the name variable. We can do this by passing it through the constructor.

				name = inputName;
				//+ Here we assign whatever String the parameter is to the class variable called 'name'.
				//@ Now when we create a new Robot, we'll have to pass in a String parameter into the constructor for its name.
			}
		}

		/* Step 4 - create a method to retrieve the name */
		class Robot {
			private String name;

			public Robot(String inputName) {
				name = inputName;
			}

			public String getName() {
				return name;
			}
			//+ Here we create a method in our Robot class that will return the name variable so we can actually read what the name is.
			//@ The method simply returns the name variable to wherever this method is called.
		}

		Robot robot1 = new Robot("Sparky");
		//+ Now we declare and initialize a Robot, but this time we give the constructor a bit more info: a String of what name we'd like to give the Robot object
    //& Have the students name their Robot whatever they want

		System.out.println(robot1.getName());
		//& Ask the students what they think will get printed
		//! (make sure you are building off previous steps so your code will compile)
		//@ Remember, in our constructor we set the object's 'name' variable and return the same variable through the getName() method

		Robot robot2 = new Robot("Bop");
    System.out.println(robot2.getName());
		//& Ask the students what they think will get printed.
		//!
		//@ Here we create another robot instance with a different name

		

		/* Step 5 - creating a method to set the name */
		class Robot {
			private String name;

			public Robot(String inputName) {
				name = inputName;
			}

			public String getName() {
				return name;
			}

			public void setName(String newName) {
        //& Have students guess what this method will do
				//+ Here our method isn't returning anything; it's setting something in our Robot - the name.

				name = newName;
				//@ We take the String parameter and assign it to our class variable.
			}
		}

		robot2.setName("Zap");
    System.out.println(robot2.getName());
    //!
		//+ We created robot2 with an initial name of Bop, but now we're assigning that name to be something new.
    //& Have students change the name of their robots a few times

		System.out.println(robot1.getName());
		//& Ask the students what they think will get printed.
		//!
		//@ Our robot1 object did not have its name changed so "Sparky" is printed

		/* Step 6 - more variables and methods */
		class Robot {
			private String name;
			private boolean isPoweredOn;
			//+ We will add another variable to the Robot class which will represent whether the Robot is turned on or off
			//@ When the boolean is true, the robot will be on; when it's false, off.

			public Robot(String inputName) {
				name = inputName;
				isPoweredOn = true;
				//+ When we create a Robot with our constructor, we can initialize more of its variables without needing to input them as paramaters.
				//+ In this case, instead of getting input from the user we'll say the the Robot is turned on when we create it, isPoweredOn = true
			}

			public String getName() {
				return name;
			}

			public void setName(String newName) {
				name = newName;
			}

			public boolean isPoweredOn() {
				return isPoweredOn;
				//@ This method returns our boolean variable telling us whether it's on or off
			}

			public void powerUp() {
				isPoweredOn = true;
			}
			//@ Here we create a method that will turn the Robot on, so if it's already on nothing happens

			public void powerDown() {
				isPoweredOn = false;
			}
			//@ Similar to powerUp(), instead we turn if off
		}

    //& have students add code to test the functions, have them create instances of Robot and call the new methods on them

		/* Step 7 - adding a method to raise the robot's arm */
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
					//@ If the robot is on,
					System.out.println(name + " lifts its right arm.");
				} else {
					System.out.println(name + " is powered off!");
				}
			}
			//@ This method will do something different based on the power state of the Robot.
			//@ We will simply print the results so we can see them visually.

		}

		robot2.powerDown();
    //!
		//@ Our robots are initialized with a powered-on state. This will turn it off by setting the
		//@ isPoweredOn boolean to false.

		robot2.liftRightArm();
		//& Ask the students what they think will get printed
		//!
		//@ Since robot2 is currently turned off, our if clause doesn't execute, therefore the else clause does

		Robot robot3 = new Robot("Scrapper");
		//@ We're going to create another robot

		robot3.liftRightArm();
		//& Ask the students what they think will get printed.
		//!
		//@ One again, an initialized robot is in an on power state because that's how we've set up our constructor.

		robot2.liftRightArm();
		//+ We run this method again to see that robot2 is independent of the newly created robot3
    //@ Be aware that each object has its own variable data.

		if (robot3.isPoweredOn()) {
			robot3.powerDown();
		} else {
			robot3.powerUp();
		}
		//@ These lines of code essentially swap the power state of the Robot.
		//@ If Robot3 it is on, we turn it off
    //@ Otherwise it's off, so we turn it back on.

		robot3.liftRightArm();
		//& Ask the students what they think will get printed.
		//!
		//@ Robot3 was initialized as on, we swap the power state of robot3 to off, so nothing was printed

	}
}
