import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (Math.abs(o1.getGPA() - o2.getGPA()) <= 0.01) return 0;
        return o1.getGPA() > o2.getGPA() ? -1 : 1;
    }
    //отрицательный int (первый объект отрицательный, то есть меньше)
    //положительный int (первый объект положительный, хороший, то есть больший)
    //ноль = объекты равны
}
