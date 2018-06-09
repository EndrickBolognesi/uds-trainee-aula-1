import javax.swing.*;
import java.util.Scanner;
class Main {
        public static String romanos(Integer numero){
                switch(numero){
                    case 1: return "I";
                    case 2: return "II";
                    case 3: return "III";
                    case 4: return "IV";
                    case 5: return "V";
                    case 6: return  "VI";
                    case 7: return "VII";
                    case 8: return "VIII";
                    case 9: return  "IX";
                    case 10: return "X";
                    default: return "Numero invalido";

                }
        }
    public static void main(String[] args) {

        //Scanner entrada = new Scanner(System.in);
        //System.out.println("Digite um número entre 0 e 10: ");

        //int numero;
        //= entrada.nextInt();
        //System.out.println(romanos(numero));

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        JOptionPane.showMessageDialog(null,romanos(numero), "Resultado" , JOptionPane.WARNING_MESSAGE);

    }
}