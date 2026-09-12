import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /* PART A  */
        int[] test1 = {8, 3, 12, 5};
        int[] test2 = {5};
        int[] test3 = {-10, -4, -20};

        System.out.println(findHighest(test1));
        System.out.println(findHighest(test2));
        System.out.println(findHighest(test3));

        /* PART B  */
        int[] a = {10, 20, 30};
        int[] b = a;

        b[0] = 99;

        System.out.println(a[0]);
        System.out.println(b[0]);

        int[] c = Arrays.copyOf(a, a.length);

        c[0] = 555;

        System.out.println(a[0]);
        System.out.println(c[0]);

        /* PART C */
        Student s1 = new Student("V123456", "Amina Rahman", 86.5);
        System.out.println(s1);

        /* PART E */
        Student[] students = {
                new Student("V100001", "Amina", 86.5),
                new Student("V100002", "Daniel", 72.0),
                new Student("V100003", "Sofia", 91.0)
        };

        System.out.println(calculateAverage(students));
        System.out.println(findStudent(students, "V100002"));
        System.out.println(findStudent(students, "V999999"));
        System.out.println(findStudent(students, "V100001"));

        /* PART F */
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("V100001", "Amina", 86.5));
        studentList.add(new Student("V100002", "Daniel", 72.0));
        studentList.add(new Student("V100003", "Sofia", 91.0));
        studentList.add(new Student("V100004", "Liam", 65.0));
        studentList.add(new Student("V100005", "Nora", 78.5));

        System.out.println(findStudent(studentList, "V100003"));
        System.out.println(findStudent(studentList, "V999999"));
        System.out.println(countAbove(studentList, 80.0));


        // ============ PART A ============
/*
     What is wrong with: int highest = 0; if the array is: {-10, -4, -20}
     The highest value never changes, it stays 0 forever. Even if 0 wasn't in the actual numbers in the array,
     the method would incorrectly return 0 when it should be returning the highest number. Which
     in this case is -4.
 */

    }

    public static int findHighest(int[] values) {
        int highest = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > highest) {
                highest = values[i];
            }
        }

        return highest;
    }

    // ============ PART B ============
  /*
    1. What prints?
    a[0] -> 99 and b[0] -> 99, both print the same number.
    2. Why?
    Because a and b are two names of the same array. So that means changing it through
    one name changes it for both.
    3. Are a and b two arrays?
    No, they are just one array with two references pointing at it.
    4. Draw a small reference diagram.
    a ──┐
        ├──→ [99, 20, 30]   ← changed, and BOTH a and b see this same array
    b ──┘
    5. How would you create an independent copy?
    You will need a separate array and not just another name for the same one.
    You really need a brand new separate array with its own value or same value copied over.
*/
    // ============ PART E ============

    public static double calculateAverage(Student[] students) {
        double sum = 0;

        for (int i = 0; i < students.length; i++) {
            sum += students[i].getAverage();
        }
        return sum / students.length;

    }

    public static Student findStudent(Student[] students, String id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId().equals(id)) {
                return students[i];
            }

        }

        return null;
    }
    // ============ PART F ============

    public static Student findStudent(ArrayList<Student> students, String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                return students.get(i);
            }
        }
        return null;
}
    public static int countAbove(ArrayList<Student> students, double threshold) {
        int count = 0;

        for(int i = 0; i < students.size(); i++) {
            if(students.get(i).getAverage() > threshold) {
                count++;
            }
        }
        return count;
    }

    /*
    // ============ PART G=========== //
    1.An array because we need exactly 30 computer stations.
    2.An arraylist since we have to remove or add members to the club.
    3.Arraylist since we don't know the amount of students.
    4.Array since there's a fixed amount of days in a week (7).
    5.Arraylist because we could change the amount of students enrolled for the next semester.
     */
}