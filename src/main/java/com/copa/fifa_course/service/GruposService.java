package com.copa.fifa_course.service;

import com.copa.fifa_course.entities.Grupos;
import com.copa.fifa_course.repository.GruposRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GruposService {

    @Autowired
    private GruposRespository gruposRespository;

    public List<Grupos> findAll() {
        return gruposRespository.findAll();
    }

    public Grupos findbyId(Long id) {
        Optional<Grupos> obj = gruposRespository.findById(id);
        return obj.get();
    }
    public List<Grupos> insert(List<Grupos> selecoes1){
        if ( selecoes1.size() == gruposRespository.findAll().size()) {

        }
    }

}
