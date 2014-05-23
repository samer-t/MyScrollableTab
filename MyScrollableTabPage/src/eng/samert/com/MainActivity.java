package eng.samert.com;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;


public class MainActivity extends FragmentActivity {
	ViewPager viewPager = null;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		viewPager = (ViewPager) findViewById(R.id.pager);
		
		FragmentManager fm = getSupportFragmentManager();
		viewPager.setAdapter(new FragmentAdapter(fm));
		

	}
}


class FragmentAdapter extends FragmentStatePagerAdapter {

	public FragmentAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int i) {
		Fragment fragment = null;
		if (i== 0){
			fragment = new FragmentA();
		}if (i== 1){
			fragment = new FragmentB();
		}if (i== 2){
			fragment = new FragmentC();
		}
		return fragment;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 3;
	}
	
	@Override
	public CharSequence getPageTitle(int position) {
		String title = null;
		if (position == 0)
			return title = "first tab";
		if (position == 1)
			return title = "Second tab";
		if (position == 2)
			return title = "Third tab";
			
		return super.getPageTitle(position);
	}
	
}