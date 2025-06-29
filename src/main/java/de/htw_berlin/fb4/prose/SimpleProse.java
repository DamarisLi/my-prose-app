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