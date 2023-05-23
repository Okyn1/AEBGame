
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_13_pro_max___aboutgame
	 *	@date 		Sunday 26th of March 2023 03:30:50 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.aeb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;

public class iphone_13_pro_max___aboutgame_activity extends Activity {

	
	private View _bg__iphone_13_pro_max___aboutgame_ek2;
	private View rectangle_1;
	private TextView back;
	private TextView a_b_game;
	private TextView ________________________;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_13_pro_max___aboutgame);

		
		_bg__iphone_13_pro_max___aboutgame_ek2 = (View) findViewById(R.id._bg__iphone_13_pro_max___aboutgame_ek2);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		back = (TextView) findViewById(R.id.back);
		a_b_game = (TextView) findViewById(R.id.a_b_game);
		________________________ = (TextView) findViewById(R.id.________________________);


		back.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), iphone_13_pro_max___mainmenu_activity.class);
				startActivity(intent);
			}});
	
	}
}
	
	