package com.fast.food;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.EditText;
import android.widget.ScrollView;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class HomeActivity extends  AppCompatActivity  { 
	
	
	private double tog1 = 0;
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private TextView textview1;
	private LinearLayout linear4;
	private HorizontalScrollView hscroll1;
	private TextView textview11;
	private LinearLayout linear40;
	private ImageView imageview1;
	private LinearLayout linear3;
	private ImageView imageview6;
	private ImageView imageview2;
	private EditText edittext1;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear14;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout linear13;
	private TextView textview2;
	private TextView textview3;
	private LinearLayout linear12;
	private TextView textview4;
	private ImageView imageview3;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private TextView textview5;
	private TextView textview6;
	private LinearLayout linear19;
	private TextView textview7;
	private ImageView imageview4;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private TextView textview8;
	private TextView textview9;
	private LinearLayout linear26;
	private TextView textview10;
	private ImageView imageview5;
	private ScrollView vscroll1;
	private LinearLayout linear27;
	private LinearLayout linear28;
	private LinearLayout linear34;
	private LinearLayout linear29;
	private LinearLayout linear31;
	private LinearLayout linear32;
	private TextView textview12;
	private ImageView imageview7;
	private LinearLayout linear30;
	private TextView textview13;
	private TextView textview14;
	private ImageView imageview8;
	private TextView textview15;
	private ImageView imageview9;
	private LinearLayout linear33;
	private TextView textview16;
	private TextView textview17;
	private ImageView imageview10;
	private LinearLayout linear35;
	private LinearLayout linear36;
	private LinearLayout linear37;
	private TextView textview18;
	private ImageView imageview11;
	private LinearLayout linear38;
	private TextView textview19;
	private TextView textview20;
	private ImageView imageview12;
	private TextView textview21;
	private ImageView imageview13;
	private LinearLayout linear39;
	private TextView textview22;
	private TextView textview23;
	private ImageView imageview14;
	
	private Intent i = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		textview11 = (TextView) findViewById(R.id.textview11);
		linear40 = (LinearLayout) findViewById(R.id.linear40);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview9 = (TextView) findViewById(R.id.textview9);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		textview10 = (TextView) findViewById(R.id.textview10);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		textview12 = (TextView) findViewById(R.id.textview12);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview14 = (TextView) findViewById(R.id.textview14);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview15 = (TextView) findViewById(R.id.textview15);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		textview16 = (TextView) findViewById(R.id.textview16);
		textview17 = (TextView) findViewById(R.id.textview17);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		linear35 = (LinearLayout) findViewById(R.id.linear35);
		linear36 = (LinearLayout) findViewById(R.id.linear36);
		linear37 = (LinearLayout) findViewById(R.id.linear37);
		textview18 = (TextView) findViewById(R.id.textview18);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		linear38 = (LinearLayout) findViewById(R.id.linear38);
		textview19 = (TextView) findViewById(R.id.textview19);
		textview20 = (TextView) findViewById(R.id.textview20);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		textview21 = (TextView) findViewById(R.id.textview21);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		linear39 = (LinearLayout) findViewById(R.id.linear39);
		textview22 = (TextView) findViewById(R.id.textview22);
		textview23 = (TextView) findViewById(R.id.textview23);
		imageview14 = (ImageView) findViewById(R.id.imageview14);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), ProfileActivity.class);
				startActivity(i);
			}
		});
		
		imageview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), ConnectingActivity.class);
				startActivity(i);
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ObjectAnimator animation9 = ObjectAnimator.ofFloat(linear4, "ScaleY", 0, 1);
				animation9.setInterpolator(new BounceInterpolator()); 
				animation9.setDuration(600);
				animation9.start();
				if (tog1 == 0) {
					linear4.setVisibility(View.VISIBLE);
					tog1 = 1;
				}
				else {
					if (tog1 == 1) {
						linear4.setVisibility(View.GONE);
						tog1 = 0;
					}
				}
			}
		});
		
		linear29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), ViweActivity.class);
				startActivity(i);
			}
		});
	}
	
	private void initializeLogic() {
		Window w = this.getWindow();
		
		w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		
		w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); 
		
		w.setStatusBarColor(Color.parseColor("#FFFFFF")); 
		linear1.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		
		
		_SX_CornerRadius_4(imageview2, "#dd7755", "#dd7755", 20, 20, 20, 20, 20);
		_SX_CornerRadius_4(edittext1, "#EEEEEE", "#EEEEEE", 12, 12, 12, 12, 12);
		_SX_CornerRadius_4(linear6, "#dd7755", "#dd7755", 15, 15, 15, 15, 15);
		_SX_CornerRadius_4(linear14, "#dd7755", "#dd7755", 15, 15, 15, 15, 15);
		_SX_CornerRadius_4(linear21, "#dd7755", "#dd7755", 15, 15, 15, 15, 15);
		linear4.setVisibility(View.GONE);
		_removeScollBar(hscroll1);
		_ICC(imageview2, "#FFFFFF", "#E0E0E0");
		_ICC(imageview8, "#FFFFFF", "#E0E0E0");
		_ICC(imageview10, "#FFFFFF", "#E0E0E0");
		_ICC(imageview12, "#FFFFFF", "#E0E0E0");
		_ICC(imageview14, "#FFFFFF", "#E0E0E0");
		_radius_to(linear12, 12, 15, "#FFFFFF");
		_radius_to(linear19, 12, 15, "#FFFFFF");
		_radius_to(linear26, 12, 15, "#FFFFFF");
		_radius_to(linear29, 12, 0, "#EEEEEE");
		_radius_to(linear32, 12, 0, "#EEEEEE");
		_radius_to(linear35, 12, 0, "#EEEEEE");
		_radius_to(linear37, 12, 0, "#EEEEEE");
		_radius_to(imageview8, 12, 0, "#dd7755");
		_radius_to(imageview10, 12, 0, "#dd7755");
		_radius_to(imageview12, 12, 0, "#dd7755");
		_radius_to(imageview14, 12, 0, "#dd7755");
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _SX_CornerRadius_4 (final View _view, final String _color1, final String _color2, final double _str, final double _n1, final double _n2, final double _n3, final double _n4) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		
		gd.setColor(Color.parseColor(_color1));
		
		gd.setStroke((int)_str, Color.parseColor(_color2));
		
		gd.setCornerRadii(new float[]{(int)_n1,(int)_n1,(int)_n2,(int)_n2,(int)_n3,(int)_n3,(int)_n4,(int)_n4});
		
		_view.setBackground(gd);
		
		_view.setElevation(4);
	}
	
	
	public void _ICC (final ImageView _img, final String _c1, final String _c2) {
		_img.setImageTintList(new android.content.res.ColorStateList(new int[][] {{-android.R.attr.state_pressed},{android.R.attr.state_pressed}},new int[]{Color.parseColor(_c1), Color.parseColor(_c2)}));
	}
	
	
	public void _radius_to (final View _view, final double _radius, final double _shadow, final String _color) {
		android.graphics.drawable.GradientDrawable ab = new android.graphics.drawable.GradientDrawable();
		
		ab.setColor(Color.parseColor(_color));
		ab.setCornerRadius((float) _radius);
		_view.setElevation((float) _shadow);
		_view.setBackground(ab);
	}
	
	
	public void _removeScollBar (final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}