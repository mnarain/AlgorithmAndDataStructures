package sr.unasat.ad.recursion.exercise;

import java.util.Objects;

public class MobilePhone {
    private String brand;
    private String modelNumber;
    public MobilePhone(String brand, String modelnumber) {
        this.brand = brand;
        this.modelNumber = modelnumber;
    }
    public String getBrand() {
        return brand;
    }
    public String getModelNumber() {
        return modelNumber;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "brand='" + brand + '\'' +
                ", modelnumber='" + modelNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePhone)) return false;
        MobilePhone that = (MobilePhone) o;
        return getBrand().equals(that.getBrand()) &&
                getModelNumber().equals(that.getModelNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModelNumber());
    }
}