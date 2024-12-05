public class NormalDoc extends Document {
    @Override
    public void SetExtension() {
        this.extension = ".txt";
    }

    @Override
    public void SetEncryption(String exString) {
        this.encryption = exString;
    }

    @Override
    public Document BuilDocument() {
        return this;
    }
}
