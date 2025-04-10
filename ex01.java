package pasta1.EstruturasCondicionais;

public class ex01 {
    public static void main(String[] args) {
        double salario = 70000;
        double taxa1 = 9.70 / 100;
        double taxa2 = 37.35 / 100;
        double taxa3 = 49.50 / 100;
        double valorImposto;
        if (salario < 34712) {
            valorImposto = salario * taxa1;

        } else if (salario >= 34712 && salario < 68507) {
            valorImposto = salario * taxa2;
        } else {
            valorImposto = salario * taxa3;
        }

        System.out.println(valorImposto);
    }
}
