public class GerenciadorVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);
        Moto moto = new Moto("Honda", "CB500", 2021, true);
        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2020, 20000);

        carro.exibirDetalhes();
        moto.exibirDetalhes();
        caminhao.exibirDetalhes();
    }
}
