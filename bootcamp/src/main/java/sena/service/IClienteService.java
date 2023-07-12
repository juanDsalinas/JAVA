package sena.service;

import org.springframework.stereotype.Service;
import java.util.List;
import sena.bootcamp.modell.Cliente;

@Service
public interface IClienteService{
    public List<Cliente> findAll();
    public void save (Cliente cliente);
    public Cliente findOne(Integer id);
    public void delete(Integer id);
}
