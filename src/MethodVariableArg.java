public class MethodVariableArg {
    public static void main(String[] args) {
        int[] valls = {80,60,70,90,100};
        sayCongrats("maul", 80,66,77,90,88);
    }

    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value: values) {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println(finalValue);
            System.out.println("Selamat " + name + " Anda lulus");
        } else {
            System.out.println("coba lagi");
        }
    }
}
