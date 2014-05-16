package com.cita.irrigationsystem.irrigationsystem.activities;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.cita.irrigationsystem.irrigationsystem.R;
import com.cita.irrigationsystem.irrigationsystem.fragments.AreasFragment;
import com.cita.irrigationsystem.irrigationsystem.fragments.StartFragment;
import com.cita.irrigationsystem.irrigationsystem.fragments.WeatherInformationFragment;


public class MainActivity extends Activity implements
        StartFragment.OnFragmentInteractionListener, WeatherInformationFragment.OnFragmentInteractionListener,
        AreasFragment.OnFragmentInteractionListener {

    private String[] menu = {"Campos", "Válvulas", "Áreas", "Sensores"};
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;

    FragmentManager mainFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.drawer_list);

        mDrawerList.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_text_view, R.id.drawer_tv, menu));
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
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
        //TODO: SWITCH FOR MENU ITEMS PRESSED
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStartFragmentInteraction(Uri uri) {

    }

    @Override
    public void onFragmentInteraction(String id) {

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Log.i("Button pressed:", "" + i);

            switch (i){
                case 0:
                    AreasFragment areasFragment = new AreasFragment();
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.main_container, areasFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    break;
                default: break;
            }
        }
    }
}
