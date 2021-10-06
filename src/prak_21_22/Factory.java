package prak_21_22;

public class Factory implements ComplexNumbersFactory {
    public Factory(){}
    public Real createRealNumber()
    {
        Real real = new Real();
        real.create();
        return real;
    }

    public Complex createComplexNumber()
    {
        Complex complex = new Complex();
        complex.create();
        return complex;
    }
}
