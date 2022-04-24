import java.util.Arrays;

public class OperasiMatematika {
    public static void main(String[] args) {
        int nilaiA = 100;
        int nilaiB = 10;

        System.out.println(nilaiA + nilaiB);
        System.out.println(nilaiA - nilaiB);
        System.out.println(nilaiA / nilaiB);
        System.out.println(nilaiA * nilaiB);
        System.out.println(nilaiA % nilaiB);

        // unary operator
        // operator yang ditempatkan didepan variable
        nilaiA++;
        nilaiB--;
        System.out.println(nilaiA);
        System.out.println(nilaiB);
    }
}
