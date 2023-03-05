public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoGilberto = new Conta();
        contaDoGilberto.saldo = 100;
        contaDoGilberto.deposita(50);

        System.out.println(contaDoGilberto.saldo);

        boolean conseguiuSacar = contaDoGilberto.saca(20);
        
        System.out.println(contaDoGilberto.saldo);
        System.out.println(conseguiuSacar);


        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        boolean sucessoTransferencia = contaDaMarcela.transfere(3000, contaDoGilberto);
        
        if(sucessoTransferencia) {
            System.out.println("Transferencia efetuada com sucesso");
        } else {
            System.out.println("Erro ao tentar transferir");
        }

        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoGilberto.saldo);
    }
}