/*
 * ProseApp - A simple prose builder application
 * Copyright (C) 2025 Damaris Liedtke
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2
 * which is available at https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html.
 */

package de.htw_berlin.fb4.prose;

import java.util.List;
import java.util.stream.Collectors;

import de.htw_berlin.fb4.ossd.prose.Prose;
import de.htw_berlin.fb4.ossd.prose.Sentence;

public class SimpleProse implements Prose {
    private final List<Sentence> sentences;

    public SimpleProse(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public String get() {
        return sentences.stream()
                .map(Sentence::get)
                .collect(Collectors.joining(" "));
    }
    
}