package anouar.oulhaj.buttomappbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottom_nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottom_nav = findViewById(R.id.bottom_nav_bar);
        bottom_nav.setBackground(null);

        bottom_nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if(item.getItemId() == R.id.mi_home){
                    Toast.makeText(MainActivity.this, "home", Toast.LENGTH_SHORT).show();
                }
                if(item.getItemId() == R.id.mi_settings){
                    Toast.makeText(MainActivity.this, "settings", Toast.LENGTH_SHORT).show();
                }
                if(item.getItemId() == R.id.mi_help){
                    Toast.makeText(MainActivity.this, "help", Toast.LENGTH_SHORT).show();
                }
                if(item.getItemId() == R.id.mi_profile){
                    Toast.makeText(MainActivity.this, "profile", Toast.LENGTH_SHORT).show();
                }


                return true;
            }
        });
    }
}