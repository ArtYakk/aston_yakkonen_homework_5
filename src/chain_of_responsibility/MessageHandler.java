package chain_of_responsibility;

public interface MessageHandler {
   void setNext(MessageHandler messageHandler);
   boolean handle(String message);
}
