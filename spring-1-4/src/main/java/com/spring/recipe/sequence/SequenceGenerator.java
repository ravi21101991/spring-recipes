package com.spring.recipe.sequence;

import lombok.Data;

@Data
public class SequenceGenerator {

    private String prefix;
    private String suffix;
    private int initial;
    private int count;

    public SequenceGenerator(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public SequenceGenerator(String suffix, int initial) {
        this.suffix = suffix;
        this.initial = initial;
    }

    public synchronized String getNextSequence() {
        return prefix + (initial + ++count) + suffix;
    }

}