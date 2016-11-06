println "Create matrix: "
Matrix matrix = new Matrix(4, 5)
println matrix.matrix

println "Call setElement method.  Change cell 2, 3 to 8: "
matrix.setElement(2, 3, 8)
println matrix.matrix

println "Call setRow.  Change row 0 to values '2, 3, 4, 5': "
matrix.setRow(2, "2,3,4,5,6")
println matrix.matrix

println "Call setColumn.  Change column 2 to values '5, 6, 7, 8, 9': "
matrix.setColumn(2, "5,6,7,8")
println matrix.matrix

println "Call toString method: "
println matrix.toString()

println "Output matrix using prettyPrint method: "
matrix.prettyPrint()