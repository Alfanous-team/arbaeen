package sd.waleed.android.islamic;

import java.io.IOException;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class Hadeeth extends Activity {
	TextView title,content ;
	ArbaeenHelper helper ;
	Cursor cursor ;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.hadeethscreen);
		title = (TextView)findViewById(R.id.title);
		content = (TextView)findViewById(R.id.content);
		title.setText(getIntent().getExtras().getString("title"));
		helper = new ArbaeenHelper(this);
		try {
            helper.createDataBase();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_LONG).show();
        }
		cursor = helper.getHadeethById(""+getIntent().getExtras().getInt("id"));		
		if(cursor.moveToFirst()){
			do{
				content.setText(cursor.getString(1));
			}while(cursor.moveToNext());
		}
		
	}

}
