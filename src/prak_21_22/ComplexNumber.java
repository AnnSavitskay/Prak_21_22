package prak_21_22;

public class ComplexNumber {
    public Number real;
    public Number complex;

    public ComplexNumber(ComplexNumbersFactory factory)
    {
        real = factory.createRealNumber();
        complex = factory.createComplexNumber();
    }

    public String toString()
    {
        return real.get_number() + " " + "+" + " " + complex.get_number();
    }
}
