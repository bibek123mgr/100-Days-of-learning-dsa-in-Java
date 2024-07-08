
class BitMasking {

    static void on() {
        int number = 47;
        int i = 4;
        int mask = 1 << i;

        System.out.println(number | mask);
    }

    static void off() {
        int number = 47;
        int i = 5;
        int mask = ~(1 << i);

        System.out.println(number & mask);
    }

    static void toggle() {
        int number = 47;
        int i = 2;
        int mask = 1 << i;
        System.out.println(number ^ mask);
    }

    static void checkOForON() {
        int number = 47;
        int i = 3;
        int mask = 1 << i;
        if ((number & mask) == 0) {
            System.out.println("OFF");
        } else {
            System.out.println("ON");
        }
    }

    public static void main(String[] args) {
        //make on use OR Operator
        on();
        off();
        toggle();
        checkOForON();
    }
}
