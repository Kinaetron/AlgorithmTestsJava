import org.junit.Test;

import java.util.HashSet;

import static junit.framework.TestCase.assertEquals;

public class AlgorithmTests
{
    private boolean Algorithm(int[] nums)
    {
        var lookedAt = new HashSet<Integer>();

        for (int number : nums)
        {
            if(lookedAt.contains(number)){
                return true;
            }

            lookedAt.add(number);
        }
        return false;
    }

    @Test
    public void Test1()
    {
        // Arrange
        var intArray = new int[] { 1, 2, 3, 1 };

        // Act
        var result = Algorithm(intArray);

        // Assert
        assertEquals(true, result);
    }

    @Test
    public void Test2()
    {
        // Arrange
        var intArray = new int[] { 1, 2, 3, 4 };

        // Act
        var result = Algorithm(intArray);

        // Assert
        assertEquals(false, result);
    }

    @Test
    public void Test3()
    {
        // Arrange
        var intArray = new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        // Act
        var result = Algorithm(intArray);

        // Assert
        assertEquals(true, result);
    }
}
