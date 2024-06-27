import java.util.List;
import java.util.Objects;

public class Message<T> {
//    1. Создайте класс Message. Этот класс будет позволять хранить в себе сообщение любого типа.
//    2. Для того, чтобы Message мог хранить в себе любой тип данных, создайте поле в этом классе, тип которого будет является дженериком
//    3. Создайте приложение, которое спрашивает у пользователя, что положить в Message.
//       3.1 Если пользователь хочет положить строку - создайте Message<String> и дайте пользователю ввести строку
//       3.2 Если же пользователь хочет положить число - создайте Message<Integer> и дайте пользователю ввести число

    private T Message;

    @Override
    public String toString() {
        return "Message{" +
                "Message=" + Message +
                '}';
    }

    public Message(T message) {
        Message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message<?> message = (Message<?>) o;
        return Objects.equals(Message, message.Message);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Message);
    }

    public T getMessage() {
        return Message;
    }

    public void setMessage(T message) {
        Message = message;
    }
}

