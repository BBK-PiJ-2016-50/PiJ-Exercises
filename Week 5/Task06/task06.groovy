println "Create matrix: "
Matrix matrix = new Matrix(3, 3)
println matrix.matrix

println "Call setRow.  Change row 0 to values '1,2,3': "
matrix.setRow(0, "1,2,3")
println matrix.matrix

println "Call setRow.  Change row 1 to values '2,2,3': "
matrix.setRow(1, "2,2,3")
println matrix.matrix

println "Call setRow.  Change row 2 to values '3,3,3': "
matrix.setRow(2, "3,3,3")
println matrix.matrix

matrix.prettyPrint()

println "Check if matrix is symmetrical: "
println matrix.isSymmetrical()

println "Check if matrix is triangular: "
println matrix.isTriangular()