package Util;

public class Validator {

    public static boolean validarEntradaPF(String nome, String cpf, String telefones, String endereco, String email, String contatos) {
        // Regex flexível para telefone
        String telefoneRegex = "^\\s*(?:\\(?\\d{2}\\)?[-.\\s]?)?(?:9\\d{4}|\\d{4})[-.\\s]?\\d{4}\\s*$";

        // Validação do nome
        if (nome.trim().isEmpty() || !nome.matches("([A-ZÀ-Ü][a-zà-ü]+(?:[-'\\s][A-ZÀ-Üa-zà-ü]+)*)")) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Nome inválido! Certifique-se de que cada palavra começa com letra maiúscula.",
                    "Erro de Validação", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validação do CPF
        if (!cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "CPF inválido! Formato esperado: XXX.XXX.XXX-XX",
                    "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validação de telefone
        if (telefones.trim().isEmpty() || !telefones.matches(telefoneRegex)) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Formato de telefone inválido! Exemplos válidos: (XX) 9XXXX-XXXX, XX9XXXX-XXXX, XXXX-XXXX",
                    "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validação do endereço
        if (endereco.trim().isEmpty()
                || !endereco.matches("^[A-ZÀ-Üa-zà-ü0-9\\s.,'-]+,\\s*\\d+(\\/\\S*)?\\s*,\\s*[A-ZÀ-Üa-zà-ü0-9\\s.,'-]+,\\s*[A-ZÀ-Üa-zà-ü0-9\\s.,'-]+,\\s*CEP:\\d{5}-\\d{3}$")) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Endereço inválido! Certifique-se de que está no formato: RUA NOME, NÚMERO/COMPLEMENTO, BAIRRO, CIDADE, CEP:XXXXX-XXX",
                    "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validação do e-mail
        if (email.trim().isEmpty() || !email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "E-mail inválido! Insira um endereço de e-mail válido.",
                    "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validação dos contatos (opcional)
        if (!contatos.trim().isEmpty() && !contatos.matches("^[a-zA-Z0-9,\\s]+$")) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Contatos inválidos! Certifique-se de que os contatos estão formatados corretamente.",
                    "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    public static boolean validarEntradaPJ(String nome, String cnpj, String telefones, String endereco, String email, String contatos, String inscricaoEstadual) {
        // Regex flexível para telefone
        String telefoneRegex = "^\\s*(?:\\(?\\d{2}\\)?[-.\\s]?)?(?:9\\d{4}|\\d{4})[-.\\s]?\\d{4}\\s*$";

        // Validação do nome
        if (nome.trim().isEmpty() || !nome.matches("([A-ZÀ-Ü][a-zà-ü]+(?:[-'\\s][A-ZÀ-Üa-zà-ü]+)*)")) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Nome inválido! Certifique-se de que cada palavra começa com letra maiúscula.",
                    "Erro de Validação", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validação do CNPJ
        if (cnpj.trim().isEmpty() || !cnpj.matches("\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}")) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "CNPJ inválido! Formato esperado: XX.XXX.XXX/XXXX-XX",
                    "Erro de Validação", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validação de telefone
        if (telefones.trim().isEmpty() || !telefones.matches(telefoneRegex)) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Formato de telefone inválido! Exemplos válidos: (XX) 9XXXX-XXXX, XX9XXXX-XXXX, XXXX-XXXX",
                    "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validação do endereço
        if (endereco.trim().isEmpty()
                || !endereco.matches("^[A-Za-zÀ-Üà-ü0-9\\s,/-]+$")) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Endereço inválido! Certifique-se de que contém Rua, Número, Bairro, Cidade e CEP.",
                    "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validação do e-mail
        if (email.trim().isEmpty() || !email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "E-mail inválido! Insira um endereço de e-mail válido.",
                    "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validação dos contatos (opcional)
        if (!contatos.trim().isEmpty() && !contatos.matches("^[a-zA-Z0-9,\\s]+$")) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Contatos inválidos! Certifique-se de que os contatos estão formatados corretamente.",
                    "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validação de inscrição estadual (apenas números)
        if (inscricaoEstadual.trim().isEmpty() || !inscricaoEstadual.matches("\\d+")) {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Inscrição estadual inválida! Deve conter apenas números.",
                    "Erro de Validação", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }
}
