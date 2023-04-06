public class Main {
    public static void main(String[] args) {
Phone phone1 = new Phone(111,"IPhone",100);
Phone phone2 = new Phone(222,"Samsung", 200);
Phone phone3 = new Phone(333,"Xiaomi", 300);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Anna");

        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();

        Phone phone4 = new Phone(444,"Nokia");
        System.out.println(phone4);

        phone1.receiveCall("Kate", 555);

        phone2.sendMessage(122,345567,12345);
    }

}