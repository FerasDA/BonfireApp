package com.bonfireapp.bonfireapp.bonfireapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;

public class Main extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab = actionBar.newTab().setText("Events");
        Fragment t1 = new EventsMain();
        tab.setTabListener(new TabListener(t1));
        actionBar.addTab(tab);

        tab = actionBar.newTab().setText("Groups");
        Fragment t2 = new GroupsMain();
        tab.setTabListener(new TabListener(t2));
        actionBar.addTab(tab);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public static class TabListener implements ActionBar.TabListener {
        private Fragment mFragment;

        public TabListener(Fragment fragment) {
            mFragment = fragment;
        }

        @Override
        public void onTabReselected(ActionBar.Tab arg0, android.support.v4.app.FragmentTransaction ft) {
            //Do nothing
        }

        @Override
        public void onTabSelected(ActionBar.Tab arg0, android.support.v4.app.FragmentTransaction ft) {
            ft.replace(android.R.id.content, mFragment, null);
        }

        @Override
        public void onTabUnselected(ActionBar.Tab arg0, android.support.v4.app.FragmentTransaction ft) {
            ft.remove(mFragment);
        }

    }

}
