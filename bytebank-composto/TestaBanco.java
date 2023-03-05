public class TestaBanco {
    public static void main(String[] args) {
        Cliente gilberto = new Cliente();
        gilberto.nome = "Gilberto Martins";
        gilberto.cpf = "222.222.222-22";
        gilberto.profissao = "Programador";

        Conta contaDoGilberto = new Conta();
        contaDoGilberto.deposita(1000);

        contaDoGilberto.titular = gilberto;
        System.out.println(contaDoGilberto.titular.nome);
    }
}
