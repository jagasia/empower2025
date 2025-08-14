package com.empower.demo.beans;

public class Car {
	Audio audio;

	public Car() {
		super();
	}

	public Car(Audio audio) {
		super();
		this.audio = audio;
	}

	public Audio getAudio() {
		return audio;
	}

	public void setAudio(Audio audio) {
		this.audio = audio;
	}
	
	public void playMusic() {
		audio.play();
	}
}
