import java.util.*;
import java.util.stream.*;

public class task02 {
  
  public static void main(String[] args) {
    task02 script = new task02();
    script.launch();
  }
  
  private void launch() {
    Dish fish = new Dish("fish", false, 100, Dish.Type.FISH);
    Dish pork = new Dish("pork", false, 455, Dish.Type.MEAT);
    Dish curry = new Dish("curry", false, 200, Dish.Type.OTHER);
    Dish pasta = new Dish("pasta", true, 300, Dish.Type.OTHER);
    Dish beef = new Dish("beef", false, 350, Dish.Type.MEAT);
    Dish muesli = new Dish("muesli", true, 50, Dish.Type.OTHER);
    Dish chicken = new Dish("chicken", false, 355, Dish.Type.MEAT);
    Dish beans = new Dish("beans", true, 90, Dish.Type.OTHER);
    List<Dish> dishes = Arrays.asList(fish, pork, curry, pasta, beef, muesli, chicken, beans);
    
    Stream<Dish> myStream = dishes.stream();
    Integer total = myStream.map(d -> 1).reduce(0, (d1, d2) -> d1 + d2);
    System.out.println(total);
  }
  
}