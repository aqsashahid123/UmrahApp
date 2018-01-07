package danish.fyp.com.umrahapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;

public class UmrahMain extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umrah_main);

        toolbar = (Toolbar) findViewById(R.id.appBar);
        toolbar.inflateMenu(R.menu.toolbar_men);
        toolbar.setTitle("How to Perform Umrah");
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()){

                    case (R.id.toolbar_men):
                        drawerLayout.openDrawer(Gravity.END);
                        break;


                }

                return true;
            }
        });



        navigationView = (NavigationView) findViewById(R.id.nav_view);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {

                    case R.id.howTo:
                        drawerLayout.closeDrawer(Gravity.END);


                        break;
                    case R.id.placesToVisit:
                        drawerLayout.closeDrawer(Gravity.END);
                        // Toast.makeText(getApplicationContext(),"Add Sale", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), PlacesToVisit.class);
                        startActivity(intent);
                        break;

                    case R.id.gallery:
                        drawerLayout.closeDrawer(Gravity.END);
                        // Toast.makeText(getApplicationContext(),"Add Sale", Toast.LENGTH_SHORT).show();
                        Intent graphIntent = new Intent(getApplicationContext(), Gallery.class);
                        startActivity(graphIntent);

                        break;


                }
                return true;
            }
        });


    }
}
