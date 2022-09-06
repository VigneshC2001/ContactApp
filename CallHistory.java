package com.dao;

import java.time.LocalDateTime;

public class CallHistory {
	private LocalDateTime start;
	private int duration;
	public LocalDateTime getStart() {
		return start;
	}
	public void setStart(LocalDateTime start) {
		this.start = start;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
}
