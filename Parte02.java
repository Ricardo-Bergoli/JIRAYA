package pasta1.EstruturasCondicionais;

public class Parte02 {
    public static void main(String[] args) {
       int idade = 17;
       String categoria;

       if (idade < 15){
           categoria = "categoria infantil";
       } else if (idade >= 15 && idade < 18 ){
           categoria = "juvena!";
       } else {
           categoria = "adulto";
        }
        System.out.println(categoria);
    }
}
