import java.util.Arrays;
import java.util.StringJoiner;

public class Phone {
    int number;
    String model;
    int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Phone.class.getSimpleName() + "[", "]")
                .add("number=" + number)
                .add("model='" + model + "'")
                .add("weight=" + weight)
                .toString();
    }

    public void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }

    public void getNumber() {
        System.out.println("Номер: " + number);
    }


    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит: " + name + " c номера " + number);
    }

    public void sendMessage(int... numbers){
        System.out.println("Сообщение отправлено на номера: " + Arrays.toString(numbers));

    }
}

