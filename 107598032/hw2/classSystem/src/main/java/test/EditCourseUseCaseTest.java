package test;

import dao.InMemoryCourseDaoImplement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import usecase.edit.EditUseCaseImplement;
import usecase.edit.EditUseCaseInterface;
import usecase.input.edit.EditInputImplement;
import usecase.input.edit.EditInputInterface;
import usecase.input.insert.InsertInputImplement;
import usecase.input.insert.InsertInputInterface;
import usecase.insert.InsertUseCaseImplement;
import usecase.insert.InsertUseCaseInterface;
import usecase.output.edit.EditOutputImplement;
import usecase.output.edit.EditOutputInterface;
import usecase.output.insert.InsertOutputImplement;
import usecase.output.insert.InsertOutputInterface;

import static org.junit.Assert.assertEquals;

public class EditCourseUseCaseTest {
    InMemoryCourseDaoImplement inMemoryCourseDao;
    @Before
    public void setUp() throws Exception{
        inMemoryCourseDao = new InMemoryCourseDaoImplement();
        InsertUseCaseInterface insertUseCase = new InsertUseCaseImplement();
        insertUseCase.setRepository(inMemoryCourseDao);
        InsertInputInterface input = new InsertInputImplement(
                0,
                "軟體架構",
                "clean architecture",
                "碩一",
                80000,
                "先修POSD、OOAD",
                "不要遲到"
        );
        InsertOutputInterface output = new InsertOutputImplement();
        insertUseCase.execute(input, output);
        assertEquals(1, inMemoryCourseDao.getCoursesSize());
    }

    @After
    public void tearDown() throws Exception{

    }

    @Test
    public void editCourseTest(){
        EditUseCaseInterface editUseCase = new EditUseCaseImplement();
        editUseCase.setRepository(inMemoryCourseDao);
        EditInputInterface input = new EditInputImplement(
                0,
                "軟體架構",
                "clean architecture",
                "碩一",
                8000,
                "先修POSD、OOAD",
                "不要遲到"
        );
        EditOutputInterface output = new EditOutputImplement();
        editUseCase.execute(input, output);
        assertEquals(8000, inMemoryCourseDao.getCourseById(0).getPrice());
    }
}
