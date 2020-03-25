package fizzbuzz;

public class FizzBuzzApp {
    public static String main(String[] args) {
        FizzBuzz myFizzBuzz = new FizzBuzz();
        String result = "";
        if(args != null){
            for (String argument : args) {
                int number = Integer.parseInt(argument);
                result += myFizzBuzz.fizzbuzzFor(number)+",";
            }
            return result.substring(0, result.length()-1);
        }
        return "";
    }
}
