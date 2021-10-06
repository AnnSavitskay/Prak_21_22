package prak_21_22_part2;

public class Client {

    public Client(){}
    public String Sit(Chairs chair)
    {
        String str = " ";
        if(chair.type_of_chair() == "MagicChair")
        {
            str = "Client sat down on Magic chair";
        }
        if(chair.type_of_chair() == "VictorianChair")
        {
            str = "Client sat down on Victorian chair";
        }
        if(chair.type_of_chair() == "MultifunctionalChair")
        {
            str = "Client sat down on Multifunctional chair";
        }
        return str;
    }
}
