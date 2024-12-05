
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKey;

public class ConfidentialDoc extends Document {
    @Override
    public void SetExtension() {

        this.extension = ".zip";
    }

    @Override
    public void SetEncryption(String s) {
        RentalManagement rental = new RentalManagement();

        String encry = null;

        SecretKey key = null;
        try {
            key = rental.generateKey();
        } catch (Exception ex) {
            Logger.getLogger(ConfidentialDoc.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            encry = rental.encrypt(s, key);
        } catch (Exception ex) {
            Logger.getLogger(ConfidentialDoc.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.encryption = encry;
    }

    @Override
    public Document BuilDocument() {
        return this;
    }
}
