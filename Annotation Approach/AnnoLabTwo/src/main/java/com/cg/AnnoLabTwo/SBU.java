package com.cg.AnnoLabTwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBU {
	@Value("123")
	public int id;
	@Value("Europe")
	public String subName;
	@Value("Radha")
	public String subHead;
	@Autowired
	public SBU() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getSubHead() {
		return subHead;
	}
	public void setSubHead(String subHead) {
		this.subHead = subHead;
	}
	@Override
	public String toString() {
		return "SBU Details= SBU [SBU-Id=" + id + ", SBU-Name=" + subName + ", SBU-Head=" + subHead +"]";
	}
	

}
