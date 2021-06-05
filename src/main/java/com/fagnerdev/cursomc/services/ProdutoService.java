package com.fagnerdev.cursomc.services;

import com.fagnerdev.cursomc.domain.Categoria;
import com.fagnerdev.cursomc.domain.Produto;
import com.fagnerdev.cursomc.repositories.CategoriaRepository;
import com.fagnerdev.cursomc.repositories.ProdutoRepository;
import com.fagnerdev.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    /*public Produto find(Integer id) {
        Optional<Produto> obj = ProdutoRepository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Produto.class.getName()
        ));
    }*/

    /*public Page<Produto> search(String nome, List<Integer> ids, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        List<Categoria> categorias = categoriaRepository.findAll(ids);
        return repository.search(nome, categoria, pageRequest);
    }*/
}
