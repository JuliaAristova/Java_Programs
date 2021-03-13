package BasicPrograms;
/*
- Using the random() Method
  public static double random(). It returns a pseudorandom double that is greater than or equal to 0.0 and less than 1.0.
- Using the Random Class
- Using the ThreadLocalRandom Class
- Using the ints() Method (in Java 8)
 */
public class RandomNumber {
    static int count=1;

    public static void randomNumber1() {
        System.out.println("Random number " + count + ": " + (int)(Math.random()*100));
        count++;
    }
    //Math.random() * (max - min + 1) + min  - in range
    //min value is inclusive while the max value is exclusive
    public static void randomNumber1(int min, int max) {
        System.out.println("Random number " + count + ": " + (int)(Math.random()*(max-min+1) + min));
        count++;
    }

    public static void main(String[] args) {
        System.out.println("Random: " + Math.random());
        randomNumber1();
        randomNumber1();
        randomNumber1();
        randomNumber1(1, 10);
        randomNumber1(1, 100);
        randomNumber1(1, 1000);

    }
}
