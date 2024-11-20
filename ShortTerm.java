public class ShortTerm implements ContractBuilder {
    private String ContractID;
    private String RentAmountID;
    private String TenantID;
    private String PropertyID;

    public ShortTerm(String contractID, String rentAmountID, String tenantID, String propertyID) {
        ContractID = contractID;
        RentAmountID = rentAmountID;
        TenantID = tenantID;
        PropertyID = propertyID;
    }

    @Override
    public void BuildContractID(String ContractID) {
        this.ContractID = ContractID;
    }

    @Override
    public void BuildPropertyID(String PropertyID) {
        this.PropertyID = PropertyID;
    }

    @Override
    public void BuildTenantID(String TenantID) {
        this.TenantID = TenantID;
    }

    @Override
    public void BuildRentAmountID(String RentAmountID) {
        this.RentAmountID = RentAmountID;
    }

    @Override
    public Contract SignContract() {
        return new Contract(ContractID, RentAmountID, TenantID, PropertyID);
    }

}
