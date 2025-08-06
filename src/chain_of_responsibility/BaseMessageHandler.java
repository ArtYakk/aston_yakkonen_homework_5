package chain_of_responsibility;

public abstract class BaseMessageHandler implements MessageHandler{
    private MessageHandler next;

    @Override
    public void setNext(MessageHandler next) {
        this.next = next;
    }

    @Override
    public boolean handle(String message) {
        if (next != null){
            return next.handle(message);
        }
        System.out.println("Все этапы проверки пройдены, сообщение валидно");
        return true;
    }
}
