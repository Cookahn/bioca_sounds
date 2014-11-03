package com.fathead.chicobiocaapp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaScannerConnection;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class RemixActivity extends Activity {
	Button buttonBioca;
	TextView textBioca;
	LinearLayout linearButton;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.remix_activity);

		textBioca = (TextView) findViewById(R.id.text_bioca);
		linearButton = (LinearLayout) findViewById(R.id.linear_button);
		final String arrayPhrase[] = getResources().getStringArray(R.array.phraseBioca);
		final String titleSound[] = getResources().getStringArray(R.array.title_bioca_sound);
		final String arrayTitle[] = getResources().getStringArray(R.array.title_bioca);
		final String arrayTitleRaw[] = getResources().getStringArray(R.array.title_bioca_raw);
		final int arrayImageButton[] = new int[21];
		
		final SoundsBioca soundsBioca[] = new SoundsBioca[21];
		
		soundsBioca[0] = new SoundsBioca(arrayTitle[0], MediaPlayer.create(this, R.raw.eu_quero_sabe), R.raw.eu_quero_sabe, arrayTitleRaw[0], titleSound[0]);
		soundsBioca[1] = new SoundsBioca(arrayTitle[1], MediaPlayer.create(this, R.raw.quem_e_que_transa), R.raw.quem_e_que_transa, arrayTitleRaw[1], titleSound[1]);
		soundsBioca[2] = new SoundsBioca(arrayTitle[2], MediaPlayer.create(this, R.raw.quem_transa_nessa_porra), R.raw.quem_transa_nessa_porra, arrayTitleRaw[2], titleSound[2]);
		soundsBioca[3] = new SoundsBioca(arrayTitle[3], MediaPlayer.create(this, R.raw.gluu), R.raw.gluu, arrayTitleRaw[3], titleSound[3]);
		soundsBioca[4] = new SoundsBioca(arrayTitle[4], MediaPlayer.create(this, R.raw.glooe), R.raw.glooe, arrayTitleRaw[4], titleSound[4]);
		soundsBioca[5] = new SoundsBioca(arrayTitle[5], MediaPlayer.create(this, R.raw.sexo_anal), R.raw.sexo_anal, arrayTitleRaw[5], titleSound[5]);
		soundsBioca[6] = new SoundsBioca(arrayTitle[6], MediaPlayer.create(this, R.raw.smack), R.raw.smack, arrayTitleRaw[6], titleSound[6]);
		soundsBioca[7] = new SoundsBioca(arrayTitle[7], MediaPlayer.create(this, R.raw.chupa_um_cu), R.raw.chupa_um_cu, arrayTitleRaw[7], titleSound[7]);
		soundsBioca[8] = new SoundsBioca(arrayTitle[8], MediaPlayer.create(this, R.raw.pa_e_sei_que_la), R.raw.pa_e_sei_que_la, arrayTitleRaw[8], titleSound[8]);
		soundsBioca[9] = new SoundsBioca(arrayTitle[9], MediaPlayer.create(this, R.raw.trasa_mesmo), R.raw.trasa_mesmo, arrayTitleRaw[9], titleSound[9]);
		soundsBioca[10] = new SoundsBioca(arrayTitle[10], MediaPlayer.create(this, R.raw.comer_vagina), R.raw.comer_vagina, arrayTitleRaw[10], titleSound[10]);
		soundsBioca[11] = new SoundsBioca(arrayTitle[11], MediaPlayer.create(this, R.raw.tudo_mais), R.raw.tudo_mais, arrayTitleRaw[11], titleSound[11]);
		soundsBioca[12] = new SoundsBioca(arrayTitle[12], MediaPlayer.create(this, R.raw.quero_nem_saber), R.raw.quero_nem_saber, arrayTitleRaw[12], titleSound[12]);
		soundsBioca[13] = new SoundsBioca(arrayTitle[13], MediaPlayer.create(this, R.raw.nessa_porra), R.raw.nessa_porra, arrayTitleRaw[13], titleSound[13]);
		soundsBioca[14] = new SoundsBioca(arrayTitle[14], MediaPlayer.create(this, R.raw.tabaco_massa), R.raw.tabaco_massa, arrayTitleRaw[14], titleSound[14]);
		soundsBioca[15] = new SoundsBioca(arrayTitle[15], MediaPlayer.create(this, R.raw.pff), R.raw.pff, arrayTitleRaw[15], titleSound[15]);
		soundsBioca[16] = new SoundsBioca(arrayTitle[16], MediaPlayer.create(this, R.raw.pff_pff), R.raw.pff_pff, arrayTitleRaw[16], titleSound[16]);
		soundsBioca[17] = new SoundsBioca(arrayTitle[17], MediaPlayer.create(this, R.raw.pff_pff_pff), R.raw.pff_pff_pff, arrayTitleRaw[17], titleSound[17]);
		soundsBioca[18] = new SoundsBioca(arrayTitle[18], MediaPlayer.create(this, R.raw.fude_ate_o_talo), R.raw.fude_ate_o_talo, arrayTitleRaw[18], titleSound[18]);
		soundsBioca[19] = new SoundsBioca(arrayTitle[19], MediaPlayer.create(this, R.raw.undefined), R.raw.undefined, arrayTitleRaw[19], titleSound[19]);

		
		for (int i = 0; i < titleSound.length; i++) {
			saveAudio(soundsBioca[i].getTitleFile(), soundsBioca[i].getTitleRaw(), soundsBioca[i].getResource());
		};
		
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
		params.setMargins(3, 3, 3, 3);

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
				
				@SuppressLint("NewApi")
				@Override
				public void onClick(View v) {
					soundsBioca[aux].getBiocaSound().start();
					textBioca.setText(soundsBioca[aux].getTitle());
					getAudioVolume();
				}
			});
			
			buttonBioca.setOnLongClickListener(new OnLongClickListener() {
				
				@Override
				public boolean onLongClick(View v) {
						sendAudio(titleSound[aux]);
					return false;
				}
			});
			
			arrayButton.add(buttonBioca);

		}
		
	}
	
	private void sendAudio(String biocaSoundName) {
		String sharePath = Environment.getExternalStorageDirectory().getPath()
	            + "/.bioca_sounds/"+ biocaSoundName + ".mp3";
	    Uri uri = Uri.parse(sharePath);
	    Intent intent = new Intent(Intent.ACTION_SEND);
	    intent.setType("audio/*");
	    intent.putExtra(Intent.EXTRA_STREAM, uri);
	    startActivity(Intent.createChooser(intent, "Envie sua Transa"));
	}
	
	private void saveAudio(String arrayTitleSound, String titleRaw, int resource) {
		
		String rootAudi = Environment.getExternalStorageDirectory().toString();
		File myDir = new File(rootAudi + "/.bioca_sounds");
		if(!myDir.exists()){
		myDir.mkdir();
		}
		String audioName = arrayTitleSound.toString() + ".mp3";
		File file =  new File(myDir, audioName);
		if(!file.exists()){
		
	    try {
	    	InputStream is = getResources().openRawResource(resource);
	        OutputStream os = new FileOutputStream(file);
	        byte[] data = new byte[is.available()];
	        is.read(data);
	        os.write(data);
	        is.close();
	        os.close();

	        MediaScannerConnection.scanFile(this,
	                new String[] { file.toString() }, null,
	                new MediaScannerConnection.OnScanCompletedListener() {
				@Override
				public void onScanCompleted(String path, Uri uri) {

				}
	        });
	    } catch (IOException e) {
	    }
		}
	}
	
	public void getAudioVolume() {
		AudioManager am = (AudioManager) getSystemService(AUDIO_SERVICE);
		int volume_level= am.getStreamVolume(AudioManager.STREAM_MUSIC);
			if(volume_level <= 1){
				Toast.makeText(this, "Aumente o volume", Toast.LENGTH_SHORT).show();
			}		
	}
}
