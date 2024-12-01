package Util;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;

import java.io.FileNotFoundException;

public class ReportGenerator {

    public static void main(String[] args) {
        // Caminho do arquivo PDF de saída
        String dest = "relatorio_funcionarios.pdf";

        try {
            // Criando o PdfWriter que escreve no arquivo de saída
            PdfWriter writer = new PdfWriter(dest);

            // Criando o PdfDocument
            PdfDocument pdf = new PdfDocument(writer);

            // Criando o documento com layout
            Document document = new Document(pdf);

            // Título do relatório
            document.add(new Paragraph("Relatório de Funcionários")
                    .setBold().setFontSize(18).setTextAlignment(com.itextpdf.layout.properties.TextAlignment.CENTER));

            // Adicionando uma linha em branco
            document.add(new Paragraph("\n"));

            // Criando uma tabela com 3 colunas (Nome, Cargo, Salário)
            float[] columnWidths = {1, 2, 1};  // Largura das colunas
            Table table = new Table(columnWidths);

            // Cabeçalho da tabela
            table.addCell(new Cell().add(new Paragraph("Nome")).setBold());
            table.addCell(new Cell().add(new Paragraph("Cargo")).setBold());
            table.addCell(new Cell().add(new Paragraph("Salário")).setBold());

            // Adicionando dados à tabela
            table.addCell("João Silva");
            table.addCell("Desenvolvedor");
            table.addCell("R$ 5.000,00");

            table.addCell("Maria Souza");
            table.addCell("Analista de Sistemas");
            table.addCell("R$ 4.200,00");

            table.addCell("Carlos Pereira");
            table.addCell("Gerente de Projetos");
            table.addCell("R$ 7.500,00");

            // Adicionando a tabela ao documento
            document.add(table);

            // Fechando o documento
            document.close();

            System.out.println("Relatório gerado com sucesso!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
