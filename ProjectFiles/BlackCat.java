/** Simple application that includes variables and contructors involving trick or treating.
 * Date: Oct 07-2021
 * @author abdulchowdhury
 * @version 1.5
 */
public class BlackCat extends TrickOrTreater {
    private String name;
    private boolean familiar;

    /** Returns boolean familiar of BlackCat.
     * @return familiar of BlackCat
     */
    public boolean getFamiliar() {
        return familiar;
    }

    /** Sets boolean familiar of BlackCat.
     * @param familiar boolean passed in to get value of familiar
     */
    public void setFamiliar(boolean familiar) {
        this.familiar = familiar;
    }

    /** Method that initialized the value of name and familiar in this class to name and familiar.
     * @param name String passed in to get name of BlackCat
     * @param familiar boolean passed in to get familiar of BlackCat
     */
    public BlackCat(String name, boolean familiar) {
        this.name = name;
        this.familiar = familiar;
    }

    /** Method that will do a certain action depending on value of familiar boolean.
     * constructor prints a certain statement depending on value of familiar boolean
     */
    public void meow() {
        if (familiar) {
            System.out.println(name + "is a familiar");
        } else {
            System.out.println(name + "is not a familiar");
        }
    }
}