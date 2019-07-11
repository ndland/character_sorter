import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterSorterTest {

    private CharacterSorter characterSorter;

    @BeforeEach
    void setUp() {
        characterSorter = new CharacterSorter();
    }

    @Test
    void testCharacterSorterSortsSingleWords() {
        String word = "word";
        assertHelper("dorw", word);
    }

    @Test
    void testCharacterSorterSortsSentences() {
        String sentence = "This is a sentence.";
        assertHelper("aceeehiinnssstt", sentence);
    }

    @Test
    void testCharacterSorterSortsExampleString() {
        String example = "When not studying nuclear physics, Bambi likes to play" +
                " beach volleyball.";
        assertHelper("aaaaabbbbcccdeeeeeghhhiiiiklllllllmnnnnooopprsssstttuuvwyyyy", example);
    }

    void assertHelper(String expected, String actual) {
        assertEquals(expected, characterSorter.sort(actual), "Not sorted correctly");
    }

}