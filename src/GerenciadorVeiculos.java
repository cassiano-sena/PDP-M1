public class GerenciadorVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2008, 4);
        Moto moto = new Moto("Honda", "CBR1000RR", 2009, true);
        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2020, 20000);

        carro.exibirDetalhes();
        moto.exibirDetalhes();
        caminhao.exibirDetalhes();
    }
}
