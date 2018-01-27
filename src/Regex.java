import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        String schools = "Name: Hillel, City: Odessa; Name: Stanford, City: Stanford";
        System.out.println("---------------------------");
        System.out.println(schools.replaceAll("Name: ([^,]+)", "Name: *$1*"));  //Use * after any names of city

        String text = "Hello, my    name is Villi. I am a programmer.";
        String betterText = text.toLowerCase().replaceAll("[.,!?;:]", "");  // miss any symbols
        System.out.println(betterText);
        String[] words = betterText.split("\\s+");  // trims to space, enter, tab and go to the new line
         for (String w : words) {
             System.out.println(w);
         }

        String phoneNumber = "+380975156900";

        Matcher m = Pattern.compile(".{3}(.{3})").matcher(phoneNumber); // first 3 symbols and second 3 symbols
        if(m.find()) {
            System.out.println(m.group(0));
        } else {
            System.out.println("No carrier code in phone number.");
        }

    }

    public static String removeLastD(String text) {
        return text.replaceFirst("(.*)d", "$1"); // find all symbols before d and miss d
    }

}