package com.copa.fifa_course.resource;

import com.copa.fifa_course.entities.Grupos;
import com.copa.fifa_course.service.GruposService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/grupos")
public class GruposResource {

    @Autowired
    private GruposService service;

    @GetMapping
    public ResponseEntity<List<Grupos>> findAll() {
        List<Grupos> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping
    public ResponseEntity<Grupos> findById(@PathVariable Long id) {
        Grupos obj = service.findbyId(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<List<Grupos>> insert(@RequestBody List<Grupos> objetos) {
        List<Grupos> result = service.insert(objetos);
        return ResponseEntity.ok().body(result);
    }
}
