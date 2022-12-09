import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) throws Exception {
        double total = 0, cont = 0; 
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Informe o valor da prestação: ");
            double valor = sc.nextDouble(); 

            if (valor == 0) {
                break;
            }
            System.out.println("Digite o número de dias em atraso: ");
            int dias = sc.nextInt();

            total += valorPagamento(valor, dias);
            cont += 1;
        }

        System.out.println("Quantidade total: " + String.format("%.0f", cont));
        System.out.println("Valor total das prestações: " + String.format("%.2f", total));
        sc.close();
    } 

    public static Double valorPagamento(double valor, double dias) {
        double juros, multa = valor + (valor * 0.03);
        
        if (dias == 0) {
            return valor; 
        } else {
            juros = multa * dias * 0.001; 
        }
        return multa + juros; 
    }
}
