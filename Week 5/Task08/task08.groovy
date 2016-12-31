println "Enter employee names and IDs one at a time: "

EmployeeArrays empArry = new EmployeeArrays()

//get the employee name and id and add to array
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

//get the names and ids for employees and print them out if name starts with S or if ID is even
names = empArry.getNames()
ids = empArry.getIds()

println "Names that start with 'S' or ID is even: "
for (int i = 0; i < names.length - 1; i++) {
	if (names[i] != null && names[i].startsWith("S")) {
		println names[i]
	} else if (names[i] != null && ids[i] % 2 == 0) {
		println names[i]
	}
}
