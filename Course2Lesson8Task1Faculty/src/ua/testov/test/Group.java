package ua.testov.test;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;

public class Group implements Military,Serializable{

	private String name;
	private Student[] st = new Student[5];

	public Group() {
		super();
	}

	public Group(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addStudent(int n, Student... names) throws myException {
		if (names.length > 5 - (n - 1) || n < 1)
			throw new myException();
		for (int i = 0; i < names.length; i++) {
			if (st[n - 1] == null) {
				st[n - 1] = names[i];
			} else {
				System.out.print("Елемент " + (n - 1) + " не є пустим.");
			}
			n++;
		}
	}

	public void delStudent(int i) {
		st[i] = null;
	}

	public Student searchStudent(String str) {
		Student s = new Student();
		for (int i = 0; i < this.st.length; i++) {
			if (this.st[i] != null) {
				if (this.st[i].getSecondName().equals(str)) {
					s = this.st[i];
					break;
				}
			}
		}

		if (s.getSecondName() == null) {
			System.out.print("Студента не знайдено! ");
			return null;
		}
		return s;
	}
	public enum En {
		reverse, withoutReverse;
	}

	public Student[] sortWithParam(int p, En n) {
		if (p < 1 || p > 3) {
			throw new IllegalArgumentException();
		}
		try {
			if (n == En.reverse) {
				Arrays.sort(st, Collections.reverseOrder(new SortWithParameter(p)));
			} else {
				Arrays.sort(st, new SortWithParameter(p));
			}

		} catch (Exception e) {
			System.out.println("null element(-s) in massive");
		}

		return st;
	}

	public Student[] getDraftees(Student[] student) {
		Student[] recruits=new Student[10];
		int n=0;
		for (int i = 0; i < student.length; i++) {
			if (student[i] == null) {
				continue;
			}
			if(student[i].getAge()>=18 & student[i].isGender()) {
				recruits[n]=student[i];
				n++;
			}
		}
		return recruits;
	}

	@Override
	public String toString() {
		for (int i = this.st.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (st[j] == null) {
					Student tmp = st[j];
					st[j] = st[j + 1];
					st[j + 1] = tmp;
				}
			}
		}
		for (int i = this.st.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (st[j] != null & st[j + 1] != null)
					if (st[j].getSecondName().compareToIgnoreCase(st[j + 1].getSecondName()) > 0) {
						Student tmp = st[j];
						st[j] = st[j + 1];
						st[j + 1] = tmp;
					}
			}
		}
		return "Group " + Arrays.toString(st);
	}

}
