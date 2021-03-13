package BasicPrograms;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
- Using the random() Method
  public static double random(). It returns a pseudorandom double that is greater than or equal to 0.0 and less than 1.0.
- Using the Random Class
- Using the ThreadLocalRandom Class
- Using the ints() Method (in Java 8) - returns a stream of randomly generated int values
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

    //method that generates a stream of integers having size 5
    public static void randomInts(int num){
        Random random = new Random();
        random.ints(num).forEach(System.out::println);
    }
    //method that generates a stream of 9 integers between 50 to 90
    public static void randomInts(int num, int origin, int bound) {
        Random random1 = new Random();
        random1.ints(num, origin, bound).forEach(System.out::println);
    }

    public static void randomNumber2(int bound) {
        Random n = new Random();
        System.out.println("Random integer: " + n.nextInt());
        System.out.println("Random float: " + n.nextFloat());
        System.out.println("Random double: " + n.nextDouble());
        System.out.println("Random long : " + n.nextLong());

        System.out.println("Random between 0-" +(bound-1) +": " + n.nextInt(bound));

        System.out.println("Random boolean: " + n.nextBoolean());


    }


    //The nextInt(int bound) method accepts a parameter bound (upper) that must be positive.
    // It generates a random number in the range 0 to bound-1.
    public static void main(String[] args) {
        System.out.println("Random: " + Math.random());
        randomNumber1();
        randomNumber1();
        randomNumber1();
        randomNumber1(1, 10);
        randomNumber1(1, 100);
        randomNumber1(1, 1000);
        randomNumber2(11);

        //TheadLocalRandom
        System.out.println("Random using TheadLocalRandom class:");
        System.out.println(ThreadLocalRandom.current().nextInt());
        System.out.println(ThreadLocalRandom.current().nextLong(10));
        System.out.println(ThreadLocalRandom.current().nextDouble(5.0, 20.0));

        System.out.println("\nRandom using ints() of Random class:");
        randomInts(5);
        randomInts(9,50,90);

    }

}
