package Assignment_5428362.AS2_Q1;

public class BugTester {
    public static void main(String[] args)
    {
        Bug beetle1 = new Bug(10);
        beetle1.move(); /** bug position = 11 */
        beetle1.turn(); /** bug position = 11 */
        beetle1.move(); /** bug position = 10 */
        beetle1.move(); /** bug position = 9 */
        beetle1.turn(); /** bug position = 9 */
        beetle1.move(); /** bug position = 10 */
        beetle1.move(); /** bug position = 11 */
        beetle1.move(); /** bug position = 12 */
        System.out.println(beetle1.getPosition());
        System.out.println("Expected: 12");
    }

}
