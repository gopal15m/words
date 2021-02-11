import com.Words;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class WordsTest {
    Words words;
    Set<String> exceptedResult, actualResult;
    @Before
    public void setUp() throws Exception {

        words = new Words();
        exceptedResult = new HashSet<String>();
        exceptedResult.add("ROW");
        exceptedResult.add("KING");
        exceptedResult.add("KNOW");
        exceptedResult.add("WORK");
    }

    @Test
    public void TestFindWordsForValidString() {

        actualResult = words.findWords("WORKING");
        assertTrue(CollectionUtils.isEqualCollection(exceptedResult, actualResult));
    }

    @Test
    public void TestFindWordsForInvalidString() {
         actualResult = words.findWords("WORKI6565656NG");
        assertTrue(CollectionUtils.isEmpty(actualResult));
    }

    @Test
    public void TestFindWordsForNullString() {
         actualResult = words.findWords(null);
        assertTrue(CollectionUtils.isEmpty(actualResult));
    }

     @Test
    public void TestFindWordsForEmptyString() {
         actualResult = words.findWords(null);
        assertTrue(CollectionUtils.isEmpty(actualResult));
    }
    
    @After
    public void tearDown() throws Exception {
    }


}
