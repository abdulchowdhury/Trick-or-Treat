/** Simple application that includes variables and contructors involving trick or treating.
 * Date: Oct 07-2021
 * @author abdulchowdhury
 * @version 1.5
 */
public class TrickOrTreater {
    protected String name;
    protected String neighborhood;
    protected int numCandy;
    protected static int totalCandy;

    /** Returns name of TrickOrTreater.
     * @return name of TrickOrTreater
     */
    public String getName() {
        return name;
    }

    /** Sets name of TrickOrTreater.
     * @param name String passed in to get name of TrickOrTreater
     */
    public void setName(String name) {
        this.name = name;
    }

    /** Returns neighborhood of TrickOrTreater.
     * @return neighborhood of TrickOrTreater
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /** Sets neighborhood of TrickOrTreater.
     * @param neighborhood String passed in for name of neighborhood
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /** Gets the number of candy.
     * @return number of candy
     */
    public int getNumCandy() {
        return numCandy;
    }

    /** Set the number of candy as integer for TrickOrTreater.
     * @param numCandy number of candy as integer for TrickOrTreater
     */
    public void setNumCandy(int numCandy) {
        this.numCandy = numCandy;
    }

    /** Get the total number of candy from TrickOrTreater.
     * @return total number of candy from TrickOrTreater as integer
     */
    public static int getTotalCandy() {
        return totalCandy;
    }

    /** Set the total number of candies all together.
     * @param totalCandy is passed in to set total number of candies all together
     */
    public static void setTotalCandy(int totalCandy) {
        TrickOrTreater.totalCandy = totalCandy;
    }

    /** Sets String name to "Agnes", String neighborhood to "Holloweentown" and number of candy to 0.
     *  constructor sets String name to "Agnes", String neighborhood to "Holloweentown" and number of candy to 0
     */
    public TrickOrTreater() {
        this("Agnes", "Halloweentown", 0);
    }

    /** Takes in int luck and is multiplied by 3 to determine number of candy and total number of candy.
     * @param luck is multiplied by 3 to determine number of candy and total number of candy
     */
    public void seekCandy(int luck) {
        this.numCandy += 3 * luck;
        totalCandy += 3 * luck;
    }

    /** Constructor that takes in variables and sets it within constructor for TrickOrTreater.
     * @param name of the TrickOrTreater
     * @param neighborhood in where the TrickOrTreater is
     * @param numCandy number of candy TrickOrTreater has
     */
    public TrickOrTreater(String name, String neighborhood, int numCandy) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.numCandy = numCandy;
    }
}