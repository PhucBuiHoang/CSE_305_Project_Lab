public class Contract {
    private String ContractID;
    private String RentAmountID;
    private String TenantID;
    private String PropertyID;

    public Contract(String contractID, String rentAmountID, String tenantID, String propertyID) {
        ContractID = contractID;
        RentAmountID = rentAmountID;
        TenantID = tenantID;
        PropertyID = propertyID;
    }

}
