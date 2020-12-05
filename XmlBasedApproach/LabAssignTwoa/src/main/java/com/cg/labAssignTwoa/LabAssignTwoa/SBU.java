package com.cg.labAssignTwoa.LabAssignTwoa;

public class SBU {
	public int id;
	public String subName;
	public String subHead;
	
	public SBU(int id, String subName, String subHead) {
		super();
		this.id = id;
		this.subName = subName;
		this.subHead = subHead;
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
