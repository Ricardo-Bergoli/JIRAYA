package pasta1.EstruturasCondicionais;

public class Parte03 {
    public static void main(String[] args) {
        // operador ternário (if e else simplificado)
        double salario = 3000;
        String mensagemDoar = "receba sua merenda!";
        String mensagemNaoDoar = "to sem cash :c";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }

}
