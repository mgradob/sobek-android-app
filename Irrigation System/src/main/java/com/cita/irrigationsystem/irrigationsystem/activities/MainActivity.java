package com.cita.irrigationsystem.irrigationsystem.activities;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.cita.irrigationsystem.irrigationsystem.JsonSpiceService;
import com.cita.irrigationsystem.irrigationsystem.R;
import com.cita.irrigationsystem.irrigationsystem.StartFragment;
import com.cita.irrigationsystem.irrigationsystem.WeatherInformationFragment;
import com.cita.irrigationsystem.irrigationsystem.lists.CropList;
import com.octo.android.robospice.SpiceManager;
import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;


public class MainActivity extends Activity implements
        StartFragment.OnFragmentInteractionListener, WeatherInformationFragment.OnFragmentInteractionListener {

    protected SpiceManager spiceManager = new SpiceManager(JsonSpiceService.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spiceManager.start(this);
    }

    @Override
    protected void onPause() {
        spiceManager.shouldStop();
        super.onPause();
    }

    @Override
    protected void onStop() {
        spiceManager.shouldStop();
        super.onStop();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStartFragmentInteraction(Uri uri) {

    }

    @Override
    public void onFragmentInteraction(String id) {

    }

    private void performRequest(String areas){
        MainActivity.this.setProgressBarIndeterminateVisibility(true);


    }

    /**
     * Inner class for updating ui with data received from the API.
     */
    public class CropListRequestListener implements RequestListener<CropList> {
        @Override
        public void onRequestFailure(SpiceException e) {
            Toast.makeText(MainActivity.this, "Failed to fetch crops", Toast.LENGTH_LONG).show();
        }

        @Override
        public void onRequestSuccess(CropList cropInformations) {
            Toast.makeText(MainActivity.this, "Succeded to fetch crops", Toast.LENGTH_LONG).show();
        }
    }
}
