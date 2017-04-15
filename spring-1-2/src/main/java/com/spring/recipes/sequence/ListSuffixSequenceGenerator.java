package com.spring.recipes.sequence;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ListSuffixSequenceGenerator {

    private List<Object> suffixes;
    private int counter;

    public synchronized String getSequence() {
        StringBuilder stringBuilder = new StringBuilder("" + counter++);
        for (Object suffix : suffixes) {
            stringBuilder.append("-" + suffix);
        }
        return stringBuilder.toString();
    }

}
