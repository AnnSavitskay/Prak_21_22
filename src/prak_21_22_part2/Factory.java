package prak_21_22_part2;

public class Factory implements ChairsFactory{
    public MagicChair createMagicChair()
    {
        MagicChair magicChair = new MagicChair();
        magicChair.create();
        return magicChair;
    }
    public MultifunctionalChair createMultifunctionalChair()
    {
        MultifunctionalChair multifunctionalChair = new MultifunctionalChair();
        multifunctionalChair.create();
        return multifunctionalChair;
    }
    public VictorianChair createVictorianChair()
    {
        VictorianChair victorianChair = new VictorianChair();
        victorianChair.create();
        return victorianChair;
    }
}
