package id.sch.smktelkom_mlg.learn.timesheet;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import id.sch.smktelkom_mlg.learn.timesheet.fragment.AboutFragment;
import id.sch.smktelkom_mlg.learn.timesheet.fragment.HistoryFragment;
import id.sch.smktelkom_mlg.learn.timesheet.fragment.HomeFragment;
import id.sch.smktelkom_mlg.learn.timesheet.fragment.dummy.DummyContent;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, HomeFragment.OnListFragmentInteractionListener, HistoryFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        changePage(R.id.nav_home);
        navigationView.setCheckedItem(R.id.nav_home);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_logout) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        } else {
            changePage(id);
        }

        return true;
    }

    private void changePage(int id) {
        Fragment fragment = null;

        if (id == R.id.nav_home) {
            fragment = new HomeFragment();
            setTitle("Home");
        } else if (id == R.id.nav_history) {
            fragment = new HistoryFragment();
            setTitle("History");
        } else if (id == R.id.nav_about) {
            fragment = new AboutFragment();
            setTitle("About");
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commitNow();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
