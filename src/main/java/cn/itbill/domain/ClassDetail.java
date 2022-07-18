package cn.itbill.domain;

import java.util.List;

public class ClassDetail {
	private List<Integer> weekList;
	private String location;
	/**
	 * 目前还不知道课程中是否有1节课的。
	 * 先记录第一节课，例如，classTime是1说明1-2节上课
	 */
	private int classTime;
	private int weekday;

	// 暂时不写classId


	public ClassDetail() {
	}

	public ClassDetail(List<Integer> weekList, String location, int classTime, int weekday) {
		this.weekList = weekList;
		this.location = location;
		this.classTime = classTime;
		this.weekday = weekday;
	}

	public List<Integer> getWeekList() {
		return weekList;
	}

	public void setWeekList(List<Integer> weekList) {
		this.weekList = weekList;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getClassTime() {
		return classTime;
	}

	public void setClassTime(int classTime) {
		this.classTime = classTime;
	}

	public int getWeekday() {
		return weekday;
	}

	public void setWeekday(int weekday) {
		this.weekday = weekday;
	}

	@Override
	public String toString() {
		return "ClassDetail{" +
				"weekList=" + weekList +
				", location='" + location + '\'' +
				", classTime=" + classTime +
				", weekday=" + weekday +
				'}';
	}
}
