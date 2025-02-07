package linearsearch;
import com.tit.linearsearch.SearchSpecificWord;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SearchSpecificWordTesting {

    @Test
    public void testWordFound() {
        String[] sentences = {
                "Aadarsh is good in Web Development.",
                "Ankit is good in JAVA.",
                "Aditya is not good in AWS."
        };
        assertEquals("Ankit is good in JAVA.", SearchSpecificWord.findSentenceWithWord(sentences, "JAVA"));
    }

    @Test
    public void testWordNotFound() {
        String[] sentences = {
                "Aadarsh is good in Web Development.",
                "Ankit is good in JAVA.",
                "Aditya is not good in AWS."
        };
        assertEquals("Not Found", SearchSpecificWord.findSentenceWithWord(sentences, "Python"));
    }

    @Test
    public void testCaseSensitivity() {
        String[] sentences = {
                "Aadarsh is good in Web Development.",
                "Ankit is good in JAVA.",
                "Aditya is not good in AWS."
        };
        assertEquals("Not Found", SearchSpecificWord.findSentenceWithWord(sentences, "java"));
    }
}
