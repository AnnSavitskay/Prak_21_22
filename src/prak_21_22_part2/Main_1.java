package prak_21_22_part2;

public class Main_1 {
    public static void main(String[] args)
    {
        ChairsFactory chairsFactory = new Factory();
        Client client = new Client();
        System.out.println(client.Sit(chairsFactory.createMagicChair()));
        System.out.println(client.Sit(chairsFactory.createMultifunctionalChair()));
        System.out.println(client.Sit(chairsFactory.createVictorianChair()));
    }
}
