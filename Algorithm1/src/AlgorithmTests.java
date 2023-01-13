import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class AlgorithmTests
{
    private Integer Algorithm(int[] nums)
    {
        if(nums.length == 1){
            return nums[0];
        }

        var runningCount = new HashMap<Integer, Integer>();

        for(int number : nums)
        {
            var count = runningCount.get(number);

            if(count == null) {
                runningCount.put(number, 1);
            }
            else {
                runningCount.put(number, ++count);
            }
        }

        for(Map.Entry<Integer, Integer> entry : runningCount.entrySet())
        {
            int key = entry.getKey();
            int value = entry.getValue();

            if(value == 1) {
                return key;
            }
        }

        return 0;
    }

    // region Tests
    @Test
    public void Test1()
    {
        // Arrange
        var numberArray = new int[] { 2, 2, 1 };

        // Act
        int result = Algorithm(numberArray);

        // Assert
        assertEquals(1, result);
    }

    @Test
    public void Test2()
    {
        // Arrange
        var numberArray = new int[] { 4, 1, 2, 1, 2 };

        // Act
        int result = Algorithm(numberArray);

        // Assert
        assertEquals(4, result);
    }
    // endregion
}
