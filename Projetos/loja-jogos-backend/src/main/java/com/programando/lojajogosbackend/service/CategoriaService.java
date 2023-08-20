package com.programando.lojajogosbackend.service;

import com.programando.lojajogosbackend.model.Categoria;
import com.programando.lojajogosbackend.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> getCategorias(){
        return categoriaRepository.findAll();
    }

    public Categoria save(Categoria categoria){
        return categoriaRepository.save(categoria);
    }
}
