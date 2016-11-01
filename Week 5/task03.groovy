int[] arrayOne = [1,2,3,4,5]
int[] arrayTwo = [7,8,8,9,10]

println "Source and destination same size: "
ArrayCopier sameSize = new ArrayCopier()
println sameSize.copy(arrayOne, arrayTwo)

int[] arrayThree = [8,9]
int[] arrayFour = [1,2,3,4,5]

println "Source smaller than destination: "
ArrayCopier srcSmall = new ArrayCopier()
println srcSmall.copy(arrayThree, arrayFour)

int[] arrayFive = [17,28,59,78]
int[] arraySix = [50,60]

println "Source larger than destination: "
ArrayCopier srcBig = new ArrayCopier()
println srcBig.copy(arrayFive, arraySix)


