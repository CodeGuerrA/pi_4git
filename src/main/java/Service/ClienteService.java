package Service;

import Model.Cliente;
import java.util.Hashtable;

public interface ClienteService {

    Cliente buscarClientePorChave(String chave);

    Hashtable<String, Cliente> listarTodosClientes();

    boolean verificarCliente(String chave);
}
