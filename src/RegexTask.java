

public class RegexTask {

    public static void main(String[] args) {
        String email = "qq4@gmail.com,qaddf@yandex.ru";
        System.out.println(checkEmail(email));
        String value = "1233";
        System.out.println(checkValue(value));
    }

    public static boolean checkEmail(String str) {
        return str.matches("(?:\\d?\\w)+(?:@gmail\\.com|@yandex\\.ru),?");

    }

    public static boolean checkValue(String str2) {
        return str2.matches("^(?:[1][4-9][5-9]\\d)|(?:[2-9]\\d{3})|(?:[1][4][5-9]\\d)$");
    }

}
