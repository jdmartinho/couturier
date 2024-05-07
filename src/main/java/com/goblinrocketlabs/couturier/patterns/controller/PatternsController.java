package com.goblinrocketlabs.couturier.patterns.controller;

import com.goblinrocketlabs.couturier.patterns.repository.PatternEntity;
import com.goblinrocketlabs.couturier.patterns.repository.PatternsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatternsController {

    @Autowired
    private PatternsRepository patternsRepository;

    @PostMapping("/patterns")
    public PatternEntity createPattern(PatternEntity pattern) {
        return null;
    }

    @GetMapping("/patterns/")
    public List<PatternEntity> getPatterns() {
        return (List<PatternEntity>) patternsRepository.findAll();
    }

    @GetMapping("/patterns/{id}")
    public PatternEntity getPattern(@PathVariable Long id) {
        // findById
        // return if present
        // else return 404 not found
        return patternsRepository.findById(id).get();
    }

    @PutMapping("/patterns/{id}")
    public void updatePattern() {
    }

    @DeleteMapping("/patterns{id}")
    public void deletePattern() {
        // deleteById
        // return success
        // else return 404 not found
    }

}
