//PART 1
println "Welcome to My Mail Server!"

String fromEmail = ""
String toEmail = ""
String emailMsg = ""

//provide cmd prompt to user to input MAIL FROM info.  Perform validation
boolean correctInput = false
while (!correctInput) {
	print ">>> "
	String from = System.console().readLine()
	if (from.length() < 14) {
		println "Invalid command"
	} else {
		//check for correct keyword
		if (from.substring(0, 11) != "MAIL FROM: ") {
			println "Invalid command (fromtext)"
		} else {
			//check for correctly formatted email address
			String email = from.substring(11)
			if (checkEmail(email)) {
				println "OK"
				fromEmail = email
				correctInput = true
			} else {
				println "Invalid email address"	
			}
		}
	}
}

//PART 2
//provide cmd prompt to user
//should read a recipient - "RCPT FROM: <email-address>"
//check that cmd is properly written and email address is valid (@ sign, must not be first or last char)
//if error then tell user and get them to enter again
//if correct then output OK

//PART 3
//provide cmd prompt to user
//should read - "DATA"
//provide cmd prompt to user
//write email message, line after line (while loop)
//terminates with a line with a dot

//PART 4
//write out on screen who is sending the email
//write out who is receiving the email
//write out what the email says

//at any time if QUIT entered then program must terminate (wrap all text input in a method to check for QUIT)
//if any command RCPT, MAIL or DATA entered at wrong time, then output 'invalid command'


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