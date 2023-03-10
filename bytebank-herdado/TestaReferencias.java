public class TestaReferencias {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Gilberto");
        g1.setSalario(5000.00);

        EditorVideo ev1 = new EditorVideo();
        ev1.setSalario(3000.00);

        Designer d1 = new Designer();
        d1.setSalario(2000.00);

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registra(g1);
        controleBonificacao.registra(ev1);
        controleBonificacao.registra(d1);

        System.out.println(controleBonificacao.getSoma());
        
    }
}