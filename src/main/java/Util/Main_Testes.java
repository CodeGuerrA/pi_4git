package Util;

import Controller.ClienteController;
import Implementations.HashtableClienteRepository;
import Implementations.HashtableVeiculoRepository;
import Model.Cliente;
import Model.Veiculos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main_Testes {

    public static void main(String[] args) {
        // Inicializa os repositórios para clientes e veículos
        HashtableClienteRepository hashtableClienteRepository = new HashtableClienteRepository();
        HashtableVeiculoRepository hashtableVeiculoRepository = new HashtableVeiculoRepository();

        // Cria dois clientes para os testes
        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();

        // Configura os dados do cliente 1
        cliente.setCPF("024.078.161-96");
        cliente.setNome("Carlos");

        // Configura os dados do cliente 2
        cliente2.setCNPJ("000.000.222");
        cliente2.setNome("Gustavo");

        // Adiciona os clientes ao repositório
        hashtableClienteRepository.adicionarCliente(cliente);
        hashtableClienteRepository.adicionarCliente(cliente2);

        // Cria dois veículos para os testes
        Veiculos veiculo = new Veiculos();
        Veiculos veiculo2 = new Veiculos();
        String dataEntradaStr = "08/07/2010";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataEntrada = null;
        try {
            dataEntrada = sdf.parse(dataEntradaStr);  // Convertendo a string para Date
        } catch (ParseException e) {
            
            
        }

        // Configura os dados do veículo 1
        String placa = "AAA-1234";
        veiculo.setPlaca(placa);
        veiculo.setModelo("Fusca");
        veiculo.setDataEntrada(dataEntrada);  // Adiciona data de entrada

        // Configura os dados do veículo 2
        String placa2 = "BBB-1324";
        veiculo2.setPlaca(placa2);
        veiculo2.setModelo("Quebrado");

        // Adiciona os veículos ao repositório
        hashtableVeiculoRepository.adicionarVeiculo(placa, veiculo);
        hashtableVeiculoRepository.adicionarVeiculo(placa2, veiculo2);

      
        hashtableClienteRepository.adicionarVeiculoAoCliente("024.078.161-96", veiculo);
        System.out.println("Cliente 1 após adicionar o veículo1: " + cliente.getVeiculos());

        // Move o demonio 1 para o cliente 2
        hashtableClienteRepository.adicionarVeiculoAoCliente("000.000.222", veiculo);
        System.out.println("Cliente 2 após adicionar o veículo 1: " + cliente2.getVeiculos());
        
        System.out.println("Cliente 1 após transferência de veículo: " + cliente.getVeiculos() +""+ veiculo.getDataEntrada()+ " " + veiculo.getDataFim());
        
        hashtableClienteRepository.adicionarVeiculoAoCliente("024.078.161-96", veiculo2);
        System.out.println("" + cliente.getVeiculos());
    }
}
