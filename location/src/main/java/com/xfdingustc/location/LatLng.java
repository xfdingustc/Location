package com.xfdingustc.location;

/**
 * Created by Xiaofei on 2015/5/19.
 */
public final class LatLng {
  public final double latitude;
  public final double longitude;

  public LatLng(double latitude, double longitude) {
    int lat = (int) (latitude * 1000000.0D);
    int lng = (int) (longitude * 1000000.0D);
    this.latitude = (double) lat / 1000000.0D;
    this.longitude = (double) lng / 1000000.0D;
  }

  public String toString() {
    String str = "latitude: " + this.latitude + ", longitude: " + this.longitude;
    return str;
  }
}
