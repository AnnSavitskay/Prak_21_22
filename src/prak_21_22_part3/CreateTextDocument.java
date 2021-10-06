package prak_21_22_part3;

public class CreateTextDocument implements ICreateDocument{
    public IDocument CreateNew()
    {
        TextDocument textDocument = new TextDocument();
        textDocument.FileNew();
        return textDocument;
    }

    public IDocument CreateOpen()
    {
        TextDocument textDocument = new TextDocument();
        textDocument.FileOpen();
        return textDocument;
    }
}
