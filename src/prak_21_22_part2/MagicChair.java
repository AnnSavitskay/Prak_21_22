package prak_21_22_part2;

public class MagicChair implements Chairs{
    protected String type_of_chair;
    public MagicChair(){}
    @Override
    public void create()
    {
        type_of_chair = "MagicChair";
    }

    @Override
    public String type_of_chair()
    {
        return type_of_chair;
    }
}
