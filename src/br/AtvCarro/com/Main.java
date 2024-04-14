package br.AtvCarro.com;

public class Main {
    public static void main(String[] args) {
        // Objetos da classe Carro
        Carro carro1 = new Carro("Toyota", "Corolla", 2022, "Prata");
        Carro carro2 = new Carro("Honda", "Civic", 2021, "Preto");

        // Exibindo informações dos carros
        System.out.println("Informações do Carro 1:");
        carro1.exibirInformacoes();

        System.out.println("\nInformações do Carro 2:");
        carro2.exibirInformacoes();

        // Modificando informações do carro 1
        carro1.setAno(2023);
        carro1.setCor("Azul");

        // Exibindo informações atualizadas do carro 1
        System.out.println("\nInformações do Carro 1 após atualização:");
        carro1.exibirInformacoes();
    }
}

