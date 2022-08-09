package HW4;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int facultyId;
    private int specialtyId;
    private int course;
    private int gpa;

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public int getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(int specialtyId) {
        this.specialtyId = specialtyId;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", facultyId=" + facultyId +
                ", specialtyId=" + specialtyId +
                ", course=" + course +
                ", gpa=" + gpa +
                '}';
    }
}
