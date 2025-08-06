package chain_of_responsibility;

public class Test {
    public static void main(String[] args) {
        String messageWithWrongLength = "Ку";
        String messageWithWrongUpperCaseCount = "Привет, меня зовут Артем, Я пишу на жаве";
        String messageWithWrongLowerCaseCount = "ППрив";
        String perfectMessage = "Привет, меня зовут Артем, я пишу на жаве";

        LengthMessageHandler lengthMessageHandler = new LengthMessageHandler();
        lengthMessageHandler.handle(messageWithWrongLength);
        lengthMessageHandler.handle(perfectMessage);

        System.out.println("==========================================================");

        UpperCaseCountMessageHandler upperCaseCountMessageHandler = new UpperCaseCountMessageHandler();
        upperCaseCountMessageHandler.handle(messageWithWrongUpperCaseCount);
        upperCaseCountMessageHandler.handle(perfectMessage);

        System.out.println("==========================================================");

        LowerCaseCountMessageHandler lowerCaseCountMessageHandler = new LowerCaseCountMessageHandler();
        lowerCaseCountMessageHandler.handle(messageWithWrongLowerCaseCount);
        lowerCaseCountMessageHandler.handle(perfectMessage);

        System.out.println("==========================================================");

        /* Соединяем хэндлеры в цепочку */
        upperCaseCountMessageHandler.setNext(lowerCaseCountMessageHandler);
        lengthMessageHandler.setNext(upperCaseCountMessageHandler);

        lengthMessageHandler.handle(messageWithWrongLength);
        lengthMessageHandler.handle(messageWithWrongUpperCaseCount);
        lengthMessageHandler.handle(messageWithWrongLowerCaseCount);

        System.out.println("==========================================================");

        if (lengthMessageHandler.handle(perfectMessage)){
            System.out.println("Например, отправляем сообщение на почту");
        }else {
            System.out.println("Вам следует исправить сообщение");
        }





    }
}
