package chain_of_responsibility;

public class LengthMessageHandler extends BaseMessageHandler{
    @Override
    public boolean handle(String message) {
        if (message.length() < 5){
            System.out.println("Слишком короткое сообщение");
            return false;
        }else {
            System.out.println("Проверка по длине пройдена");
            return super.handle(message);
        }
    }
}
