package nyc.c4q.akashaarcher.final_apppractice1;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle drawerToggle;
    private Toolbar mToolbar;

    private RecyclerView mNavRv;
    RecyclerView.Adapter mNavAdapter;
    RecyclerView.LayoutManager mNavLayoutManager;

    private ArrayList<String> mNavItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set a Toolbar to replace the ActionBar.
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        // Find our drawer view
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        mNavRv = (RecyclerView) findViewById(R.id.recyclerView);
        mNavLayoutManager = new LinearLayoutManager(this);
        mNavRv.setLayoutManager(mNavLayoutManager);
        mNavRv.setHasFixedSize(true);

        String[] items = getResources().getStringArray(R.array.nav_draw_items);

        for (String Items : items) {
            mNavItems.add(Items);
        }

        mNavAdapter = new NavAdapter(mNavItems);
        mNavRv.setAdapter(mNavAdapter);

        drawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.drawer_open, R.string.drawer_close);
        mDrawerLayout.addDrawerListener(drawerToggle);

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        drawerToggle.syncState();
    }


}
