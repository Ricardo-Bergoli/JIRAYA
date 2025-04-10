package Pasta2.EstruturaRepeticao;

public class Ex01 {
    public static void main(String[] args) {
        //numero pares até 10.000

        for (int i = 0; i <= 10000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
