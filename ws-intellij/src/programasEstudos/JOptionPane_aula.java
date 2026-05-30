package programasEstudos;

import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class JOptionPane_aula {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        //System.out.println("Digite a idade: ");
        //int idade = sc.nextInt();
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura: "));


        //System.out.println("Digite a altura: ");
        //double altura = sc.nextDouble();


        JOptionPane.showMessageDialog(null, "A idade é: " + idade);
        //System.out.println("A idade é: " + idade);
        JOptionPane.showMessageDialog(null, "A altura é: " + altura);
        //System.out.printf("A altura é: %.2f", altura);


        sc.close();
    }
}
