/** Simple application that includes variables and contructors involving trick or treating.
 * Date: Oct 07-2021
 * @author abdulchowdhury
 * @version 1.5
 */
public class Witch extends TrickOrTreater {
    private String signatureSpell;
    private BlackCat companion;

    /** Constructor that takes in name, neighborhood, numCandy, signatureSpell and a companion of BlackCat.
     * @param name of Witch
     * @param neighborhood in where Witch is
     * @param numCandy the Witch has
     * @param signatureSpell unique spell of Witch
     * @param companion cat that is under watch of Witch
     */

    public Witch(String name, String neighborhood, int numCandy, String signatureSpell, BlackCat companion) {
        super(name, neighborhood, numCandy);
        this.signatureSpell = signatureSpell;
        this.companion = companion;
    }

    /** Constructor that takes in name, signatureSpell and a companion of BlackCat.
     * @param name of Witch
     * @param signatureSpell unique spell of Witch
     * @param companion of Witch from BlackCat
     */
    public Witch(String name, String signatureSpell, BlackCat companion) {
        this(name, "Godric's Hollow", 13, signatureSpell, companion);
    }

    /** Sets a new Witch that of which is same as original Witch.
     * @param other is taken in and given set variables of...
     *...name, neighborhood, numCandy, signatureSpell and a new BlackCat
     */
    public Witch(Witch other) {
        this(other.name, other.neighborhood, other.numCandy, other.signatureSpell, new BlackCat(other.companion.getName(), other.companion.getFamiliar()));
    }

    /** Method that prints out a spell that is casted and doubles numCandy.
     * prints out a spell that is casted and doubles numCandy
     */
    public void castSpell() {
        System.out.println(name + " casts " + signatureSpell + "!");
        totalCandy += numCandy;
        numCandy *= 2;
    }
}