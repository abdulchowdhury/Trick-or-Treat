/** Simple application that includes variables and contructors involving trick or treating.
 * Date: Oct 07-2021
 * @author abdulchowdhury
 * @version 1.5
 */
public class Ghost extends TrickOrTreater {
    private int transparency;

    /**Returns the transparency of Ghost.
     * @return the transparency of Ghost
     */
    public int getTransparency() {
        return transparency;
    }

    /** Sets the transparency of Ghost.
     * @param transparency is passed in as integer then set to equal transparency
     */
    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }

    /** Constructor that takes in name, neighborhood, numCandy, and transparency and sets them within constructor.
     * @param name of Ghost within TrickOrTreater
     * @param neighborhood in where Ghost is within TrickOrTreater
     * @param numCandy of Ghost within TrickOrTreater
     * @param transparency of Ghost
     */
    public Ghost(String name, String neighborhood, int numCandy, int transparency) {
        super(name, neighborhood, numCandy);
        this.transparency = transparency;
    }

    /** Sets the transparency of Ghost.
     * @param transparency is taken in as int and is set to transparency
     */
    public Ghost(int transparency) {
        this.transparency = transparency;
    }

    /** Sets a new Ghost that of which is same as original Ghost.
     * @param other is taken in and given set variables of name, neighborhood, numCandy and transparency
     */
    public Ghost(Ghost other) {
        this(other.name, other.neighborhood, other.numCandy, other.transparency);
    }

    /** Method that prints a certain statement if value of transparency is between certain numbers.
     * @param prints a certain statement if value of transparency is between certain numbers
     */
    public void spook() {
        if (transparency >= 10) {
            System.out.println("Very spooky");
        } else if (transparency >= 3) {
            System.out.println("Boo!");
        } else {
            System.out.println("Not very spooky");
        }
    }
}