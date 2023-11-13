package org.example.service;

import org.example.model.Cliente;
import org.example.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;
    @Autowired
    public ClientesService( ClientesRepository repository){
        this.repository = repository;
    }
    public void SalvarCliente(Cliente cliente){
        ValidarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public  void  ValidarCliente(Cliente cliente){
        //valida o cliente
    }
}
