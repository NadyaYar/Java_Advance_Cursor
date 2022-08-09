package HW4;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/University";
        String userName = "postgres";
        String password = "15102003n";

        try {
            DriverManager.registerDriver(new SQLServerDriver());
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
             ResultSet resultSet2 = statement.executeQuery("SELECT id FROM \"STUDENTS\"");
            List<Student> studentList = new LinkedList<>();
            while (resultSet2.next()) {
                Student student = buildStudent(resultSet2);
                studentList.add(student);
            }
            System.out.println(studentList);
            System.out.println(studentList.size());

//            resultSet.close();
            resultSet2.close();
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }


        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM \"STUDENTS\"");

            List<Student> studentList = new LinkedList<>();
            while (resultSet.next()) {
                Student student = buildStudent(resultSet);
                studentList.add(student);
            }
            System.out.println(studentList);
            System.out.println(studentList.size());

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }



    private static Student buildStudent(ResultSet resultSet) throws SQLException {
        Student student = new Student();
        student.setId(resultSet.getInt(1));
        student.setLastName(resultSet.getString(2));
        student.setFirstName(resultSet.getString(3));
        student.setFacultyId(resultSet.getInt(4));
        student.setSpecialtyId(resultSet.getInt(5));
        student.setCourse(resultSet.getInt(6));
        student.setGpa(resultSet.getInt(7));
        return student;
    }

    private static Faculty buildFaculty(ResultSet resultSet) throws SQLException {
        Faculty faculty = new Faculty();
        faculty.setId(resultSet.getInt(1));
        faculty.setName(resultSet.getString(2));
        return faculty;
    }

    private static Specialty buildSpecialty(ResultSet resultSet) throws SQLException {
        Specialty specialty = new Specialty();
        specialty.setId(resultSet.getInt(1));
        specialty.setName(resultSet.getString(2));
        return specialty;
    }
}


