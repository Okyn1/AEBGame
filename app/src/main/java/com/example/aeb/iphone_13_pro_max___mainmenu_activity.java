
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_13_pro_max___mainmenu
	 *	@date 		Sunday 26th of March 2023 02:13:53 PM
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
import android.widget.Toast;

	public class iphone_13_pro_max___mainmenu_activity extends Activity {

	
	private View _bg__iphone_13_pro_max___mainmenu_ek2;
	private View rectangle_1;
	private TextView a_bout_game;
	private TextView theme;
	private TextView a_b_game;
	private TextView tutorial;
	private TextView level_1;
	private TextView level_2;
	private TextView level_3;
	private TextView level_4;
	private View ellipse_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_13_pro_max___mainmenu);

		
		_bg__iphone_13_pro_max___mainmenu_ek2 = (View) findViewById(R.id._bg__iphone_13_pro_max___mainmenu_ek2);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		a_bout_game = (TextView) findViewById(R.id.a_bout_game);
		theme = (TextView) findViewById(R.id.theme);
		a_b_game = (TextView) findViewById(R.id.a_b_game);

		level_1 = (TextView) findViewById(R.id.level_1);
		level_2 = (TextView) findViewById(R.id.level_2);
		level_3 = (TextView) findViewById(R.id.level_3);
		level_4 = (TextView) findViewById(R.id.level_4);

	
		
		//custom code goes here
		a_bout_game.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), iphone_13_pro_max___aboutgame_activity.class);
				startActivity(intent);
		}});
		level_1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), iphone_13_pro_max___game_activity.class);//запускает активность и передает число - номер уровня
				intent.putExtra("level", 1);
				startActivity(intent);
			}});
		level_2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), iphone_13_pro_max___game_activity.class);//запускает активность и передает число - номер уровня
				intent.putExtra("level", 2);
				startActivity(intent);
			}});
		level_3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), iphone_13_pro_max___game_activity.class);//запускает активность и передает число - номер уровня
				intent.putExtra("level", 3);
				startActivity(intent);
			}});
		level_4.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), iphone_13_pro_max___game_activity.class);//запускает активность и передает число - номер уровня
				intent.putExtra("level", 4);
				startActivity(intent);
			}});


	}
}
	
	