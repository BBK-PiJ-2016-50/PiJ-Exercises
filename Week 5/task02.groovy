int[] intArray = [1,2,3,6,6,3,2,1];

ArrayChecker ac = new ArrayChecker();

if (ac.isSymmetrical(intArray)) {
	println "Array is symmetrical";
} else {
	print "Array is not symmetrical.  So the array is reversed: ";
	println ac.reverse(intArray);
}
