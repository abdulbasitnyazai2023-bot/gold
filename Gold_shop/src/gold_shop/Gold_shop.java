import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Gold_shop {

    // د ډیټابېس مسیر (Path)
    private static final String DB_URL =
            "jdbc:sqlite:backenjjjjjhd.db";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            // SQLite Driver Load
            Class.forName("org.sqlite.JDBC");

            conn = DriverManager.getConnection(DB_URL);
            System.out.println("✅ Database Connected Successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("❌ SQLite Driver Not Found");
        } catch (SQLException e) {
            System.out.println("❌ Database Connection Failed");
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public static void main(String[] args) {
        getConnection();
    }
}