import org.junit.Test;

import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;

public class AlgorithmTests
{
    private int Algorithm(String s)
    {
        var characters = new HashMap<Character, Integer>();
        var charArray = s.toCharArray();


        for (Character letter : charArray)
        {
            var count = characters.get(letter);

            if(count == null) {
                characters.put(letter, 1);
            }
            else {
                characters.put(letter, ++count);
            }
        }

        for(int i = 0; i < s.length(); i++)
        {
            if(characters.get(charArray[i]) == 1) {
                return i;
            }
        }

        return -1;
    }

    // region Tests
    @Test
    public void Test1()
    {
        // Arrange
        var testString = "leetcode";

        // Act
        var result = Algorithm(testString);

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void Test2()
    {
        // Arrange
        var testString = "loveleetcode";

        // Act
        var result = Algorithm(testString);

        // Assert
        assertEquals(2, result);
    }

    @Test
    public void Test3()
    {
        // Arrange
        var testString = "aabb";

        // Act
        var result = Algorithm(testString);

        // Assert
        assertEquals(-1, result);
    }
    // endregion
}
