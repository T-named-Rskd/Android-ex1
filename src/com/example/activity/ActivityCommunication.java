package com.example.activity;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class ActivityCommunication extends Activity {

	private static final int SUBACTIVITY1 = 1;
	private static final int SUBACTIVITY2 = 2;
	TextView textView;
	@Override
	public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);

	        setContentView(R.layout.main);

	        textView = (TextView)findViewById(R.id.textShow);
	        final Button btn1 = (Button)findViewById(R.id.Btn1);
	        final Button btn2 = (Button)findViewById(R.id.Btn2);
        
	        btn1.setOnClickListener(new OnClickListener(){
			public void onClick(View view){
			Intent intent = new Intent(ActivityCommunication.this, SubActivity1.class);
			startActivityForResult(intent, SUBACTIVITY1);
		    }
		   });

	         btn2.setOnClickListener(new OnClickListener(){
	                  public void onClick(View view){
		Intent intent = new Intent(ActivityCommunication.this, SubActivity2.class);
			startActivityForResult(intent, SUBACTIVITY2);
			}
              });
}

   @Override
	    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		     super.onActivityResult(requestCode, resultCode, data);
		
	     switch(requestCode){
		     case SUBACTIVITY1:

		         if (resultCode == RESULT_OK){
		        	 			     Uri uriData = data.getData();
		        	 			     textView.setText(uriData.toString());
		        	 		                }
		        	 		                break;
		        	 		     case SUBACTIVITY2:
		        	 		                 break;
		        	 		     }
		        	 	        }
}


