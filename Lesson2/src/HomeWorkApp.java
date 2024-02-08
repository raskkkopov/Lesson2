public class HomeWorkApp {

    public static void main(String[] args) {
        // Первое задание
        System.out.println(SumInRange(5, 6)); // true
        System.out.println(SumInRange(10, 20)); // true
        System.out.println(SumInRange(15, 25)); // false

        // Второе задание
        PosNig(-5); // Отрицательное число
        PosNig(0); // Положительное число
        PosNig(10); // Положительное число

        // Третье задание
        System.out.println(isNegative(-5)); // true
        System.out.println(isNegative(0)); // false
        System.out.println(isNegative(10)); // false

        // Четвертое задание
        StringMultipleTimes("Строка", 3);

        // Задание со звездочкой(пятое)
        System.out.println(LeapYear(2020)); // true
        System.out.println(LeapYear(2000)); // true
        System.out.println(LeapYear(1900)); // false
    }

    public static boolean SumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void PosNig(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void StringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static boolean LeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}