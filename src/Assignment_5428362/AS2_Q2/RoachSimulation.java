package Assignment_5428362.AS2_Q2;

public class RoachSimulation {
    public static void main(String[] args)
    {
        RoachPopulation roach = new RoachPopulation(10);
        roach.breed(); /** roach = 20 */
        roach.breed(); /** roach = 40 */
        roach.breed(); /** roach = 80 */
        roach.spray(10); /** roach = 80 - 8 =72 */
        System.out.println(roach.getPopulation());
        System.out.println("Expected : 72");
    }
}
