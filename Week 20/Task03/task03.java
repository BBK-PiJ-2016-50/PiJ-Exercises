public class task03 {

 public static void main(String[] args) {
   task03 t = new task03();
   t.launch();
 }

 private void launch() {
   String strOne = "some words";
   String strTwo = "some even more words";
   String result = betterString(strOne, strTwo, (s1, s2) -> s1.length() > s2.length());
   System.out.println("Better string is: " + result);
 }
 
 private static String betterString(String w1, String w2, TwoStringPredicate exp) {
  return (exp.isFirstStringBetter(w1, w2)) ? w1 : w2;
 }

}