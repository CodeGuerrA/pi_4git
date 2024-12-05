/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

/**
 *
 * @author Guerra
 */



import javax.swing.JOptionPane;

public class Validar {

    // Constantes para regex
    private static final String NOME_REGEX = "([A-ZÀ-Ü][a-zà-ü]+(?:[-'\\s][A-ZÀ-Üa-zà-ü]+)*)";
    private static final String CPF_REGEX = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
    private static final String TELEFONE_REGEX = "^\\s*(?:\\(?\\d{2}\\)?[-.\\s]?)?(?:9\\d{4}|\\d{4})[-.\\s]?\\d{4}\\s*(?:,\\s*(?:\\(?\\d{2}\\)?[-.\\s]?)?(?:9\\d{4}|\\d{4})[-.\\s]?\\d{4}\\s*)?$";
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final String CNPJ_REGEX = "\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}";
    private static final String PLACA_REGEX = "^[A-Z]{3}-[0-9]{4}$";
    private static final String ENDERECO_REGEX = "^[A-ZÀ-Üa-zà-ü0-9\\s.,'-]+,\\s*\\d+(\\/\\S*)?\\s*,\\s*[A-ZÀ-Üa-zà-ü0-9\\s.,'-]+,\\s*[A-ZÀ-Üa-zà-ü0-9\\s.,'-]+,\\s*CEP:\\d{5}-\\d{3}$";

    // Validação comum com regex
    private static boolean validarRegex(String valor, String regex, String mensagemErro) {
        if (valor.trim().isEmpty() || !valor.matches(regex)) {
            JOptionPane.showMessageDialog(null, mensagemErro, "Erro de Validação", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    // Validação para entrada de pessoa física || Exemplos Nome: João da Silva, CPF:123.456.789-01, Telefones: (11) 91234-5678, Endereço: Rua das Flores, 123, Jardim Primavera, São Paulo, CEP:12345-678
    public static boolean validarEntradaPF(String nome, String cpf, String telefones, String endereco, String email) {
        return validarRegex(nome, NOME_REGEX, "Nome inválido! Certifique-se de que cada palavra começa com letra maiúscula.")
                && validarRegex(cpf, CPF_REGEX, "CPF inválido! Formato esperado: XXX.XXX.XXX-XX.")
                && validarRegex(telefones, TELEFONE_REGEX, "Formato de telefone inválido! Exemplos válidos: (XX) 9XXXX-XXXX.")
                && validarRegex(endereco, ENDERECO_REGEX, "Endereço inválido! Certifique-se de que está no formato esperado.")
                && validarRegex(email, EMAIL_REGEX, "E-mail inválido! Insira um endereço de e-mail válido.");
    }

    // Validação para entrada de pessoa jurídica, Inscrição estadual: 123456789, 
    public static boolean validarEntradaPJ(String nome, String cnpj, String telefones, String endereco, String email, String contatos, String inscricaoEstadual) {
        return validarRegex(nome, NOME_REGEX, "Nome inválido! Certifique-se de que cada palavra começa com letra maiúscula.")
                && validarRegex(cnpj, CNPJ_REGEX, "CNPJ inválido! Formato esperado: XX.XXX.XXX/XXXX-XX.")
                && validarRegex(telefones, TELEFONE_REGEX, "Formato de telefone inválido! Exemplos válidos: (XX) 9XXXX-XXXX.")
                && validarRegex(endereco, "^[A-Za-zÀ-Üà-ü0-9\\s,/-]+$", "Endereço inválido! Certifique-se de que contém Rua, Número, Bairro, Cidade e CEP.")
                && validarRegex(email, EMAIL_REGEX, "E-mail inválido! Insira um endereço de e-mail válido.")
                && (contatos.trim().isEmpty() || validarRegex(contatos, "^[A-Za-zÀ-ÖØ-öø-ÿ]+(?: [A-Za-zÀ-ÖØ-öø-ÿ]+)*$", "Contatos inválidos! Certifique-se de que estão formatados corretamente."))
                && validarRegex(inscricaoEstadual, "\\d+", "Inscrição estadual inválida! Deve conter apenas números.");
    }

    // Validação para entrada de carro
    public static boolean validarEntradaCarro(String chave, String modelo, String marca,
            String placa, String chassi, String patrimonio,
            String kilometragemText) {
        return !chave.trim().isEmpty()
                || mostrarErro("A chave não pode ser vazia.")
                && !modelo.trim().isEmpty()
                || mostrarErro("O modelo não pode ser vazio.")
                && !marca.trim().isEmpty()
                || mostrarErro("A marca não pode ser vazia.")
                && validarRegex(placa, PLACA_REGEX, "Placa inválida! O formato esperado é AAA-1234.")
                && (chassi.trim().length() == 17 || mostrarErro("Chassi inválido! Deve ter 17 caracteres."))
                && !patrimonio.trim().isEmpty()
                || mostrarErro("O patrimônio não pode ser vazio.")
                && !kilometragemText.trim().isEmpty()
                || mostrarErro("A quilometragem não pode ser vazia.");
    }

    // Método auxiliar para mostrar erros
    private static boolean mostrarErro(String mensagemErro) {
        JOptionPane.showMessageDialog(null, mensagemErro, "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}

