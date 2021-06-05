package com.fagnerdev.cursomc.controllers;

import com.fagnerdev.cursomc.domain.Categoria;
import com.fagnerdev.cursomc.domain.Produto;
import com.fagnerdev.cursomc.dto.ProdutoDTO;
import com.fagnerdev.cursomc.dto.CategoriaDTO;
import com.fagnerdev.cursomc.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/Produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService ProdutoService;

    /*@GetMapping(value = "/{id}")
    public ResponseEntity<Produto> find(@PathVariable Integer id){
        Produto obj = ProdutoService.find(id);
        return ResponseEntity.ok().body(obj);
    }*/

 /*   @GetMapping(value = "/page")
    public ResponseEntity<Page<ProdutoDTO>> findPage(
            @RequestParam(value = "nome", defaultValue = "0") Integer nome,
            @RequestParam(value = "categorias", defaultValue = "24") Integer categorias,
            @RequestParam(value = "orderBy", defaultValue = "nome") String orderBy,
            @RequestParam(value = "direction", defaultValue = "ASC") String direction) {
        Page<Categoria> list = categoriaService.findPage(page, linesPerPage, orderBy, direction);
        Page<CategoriaDTO> listDTO = list.map(obj -> new CategoriaDTO(obj));
        return ResponseEntity.ok().body(listDTO);

    }*/
}
