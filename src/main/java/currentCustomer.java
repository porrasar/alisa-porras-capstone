package src.main.java;

public class currentCustomer extends Customer
{
    //---------------------------------------------VARIABLE-------------------------------------------

    private boolean waterPd;
    private boolean electricPd;
    private boolean grassCut;
    private boolean rentPd;

    //---------------------------------------------CONSTRUCTORS-------------------------------------------

    public currentCustomer()
    {
    }

    public currentCustomer(boolean waterPd, boolean electricPd, boolean grassCut, boolean rentPd) {
        this.waterPd = waterPd;
        this.electricPd = electricPd;
        this.grassCut = grassCut;
        this.rentPd = rentPd;
    }

    public currentCustomer(int customerId, String customerName, String customerAddress, String customerPhone,
                           boolean waterPd, boolean electricPd,
                           boolean grassCut, boolean rentPd)
    {
        super(customerId, customerName, customerAddress, customerPhone);
        this.waterPd = waterPd;
        this.electricPd = electricPd;
        this.grassCut = grassCut;
        this.rentPd = rentPd;
    }

    //---------------------------------------------BUSINESS LOGIC/METHODS---------------------------------
    @Override
    public String getCustomerInfo()
    {
        String customerInfo = ("Customer in CURRENT customer phone : " + " " + getCustomerId()
                + " " + getCustomerName() + " " + getCustomerAddress()
                + " " + getCustomerName() + " " + customerPhone
                + " " + waterPd + " " + electricPd  + " " + grassCut + " " + rentPd);

        return customerInfo;
    }

    //---------------------------------------------GETTER/SETTER-------------------------------------------
    public boolean isWaterPd() {
        return waterPd;
    }

    public void setWaterPd(boolean waterPd) {
        this.waterPd = waterPd;
    }

    public boolean isElectricPd() {
        return electricPd;
    }

    public void setElectricpd(boolean electricPd) {
        this.electricPd = electricPd;
    }

    public boolean isGrassCut() {
        return grassCut;
    }

    public void setGrassCut(boolean grassCut) {
        this.grassCut = grassCut;
    }

    public boolean isRentPd() {
        return rentPd;
    }

    public void setRentPd(boolean rentPd) {
        this.rentPd = rentPd;
    }



}
