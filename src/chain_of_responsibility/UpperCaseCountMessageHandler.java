package chain_of_responsibility;

import java.util.Arrays;

public class UpperCaseCountMessageHandler extends BaseMessageHandler{
    @Override
    public boolean handle(String message) {
        long upperCaseCount =
                Arrays.stream(message.split(""))
                        .filter(a -> Character.isUpperCase(a.charAt(0)))
                        .count();

        if (upperCaseCount > 2){
            System.out.println("В сообщении больше одной заглавной буквы, проверка не пройдена");
            return false;
        }else {
            System.out.println("Проверка по количеству заглавных букв пройдена");
            return super.handle(message);
        }
    }
}
