public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.integrateUSBPort();
        computer.integrateUSBPort();
        computer.integrateUSBPort();
        computer.integrateUSBPort();
        User user = new User(computer, new OS());

        SmartCardUSB smartCard = new SmartCardUSB();

        FlashUSB flash1 = new FlashUSB();
        user.insertToken(flash1);
        user.installTokenDriver();
        user.signIn();
        System.out.println();


        FlashUSB flash2 = new FlashUSB();
        user.insertToken(flash2);
        user.installTokenDriver();
        user.signIn();
        System.out.println();

        FlashUSB flash3 = new FlashUSB();
        user.insertToken(flash3);
        user.installTokenDriver();
        user.signIn();
        System.out.println();

        FlashUSB flash4 = new FlashUSB();
        user.insertToken(flash4);
        user.installTokenDriver();
        user.signUp();


        System.out.println();
        user.insertToken(smartCard);
        user.installTokenDriver();



    }
}
