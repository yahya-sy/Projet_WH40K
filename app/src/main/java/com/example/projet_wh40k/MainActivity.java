package com.example.projet_wh40k;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity {

    private Button bt_map;

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_map=(Button) findViewById(R.id.map_button);


    }

    public void go(View r){
        switch (r.getId()){
            case R.id.map_button:
                Intent relance = new Intent(MainActivity.this, MapActivity.class);
                startActivity(relance);
                //Toast.makeText(MainActivity.this, "Page rechargée", Toast.LENGTH_LONG).show();

        }
    }



}