/** Simple application that includes variables and contructors involving trick or treating.
 * Date: Oct 07-2021
 * @author abdulchowdhury
 * @version 1.5
 */
public class HappyHalloween {

    /** Method that contains and will run TrickOrTreat, Witch, Ghost, and BlackCat.
     * @param args creates 2 new Witches, Ghost, and BlackCats and calls seekCandy...
     *...to each new variable and calculates totalCandy of all TrickOrTreater
     */
    public static void main(String[] args) {
        Witch newWitch1 = new Witch("Medusa", "Rum Rd", 17, "Stone", new BlackCat("Chewy", true));
        Witch newWitch2 = new Witch("Sarena", "Trick Rd", 28, "Vanishhhh", new BlackCat("Stwey", false));
        Ghost newGhost1 = new Ghost("Kaspar", "Rum Rd", 35, 5);
        Ghost newGhost2 = new Ghost("Joshua", "Spooky Rd", 7, 11);
        BlackCat newBlackCat1 = new BlackCat("Chewy", true);
        BlackCat newBlackCat2 = new BlackCat("Stewy", false);
        newWitch1.seekCandy(5);
        newWitch2.seekCandy(3);
        newGhost1.seekCandy(8);
        newGhost2.seekCandy(10);
        System.out.println(TrickOrTreater.getTotalCandy());
    }
}