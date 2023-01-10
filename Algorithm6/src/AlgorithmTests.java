import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class AlgorithmTests
{
    private String[] Algorithm(int n)
    {
        var results = new String[n];

        for(int i = 1; i <= n; i++)
        {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i - 1] = "FizzBuzz";
            }
            else if (i % 3 == 0) {
                results[i - 1] = "Fizz";
            }
            else if (i %  5 == 0) {
                results[i - 1] = "Buzz";
            }
            else {
                results[i - 1] = Integer.toString(i);
            }
        }

        return results;
    }

    @Test
    public void Test1()
    {
        // Arrange
        var testInt = 3;
        var expectedResult = new String[] { "1", "2", "Fizz" };

        // Act
        var result = Algorithm(testInt);

        // Assert
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void Test2()
    {
        // Arrange
        var testInt = 5;
        var expectedResult = new String[] { "1", "2", "Fizz", "4", "Buzz" };

        // Act
        var result = Algorithm(testInt);

        // Assert
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void Test3()
    {
        // Arrange
        var testInt = 15;
        var expectedResult = new String[] { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz" };

        // Act
        var result = Algorithm(testInt);

        // Assert
        assertArrayEquals(expectedResult, result);
    }
}
