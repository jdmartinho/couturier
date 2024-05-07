package com.goblinrocketlabs.couturier.patterns.controller;

import com.goblinrocketlabs.couturier.patterns.PatternDTO;
import com.goblinrocketlabs.couturier.patterns.repository.PatternEntity;
import com.goblinrocketlabs.couturier.patterns.repository.PatternsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patterns")
public class PatternsController {

    @Autowired
    private PatternsRepository patternsRepository;

    @PostMapping("/")
    public PatternEntity createPattern(PatternDTO pattern) {
        return null;
    }

    @GetMapping("/")
    public List<PatternEntity> getPatterns() {
        return (List<PatternEntity>) patternsRepository.findAll();
    }

    @GetMapping("/{id}")
    public PatternEntity getPattern(@PathVariable Long id) throws ResponseStatusException {
        Optional<PatternEntity> response = patternsRepository.findById(id);
        if (response.isPresent()) {
            return response.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pattern not found");
        }
    }

    @PutMapping("/{id}")
    public void updatePattern() {
    }

    @DeleteMapping("/{id}")
    public void deletePattern(@PathVariable Long id) {
        patternsRepository.deleteById(id);
    }

}
