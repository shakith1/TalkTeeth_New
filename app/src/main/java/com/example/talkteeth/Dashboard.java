package com.example.talkteeth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.navigation.NavigationView;

public class Dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    //Drawer Menu

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView menuIcon;
    LinearLayout contentView;

    public SectionStatePagerAdapter sectionStatePagerAdapter;
    SectionStatePagerAdapter adapter;
    ViewPager viewPager;

    int fragmentNubmer;

    static final float END_SCALE = 0.7f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
        menuIcon = findViewById(R.id.menu_image);
        contentView = findViewById(R.id.content);

        sectionStatePagerAdapter = new SectionStatePagerAdapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.container);

        navigationDrawer();

        setUpViewPager(viewPager);

    }

    // Set the fragments to the container fragment
    private void setUpViewPager(ViewPager viewPager){
        SectionStatePagerAdapter adapter = new SectionStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Home(),"Home");
        adapter.addFragment(new add_doctor(),"Add Doctor");
        adapter.addFragment(new doctorList(),"Doctor List");
        adapter.addFragment(new edit_doctor(),"Edit Doctor");
        adapter.addFragment(new clinic_info(),"Clinic Info");
        adapter.addFragment(new pickers_data(),"Pickers Data");
        viewPager.setAdapter(adapter);
    }

    public void setViewPager(int fragmentNumber){
        this.fragmentNubmer = fragmentNumber;
        viewPager.setCurrentItem(fragmentNumber);
    }

    // Navigation Drawer
    private void navigationDrawer() {

        //Navigation Drawer
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerVisible(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.START);
                else
                    drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        animateNavigationDrawer();
    }

    private void animateNavigationDrawer() {

        drawerLayout.setScrimColor(getResources().getColor(R.color.colorBlue));

        //Add any color or remove it to use the default one!
        //To make it transparent use Color.Transparent in side setScrimColor();
        //drawerLayout.setScrimColor(Color.TRANSPARENT);
        drawerLayout.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

                // Scale the View based on current slide offset
                final float diffScaledOffset = slideOffset * (1 - END_SCALE);
                final float offsetScale = 1 - diffScaledOffset;
                contentView.setScaleX(offsetScale);
                contentView.setScaleY(offsetScale);

                // Translate the View, accounting for the scaled width
                final float xOffset = drawerView.getWidth() * slideOffset;
                final float xOffsetDiff = contentView.getWidth() * diffScaledOffset / 2;
                final float xTranslation = xOffset - xOffsetDiff;
                contentView.setTranslationX(xTranslation);
            }
        });
    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
            drawerLayout.closeDrawer((GravityCompat.START));
        } else if(fragmentNubmer == 0)
            super.onBackPressed();
        else if(fragmentNubmer == 2)
            setViewPager(0);
        else if(fragmentNubmer == 3)
            setViewPager(2);
        else if(fragmentNubmer == 4)
            setViewPager(0);
        else if(fragmentNubmer == 5)
            setViewPager(0);
        else
            setViewPager(fragmentNubmer - 1);

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.nav_home :
                setViewPager(0);
                drawerLayout.closeDrawer((GravityCompat.START));
                break;
            case R.id.nav_doctor:
                setViewPager(1);
                drawerLayout.closeDrawer((GravityCompat.START));
                break;
            case R.id.nav_patient:
                //setViewPager(1);
                drawerLayout.closeDrawer((GravityCompat.START));
                break;
            case R.id.nav_to_do:
                //setViewPager(1);
                drawerLayout.closeDrawer((GravityCompat.START));
                break;
            case R.id.nav_clinic:
                setViewPager(4);
                drawerLayout.closeDrawer((GravityCompat.START));
                break;
            case R.id.nav_appoinment:
                //setViewPager(1);
                drawerLayout.closeDrawer((GravityCompat.START));
                break;
            case R.id.nav_patient_files:
                //setViewPager(1);
                drawerLayout.closeDrawer((GravityCompat.START));
                break;
            case R.id.pickets_data:
                setViewPager(5);
                drawerLayout.closeDrawer((GravityCompat.START));
                break;
            case R.id.nav_doctor_details:
                setViewPager(2);
                drawerLayout.closeDrawer((GravityCompat.START));
                break;
            case R.id.nav_accounting:
                //setViewPager(1);
                drawerLayout.closeDrawer((GravityCompat.START));
                break;
            default:
                return true;
        }
        return true;
    }
}
