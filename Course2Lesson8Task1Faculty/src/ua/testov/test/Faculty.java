package ua.testov.test;

import java.io.Serializable;
import java.util.Arrays;

public class Faculty implements Serializable{
private Group[] faculty=new Group[5];
private String name;

public Faculty() {
	super();
}

public Faculty(Group[] faculty) {
	super();
	this.faculty = faculty;
}

public Faculty(Group[] faculty, String name) {
	super();
	this.faculty = faculty;
	this.name = name;
}
public void addGroup(int n, Group... names) throws IllegalArgumentException {
	if (names.length > 5 - (n - 1) || n < 1)
		throw new IllegalArgumentException();
	for (int i = 0; i < names.length; i++) {
		if (faculty[n - 1] == null) {
			faculty[n - 1] = names[i];
		} else {
			System.out.print("Елемент " + (n - 1) + " не є пустим.");
		}
		n++;
	}
}
public void delGroup(int i) {
	faculty[i] = null;
}

@Override
public String toString() {
	return "Faculty [faculty=" + Arrays.toString(faculty) + ", name=" + name + "]";
}

}
