package com.copa.fifa_course.resource;


import com.copa.fifa_course.entities.Selecao;
import com.copa.fifa_course.service.SelecaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

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
    public ResponseEntity<Selecao> insert(@RequestBody Selecao obj) {
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Selecao> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<Selecao> update(@PathVariable Long id, @RequestBody Selecao obj) {
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

}
