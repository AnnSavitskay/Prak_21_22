package prak_21_22;

public class Complex implements Number{
    public int x;
    public Complex(){}

    @Override
    public void create()
    {
        x = (int)(Math.random()*100 - 50);
    }

    @Override
    public String get_number()
    {
        if(x != 0) {
            return Integer.toString(x) + "i";
        }
        else {
            return " ";
        }
    }

    public void setComplex(int x)
    {
        this.x = x;
    }
}
