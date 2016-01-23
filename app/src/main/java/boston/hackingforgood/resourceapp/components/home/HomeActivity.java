package boston.hackingforgood.resourceapp.components.home;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import boston.hackingforgood.resourceapp.R;
import butterknife.Bind;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {
    @Bind(R.id.homeViewPager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        setUpViewPagerAdapter();
    }

    private void setUpViewPagerAdapter() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        HomeViewPagerAdapter homeViewPagerAdapter = new HomeViewPagerAdapter(this, fragmentManager);
        viewPager.setAdapter(homeViewPagerAdapter);
    }
}
