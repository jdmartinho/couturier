package com.goblinrocketlabs.couturier.patterns;

import org.springframework.data.annotation.Id;

import java.time.Year;
public record Pattern(
        @Id
        Long id,
        String name,
        Year year,
        String company,
        Enum<GarmentType> garmentType,
        String notes
) {}