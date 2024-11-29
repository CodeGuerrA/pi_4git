package Repository;

import Model.Cliente;
import javax.swing.table.DefaultTableModel;

public interface IClientesCRUD {
    public void insertPJ(Cliente objClientes) throws Exception;
    public void insertPF(Cliente objClientes) throws Exception;
    public void removerPJ(String cnpjCLiente) throws Exception;
    public void removerPF(String cpfCliente) throws Exception;
    public void updatePJ(Cliente cliente, String cnpj) throws Exception;
    public void updatePF(Cliente cliente, String cpf) throws Exception;
    public void selectClientes(DefaultTableModel model) throws Exception;
}
