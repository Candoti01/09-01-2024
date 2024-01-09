import java.util.*;

public class inputVar {
    public static void main(String[] args) {
        System.out.println("Digite a letra maiuscula que voce deseja: ");
        Scanner leitor = new Scanner(System.in);
        String letra = leitor.next();
        System.out.println("Voce escolheu a letra " + letra);
        leitor.close();
    }
}