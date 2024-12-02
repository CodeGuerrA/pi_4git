package Service;

import Model.Veiculos;
import java.util.Hashtable;

/**
 *
 * @author Guerra
 */
public interface VeiculoService {

    void adicionarVeiculo(String placa, Veiculos veiculo);
    
    Veiculos buscarVeiculosPelaPlaca(String placa);


    Hashtable<String, Veiculos> listarTodosVeiculos();
    
    

}
