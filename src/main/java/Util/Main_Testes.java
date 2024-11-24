package Util;

import Implementations.HashtableClienteRepository;
import Model.Cliente;
import Model.Veiculos;
import java.util.Scanner;

public class Main_Testes {
    public static void main(String[] args) {
        // Criando instâncias da classe de repositório
        HashtableClienteRepository repositorio = new HashtableClienteRepository();

        // Criando alguns clientes para adicionar no repositório
        Cliente cliente1 = new Cliente("Cliente 1", "Rua A, 123", "123.456.789-00", "", "", "email1@exemplo.com", "123456789", "");
        Cliente cliente2 = new Cliente("Cliente 2", "Rua B, 456", "987.654.321-00", "", "", "email2@exemplo.com", "987654321", "");

        // Adicionando clientes ao repositório
        repositorio.adicionarCliente(cliente1);
        repositorio.adicionarCliente(cliente2);

        // Solicitando CPF para cadastro do veículo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CPF do cliente para cadastrar o veículo: ");
        String cpfDigitado = scanner.nextLine();

        // Verificando se o cliente existe no repositório
        if (repositorio.verificarCliente(cpfDigitado)) {
            Cliente clienteExistente = repositorio.buscarClientePorChave(cpfDigitado);
            System.out.println("Cliente encontrado: " + clienteExistente.getNome());

            // Cadastro automático do veículo
            String modelo = "Fusca";
            String marca = "Volkswagen";
            String placa = "ABC-1234";
            String chassi = "1234567890";
            String patrimonio = "Patrimonio-001";
            double kilometragem = 150000;
            String acessorios = "Rádio, Ar condicionado";

            // Criando o veículo automaticamente
            Veiculos veiculo = new Veiculos(modelo, marca, placa, chassi, patrimonio, kilometragem, new java.util.Date(), acessorios);
            
            // Adicionando o veículo ao cliente
            repositorio.adicionarVeiculoAoCliente(cpfDigitado, veiculo);

            System.out.println("Veículo cadastrado automaticamente para o cliente " + clienteExistente.getNome());
            System.out.println("Modelo do veículo: " + veiculo.getModelo());
        } else {
            System.out.println("Cliente não encontrado com o CPF: " + cpfDigitado);
        }

        scanner.close();
    }
}
