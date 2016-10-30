String[] names
names = new String[10]
int[] ids
ids = new int[10]

println "Enter name and ID for employees"
for (int i=0; i < 10; i++) {
	print "employee name: "
	String employee = System.console().readLine()
	
	print "employee ID: "
	String strId = System.console().readLine()
	int id = Integer.parseInt(strId)
	
	names[i] = employee
	ids[i] = id
}

println "Names and IDs of employees with ID less than 1000: "
for (int i=0; i < names.length; i++) {
	if (ids[i] < 1000) {
		println names[i] + " : " + ids[i]
	}
}

println "Names and IDs of employees with name starting with J or S: "
for (int i=0; i < names.length; i++) {
	String currentName = names[i]
	if (currentName[0] == "J" || currentName[0] == "S") {
		println currentName + " : " + ids[i]
	}
}


