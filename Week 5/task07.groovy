



boolean run = true

while (run) {

	println "Here they come! Try to bring the plane down!"
	Target target = new Target(2)
	
	boolean success = false
	
	while (!success) {
		
		print "Enter a coordinate X: "
		String xStr = System.console().readLine()
		int x = Integer.parseInt(xStr)
		print "Enter a coordinate Y: "
		String yStr = System.console().readLine()
		int y = Integer.parseInt(yStr)
		print "Enter a coordinate Z: "
		String zStr = System.console().readLine()
		int z = Integer.parseInt(zStr)
		
		Result result = target.fire(x, y, z)
		
		switch (result) {
			case Result.HIT:
				println "You hit it! Well done!"
				if (tryAgain()) {
					success = true
				} else {
					success = true
					run = false
				}
				break;
			case Result.FAIL_LEFT:
				println "You missed! The target is to the right!"
				break;
			case Result.FAIL_RIGHT:
				println "You missed! The target is to the left!"
				break;
			case Result.FAIL_HIGH:
				println "You missed! The target is lower!"
				break;
			case Result.FAIL_LOW:
				println "You missed! The target is higher!"
				break;
			case Result.FAIL_SHORT:
				println "You missed! The target is farther!"
				break;
			case Result.FAIL_LONG:
				println "You missed! The target is nearer!"
				break;
			case Result.OUT_OF_RANGE:
				println "That shot is way out of range. Try harder!"
				break;
		}	
	}
	
}

boolean tryAgain() {
	print "Would you like to play again? y/n: "
	String choice = System.console().readLine()
	boolean correct = false
	
	while (!correct) {
	
		if (choice == "y") {
			return true
		} else if (choice == "n") {
			return false
		} else {
			println "choice not recognised.  Try again..."
		}
	
	}
}