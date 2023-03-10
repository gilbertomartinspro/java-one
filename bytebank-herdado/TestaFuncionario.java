public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionario gilberto = new Gerente();
        gilberto.setNome("Gilberto");
        gilberto.setCpf("123456789");
        gilberto.setSalario(2800.00);

        System.out.println(gilberto.getNome());
        System.out.println(gilberto.getBonificacao());
        
    }
}
