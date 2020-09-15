

public class Main {
  public static void main(String[] args) {
    // int dogCount = 1;
    // System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    // int catCount = 2;
    // System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    // int turtleCount = 0;
    // System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    // flipNHeads(4);

    // LocalDateTime now = LocalDateTime.now();
    // int hour = now.getHour();
    // int minute = now.getMinute();
    // int second = now.getSecond();
    // or, if you're feeling fancy
    // String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
  }

  public static String pluralize(String word, int number) {
    if(number == 0 || number > 1) {
      return word + "s";
    };
    return word;
  }

  public static int flipNHeads (int number) {
    int min = 0;
    int max = 1;
    int flips = 0;
    int num = 0;

    while (true) {
      double random_number = Math.random() * (max - min) + min;
    
      if(num == number) {
        System.out.println("It took " + flips + " flips to flip " + number + " heads in a row.");
        break;
      } else if(random_number < 0.5) {
        flips++;
        num = 0;
        System.out.println("Tails");
      } else if(random_number >= 0.5) {
        flips++;
        num++;
        System.out.println("Heads");
      }
    }
    return number;
  }

  public static LocalDateTime clock(LocalDateTime now) {
    
  }
}