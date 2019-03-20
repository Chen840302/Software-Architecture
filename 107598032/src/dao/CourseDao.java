package dao;

import model.Course;

import java.sql.SQLException;
import java.util.List;

public interface CourseDao {
    List<Course> getCourseList() throws SQLException;
    void insertCourse(Course course) throws SQLException;
    void deleteCourse(int id) throws SQLException;
    void updateCourse(Course course) throws SQLException;
}
