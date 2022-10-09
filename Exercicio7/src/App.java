import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Double lado, area;
        Scanner S =new Scanner(System.in);

        System.out.println("Digite o valor da lateral do quadrado");
        lado = S.nextDouble();

        area= lado*lado;

        System.out.println("O dobro da area do quadrado é de" +(area*2));
        
    }
}
