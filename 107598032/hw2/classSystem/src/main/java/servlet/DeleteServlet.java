package servlet;

import dao.CourseDaoImpl;
import model.Course;
import useCase.DeleteCourseUseCase;
import useCase.ListCourseUseCase;
import useCase.UseCaseInput;
import useCase.UseCaseOutput;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/Delete")
public class DeleteServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ListCourseUseCase listCourseUseCase = new ListCourseUseCase();
        listCourseUseCase.setCourseDao(new CourseDaoImpl());
        UseCaseInput useCaseInput = new UseCaseInput(-1, "", "", "", -1, "", "");
        UseCaseOutput useCaseOutput = new UseCaseOutput();
        listCourseUseCase.execute(useCaseInput, useCaseOutput);
        if(useCaseOutput.isSuccess()) {
            request.setAttribute("courseList", useCaseOutput.getCourses());
            request.getRequestDispatcher("/WEB-INF/jsp/delete.jsp").forward(request, response);
        }
        else {
            request.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(request, response);
            System.out.println(useCaseOutput.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        CourseDaoImpl courseDaoImpl = new CourseDaoImpl();
        String[] deleteCourseId = request.getParameterValues("deleteId");
        DeleteCourseUseCase deleteCourseUseCase = new DeleteCourseUseCase();
        deleteCourseUseCase.setCourseDao(new CourseDaoImpl());
        UseCaseInput useCaseInput = new UseCaseInput(-1, "", "", "", -1, "", "");
        UseCaseOutput useCaseOutput = new UseCaseOutput();
        if(deleteCourseId != null){
            for(String id: deleteCourseId) {
                useCaseInput.setId(Integer.parseInt(id));
                deleteCourseUseCase.execute(useCaseInput, useCaseOutput);
                if(!useCaseOutput.isSuccess()){
                    request.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(request, response);
                    System.out.println(useCaseOutput.getMessage());
                }
            }
        }
        response.sendRedirect("/Delete");
    }
}
