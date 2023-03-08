public class TesteContas {
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(123, 1234);
        cc.deposita(100.00);

        ContaPoupanca cp = new ContaPoupanca(444, 5555);
        cp.deposita(200.00);

        cc.transfere(10.00, cp);

        System.out.println("CC " + cc.getSaldo());
        System.out.println("CP " + cp.getSaldo());

    }
}