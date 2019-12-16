package test;

import com.prac.db.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by shkstart on 2019/12/15
 */
public class TestProject {

    @Test
    public void testProject(){
        System.out.println("success");
        System.out.println("成功");
    }

    @Test
    public void testConnection() throws SQLException {
        Connection conn = JdbcUtils.getConnection();
        System.out.println(conn);
    }
}
