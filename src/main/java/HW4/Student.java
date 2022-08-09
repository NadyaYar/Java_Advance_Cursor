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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public void setSpecialtyId(int specialtyId) {
        this.specialtyId = specialtyId;
    }

    public void setCourse(int course) {
        this.course = course;
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
