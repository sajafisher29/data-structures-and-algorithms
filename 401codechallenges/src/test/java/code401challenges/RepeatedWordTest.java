package code401challenges;

import org.junit.Test;

import static code401challenges.RepeatedWord.repeatedWord;
import static org.junit.Assert.*;

public class RepeatedWordTest {

    // Test for a string that has one repeated word
    @Test
    public void testFirstRepeatedWordForStringWithOneRepeatedWord() {
        String testString = "Pai: 'I wasn't scared to die.' Koro: 'Wise leader, forgive me… I am just a fledgling new to this flight.'";
        String repeatedWord = repeatedWord(testString);

        assertEquals("i", repeatedWord);
    }

    // Test a long string that has multiple repeated words
    @Test
    public void testFirstRepeatedWordForStringWithMultipleRepeatedWordsConnectedToSpecialCharacters() {
        String testString = "Pai: 'I wasn't scared to die.' Koro: 'Wise leader, forgive me…I am just a fledgling new to this flight.' Pai: 'My name is Paikea Apirana and I come from a long line of chiefs, stretching all the way back to the Whale Rider. I am not a prophet, but I know our people will keep going forward with all of our strength.'";
        String repeatedWord = repeatedWord(testString);

        assertEquals("i", repeatedWord);
    }

    // Test a long string that has multiple repeated words
    @Test
    public void testFirstRepeatedWordForStringWithMultipleRepeatedWords() {
        String testString = "Our Koro was like an old whale stranded in an alien present, but that was how it was supposed to be, because he also had his role in the pattern of things, in the tides of the future";
        String repeatedWord = repeatedWord(testString);

        assertEquals("an", repeatedWord);
    }

    // Test for repeated words with special characters within the word.
    @Test
    public void testRepeatedWordForStringWithRepeatedWordsContainingApostrophes() {
        String testString = "I can't run like before and can't stop dreaming that I can.";
        String repeatedWord = repeatedWord(testString);

        assertEquals("can't", repeatedWord);
    }

    // Test for multiple special characters next to a repeated word
    @Test
    public void testRepeatedWordForStringThatHasRepeatedWordsAndMultipleSpecialCharactersAdjacent() {
        String testString = "Whale!!! Do you see the whale?!?!";
        String repeatedWord = repeatedWord(testString);

        assertEquals("whale", repeatedWord);
    }

    // test for empty string
    @Test
    public void testRepeatedWordForEmptyString() {
        String testString = "";

        assertNull(repeatedWord(testString));
    }

    // Test for a string with no repeated words
    @Test
    public void testRepeatedWordForStringThatHasNoRepeatedWord() {
        String testString = "Man might carve his mark on the earth, but unless he's vigilant, Nature will take it all back.";

        assertNull(repeatedWord(testString));
    }

}