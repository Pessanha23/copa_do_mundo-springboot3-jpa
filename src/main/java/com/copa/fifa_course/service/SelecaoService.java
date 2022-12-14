package com.copa.fifa_course.service;

import com.copa.fifa_course.entities.Selecao;
import com.copa.fifa_course.repository.SelecaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

@Service
public class SelecaoService {

    @Autowired
    private SelecaoRepository repository;

    public List<Selecao> findAll() {
        return repository.findAll(Sort.by(Sort.Direction.DESC,"id"));
    }

    public Selecao findById(Long id) {
        Optional<Selecao> obj = repository.findById(id);
        return obj.get();
    }

    public List<Selecao> insert(List<Selecao> selecoes) {
        int totalbd = repository.findAll().size();
        int quantity = totalbd + selecoes.size();
            if (quantity <= 32) {
                return repository.saveAll(selecoes);
            }
        throw new RuntimeException("NUMERO MAIOR QUE 32 SELECOES");
    }
}
