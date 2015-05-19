package com.xfdingustc.location;

/**
 * Created by Xiaofei on 2015/5/19.
 */
public final class Address {
  private String mStreetNumber;
  private String mStreet;
  private String mDistrict;
  private String mCity;
  private String mProvince;

  public String toString() {
    return "Province: " + this.mProvince
        + " city: " + this.mCity
        + " district: " + this.mDistrict
        + " street: " + this.mStreet
        + " street number: " + this.mStreetNumber;
  }

  public static class AddressBuilder {
    private Address mAddress;
    public AddressBuilder() {
      mAddress = new Address();
    }

    public Address build() {
      return mAddress;
    }

    public AddressBuilder withProvince(String province) {
      mAddress.mProvince = province;
      return this;
    }

    public AddressBuilder withCity(String city) {
      mAddress.mCity = city;
      return this;
    }

    public AddressBuilder withDistrict(String district) {
      mAddress.mDistrict = district;
      return this;
    }

    public AddressBuilder withStreet(String street) {
      mAddress.mStreet = street;
      return this;
    }

    public AddressBuilder withStreetNumber(String streetNumber) {
      mAddress.mStreetNumber = streetNumber;
      return this;
    }

  }

}
