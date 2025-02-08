public class GerenciadorVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2008, 100, 4);
        Moto moto = new Moto("Honda", "CBR1000RR", 2009,150, true);
        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2020, 300, 20000);

        System.out.println("\nVersão 1:");
        carro.exibirDetalhes();
        moto.exibirDetalhes();
        caminhao.exibirDetalhes();

        carro.setAno(1997);
        carro.setMarca("Volkswagen");
        carro.setModelo("Nardo");
        carro.setManutencao(20000);
        carro.setQuantidadePortas(2);

        moto.setAno(1998);
        moto.setMarca("Harley-Davidson");
        moto.setModelo("Fatboy");
        moto.setManutencao(400);
        moto.setTemPartidaEletrica(false);

        caminhao.setAno(2000);
        caminhao.setMarca("Peterbilt");
        caminhao.setModelo("379");
        caminhao.setManutencao(4000);
        caminhao.setCapacidadeCarga(30000);

        System.out.println("\nVersão 2:");
        carro.exibirDetalhes();
        moto.exibirDetalhes();
        caminhao.exibirDetalhes();
    }
}
