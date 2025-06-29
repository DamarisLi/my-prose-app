/*
 * ProseApp - A simple prose builder application
 * Copyright (C) 2025 Damaris Liedtke
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2
 * which is available at https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html.
 */

package de.htw_berlin.fb4.prose;

import de.htw_berlin.fb4.ossd.prose.Prose;
import de.htw_berlin.fb4.ossd.prose.Sentence;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        // Create sentences
        Sentence sentence1 = new SimpleSentence("This is the first sentence.");
        Sentence sentence2 = new SimpleSentence("Here is the second sentence.");
        Sentence sentence3 = new SimpleSentence("Finally, this is the third sentence.");

        // Create a prose object with the sentences
        Prose prose = new SimpleProse(List.of(sentence1, sentence2, sentence3));

        // Print the prose
        System.out.println(prose.get());
    }
}
