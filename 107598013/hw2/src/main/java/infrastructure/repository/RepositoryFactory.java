package infrastructure.repository;

import com.mysql.cj.jdbc.MysqlDataSource;
import core.boundary.require.ICourseRepository;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class RepositoryFactory {
    public ICourseRepository createCourseRepository() {
        return new MysqlCourseRepository(getDataSource());
    }

    private DataSource getDataSource() {
        Properties props = new Properties();
        try {
            InputStream is = this.getClass().getResourceAsStream("db.properties");
            props.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl(props.getProperty("jdbc.url"));
        dataSource.setUser(props.getProperty("jdbc.username"));
        dataSource.setPassword(props.getProperty("jdbc.password"));
        return dataSource;
    }
}