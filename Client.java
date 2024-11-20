import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contractID = sc.next();
        String rentAmount = sc.next();
        String tenantID = sc.next();
        String propertyID = sc.next();

        ContractBuilder per = new Permanent(contractID, rentAmount, tenantID, propertyID);
        ContractBuilder shotekdhk = new LongTerm(contractID, rentAmount, tenantID, propertyID);
        ContractBuilder sdfadsfasdf = new LongTerm(contractID, rentAmount, tenantID, propertyID);
    }
}
