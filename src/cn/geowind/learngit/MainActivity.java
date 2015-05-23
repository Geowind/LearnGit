package cn.geowind.learngit;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
	//I modified it --by zt
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    
    }

	System.out.println("233");
	// 友情提示：1.最新版add all要这样写：git add --all :/(or git add -A :/)
	//2.To restrict the command to the current directory, run:
	//
	//git add --all .
	//  (or git add -A .)
    //我想我知道，大公司是怎样做到，让员工如何让员工每天把代码提交了，哈哈，我有没有很聪明
}
