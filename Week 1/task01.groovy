//takes your birth year and subtracts from current year to find your age
//it then checks if your age is greater than 17 and outputs the result


int currentYear = 2012
print "When were you born (year)?"
String str = System.console().readLine();
int birthYear = Integer.parseInt(str);
int ageAprox = currentYear - birthYear;
String result = (ageAprox > 17) ? "" : "not "
println "It seems you are " + result + "an adult."