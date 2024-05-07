package com.goblinrocketlabs.couturier.patterns.repository;

import com.goblinrocketlabs.couturier.patterns.GarmentType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.Year;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PatternEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long patternId;
    private String patternName;
    private String patternCompany;
    private GarmentType patternGarmentType;
    private Year patternYear;
    private String patternNotes;
}
