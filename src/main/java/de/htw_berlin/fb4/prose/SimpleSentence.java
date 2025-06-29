/*
 * ProseApp - A simple prose builder application
 * Copyright (C) 2025 Damaris Liedtke
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2
 * which is available at https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html.
 */

package de.htw_berlin.fb4.prose;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class SimpleSentence implements Sentence{
    String sentence;

    /**
     * Constructs a SimpleSentence object.
     */
    public SimpleSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    /**
     * Returns a simple sentence.
     *
     * @return A string representing a simple sentence.
     */
    public String get() {
        return this.sentence;
    }
}
