import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class AlgorithmTests
{
    private void Algorithm(char[] s)
    {
        var leftIndex = 0;
        var rightIndex = s.length - 1;

        while(leftIndex <= rightIndex)
        {
            var temp = s[leftIndex];
            s[leftIndex] = s[rightIndex];
            s[rightIndex] = temp;

            ++leftIndex;
            --rightIndex;
        }
    }

    @Test
    public void Test1()
    {
        // Arrange
        var charArray = new char[] { 'h', 'e', 'l', 'l', 'o' };
        var expectedResult = new char[] { 'o', 'l', 'l', 'e', 'h' };

        // Act
        Algorithm(charArray);

        // Assert
        assertArrayEquals(expectedResult, charArray);
    }

    @Test
    public void Test2()
    {
        // Arrange
        var charArray = new char[] { 'H', 'a', 'n', 'n', 'a', 'h' };
        var expectedResult = new char[] { 'h', 'a', 'n', 'n', 'a', 'H' };

        // Act
        Algorithm(charArray);

        // Assert
        assertArrayEquals(expectedResult, charArray);
    }
}
