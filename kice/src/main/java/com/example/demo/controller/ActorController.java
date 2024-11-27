package com.example.demo.controller;

import com.example.demo.model.Actor;
import com.example.demo.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/actors")
public class ActorController {

    @Autowired
    private ActorRepository actorRepository;

    @GetMapping
    public List <Actor> getAllActors() {
        return actorRepository.findAll();
    }

    @PostMapping
    public Actor createActor(@RequestBody Actor actor) {
        return actorRepository.save(actor);
    }

    @GetMapping("/{id}")
    public Actor getActorById(@PathVariable Long id) {
        return actorRepository.findById(id).orElseThrow(() -> new RuntimeException("Actor not found"));
    }
}
