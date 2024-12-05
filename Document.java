
public abstract class Document {
    public String extension;
    public String encryption;

    public abstract void SetExtension();

    public abstract void SetEncryption(String input);

    public abstract Document BuilDocument();

    @Override
    public String toString() {
        return "Document{" + "extension=" + extension + ", encryption=" + encryption + '}';
    }
}