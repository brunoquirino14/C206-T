import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Kart k = new Kart();


        k.nome = "Relampago Marquinhos";
        k.fazerDrift();
        k.soltarTurbo();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de cilindradas: ");
        k.m.cilindradas = ler.nextLine();



    }
}
