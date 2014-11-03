package com.fathead.chicobiocaapp;

import android.media.MediaPlayer;

public class SoundsBioca {
	
	private String biocaTitle;
	private MediaPlayer biocaSound;
	private int biocaResource;
	private String biocaTitleRaw;
	private String biocaTitleFile;
	
	public SoundsBioca(String title, MediaPlayer sound, int resource, String titleRaw, String titleFile){
		biocaTitle = title;
		biocaSound = sound;
		biocaResource = resource;
		biocaTitleRaw = titleRaw;
		biocaTitleFile = titleFile;
	}
	
	public String getTitle() {
		return biocaTitle;
	}
	
	public void setTitle(String title) {
		this.biocaTitle = title;
	}
	public MediaPlayer getBiocaSound() {
		return biocaSound;
	}
	public void setBiocaSound(MediaPlayer biocaSound) {
		this.biocaSound = biocaSound;
	}
	
	public int getResource() {
		return biocaResource;
	}
	
	public String getTitleRaw() {
		return biocaTitleRaw;
	}
	
	public String getTitleFile() {
		return biocaTitleFile;
	}
	
}