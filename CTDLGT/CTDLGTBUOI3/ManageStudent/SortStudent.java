package CTDLGTBUOI3.ManageStudent;

import java.util.Comparator;

public class SortStudent implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        var nameSort = o1.getFullName().compareTo(o2.getFullName());
        if (nameSort != 0) {
            return nameSort;
        } else {
            var gpaCompare = Integer.compare(o2.getAge(), o1.getAge());
            if (gpaCompare != 0) {
                return gpaCompare;
            } else {
                return o2.getFullName().compareTo(o1.getFullName());
            }
        }
    }
}
