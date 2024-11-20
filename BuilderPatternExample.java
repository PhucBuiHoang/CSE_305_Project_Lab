import java.util.Scanner;

public class BuilderPatternExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Client client = new Client();

        // int ContractID = sc.nextInt();
        // int RentAmountID = sc.nextInt();
        // int TenantID = sc.nextInt();
        // int PropertyID = sc.nextInt();

        ContractBuilder permanentContract = new Permanent();
        client.requestCreateRentalContract(permanentContract);
        ContractBuilder longTermContract = new LongTerm();
        client.requestCreateRentalContract(longTermContract);
        ContractBuilder shortTermContract = new ShortTerm();
        client.requestCreateRentalContract(shortTermContract);
    }
}
