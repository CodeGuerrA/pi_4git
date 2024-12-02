package Util;

import Model.Propriedade;
import Model.Veiculos;
import Persistence.VeiculosDAO;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;

import java.io.FileNotFoundException;
import java.util.Date;

public class ReportGenerator {

   public static void main(String[] args) {

        try {
            // Criar as instâncias de Veiculos e Propriedade
            Veiculos veiculo = new Veiculos();
            veiculo.setModelo("Palio"); // Id do modelo
            veiculo.setMarca("Fiat");  // Id da marca
            veiculo.setPlaca("ABC1235"); // Exemplo de placa
            veiculo.setChassi("9BWZZZ377VT004251"); // Exemplo de chassi
            veiculo.setPatrimonio("123456"); // Exemplo de patrimônio
            veiculo.setKilometragem("50000"); // Exemplo de quilometragem
            veiculo.setAcessorios("Ar condicionado, Vidro elétrico"); // Exemplo de acessórios

            Propriedade propriedade = new Propriedade();
            propriedade.setIdCliente(8); // CPF ou ID do cliente
            propriedade.setDataEntrada(new Date()); // Data atual como data de entrada

            // Chamar a função insertVeiculo
            VeiculosDAO veiculosDAO = new VeiculosDAO();
            veiculosDAO.insertVeiculo(veiculo, propriedade);

            System.out.println("Veículo e propriedade cadastrados com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
