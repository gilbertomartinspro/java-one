public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        Conta conta2 = new Conta(1337, 16549);
        Conta conta3 = new Conta(2156, 456789);
        Conta conta4 = new Conta(4561, 753168);


        System.out.println(Conta.getTotal());
    }
}
