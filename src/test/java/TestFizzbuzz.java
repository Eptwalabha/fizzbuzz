import fizzbuzz.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.fest.assertions.Assertions.assertThat;

/**
 * User: Eptwalabha
 * Date: 28/05/2014
 */
public class TestFizzbuzz {

    private FizzBuzz fizzbuzz;

    @Before
    public void setUp() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    public void unDoitRetournerUn() {
        assertThat(fizzbuzz.process(1)).isEqualTo("1");
    }

    @Test
    public void unMultipleDeTroisDoitRetournerFizz() {
        assertThat(fizzbuzz.process(6)).isEqualTo("fizz");
    }

    @Test
    public void unMultipleDeCinqDoitRetournerBuzz() {
        assertThat(fizzbuzz.process(10)).isEqualTo("buzz");
    }

    @Test
    public void unMultipleDeTroisEtCinqDoitRetournerFizzBuzz() {
        assertThat(fizzbuzz.process(15)).isEqualTo("fizzbuzz");
    }

    @Test
    public void peutAjouterUneRègleAuFizzBuzz() {
        fizzbuzz.addRule(8, "toto");
        Map<Integer, String> rules = fizzbuzz.getRules();
        assertThat(rules.size()).isEqualTo(3);
        assertThat(rules.get(8)).isEqualTo("toto");
    }

    @Test
    public void unMultipleDeHuitDoitRetournerToto() {
        fizzbuzz.addRule(8, "toto");
        assertThat(fizzbuzz.process(16)).isEqualTo("toto");
    }
}
