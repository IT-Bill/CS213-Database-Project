package cn.itbill.domain;

import java.util.List;
import java.util.Objects;

public class Teacher {
	private int id;
	private String name;
	private List<Classes> classList;

	public Teacher() {
	}

	public Teacher(int id, String name, List<Classes> classList) {
		this.id = id;
		this.name = name;
		this.classList = classList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Classes> getClassList() {
		return classList;
	}

	public void setClassList(List<Classes> classList) {
		this.classList = classList;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Teacher teacher = (Teacher) o;
		return id == teacher.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
