

public class RegexTask {
    public static void main(String[] args) {
        String email = "qq4@gmail.com,qaddf@yandex.ru";
        System.out.println(checkEmail(email));

    }

    public static boolean checkEmail(String str) {

        return str.matches("(?:\\d?\\w)+(?:@gmail\\.com|@yandex\\.ru),?");

    }

}
