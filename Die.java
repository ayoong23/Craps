
/**
 * The die class to generate a random number (1-6) (integer)
 *
 * @author Andy Yoong
 * @version 1/18/22
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int dieRoll;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        dieRoll = 0;
    }

    /**
     * The roll method rolls the six-sided die
     *
     * @return    the value of the die roll (1-6) (integer)
     */
    public int roll()
    {
        dieRoll = (int) (Math.random() * 6 + 1);
        return dieRoll;
    }
}
