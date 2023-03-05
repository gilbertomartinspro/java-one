public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        conta.saca(200);

        if(conta.saca(200)) {
            System.out.println("saque efetuado com sucesso");
            System.out.println(conta.getSaldo());
        } else {
            System.out.println("saldo insuficiente");
            System.out.println(conta.getSaldo());
        }

        
    }
}
