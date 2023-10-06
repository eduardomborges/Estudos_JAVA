import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Qual o dia da semana ('1 p/domingo e 7 p/ sabado?)");
        Scanner sc = new Scanner(System.in);
        int diaNasemana = sc.nextInt();
        String diaPorExtenso;

        switch (diaNasemana) {
            case 1:
                diaPorExtenso = "Domingo";
                System.out.println("Pede cachimbo, cachimbo é de ouro que bate no touro e o touro é valente e agente é brabo e cai no buraco");
                break;
            case 2:
                diaPorExtenso = "Segunda";
                break;
            case 3:
                diaPorExtenso = "Terça";
                break;
            case 4:
                diaPorExtenso = "Quarta";
                break;
            case 5:
                diaPorExtenso = "Quinta";
                break;
            case 6:
                diaPorExtenso = "Sexta";
                break;
            case 7:
                diaPorExtenso = "Sábado";
                break;
        
            default:
            diaPorExtenso = "Dia inválido";
                break;
        }

        System.out.println("Hoje é " + diaPorExtenso);

        sc.close();
    }
}
