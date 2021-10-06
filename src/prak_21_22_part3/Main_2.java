package prak_21_22_part3;

public class Main_2 {
    public static void main(String[] args)
    {
        String str;
        Redactor redactor = new Redactor();
        ICreateDocument iCreateDocument = new CreateTextDocument();
        str = redactor.start(iCreateDocument);
        System.out.println(str);
    }
}
