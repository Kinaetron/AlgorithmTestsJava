import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertArrayEquals;

public class AlgorithmTests
{
    private int[] Algorithm(int[] nums, int target)
    {
        if(nums == null | nums.length < 2)  {
            return new int[2];
        }

        var numbersMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++)
        {
            if(numbersMap.containsKey(nums[i])) {
                return new int[] { numbersMap.get(nums[i]), i };
            }

            var numberToEnd = target - nums[i];
            numbersMap.put(numberToEnd, i);
        }

        return new int[2];
    }

    @Test
    public void Test1()
    {
        // Arrange
        var testTarget = 9;
        var testArray = new int[] { 2, 7, 11, 15 };
        var expectedResult = new int[] { 0, 1 };

        // Act
        var result = Algorithm(testArray, testTarget);

        // Assert
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void Test2()
    {
        // Arrange
        var testTarget = 6;
        var testArray = new int[] { 3, 2, 4 };
        var expectedResult = new int[] { 1, 2 };

        // Act
        var result = Algorithm(testArray, testTarget);

        // Assert
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void Test3()
    {
        // Arrange
        var testTarget = 6;
        var testArray = new int[] { 3, 3};
        var expectedResult = new int[] { 0, 1 };

        // Act
        var result = Algorithm(testArray, testTarget);

        // Assert
        assertArrayEquals(expectedResult, result);
    }
}
