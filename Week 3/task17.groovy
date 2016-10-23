println "Welcome to My Mail Server!"

String fromEmail = ""
String toEmail = ""
String emailMsg = ""

//PART 1
//provide cmd prompt to user to input MAIL FROM info.  Perform validation
boolean correctFromInput = false
while (!correctFromInput) {
	print ">>> "
	String from = System.console().readLine()
	checkQuit(from)
	if (from.length() < 14) {
		println "Invalid command"
	} else {
		//check for correct keyword
		if (from.substring(0, 11) != "MAIL FROM: ") {
			println "Invalid command"
		} else {
			//check for correctly formatted email address
			String email = from.substring(11)
			if (checkEmail(email)) {
				println "OK"
				fromEmail = email
				correctFromInput = true
			} else {
				println "Invalid email address"	
			}
		}
	}
}

//PART 2
//provide cmd prompt to user to input RCPT TO info.  Perform validation
boolean correctToInput = false
while (!correctToInput) {
	print ">>> "
	String to = System.console().readLine()
	checkQuit(to)
	if (to.length() < 12) {
		println "Invalid command"
	} else {
		//check for correct keyword
		if (to.substring(0, 9) != "RCPT TO: ") {
			println "Invalid command"
		} else {
			//check for correctly formatted email address
			String email = to.substring(9)
			if (checkEmail(email)) {
				println "OK"
				toEmail = email
				correctToInput = true
			} else {
				println "Invalid email address"	
			}
		}
	}
}

//PART 3
//provide cmd prompt to user to input email text
boolean correctDataInput = false
while (!correctDataInput) {
	print ">>> "
	String data = System.console().readLine()
	//check for correct keyword
	if (data != "DATA") {
		println "Invalid command"
	} else {
		//input message and terminate with a dot
		boolean dot = false
		while (!dot) {
			String msg = System.console().readLine()
			checkQuit(msg)
			if (msg != ".") {
				emailMsg += msg + "\n"
			} else {
				dot = true
			}
		correctDataInput = true	
		}
	}
}

//PART 4
println "Sending email..."
println "from: " + fromEmail
println "to: " + toEmail
println emailMsg
println "...done!"


//method for checking email addresses correctly formatted
boolean checkEmail(String email) {
	boolean existAtChar = false
	for (c=0; c < email.length(); c++) {
		String current = email.charAt(c)
		if (current == "@") {
			existAtChar = true
		}
	}
	if (!existAtChar || email.charAt(0) == "@" || email.charAt(email.length()-1) == "@") {
		return false
	} else {
		return true
	}
}

//method for checking if user wants to quit the program
void checkQuit(String str) {
	if (str == "QUIT") {
		println "Bye!"
		System.exit(0)
	} else {
		return
	}
}