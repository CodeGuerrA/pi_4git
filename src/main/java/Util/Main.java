package Util;

import Model.Cliente;
import Model.OrdemServico;
import Model.Veiculos;
import Util.StatusOrdemServico;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        // Criando instâncias de cliente e veículo
        Cliente cliente1 = new Cliente("Carlos Silva", "Rua A, 123", "123.456.789-00", "12.345.678/0001-99", "123456789", "carlos@example.com", "987654321", "Contato adicional");
        
        Veiculos veiculo1 = new Veiculos("Fusca", "Volkswagen", "ABC-1234", "1FSG123456789", "123456", "50000", new Date(), "Ar condicionado, direção hidráulica");
        
        // Adicionando o veículo ao cliente
        cliente1.adicionarVeiculo(veiculo1);
        
        // Criando instância de ordem de serviço
        OrdemServico ordemServico = new OrdemServico();
        ordemServico.setId("OS-001");
        ordemServico.setCliente(cliente1);
        ordemServico.setVeiculos(veiculo1);
        ordemServico.setDataCriacao(new Date());
        ordemServico.setDataPrevistaConclusao(new Date(System.currentTimeMillis() + 86400000)); // Previsão de conclusão em 1 dia
        ordemServico.setStatus(StatusOrdemServico.ABERTA); // Supondo que 'ABERTO' seja um status válido na enumeração
        
        // Exibindo os detalhes da ordem de serviço
        System.out.println("Ordem de Serviço ID: " + ordemServico.getId());
        System.out.println("Cliente: " + ordemServico.getCliente().getNome());
        System.out.println("Veículo: " + ordemServico.getVeiculos().getModelo() + " - " + ordemServico.getVeiculos().getPlaca());
        System.out.println("Data de Criação: " + formatDate(ordemServico.getDataCriacao()));
        System.out.println("Data Prevista de Conclusão: " + formatDate(ordemServico.getDataPrevistaConclusao()));
        System.out.println("Status da Ordem de Serviço: " + ordemServico.getStatus());
    }

    // Método para formatar data em string
    public static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }
    
}
