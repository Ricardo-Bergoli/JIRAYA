package Pasta2.EstruturaCondicionais;

public class EtruturaSwitch {
    public static void main(String[] args) {
        //imprima um número e a maquina responderá o nome do dia, considerando 1 domingo
        byte dia = 5;

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("está opção não existe");
                break;

        }
    }
}
