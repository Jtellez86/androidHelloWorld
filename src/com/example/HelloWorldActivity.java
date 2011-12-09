package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelloWorldActivity extends Activity implements View.OnClickListener 
{
	Button button;
	int touchCount;
	
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		button = new Button(this);
		button.setText( "Touch me!" );
		button.setHeight(50);
		button.setWidth(50);
		button.setOnClickListener(this);
		setContentView(button);
	}
	public void onClick(View v)
	{
		touchCount++;
		button.setText("Touched me " + touchCount + " time(s)");
		button.setWidth(button.getWidth() - 50);
	} 
}