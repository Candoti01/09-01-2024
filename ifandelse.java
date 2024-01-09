import java.util.*;

public class ifandelse {
    public static void main(String[] args) {
        System.out.println("Voce gosta de banana? -s- ou -n- -->");
        Scanner sc = new Scanner(System.in);
        String resposta = sc.nextLine();
        if (resposta.equals("s")) {
            System.out.println("Entao você adora bananas!");
        } else {
            System.out.println("Que pena, mas eu amo bananas!");
        }
        sc.close();
    }
}
