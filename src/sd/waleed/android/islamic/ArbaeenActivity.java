package sd.waleed.android.islamic;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class ArbaeenActivity extends Activity implements OnClickListener {
	Button first,second,third,fourth,fifth,	six,seven,eight,nine,ten,
	eleven,twelve,therteen,fourteen,fifteen,sixteen,seventeen,eighteen,ninteen,twenty,
	twentone,twentytwo,twentythree,twentyfour,twentyfive,twentysix,twentyseven,twentyeight,twentynine,thirty,
	thirtyone,thirtytwo,thirtythree,thirtyfour,thirtyfive,thirtysix,thirtyseven,thirtyeight,thirtynine,fourty,
	fourtyone,fourtytwo;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        
        first    = (Button)findViewById(R.id.first);
        second    = (Button)findViewById(R.id.second);
        third    = (Button)findViewById(R.id.third);
        fourth    = (Button)findViewById(R.id.fourth);
        fifth    = (Button)findViewById(R.id.fifth);
        six    = (Button)findViewById(R.id.six);
        seven    = (Button)findViewById(R.id.seven);
        eight    = (Button)findViewById(R.id.eight);
        nine    = (Button)findViewById(R.id.nine);
        ten    = (Button)findViewById(R.id.ten);
        eleven    = (Button)findViewById(R.id.eleven);
        twelve    = (Button)findViewById(R.id.twelve);
        therteen    = (Button)findViewById(R.id.therteen);
        fourteen    = (Button)findViewById(R.id.fourteen);
        fifteen    = (Button)findViewById(R.id.fifteen);
        sixteen    = (Button)findViewById(R.id.sixteen);
        seventeen    = (Button)findViewById(R.id.seventeen);
        eighteen    = (Button)findViewById(R.id.eighteen);
        ninteen    = (Button)findViewById(R.id.ninteen);
        twenty    = (Button)findViewById(R.id.twenty);
        twentone    = (Button)findViewById(R.id.twentone);
        twentytwo    = (Button)findViewById(R.id.twentytwo);
        twentythree    = (Button)findViewById(R.id.twentythree);
        twentyfour    = (Button)findViewById(R.id.twentyfour);
        twentyfive    = (Button)findViewById(R.id.twentyfive);
        twentysix    = (Button)findViewById(R.id.twentysix);   
        twentyseven    = (Button)findViewById(R.id.twentyseven);
        twentyeight    = (Button)findViewById(R.id.twentyeight);
        twentynine    = (Button)findViewById(R.id.twentynine);
        thirty    = (Button)findViewById(R.id.thirty);   
        thirtyone    = (Button)findViewById(R.id.thirtyone);
        thirtytwo    = (Button)findViewById(R.id.thirtytwo);
        thirtythree    = (Button)findViewById(R.id.thirtythree);  
        thirtyfour    = (Button)findViewById(R.id.thirtyfour);
        thirtyfive    = (Button)findViewById(R.id.thirtyfive);
        thirtysix    = (Button)findViewById(R.id.thirtysix);
        thirtyseven    = (Button)findViewById(R.id.thirtyseven);
        thirtyeight    = (Button)findViewById(R.id.thirtyeight);
        thirtynine    = (Button)findViewById(R.id.thirtynine);
        fourty    = (Button)findViewById(R.id.fourty);
        fourtyone    = (Button)findViewById(R.id.fourtyone);
        fourtytwo    = (Button)findViewById(R.id.fourtytwo);
        
        first.setOnClickListener(this);
        second.setOnClickListener(this);
        third.setOnClickListener(this);
        fourth.setOnClickListener(this);
        fifth.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        ten.setOnClickListener(this);
        eleven.setOnClickListener(this);
        twelve.setOnClickListener(this);
        therteen.setOnClickListener(this);
        fourteen.setOnClickListener(this);
        fifteen.setOnClickListener(this);
        sixteen.setOnClickListener(this);
        seventeen.setOnClickListener(this);
        eighteen.setOnClickListener(this);
        ninteen.setOnClickListener(this);
        twenty.setOnClickListener(this);
        twentone.setOnClickListener(this);
        twentytwo.setOnClickListener(this);
        twentythree.setOnClickListener(this);
        twentyfour.setOnClickListener(this);
        twentyfive.setOnClickListener(this);
        twentysix.setOnClickListener(this);
        twentyseven.setOnClickListener(this);
        twentyeight.setOnClickListener(this);
        twentynine.setOnClickListener(this);
        thirty.setOnClickListener(this);
        thirtyone.setOnClickListener(this);
        thirtytwo.setOnClickListener(this);
        thirtythree.setOnClickListener(this);
        thirtyfour.setOnClickListener(this);
        thirtyfive.setOnClickListener(this);
        thirtysix.setOnClickListener(this);
        thirtyseven.setOnClickListener(this);
        thirtyeight.setOnClickListener(this);
        thirtynine.setOnClickListener(this);
        fourty.setOnClickListener(this);
        fourtyone.setOnClickListener(this);
        fourtytwo.setOnClickListener(this);
        
        
    }
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i = new Intent(ArbaeenActivity.this,Hadeeth.class);
		Button b = (Button)findViewById(arg0.getId());
		i.putExtra("title", b.getText().toString());
		switch (arg0.getId()) {
		case R.id.first:
			i.putExtra("id", 1);
			break;
		case R.id.second:
			i.putExtra("id", 2);
			break;
		case R.id.third:
			i.putExtra("id", 3);
			break;
		case R.id.fourth:
			i.putExtra("id", 4);
			break;
		case R.id.fifth:
			i.putExtra("id", 5);
			break;
		case R.id.six:
			i.putExtra("id", 6);
			break;
		case R.id.seven:
			i.putExtra("id", 7);
			break;
		case R.id.eight:
			i.putExtra("id", 8);
			break;
		case R.id.nine:
			i.putExtra("id", 9);
			break;
		case R.id.ten:
			i.putExtra("id", 10);
			break;
		case R.id.eleven:
			i.putExtra("id", 11);
			break;
		case R.id.twelve:
			i.putExtra("id", 12);
			break;
		case R.id.therteen:
			i.putExtra("id", 13);
			break;
		case R.id.fourteen:
			i.putExtra("id", 14);
			break;
		case R.id.fifteen:
			i.putExtra("id", 15);
			break;
		case R.id.sixteen:
			i.putExtra("id", 16);
			break;
		case R.id.seventeen:
			i.putExtra("id", 17);
			break;
		case R.id.eighteen:
			i.putExtra("id", 18);
			break;
		case R.id.ninteen:
			i.putExtra("id", 19);
			break;
		case R.id.twenty:
			i.putExtra("id", 20);
			break;
		case R.id.twentone:
			i.putExtra("id", 21);
			break;
		case R.id.twentytwo:
			i.putExtra("id", 22);
			break;
		case R.id.twentythree:
			i.putExtra("id", 23);
			break;
		case R.id.twentyfour:
			i.putExtra("id", 24);
			break;
		case R.id.twentyfive:
			i.putExtra("id", 25);
			break;
		case R.id.twentysix:
			i.putExtra("id", 26);
			break;
		case R.id.twentyseven:
			i.putExtra("id", 27);
			break;
		case R.id.twentyeight:
			i.putExtra("id", 28);
			break;
		case R.id.twentynine:
			i.putExtra("id", 29);
			break;
		case R.id.thirty:
			i.putExtra("id", 30);
			break;
		case R.id.thirtyone:
			i.putExtra("id", 31);
			break;			
		case R.id.thirtytwo:
			i.putExtra("id", 32);
			break;
		case R.id.thirtythree:
			i.putExtra("id", 33);
			break;
		case R.id.thirtyfour:
			i.putExtra("id", 34);
			break;
		case R.id.thirtyfive:
			i.putExtra("id", 35);
			break;
		case R.id.thirtysix:
			i.putExtra("id", 36);
			break;
		case R.id.thirtyseven:
			i.putExtra("id", 37);
			break;
		case R.id.thirtyeight:
			i.putExtra("id", 38);
			break;
		case R.id.thirtynine:
			i.putExtra("id", 39);
			break;
		case R.id.fourty:
			i.putExtra("id", 40);
			break;
		case R.id.fourtyone:
			i.putExtra("id", 41);
			break;
		case R.id.fourtytwo:
			i.putExtra("id", 42);
			break;
			
		}
		
		startActivity(i);
	}
}