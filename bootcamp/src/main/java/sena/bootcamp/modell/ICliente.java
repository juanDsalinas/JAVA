package sena.bootcamp.modell;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ICliente extends CrudRepository<Cliente,Integer>{

    // public List<Cliente> findAll();
    // public void save (Cliente cliente);
    // public Cliente findOne(Integer id);
    // public void delete(Integer id);
}
