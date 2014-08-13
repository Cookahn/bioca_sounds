package com.example.chicobiocaapp;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Paint.Align;
import android.text.Layout.Alignment;
import android.view.Gravity;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.media.MediaPlayer;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RemixActivity extends Activity {
	Button buttonBioca;
	TextView textBioca;
	LinearLayout linearButton;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.remix_activity);

		textBioca = (TextView) findViewById(R.id.text_bioca);
		linearButton = (LinearLayout) findViewById(R.id.linear_button);
		final MediaPlayer arrayMedia[] = new MediaPlayer[20];
		final String arrayPhrase[]= getResources().getStringArray(R.array.phraseBioca);
		final String arrayTitle[]= getResources().getStringArray(R.array.title_bioca);
		final int arrayImageButton[] = new int[21];
		
		arrayMedia[0] = MediaPlayer.create(this, R.raw.eu_quero_sabe);
		arrayMedia[1] = MediaPlayer.create(this, R.raw.quem_e_que_transa);
		arrayMedia[2] = MediaPlayer.create(this, R.raw.quem_transa_nessa_porra);
		arrayMedia[3] = MediaPlayer.create(this, R.raw.gluu);
		arrayMedia[4] = MediaPlayer.create(this, R.raw.glooe);
		arrayMedia[5] = MediaPlayer.create(this, R.raw.sexo_anal);
		arrayMedia[6] = MediaPlayer.create(this, R.raw.smack);
		arrayMedia[7] = MediaPlayer.create(this, R.raw.chupa_um_cu);
		arrayMedia[8] = MediaPlayer.create(this, R.raw.pa_e_sei_que_la);
		arrayMedia[9] = MediaPlayer.create(this, R.raw.trasa_mesmo);
		arrayMedia[10] = MediaPlayer.create(this, R.raw.comer_vagina);
		arrayMedia[11] = MediaPlayer.create(this, R.raw.tudo_mais);
		arrayMedia[12] = MediaPlayer.create(this, R.raw.quero_nem_saber);
		arrayMedia[13] = MediaPlayer.create(this, R.raw.nessa_porra);
		arrayMedia[14] = MediaPlayer.create(this, R.raw.tabaco_massa);
		arrayMedia[15] = MediaPlayer.create(this, R.raw.pff);
		arrayMedia[16] = MediaPlayer.create(this, R.raw.pff_pff);
		arrayMedia[17] = MediaPlayer.create(this, R.raw.pff_pff_pff);
		arrayMedia[18] = MediaPlayer.create(this, R.raw.fude_ate_o_talo);
		arrayMedia[19] = MediaPlayer.create(this, R.raw.undefined);
		
		
		arrayImageButton[0] =  R.drawable.button_bioca_green;
		arrayImageButton[1] = R.drawable.button_bioca_pink;
		arrayImageButton[2] = R.drawable.button_bioca_purple;
		arrayImageButton[3] = R.drawable.button_bioca_green;
		arrayImageButton[4] = R.drawable.button_bioca_pink;
		arrayImageButton[5] = R.drawable.button_bioca_purple;
		arrayImageButton[6] = R.drawable.button_bioca_green;
		arrayImageButton[7] = R.drawable.button_bioca_pink;
		arrayImageButton[8] = R.drawable.button_bioca_purple;
		arrayImageButton[9] = R.drawable.button_bioca_green;
		arrayImageButton[10] = R.drawable.button_bioca_pink;
		arrayImageButton[11] = R.drawable.button_bioca_purple;
		arrayImageButton[12] = R.drawable.button_bioca_green;
		arrayImageButton[13] = R.drawable.button_bioca_pink;
		arrayImageButton[14] = R.drawable.button_bioca_purple;
		arrayImageButton[15] = R.drawable.button_bioca_green;
		arrayImageButton[16] = R.drawable.button_bioca_pink;
		arrayImageButton[17] = R.drawable.button_bioca_purple;
		arrayImageButton[18] = R.drawable.button_bioca_green;
		arrayImageButton[19] = R.drawable.button_bioca_pink;
		arrayImageButton[20] = R.drawable.button_bioca_purple;
		
		ArrayList<Button> arrayButton = new ArrayList<Button>();
		LinearLayout.LayoutParams params = new android.widget.LinearLayout.LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f);
		params.setMargins(10, 10, 10, 10);

		for (int i = 0; i < arrayPhrase.length; i++) {
			final int aux = i;
			if(i%5 == 0 && i > 0) {
				LinearLayout linearRow = new LinearLayout(this);
				linearRow.setGravity(Gravity.CENTER_HORIZONTAL);
				linearRow.setOrientation(LinearLayout.HORIZONTAL);
				linearRow.addView(arrayButton.get(0), 0);
				linearRow.addView(arrayButton.get(1), 1);
				linearRow.addView(arrayButton.get(2), 2);
				linearRow.addView(arrayButton.get(3), 3);
				linearRow.addView(arrayButton.get(4), 4);
				arrayButton.clear();

				linearButton.addView(linearRow);
				
			}
			Button buttonBioca = new Button(this);
			buttonBioca.setText(arrayPhrase[i]);
			buttonBioca.setTextSize(10);
			buttonBioca.setSingleLine();
			buttonBioca.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL);
			buttonBioca.setLayoutParams(params);
			buttonBioca.setTextColor(Color.WHITE);
			buttonBioca.setBackgroundResource(arrayImageButton[i]);
			buttonBioca.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					arrayMedia[aux].start();
					textBioca.setText(arrayTitle[aux]);
					
				}
			});
			arrayButton.add(buttonBioca);

		}
		
	}

}
