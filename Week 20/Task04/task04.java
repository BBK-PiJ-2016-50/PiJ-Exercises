public class task04 {

 public static void main(String[] args) {
   task04 t = new task04();
   t.launch();
 }

 private void launch() {
   String strOne = "some words";
   String strTwo = "some even more words";
   String result = betterEntry(strOne, strTwo, (s1, s2) -> s1.length() > s2.length());
   System.out.println("Better string is: " + result);
   int newResult = betterEntry(46, 33, (i1, i2) -> i1 > i2);
   System.out.println("Better int is: " + newResult);
 }
 
 private static <T> T betterEntry(T w1, T w2, TwoElementPredicate<T> exp) {
  return (exp.isFirstElementBetter(w1, w2)) ? w1 : w2;
 }

}