import org.junit.Test;

import java.util.HashMap;
import java.util.Stack;

import static junit.framework.TestCase.assertEquals;

public class AlgorithmTests
{
    private HashMap<Character, Character> mappings = new HashMap<>()
    {{
     put(')', '(');
     put('}', '{');
     put(']', '[');
    }};

    private boolean Algorithm(String symbols)
    {
        if(symbols == "")  {
            return true;
        }

        if(symbols.length() % 2 != 0)  {
            return false;
        }

        var symbolsArray = symbols.toCharArray();
        var stack = new Stack<Character>();

        for(int i = 0; i < symbolsArray.length; i++)
        {
            var character = symbolsArray[i];

            if(mappings.containsKey(character))
            {
                var topElement = stack.size() == 0 ? '#' : stack.pop();

                if(topElement != mappings.get(character)){
                    return false;
                }
            }
            else {
                stack.push(character);
            }
        }

        return stack.size() == 0;
    }

    @Test
    public void Test1()
    {
        // Arrange
        var testString = "()";

        // Act
        var result = Algorithm(testString);

        // Assert
        assertEquals(true, result);
    }

    @Test
    public void Test2()
    {
        // Arrange
        var testString = "()[]{}";

        // Act
        var result = Algorithm(testString);

        // Assert
        assertEquals(true, result);
    }

    @Test
    public void Test3()
    {
        // Arrange
        var testString = "(]";

        // Act
        var result = Algorithm(testString);

        // Assert
        assertEquals(false, result);
    }
}
