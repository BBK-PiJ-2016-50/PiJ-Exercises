//get cost of purchase
print "Enter the total cost of the purchase: "
String str1 = System.console().readLine()
double cost = Double.parseDouble(str1)

//get amount paid
print "Enter the amount paid: "
String str2 = System.console().readLine()
double paid = Double.parseDouble(str2)

//find total change required in pence
double changePence = (paid - cost) * 100
double change = changePence / 100

//find which dominations are required in the change
int dom50 = 0
int dom20 = 0
int dom10 = 0
int dom5 = 0
int dom2 = 0
int dom1 = 0
int dom05 = 0
int dom02 = 0
int dom01 = 0
int dom005 = 0
int dom002 = 0
int dom001 = 0

if (changePence == 0) {
	println "No change required to be given"
} else {
	while ((changePence / 5000) >= 1) {
		dom50++
		changePence = changePence - 5000
	}
	while ((changePence / 2000) >= 1) {
		dom20++
		changePence = changePence - 2000
	}
	while ((changePence / 1000) >= 1) {
		dom10++
		changePence = changePence - 1000
	}
	while ((changePence / 500) >= 1) {
		dom5++
		changePence = changePence - 500
	}
	while ((changePence / 200) >= 1) {
		dom2++
		changePence = changePence - 200
	}
	while ((changePence / 100) >= 1) {
		dom1++
		changePence = changePence - 100
	}
	while ((changePence / 50) >= 1) {
		dom05++
		changePence = changePence - 50
	}
	while ((changePence / 20) >= 1) {
		dom02++
		changePence = changePence - 20
	}
	while ((changePence / 10) >= 1) {
		dom01++
		changePence = changePence - 10
	}
	while ((changePence / 5) >= 1) {
		dom005++
		changePence = changePence - 5
	}
	while ((changePence / 2) >= 1) {
		dom002++
		changePence = changePence - 2
	}
	while ((changePence / 1) >= 1) {
		dom001++
		changePence = changePence - 1
	}
	
	println "Change is: " + change
	println "The following dominations of change should be given: "
	println "£50 notes: " + dom50
	println "£20 notes: " + dom20
	println "£10 notes: " + dom10
	println "£5 notes: " + dom5
	println "£2 coins: " + dom2
	println "£1 coins: " + dom1
	println "50p coins: " + dom05
	println "20p coins: " + dom02
	println "10p coins: " + dom01
	println "5p coins: " + dom005
	println "2p coins: " + dom002
	println "1p coins: " + dom001
}

