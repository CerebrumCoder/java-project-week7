public class Exercise10_07 {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        Address address1 = new Address("Jalan 1", 1, "Kelurahan 1", "Kecamatan1", "Kota1", "Provinsi1", "11111");
        Address address2 = new Address("Jalan 2", 2, "Kelurahan 2", "Kecamatan2", "Kota2", "Provinsi2", "22222");
        Address address3 = new Address("Jalan 3", 3, "Kelurahan 3", "Kecamatan3", "Kota3", "Provinsi3", "33333");

        course1.addStudent("Peter Jones", address1);
        course1.addStudent("Brian Smith", address1);
        course1.addStudent("Anne Kennedy", address1);
        course1.addStudent("Susan Kennedy", address2);
        course1.addStudent("John Kennedy", address2);
        course1.addStudent("Kim Johnson", address2);
        course1.addStudent("S1", address3);
        course1.addStudent("S2", address3);
        course1.addStudent("S3", address3);
        course1.addStudent("S4", address3);
        course1.addStudent("S5", address3);
        course1.addStudent("S6", address3);
        course1.addStudent("S7", address3);

        course2.addStudent("Peter Jones", address1);
        course2.addStudent("Steve Smith", address1);

        System.out.printf("Number of students in %s: %d %n", course1.getCourseName(), course1.getNumberOfStudents());

        Student[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i].getName() + ", ");

        System.out.println();
        System.out.printf("Number of students in %s: %d%n", course2.getCourseName(), course2.getNumberOfStudents());
        System.out.println("Setelah drop Student S1");

        course1.dropStudent("S1");
        System.out.println("Numbers of students in course1: " + course1.getNumberOfStudents());
        students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i].getName() + ", ");

        course1.clear();
        System.out.println("Setelah mendrop seluruh mhs");
        System.out.println("\nNumber of students in course1: " + course1.getNumberOfStudents());

    }
}

class Student {
    private String name;
    private double ipk;
    private Address address;

    Student(String name, double ipk, Address address) {
        // this(...) is used inside a constructor to call another constructor within the
        // same class.
        this(name, address);
        this.ipk = ipk;
    }

    Student(String name, Address address) {
        this.name = name;
        this.ipk = 0.0;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public boolean equals(String name) {
        return this.getName().equals(name);
    }
}

class Address {
    String jalan;
    int noRumah;
    String kelurahan;
    String kecamatan;
    String tingkat2; // Kabupaten/Kota
    String tingkat1; // Propinsi
    String kodepos;

    Address(String jalan, int noRumah, String kelurahan, String kecamatan, String tingkat2, String tingkat1,
            String kodepos) {
        this.jalan = jalan;
        this.noRumah = noRumah;
        this.kelurahan = kelurahan;
        this.kecamatan = kecamatan;
        this.tingkat2 = tingkat2;
        this.tingkat1 = tingkat1;
        this.kodepos = kodepos;
    }
}

class Course {
    private String courseName;
    private Student[] students = new Student[2];
    private int numberOfStudents;

    public Course(String name) {
        this.courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    // public isSamaKecamatan(){
    //     /// ???
  
    // }

    public void addStudent(String student, Address address) {
        if (numberOfStudents == students.length) {
            increaseSize();
        }

        students[numberOfStudents] = new Student(student, address);
        numberOfStudents++;
    }

    private void increaseSize() {
        Student[] temp = new Student[students.length * 2];
        System.arraycopy(students, 0, temp, 0, students.length);
        students = temp;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    /** Clear the course */
    public void clear() {
        for (int i = 0; i < numberOfStudents; i++)
            students[i] = null;
        numberOfStudents = 0;
    }

    /** Remove a student from the course */
    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                // Move students[i + 1] to students[i], etc.
                for (int k = i + 1; k < numberOfStudents; k++) {
                    students[k - 1] = students[k];
                }

                numberOfStudents--;
                break;
            }
        }
    }
}