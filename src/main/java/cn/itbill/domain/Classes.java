package cn.itbill.domain;

import java.util.Objects;

public class Classes {
	private int classId;
	private String name;
	private int capacity;
	/**
	 * 这个班级属于哪个课程
	 */
	private Course course;
	private ClassDetail detail;

	public Classes() {
	}

	public Classes(int classId, String name, int capacity, Course course, ClassDetail detail) {
		this.classId = classId;
		this.name = name;
		this.capacity = capacity;
		this.course = course;
		this.detail = detail;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public ClassDetail getDetail() {
		return detail;
	}

	public void setDetail(ClassDetail detail) {
		this.detail = detail;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Classes classes = (Classes) o;
		return classId == classes.classId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(classId);
	}

	@Override
	public String toString() {
		return "Classes{" +
				"classId=" + classId +
				", name='" + name + '\'' +
				", capacity=" + capacity +
				", course=" + course +
				", detail=" + detail +
				'}';
	}
}
