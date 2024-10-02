package vn.usth.edu.weather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager.widget.ViewPager;
public class HomeFragmentPagerAdapter extends FragmentStateAdapter{

    public  HomeFragmentPagerAdapter (@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new WeatherAndForecastFragment();
            case 1:
                return new ParisFragment();
            case 2:
                return new HanoiFragment();
            case 3:
                return new ToulouseFragment();
            default:
                return new WeatherAndForecastFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}