package sr.unasat.ad.search;

class MobilePhone{
    private String brand;
    private String modelnumber;

    public MobilePhone(String brand, String modelnumber) {
        this.brand = brand;
        this.modelnumber = modelnumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelnumber() {
        return modelnumber;
    }

    public void setModelnumber(String modelnumber) {
        this.modelnumber = modelnumber;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "brand='" + brand + '\'' +
                ", modelnumber='" + modelnumber + '\'' +
                '}';
    }
}