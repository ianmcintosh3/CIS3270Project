package edu.gsu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.gsu.common.Admin;
import edu.gsu.common.Customer;
import edu.gsu.common.Flight;
import edu.gsu.common.Reservations;
import edu.gsu.exceptions.LoginException;
public class DBQueries {

    //MAINLY COPIED FROM VIDEO FOR NOW, WE NEED TO FIGURE OUT ANOTHER WAY

    //NOT SURE IF ITS OKAY TO USE WHAT HE HAD FOR EXAMPLE

        public static void login(Customer co) throws Exception{
            Connection connection = null;
            try {
                connection = DriverManager.getConnection
                        ("jdbc:mysql://sn1.mysql.database.azure.com:3306/sn1?useSSL=true&sslMode=REQUIRED&serverTimezone=UTC",
                                "{AZ_MYSQL_NON_ADMIN_USERNAME}",
                "{AZ_MYSQL_NON_ADMIN_PASSWORD}");
                System.out.println("Database Connected");
                // Create a statement
                PreparedStatement statement = connection.prepareStatement(Queries.LOGIN);

                statement.setString(1, co.getUsername());
                statement.setString(2, co.getPassword());

                // Execute a statement
                ResultSet resultSet = statement.executeQuery();

                int count = 0;

                // Iterate through the result and print the student names
                while (resultSet.next()) {
                    System.out.println("Number of Users:" + resultSet.getInt(1));
                    count = resultSet.getInt(1);
                }

                if (count == 0)
                    throw new LoginException("Invalid UserName or Password!");


            } catch (SQLException e) {
                // TODO Auto-generated catch block
                System.out.println(e);
                throw e;
            }
            finally {

                connection.close();
            }
        }
}

