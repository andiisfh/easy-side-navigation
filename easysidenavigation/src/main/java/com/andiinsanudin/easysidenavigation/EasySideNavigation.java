package com.andiinsanudin.easysidenavigation;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;

/**
 * Created by Andi Insanudin on 04/10/18.
 */
public abstract class EasySideNavigation extends AppCompatActivity  {

    private ActionBarDrawerToggle mDrawerToggle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easysidenavigation);

        ViewStub stub = findViewById(R.id.viewStub);
        stub.setLayoutResource(setViewResource());
        View view = stub.inflate();
        onViewReady(view);

        NavigationView navigationView = findViewById(R.id.navigationView);
        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);

        mDrawerToggle = setupDrawerToggle(drawerLayout, setToolbar());
        drawerLayout.addDrawerListener(mDrawerToggle);

        navigationView.inflateHeaderView(setNavigationHeaderResource());

        getNavigationHeaderResource(navigationView.getHeaderView(0));

        navigationView.inflateMenu(setNavigationMenu());

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                EasySideNavigation.this.onNavigationItemSelected(menuItem);
                return true;
            }
        });
    }

    protected abstract int setViewResource();
    protected abstract void onViewReady(View view);
    protected abstract Toolbar setToolbar();
    protected abstract int setNavigationHeaderResource();
    protected abstract void getNavigationHeaderResource(View view);
    protected abstract int setNavigationMenu();
    protected abstract void onNavigationItemSelected(MenuItem menuItem);

    private ActionBarDrawerToggle setupDrawerToggle(DrawerLayout drawerLayout, Toolbar toolbar){
        return new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.home_drawer_open, R.string.home_drawer_close);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
