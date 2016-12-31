//calculate how much must be paid at the end
//t = c*(1+(r/100))
//t is total, c is cost, r is rate(%)

print "What is the total amount borrowed for your mortgage? "
String mtgStr = System.console().readLine()
double mtg = Double.parseDouble(mtgStr)
print "How many years to pay it back? "
String yrsStr = System.console().readLine()
double yrs = Double.parseDouble(yrsStr)
print "What is the interest rate? "
String rateStr = System.console().readLine()
double rate = Double.parseDouble(rateStr)

//The total amount to be paid
double totalAmount(double mtg, double rate) {
	double total = mtg*(1+(rate/100))
	return total
}

//The money to be paid every year
double payPerYear(double total, double yrs) {
	double perYear = total / yrs
	return perYear
}

//The number of years before the interest is paid and only the initial capital remains
double interestYears(double total, double mtg, double perYear) {
	double interest = total - mtg
	return interest / perYear
}

double total = totalAmount(mtg, rate)
double perYear = payPerYear(total, yrs)

println "Total amount to be paid: " + total
println "Money to be paid per year: " + payPerYear(total, yrs)
println "Number of years before interest paid: " + interestYears(total, mtg, perYear)