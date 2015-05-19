package com.xfdingustc.locationdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.xfdingustc.location.Address;
import com.xfdingustc.location.LatLng;

import java.awt.font.TextAttribute;


public class MainActivity extends ActionBarActivity {
  private LatLng mLatLng;
  private TextView mLocation;
  private TextView mAddress;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mLatLng = new LatLng(255.200, 322.200);
    mLocation = (TextView)findViewById(R.id.tv_lat_lng);
    mLocation.setText(mLatLng.toString());
    mAddress = (TextView)findViewById(R.id.tv_address);
    Address address =  new Address.AddressBuilder()
        .withProvince("Shanghai")
        .withCity("Shanghai")
        .withDistrict("Pudong")
        .withStreet("Zhangheng Road")
        .withStreetNumber("1000").build();

    mAddress.setText(address.toString());

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}
