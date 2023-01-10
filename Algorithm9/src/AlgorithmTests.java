import org.junit.Test;

import java.util.HashSet;

import static junit.framework.TestCase.assertEquals;

public class AlgorithmTests
{
    private int Algorithm(int[] nums)
    {
        var numbers = new HashSet<Integer>();

        for (var number : nums) {
            numbers.add(number);
        }

        for(int i = 0; i <= nums.length; i++)
        {
            if(!numbers.contains(i)) {
                return i;
            }
        }

        return Integer.MIN_VALUE;
    }

    @Test
    public void Test1()
    {
        // Arrange
        var testArray = new int[] { 3, 0, 1 };
        var expectedResult = 2;

        // Act
        var result = Algorithm(testArray);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void Test2()
    {
        // Arrange
        var testArray = new int[] { 0, 1 };
        var expectedResult = 2;

        // Act
        var result = Algorithm(testArray);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void Test3()
    {
        // Arrange
        var testArray = new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        var expectedResult = 8;

        // Act
        var result = Algorithm(testArray);

        // Assert
        assertEquals(expectedResult, result);
    }
}
