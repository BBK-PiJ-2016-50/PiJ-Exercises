println "Enter employee names and IDs one at a time: "

EmployeeArrays empArry = new EmployeeArrays()

boolean finished = false
while (!finished) {
	print "Name: "
	String name = System.console().readLine()
	if (name.length() == 0) {
		finished = true
	} else {
		print "ID: "
		String id = System.console().readLine()
		int empId = Integer.parseInt(id)
		if (empId != 0) {
			empArry.addNameToArray(name)
			empArry.addIdToArray(empId)
		} else {
			finished = true
		}
	}
}

names = empArry.getNames()
ids = empArry.getIds()

println "Names that start with 'S': "
for (int i = 0; i < names.length - 1; i++) {
	if (names[i].toLowerCase().startsWith("s")) {
		println names[i]
	} else if (ids[i] % 2 == 0) {
		println names[i]
	}
}
