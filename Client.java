import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contractID = sc.nextInt();
        int rentAmount = sc.nextInt();
        int tenantID = sc.nextInt();
        int propertyID = sc.nextInt();

        Contract permanent = new Permanent(contractID, rentAmount, tenantID,
                propertyID);
        Contract longterm = new LongTerm(contractID, rentAmount, tenantID, propertyID);
        Contract shortTerm = new ShortTerm(contractID, rentAmount, tenantID,
                propertyID);

        permanent.SignContract();
        System.out.println(permanent.toString());
        longterm.SignContract();
        System.out.println(longterm.toString());
        shortTerm.SignContract();
        System.out.println(shortTerm.toString());

        // Document
        String encryption = sc.nextLine();
        String extension = sc.nextLine();

        switch (extension) {
            case ".txt" -> {
                Document nor = new NormalDoc();
                nor.SetEncryption(encryption);
                nor.SetExtension();
                Document dc = nor.BuilDocument();
                System.out.println(dc);
            }

            case ".zip" -> {
                Document confi = new ConfidentialDoc();
                confi.SetEncryption(encryption);
                confi.SetExtension();
                Document dc = confi.BuilDocument();
                System.out.println(dc);
            }
            default -> throw new AssertionError();
        }
    }
}
