package com.goblinrocketlabs.couturier.patterns;

import com.goblinrocketlabs.couturier.patterns.repository.PatternEntity;
import org.junit.jupiter.api.Test;

import java.time.Year;

public class PatternTest {
    @Test
    public void createPatternTest(){
        PatternEntity patternUnderTest = new PatternEntity(1L, "Pattern 1", "Company 1",
                GarmentType.DRESS, Year.of(1984), "notes about this pattern");
        
    }
}
