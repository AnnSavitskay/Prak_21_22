package prak_21_22_part2;

public class MultifunctionalChair implements Chairs{
    protected String type_of_chair;
    public MultifunctionalChair(){}

    @Override
    public void create()
    {
        type_of_chair = "MultifunctionalChair";
    }

    @Override
    public String type_of_chair()
    {
        return type_of_chair;
    }
}
