package Service;

import Model.Veiculos;
import java.util.Hashtable;

/**
 *
 
@author Guerra*/
public interface VeiculoService {

    public void adicionarVeiculo(Veiculos veiculo);

    Veiculos buscarVeiculosPelaPlaca(String placa);


    Hashtable<String, Veiculos> listarTodosVeiculos();



}