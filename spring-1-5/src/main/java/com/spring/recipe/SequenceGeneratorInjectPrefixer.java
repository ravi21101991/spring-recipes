package com.spring.recipe;

import lombok.Data;

@Data
public class SequenceGeneratorInjectPrefixer {

    private Prefixer prefixer;
    private int initial;
    private int count;

    public SequenceGeneratorInjectPrefixer(Prefixer prefixer, int initial) {
        this.prefixer = prefixer;
        this.initial = initial;
    }

    public synchronized String getSequence() {
        return prefixer.getPrefix() + (initial + ++count);
    }
}
