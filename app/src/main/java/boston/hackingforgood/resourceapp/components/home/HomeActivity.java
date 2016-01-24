package boston.hackingforgood.resourceapp.components.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import boston.hackingforgood.resourceapp.R;
import boston.hackingforgood.resourceapp.components.post.CreateNewPostActivity;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {
    @Bind(R.id.homeViewPager)
    ViewPager viewPager;

    @OnClick(R.id.addPostButton)
    public void onAddPostButtonClicked() {
        openNewPost();
    }

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

    private void openNewPost() {
        // TODO: Link to creation of new post.
        Intent intent = new Intent(this, CreateNewPostActivity.class);
        startActivity(intent);
    }
}
