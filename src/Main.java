import java.sql.*;

public class Main {
    static String URL = "jdbc:mysql://localhost:3306/prasaddb";
    static String USER_NAME = "root";
    static String PASSWORD = "MySQL@123";

    public static void createUSer(String name, String mail, String password){
        String sql = "INSERT INTO employees (id, name, mail, password) VALUES(?,?,?,?)";
        try{
            Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            PreparedStatement statement = connection.prepareStatement((sql)); {
                statement.setString(2, name);
                statement.setString(3, mail);
                statement.setString(4, password);

                int rows = statement.executeUpdate();

                if (rows > 0) {
                    System.out.println("A new employee has been inserted.");
                }
            }
        } catch (SQLException e){
                e.printStackTrace();
            }
    }

    public static void readUser() {
        String sql = "SELECT * from employees";
        try{
            Connection connection = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql); {
                System.out.println("ID\tName\t\tMail\t\tPassword");
                System.out.println("--- -------------------------------------------");

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String mail = resultSet.getString("mail");
                    String password = resultSet.getString("password");

                    System.out.printf("%d\t%-10s\t%-15s\t%-10s%n", id, name, mail, password);
                }
            }
        } catch (SQLException e){

        }
    }
    public static void main(String[] args) {

        createUSer("Prasad", "prasad2082001@gmail.com", "Prasad@123");
        createUSer("Prasad", "prasad2082001@gmail.com", "12345");
        readUser();
    }

}
