package com.spring.recipe;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DaterPrefixer implements Prefixer {

    private DateFormat dateFormat;

    public DaterPrefixer(String format) {
        this.dateFormat = new SimpleDateFormat(format);
    }

    @Override
    public String getPrefix() {
        return dateFormat.format(new Date());
    }
}
