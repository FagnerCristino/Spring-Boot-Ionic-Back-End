package com.fagnerdev.cursomc.controllers;

import com.fagnerdev.cursomc.domain.Cliente;
import com.fagnerdev.cursomc.domain.Cliente;
import com.fagnerdev.cursomc.dto.CategoriaDTO;
import com.fagnerdev.cursomc.dto.ClienteDTO;
import com.fagnerdev.cursomc.dto.ClienteNewDTO;
import com.fagnerdev.cursomc.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> find(@PathVariable Integer id){
        Cliente obj = clienteService.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody ClienteNewDTO objDto){
        Cliente obj = clienteService.fromDto(objDto);
        obj = clienteService.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@Valid @RequestBody ClienteDTO objDto, @PathVariable Integer id ){
        Cliente obj = clienteService.fromDto(objDto);
        obj.setId(id);
        obj = clienteService.update(obj);
        return ResponseEntity.noContent().build();

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        clienteService.delete(id);
        return ResponseEntity.noContent().build();

    }

    @GetMapping
    public ResponseEntity<List<ClienteDTO>> findAll(){
        List<Cliente> list = clienteService.findAll();
        List<ClienteDTO> listDTO = list.stream().map(ClienteDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

    @GetMapping(value = "/page")
    public ResponseEntity<Page<ClienteDTO>> findPage(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,
            @RequestParam(value = "orderBy", defaultValue = "nome") String orderBy,
            @RequestParam(value = "direction", defaultValue = "ASC") String direction){
        Page<Cliente> list = clienteService.findPage(page, linesPerPage, orderBy, direction);
        Page<ClienteDTO> listDTO = list.map(ClienteDTO::new);
        return ResponseEntity.ok().body(listDTO);
    }

}
