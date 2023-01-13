import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class AlgorithmTests
{
    public boolean Algorithm(String s, String t)
    {
        if(s.length() != t.length())  {
            return false;
        }

        var sArray = s.toCharArray();
        var tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        for(int i = 0; i < sArray.length; i++)
        {
            if(sArray[i] != tArray[i]) {
                return false;
            }
        }
        return true;
    }

    // region Tests
    @Test
    public void Test1()
    {
        // Arrange
        var testString1 = "anagram";
        var testString2 = "nagaram";

        // Act
        var result = Algorithm(testString1, testString2);

        // Assert
        assertEquals(true, result);
    }

    @Test
    public void Test2()
    {
        // Arrange
        var testString1 = "rat";
        var testString2 = "car";

        // Act
        var result = Algorithm(testString1, testString2);

        assertEquals(false, result);
    }
    // endregion
}
