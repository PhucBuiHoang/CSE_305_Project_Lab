public interface Contract {
    int BuildContractID();

    int BuildPropertyID();

    int BuildTenantID();

    int BuildRentAmountID();

    Contract SignContract();
}
