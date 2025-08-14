package com.empower.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
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
