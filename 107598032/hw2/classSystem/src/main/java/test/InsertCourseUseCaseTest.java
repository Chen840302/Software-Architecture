package test;

import dao.InMemoryCourseDaoImplement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import usecase.input.insert.InsertInputImplement;
import usecase.insert.InsertUseCaseImplement;
import usecase.output.insert.InsertOutputImplement;

import static org.junit.Assert.*;

public class InsertCourseUseCaseTest {
    @Before
    public void setUp() throws Exception{

    }

    @After
    public void tearDown() throws Exception{

    }

    @Test
    public void insertCourseTest(){
        InMemoryCourseDaoImplement inMemoryCourseDao = new InMemoryCourseDaoImplement();
        InsertUseCaseImplement insertUseCase = new InsertUseCaseImplement();
        insertUseCase.setRepository(inMemoryCourseDao);
        InsertInputImplement input = new InsertInputImplement(
                0,
                "軟體架構",
                "clean architecture",
                "碩一",
                80000,
                "先修POSD、OOAD",
                "不要遲到"
        );
        InsertOutputImplement output = new InsertOutputImplement();
        insertUseCase.execute(input, output);
        assertEquals(1, inMemoryCourseDao.getCoursesSize());
    }

}
