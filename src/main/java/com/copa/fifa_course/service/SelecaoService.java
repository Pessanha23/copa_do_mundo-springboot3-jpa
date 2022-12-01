package com.copa.fifa_course.service;

import com.copa.fifa_course.entities.Selecao;
import com.copa.fifa_course.repository.SelecaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SelecaoService {

    @Autowired
    private SelecaoRepository repository;

    public List<Selecao> findAll() {
        return repository.findAll();
    }

    public Selecao findById(Long id) {
        Optional<Selecao> obj = repository.findById(id);
        return obj.get();
    }

    public Selecao insert(Selecao obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Selecao update(Long id, Selecao obj) {
        Selecao entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Selecao entity, Selecao obj) {
        entity.setContinente(obj.getContinente());
        entity.setTime(obj.getTime());
    }
}
