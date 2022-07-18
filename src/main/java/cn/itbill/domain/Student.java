package cn.itbill.domain;

import java.util.List;
import java.util.Objects;

public class Student {
	private String cnName;
	private char gender;
	/**
	 * 音译英文名
	 */
	private String transName;
	/**
	 * 学生学号
	 */
	private int id;
	/**
	 * 所选课程列表
	 */
	private List<Course> courseList;

	public Student() {
	}

	public Student(String cnName, char gender, String transName, int id, List<Course> courseList) {
		this.cnName = cnName;
		this.gender = gender;
		this.transName = transName;
		this.id = id;
		this.courseList = courseList;
	}

	public String getCnName() {
		return cnName;
	}

	public void setCnName(String cnName) {
		this.cnName = cnName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getTransName() {
		return transName;
	}

	public void setTransName(String transName) {
		this.transName = transName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student that = (Student) o;
		return id == that.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	// TODO
	public String toString() {
		return "StudentDTO{" +
				"cnName='" + cnName + '\'' +
				", gender=" + gender +
				", transName='" + transName + '\'' +
				", id=" + id +
				", courseList=" + courseList +
				'}';
	}
}
