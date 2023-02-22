public class TesteIR {
    
    public static void main(String[] args) {
        
        double salario = 1800.0;

        if(salario >= 1900.00 && salario <= 2800.00) {
            System.out.println("A sua alíquota é de 7,5%");
            System.out.println("Você pode deduzir até R$ 142,00");
        } else if(salario >= 2800.00 && salario <= 3751.00) {
            System.out.println("A sua alíquota é de 15%");
            System.out.println("Você pode deduzir até R$ 350,00");
        } else if(salario >= 3751.01 && salario <= 4664.00) {
            System.out.println("A sua alíquota é de 22,5%");
            System.out.println("Você pode deduzir até R$ 636,00");
        } else {
            System.out.println("Não precisa deduzir impostos.");
        }
    }
}
