public class Typecasting {
   public static void main(String[] args) {
      System.out.println("typecasting bw int and string ");
      typecastingExample();
   }

   static void typecastingExample() {
      int num = 10;
      String strNum = Integer.toString(num); // int to String
      System.out.println("String representation: " + strNum);

      String str = "20";
      int parsedNum = Integer.parseInt(str); // String to int
      System.out.println("Parsed integer: " + parsedNum);
   }
}