package servlet;

import dao.MySqlCourseDao;
import io.UseCaseInput;
import io.UseCaseError;
import usecase.CreateCourseUseCase;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/creat")
public class CreatCourseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String coursename = request.getParameter("coursename");
        String level = request.getParameter("level");
        String price_tmp = request.getParameter("courseprice");
        int price = 0;
        if(price_tmp.length() > 0){
            price = Integer.parseInt(price_tmp);
        }
        String description = request.getParameter("coursedescription");
        String precautions = request.getParameter("precautions");
        String remarks = request.getParameter("remarks");

        UseCaseInput input = new UseCaseInput(
                0,
                coursename,
                level,
                price,
                description,
                precautions,
                remarks
        );

        UseCaseError error = new UseCaseError();
        CreateCourseUseCase createCourseUseCase = new CreateCourseUseCase(new MySqlCourseDao());
        createCourseUseCase.creat(input, error);

        if(error.hasError()){
            request.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(request, response);
            log(error.getErrorMessage());
        }else {
            response.sendRedirect("/list");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/creat.jsp").forward(request, response);
    }
}
