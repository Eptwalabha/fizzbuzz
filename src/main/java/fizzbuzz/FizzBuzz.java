package fizzbuzz;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Eptwalabha
 * Date: 28/05/2014
 */
public class FizzBuzz {

    private Map<Integer, String> rules;

    public FizzBuzz() {
        rules = new HashMap<Integer, String>();
        addRule(3, "fizz");
        addRule(5, "buzz");
    }

    public String process(int number) {

        String result = "";

        for (int multiple : rules.keySet())
            result += (number % multiple == 0) ? rules.get(multiple) : "";

        return (result.length() > 0) ? result : String.valueOf(number);
    }

    public void addRule(int multiple, String output) {
        rules.put(multiple, output);
    }

    public Map<Integer, String> getRules() {
        return rules;
    }
}
