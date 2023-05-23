
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		iphone_13_pro_max___game
	 *	@date 		Monday 27th of March 2023 02:56:08 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.aeb;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

	public class iphone_13_pro_max___game_activity extends Activity {

	
	private View _bg__iphone_13_pro_max___game_ek2;
	private View rectangle_1;
	private View line_1;
	private View line_2;
	private TextView problemText;
	private TextView tests;
	private TextView input;
	private View rectangle_2;
	private TextView sendButton;
	private ImageView vector;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.iphone_13_pro_max___game);

		
		_bg__iphone_13_pro_max___game_ek2 = (View) findViewById(R.id._bg__iphone_13_pro_max___game_ek2);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		line_1 = (View) findViewById(R.id.line_1);
		line_2 = (View) findViewById(R.id.line_2);
		problemText = (TextView) findViewById(R.id._____________);
		tests = (TextView) findViewById(R.id.__________);
		input = (TextView) findViewById(R.id.______________ek1);
		rectangle_2 = (View) findViewById(R.id.rectangle_2);
		sendButton = (TextView) findViewById(R.id._________);
		//vector = (ImageView) findViewById(R.id.vector);

		Bundle arguments = getIntent().getExtras();
		int level = arguments.getInt("level") ;

		InputStream inputStream = getResources().openRawResource(R.raw.levels);
		BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(inputStream));
		String eachline = null;
		try {
			eachline = bufferedReader.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		System.out.println(eachline);


		final Gson gson = new GsonBuilder().create();
		Type typeOfLevel = new TypeToken<ArrayList<communicator.Level>>() {}.getType();
		List<communicator.Level> levels = gson.fromJson(eachline, typeOfLevel);

		String Desc = levels.get(level - 1).getDesc();
		problemText.setText(Desc);
		tests.setText((levels.get(level - 1).getTests().get(0).getL()) + " " + (levels.get(level - 1).getTests().get(0).getR()));

		sendButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				String popitka = input.getText().toString(); // приводим к типу String



				/*File json = new File("levels.json");

				String fileName = "levels.json";
				Path path = Paths.get(fileName);
				List<String> allLines = null;
				try {
					allLines = Files.readAllLines(path, StandardCharsets.UTF_8);
				} catch (IOException e) {

				}*/

				InputStream inputStream = getResources().openRawResource(R.raw.levels);
				BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(inputStream));
				String eachline = null;
				try {
					eachline = bufferedReader.readLine();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
				System.out.println(eachline);


				final Gson gson = new GsonBuilder().create();
				Type typeOfLevel = new TypeToken<ArrayList<communicator.Level>>() {}.getType();
				List<communicator.Level> levels = gson.fromJson(eachline, typeOfLevel);


				boolean flag = true;
				tests.setTextColor(Color.rgb(0,200,0));
				for (int i = 0; i < 3; i += 1) {
					String toCheck = (String) levels.get(level - 1).getTests().get(i).getL();
					String expected = (String) levels.get(level - 1).getTests().get(i).getR();


					String result = (String) codeLogic.codeHandler(popitka, toCheck);


					System.out.println(expected);
					if (!Objects.equals(result, expected)) {
						tests.setText(toCheck + " " + result);
						System.out.println(result);
						flag = false;
						tests.setTextColor(Color.rgb(200,0,0));
						break;

					}
					tests.setText(toCheck + " " + result);




				}
				if (flag){
					Toast toast5 = Toast.makeText(getApplicationContext(), "ВЕРНО", Toast.LENGTH_SHORT);
					toast5.show();

				}
				else{
					Toast toast = Toast.makeText(getApplicationContext(), "ОШИБКА", Toast.LENGTH_SHORT);
					toast.show();
				}
				//проверка кода пользователя
				//запомнить правильный код
				//поставить галочку

			}});
		/*vector.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), iphone_13_pro_max___mainmenu_activity.class);
				startActivity(intent);
			}});*/

	
	}
}
	
	