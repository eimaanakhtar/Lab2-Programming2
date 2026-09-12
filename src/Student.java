public class Student {
                             // ============ PART C =========== //

    private String id;
    private String name;
    private double average;

    public Student(String id, String name, double average) {
        this.id = id;
        this.name = name;
        this.average = average;
        }

    public String getId(){
        return id;
    }
    public String getName() {
        return name;
    }
    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + average;
    }

                                // ============ PART D =========== //
    /*
    I chose the same ignore invalid averages that are below zero or above 100 instead of throwing an exception so the
    program doesn't crash. The average just stays unchanged if someone tries to sit an invalid value
     */

    public void setAverage(double average) {
        if (average >= 0.0 && average <= 100.0){
            this.average = average;
        }
    }
}

