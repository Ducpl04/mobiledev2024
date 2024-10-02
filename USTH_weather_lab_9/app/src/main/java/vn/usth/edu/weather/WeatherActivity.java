package vn.usth.edu.weather;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.app.Fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class WeatherActivity extends AppCompatActivity {
    private ViewPager2 viewPager2;
    private TabLayout tabLayout;
    public WeatherActivity() {
        super();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        Log.i("onCreate", "onCreate State");
        setContentView(R.layout.activity_main);
        // Create a new Fragment to be placed in the activity
        //String title = context.getString(R.string.refresh);
        //textView.setText(title);

        viewPager2 = findViewById(R.id.viewPager);
        HomeFragmentPagerAdapter adapter = new HomeFragmentPagerAdapter(this);
        viewPager2.setAdapter(adapter);
        tabLayout = findViewById(R.id.tabLayout);
        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
            switch (position){
                case 0:
                    tab.setText("Default");
                    break;
                case 1:
                    tab.setText("Paris");
                    break;
                case 2:
                    tab.setText("Hanoi");
                    break;
                case 3:
                    tab.setText("Toulouse");
                    break;
            }
        }).attach();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("onStart", "onStart State");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("onResume", "onResume State");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("onPause", "onPause State");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("onStop", "onStop State");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "onDestroy State");
    }
}
