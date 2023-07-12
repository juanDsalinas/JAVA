package sena.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import sena.bootcamp.modell.Cliente;
import sena.bootcamp.modell.ICliente;
import java.util.List;

public class ClienteServiceImpl implements IClienteService{
    @Autowired
    private ICliente cliented;

    @Override
    public List<Cliente>findAll() {
        return (List<Cliente>)cliented.findAll();
    }

    @Override
    public void save(Cliente cliente) {
		cliented.save(cliente);
    }

    @Override
    public Cliente findOne(Integer id) {
        return cliented.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        cliented.deleteById(id);
    }
}