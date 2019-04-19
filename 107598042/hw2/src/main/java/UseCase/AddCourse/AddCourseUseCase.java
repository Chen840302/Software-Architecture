package UseCase.AddCourse;

import Domain.Course;
import Domain.CourseBase;
import UseCase.*;

public class AddCourseUseCase implements UseCase<AddCourseInput, CourseOutput> {
    private CourseBase courseBase;

    public AddCourseUseCase(CourseBase courseBase) {
        this.courseBase = courseBase;
    }




    public void execute(AddCourseInput input, CourseOutput output) {

        Course course = new Course(input.courseName,
                input.description,
                input.notes,
                input.remark,
                input.suitableObject,
                input.price);


        courseBase.createNewCourse(course);


        CourseDTO courseDTO = new CourseDTOMapper().mappingCourseDomainToCourseDTO(course);

        output.setCourseDTO(courseDTO);

        output.setCourseDTOList(new CourseDTOMapper().mappingCourseListToCourseDTOList(courseBase.fetchAllCourse()));
    }
}
