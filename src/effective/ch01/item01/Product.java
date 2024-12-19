package effective.ch01.item01;

public class Product {

    public static void main(String[] args) {
        Settings settings = Settings.newInstance();
        Settings settings1 = Settings.newInstance();
        System.out.println(settings == settings1);
    }
}
