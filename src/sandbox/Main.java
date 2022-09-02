package sandbox;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //1. Ініціалізуйте обьєкти всюди де це можливо
        String str = "";
        List<String> list = new ArrayList<>();

        //2. Створюйте базові значення, якщо в метод прийде null
        System.out.println(getString(null));

        //!3. Не створюйте змінні без ініціалізації або з null ініціалізацією
        String str2;
        String nullString = null;
    }

    //4. Не передавайте null як параметр метода
    private static String getString(String name){
        if(name == null){
            return "123";
        }
        // 5. Не повертайте null з методу
        return name + " name";
    }
}
