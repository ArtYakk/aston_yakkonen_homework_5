package chain_of_responsibility;

import java.util.Arrays;

public class LowerCaseCountMessageHandler extends BaseMessageHandler{

    @Override
    public boolean handle(String message) {
        long lowerCaseCount =
                Arrays.stream(message.split(""))
                .filter(a -> Character.isLowerCase(a.charAt(0)))
                .count();

        if (lowerCaseCount < 4){
            System.out.println("Слишком мало строчных букв");
            return false;
        }else {
            System.out.println("Проверка по количеству строчных букв пройдена");
            return super.handle(message);
        }
    }
}
