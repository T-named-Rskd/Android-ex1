package com.example.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class SubActivity2 extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.subactivity2);
        
		Button btnReturn = (Button)findViewById(R.id.btn_return);
		btnReturn.setOnClickListener(new OnClickListener(){
			public void onClick(View view){
				setResult(RESULT_CANCELED, null);
				finish();
			}
		});
	}
}