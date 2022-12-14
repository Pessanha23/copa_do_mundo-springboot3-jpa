package com.copa.fifa_course.resource;


import com.copa.fifa_course.entities.Selecao;
import com.copa.fifa_course.service.SelecaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/selecoes")
public class SelecaoResource {

    @Autowired
    private SelecaoService service;

    @GetMapping
    public ResponseEntity<List<Selecao>> findAll() {
        List<Selecao> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Selecao> findById(@PathVariable Long id) {
        Selecao obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<List<Selecao>> insert(@RequestBody List<Selecao> objetos) {
        List<Selecao> result = service.insert(objetos);
        return ResponseEntity.ok().body(result);
    }

}
