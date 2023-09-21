package programs;

public class LIght {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

         lightSpeed = 186000;
         days = 2000;
         seconds = days * 24 * 60 * 60;
         distance = lightSpeed * seconds;
         System.out.println("In "+ days);
         System.out.println("Days light will travel about");
         System.out.println(distance + " miles ");
         System.out.println(seconds);
    }
}
