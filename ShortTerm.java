public class ShortTerm implements Contract {
    private int ContractID;
    private int RentAmountID;
    private int TenantID;
    private int PropertyID;

    public ShortTerm(int contractID, int rentAmountID, int tenantID, int propertyID) {
        this.ContractID = contractID;
        this.RentAmountID = rentAmountID;
        this.TenantID = tenantID;
        this.PropertyID = propertyID;
    }

    @Override
    public int BuildContractID() {
        return ContractID;
    }

    @Override
    public int BuildPropertyID() {
        return PropertyID;
    }

    @Override
    public int BuildTenantID() {
        return TenantID;
    }

    @Override
    public int BuildRentAmountID() {
        return RentAmountID;
    }

    @Override
    public Contract SignContract() {
        Contract shortTerm = new ShortTerm(this.ContractID, this.RentAmountID, this.TenantID, this.PropertyID);
        return shortTerm;
    }

    @Override
    public String toString() {
        return "ShortTerm [ContractID=" + ContractID + ", RentAmountID=" + RentAmountID + ", TenantID=" + TenantID
                + ", PropertyID=" + PropertyID + "]";
    }

}
