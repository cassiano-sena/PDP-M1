abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public abstract void exibirDetalhes();
    public double calcularCustoManutencao() {
        return 500.0;
    }
}

class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int ano, int quantidadePortas) {
        super(marca, modelo, ano);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Carro: " + getMarca() + " " + getModelo() + ", Ano: " + getAno() + ", Portas: " + quantidadePortas + ", Manutenção: R$ " + calcularCustoManutencao());
    }
    @Override
    public double calcularCustoManutencao() {
        return 700.0;
    }
}

class Moto extends Veiculo {
    private boolean temPartidaEletrica;

    public Moto(String marca, String modelo, int ano, boolean temPartidaEletrica) {
        super(marca, modelo, ano);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public boolean isTemPartidaEletrica() {
        return temPartidaEletrica;
    }

    public void setTemPartidaEletrica(boolean temPartidaEletrica) {
        this.temPartidaEletrica = temPartidaEletrica;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Moto: " + getMarca() + " " + getModelo() + ", Ano: " + getAno() + ", Partida Elétrica: " + (temPartidaEletrica ? "Sim" : "Não") + ", Manutenção: R$ " + calcularCustoManutencao());
    }
    @Override
    public double calcularCustoManutencao() {
        return 300.0;
    }
}

class Caminhao extends Veiculo {
    private int capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, int capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Caminhão: " + getMarca() + " " + getModelo() + ", Ano: " + getAno() + ", Capacidade de Carga:0 " + capacidadeCarga + "kg, Manutenção: R$ " + calcularCustoManutencao());
    }
    @Override
    public double calcularCustoManutencao() {
        return 2000.0;    }
}

