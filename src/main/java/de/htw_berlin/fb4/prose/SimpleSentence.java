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
