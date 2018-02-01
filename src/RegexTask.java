

public class RegexTask {

    public static void main(String[] args) {
        String email = "qq4@gmail.com,qaddf@yanggdex.ru";
        System.out.println("checkEmail");
        System.out.println(checkEmail(email));
        String value = "1233";
        System.out.println("checkValue");
        System.out.println(checkValue(value));
        String price = "99.99";
        System.out.println("checkPrice");
        System.out.println(checkPrice(price));

        System.out.println();
    }

    public static String checkEmail(String str) {
        if (str.matches("(?:\\d?\\w)+(?:@gmail\\.com|@yandex\\.ru),?"))
            return ("OK");
        else
            return ("Not OK");
    }


    public static String checkValue(String str2) {
        if (str2.matches("^(?:[1][4-9][5-9]\\d)|(?:[2-9]\\d{3})|(?:[1][4][5-9]\\d)$"))
            return ("OK");
        else
            return ("Not OK");
    }

    public static String checkPrice(String str2) {
        if (str2.matches("^(?:[0-9]{1,2}|100)(?:\\.[0-9]{1,2})?$"))
            return ("OK");
        else
            return ("Not OK");
    }
}


