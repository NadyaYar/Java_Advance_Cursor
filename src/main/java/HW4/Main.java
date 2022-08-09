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
            ResultSet resultSet2 = statement.executeQuery("SELECT * FROM \"STUDENTS\" WHERE \"last_name\" LIKE 'P%'");
            List<Student> studentList = new LinkedList<>();
            while (resultSet2.next()) {
                Student student = buildStudentExpanded(resultSet2);
                studentList.add(student);
            }
            System.out.println(studentList);

            resultSet2.close();
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT DISTINCT * FROM \"SPECIALTY\" ORDER BY NAME");

            List<Specialty> specialties = new LinkedList<>();
            while (resultSet.next()) {
                Specialty specialty = buildSpecialtyName(resultSet);
                specialties.add(specialty);
            }
            System.out.println(specialties);

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM \"FACULTIES\" LIMIT 3");

            List<Faculty> faculties = new LinkedList<>();
            while (resultSet.next()) {
                Faculty faculty = buildFacultyIdName(resultSet);
                faculties.add(faculty);
            }
            System.out.println(faculties);

            resultSet.close();
            statement.close();
            connection.close();
        } catch (
                SQLException ex) {
            ex.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM \"STUDENTS\" WHERE \"course\" > ? AND \"faculty_id\" > ? AND NOT \"gpa\"< ?");

            preparedStatement.setInt(1, 1);
            preparedStatement.setInt(2, 2);
            preparedStatement.setInt(3, 80);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Student> studentList = new LinkedList<>();
            while (resultSet.next()) {
                Student student = buildStudentExpanded(resultSet);
                studentList.add(student);
            }
            System.out.println(studentList);

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM \"STUDENTS\" WHERE \"gpa\" > ? AND \"course\" > ?");

            preparedStatement.setInt(1, 85);
            preparedStatement.setInt(2, 1);

            ResultSet resultSet = preparedStatement.executeQuery();
            List<Student> studentList = new LinkedList<>();
            while (resultSet.next()) {
                Student student = buildStudentExpanded(resultSet);
                studentList.add(student);
            }
            System.out.println(studentList);

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static Student buildStudentExpanded(ResultSet resultSet) throws SQLException {
        Student student = new Student();
        student.setId(resultSet.getInt(1));
        student.setLastName(resultSet.getString(2));
        student.setFirstName(resultSet.getString(3));
        student.setFacultyId(resultSet.getInt(4));
        student.setSpecialtyId(resultSet.getInt(5));
        student.setCourse(resultSet.getInt(6));
        student.setGpa(7);

        return student;
    }


    private static Faculty buildFacultyIdName(ResultSet resultSet) throws SQLException {
        Faculty faculty = new Faculty();
        faculty.setId(resultSet.getInt(1));
        faculty.setName(resultSet.getString(2));

        return faculty;
    }

    private static Specialty buildSpecialtyName(ResultSet resultSet) throws SQLException {
        Specialty specialty = new Specialty();
        specialty.setId(resultSet.getInt(1));
        specialty.setName(resultSet.getString(2));

        return specialty;
    }
}


