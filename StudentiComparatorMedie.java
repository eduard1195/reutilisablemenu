package sample;

import java.util.Comparator;

public class StudentiComparatorMedie implements Comparator<Student> {

	private boolean crescator;
	StudentiComparatorMedie(boolean Comparare) {
		crescator = Comparare;
	}
	@Override
	public int compare(Student o1, Student o2) {
		if(crescator)
		{
			return Double.compare(o1.getMedie(), o2.getMedie());
		}
		else
		{
			return -Double.compare(o1.getMedie(), o2.getMedie());
		}
	}

}
