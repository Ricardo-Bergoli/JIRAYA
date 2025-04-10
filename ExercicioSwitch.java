package Pasta2.EstruturaCondicionais;

public class ExercicioSwitch {
    public static void main(String[] args) {
        // valores de 1 a 7, imprima se o dia corresponde é dia util
        //ou final de semana, usando o switch
        byte dia = 4;
        switch (dia){
            case 2, 3, 4, 5, 6:
                System.out.println("Dia útil");
                break;
            case 1, 7:
                System.out.println("Dia inútil");
                break;
            default:
                System.out.println("opção não eras");
                break;
        }
    }
}
