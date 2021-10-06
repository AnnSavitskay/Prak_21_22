package prak_21_22;

public class Real implements Number{
    public int x;
    public Real(){}

    @Override
    public void create()
    {
        x = (int)(Math.random()*100 - 50);
    }

    @Override
    public String get_number()
    {
        if(x != 0) {
            return Integer.toString(x);
        }

        else {
            return " ";
        }
    }

    public void setReal(int x)
    {
        this.x = x;
    }
}
