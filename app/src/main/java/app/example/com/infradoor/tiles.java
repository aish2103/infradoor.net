package app.example.com.infradoor;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

/**
 * Created by Lenovo-pc on 6/3/2015.
 */
public class tiles extends FragmentActivity implements ActionBar.TabListener, fragment1.OnFragmentInteractionListener,fragment2.OnFragmentInteractionListener {
    ActionBar actionBar;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tiles);
        viewPager = (ViewPager)findViewById(R.id.pager);

        viewPager.setAdapter(new myAdapter(getSupportFragmentManager()));
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i2) {

            }

            @Override
            public void onPageSelected(int i) {
                actionBar.setSelectedNavigationItem(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ActionBar.Tab tab1 = actionBar.newTab();
        tab1.setText("Floor Tiles");
        tab1.setTabListener(this);
        ActionBar.Tab tab2 = actionBar.newTab();
        tab2.setText("Wall Tiles");
        tab2.setTabListener(this);

        actionBar.addTab(tab1);
        actionBar.addTab(tab2);


    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
           viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
class myAdapter extends FragmentPagerAdapter
{

    public myAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if(position == 0)
            fragment = new fragment1();
        if(position == 1)
            fragment = new fragment2();

        return fragment;
    }



}