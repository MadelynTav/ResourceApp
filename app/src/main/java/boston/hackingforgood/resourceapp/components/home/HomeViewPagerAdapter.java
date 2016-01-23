package boston.hackingforgood.resourceapp.components.home;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import boston.hackingforgood.resourceapp.R;

public class HomeViewPagerAdapter extends FragmentPagerAdapter {
    Context context;

    public HomeViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public HomeViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return new HomeActivityFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.my_city);
        } else if (position == 1) {
            return context.getString(R.string.my_state);
        } else {
            return context.getString(R.string.nation);
        }

    }
}
