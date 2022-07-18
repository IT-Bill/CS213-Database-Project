package cn.itbill.domain;

import java.util.List;
import java.util.Objects;

public class Course {
	/**
	 * 课程的整型id
	 */
	private int cId;
	/**
	 * 课程完整id
	 */
	private String courseId;
	/**
	 * 学时
	 */
	private int hour;
	/**
	 * 学分
	 */
	private int credit;
	/**
	 * 本课程所属部门
	 */
	private int dept;
	/**
	 * 本课程所有学生
	 */
	private List<Student> studentList;


	public Course() {
	}

	public Course(int cId, String courseId, int hour, int credit, int dept) {
		this.cId = cId;
		this.courseId = courseId;
		this.hour = hour;
		this.credit = credit;
		this.dept = dept;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getDept() {
		return dept;
	}

	public void setDept(int dept) {
		this.dept = dept;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Course course = (Course) o;
		return cId == course.cId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cId);
	}

	@Override
	public String toString() {
		return "CourseDTO{" +
				"cId=" + cId +
				", courseId='" + courseId + '\'' +
				", hour=" + hour +
				", credit=" + credit +
				", dept=" + dept +
				'}';
	}
}
