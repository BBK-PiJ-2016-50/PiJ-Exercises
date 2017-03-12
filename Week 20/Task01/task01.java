import java.util.Arrays;

public class task01 {

 public static void main(String[] args) {
   task01 t = new task01();
   t.launch();
 }

 private void launch() {
   String[] strArray = {"orange", "apple", "passion fruit", "pear", "banana"};
   
   //sort array by length
   Arrays.sort(strArray, (w1, w2) -> w1.length() - w2.length());
   System.out.println("Sorted by length (shortest to longest): " + Arrays.asList(strArray));
   
   //sort by reverse length
   Arrays.sort(strArray, (w1, w2) -> w2.length() - w1.length());
   System.out.println("Sorted by length (longest to shortest): " + Arrays.asList(strArray));
   
   //sort by first character
   Arrays.sort(strArray, (w1, w2) -> w1.charAt(0) - w2.charAt(0));
   System.out.println("Sorted by first letter: " + Arrays.asList(strArray));
   
   //strings containing e come first
   Arrays.sort(strArray, (w1, w2) -> {
     if (w1.contains("e") && !w2.contains("e")) {
       return -1;
     } else if (!w1.contains("e") && w2.contains("e")) {
       return 1;
     } else {
       return 0;
     }
   });
   System.out.println("Sorted by words with e first: " + Arrays.asList(strArray));

 }

}