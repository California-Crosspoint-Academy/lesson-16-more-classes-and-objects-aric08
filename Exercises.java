public class Exercise {
    public static void main(String[] args) {

        // 1. theRock.equals(ourRock) --> true
        // 2. theRock.equals(yourRock) --> false
        // 3. theRock.equals(myRock) --> false
        // 4. myRock == ourRock --> false
        // 5. myRock.equals(yourRock) --> false

        // 6. int zz = oscarMayer.method1(4);
        // Illegal - method1 returns String, not int

        // 7. oscarMayer.method2("Hello");
        // Illegal - method2 is private, not accessible outside the class

        // 8. int cv = oscarMayer.method3();
        // Legal - method3 is public and returns int

        // 9. int cv = oscarMayer.method3(14);
        // Illegal - no method3 with int parameter exists

        // 10. oscarMayer.z = "hotdog";
        // Illegal - z is private and cannot be accessed outside the class

        // 11. Legal - both are in the same class

        // 12. Instantiate Surfer object in two lines
        Surfer surferDude;
        surferDude = new Surfer();

        // 13. Answer: Both a and b are correct

        // 14. balance = 10 + 5000 - (5010 / 2)
        // = 10 + 5000 - 2505 = 2505

        // 15. Wrong - b is declared but not properly formatted

        // 16. Error - deposit expects a numeric value, not a String

        // 17. String comparison test:
        String myString = "Yellow";
        String yourString = "Yellow";
        String hisString = new String("Yellow");
        String ourString = myString;

        System.out.println(myString == yourString);      // true (same constant pool)
        System.out.println(myString == ourString);       // true (same reference)
        System.out.println(myString.equals(yourString)); // true (same content)
        System.out.println(myString.equals(ourString));  // true (same content)
        System.out.println(myString == hisString);       // false (different object)
    }
}
