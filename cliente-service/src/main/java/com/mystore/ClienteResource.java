package com.mystore;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class ClienteResource {

    private ClienteServiceImpl clienteService;

    @Autowired
    public ClienteResource(ClienteServiceImpl clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/clientes")
    public List<ClienteDTO> getClientes(){
        //log.info("Servicio Cliente -> Se obtiene la lista de clientes");
        return clienteService.getAll();
    }
}
