package bankSim;
import bankSim.*;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class DatabaseImplementation {

    private Connection con;
    private static DatabaseImplementation dbi;
    public void connect(){
        try {
            if(con == null){
                String dbFileName = "Accounts.sqlite3";
                Class.forName("org.sqlite.JDBC");
                con = DriverManager.getConnection("jdbc:sqlite:" + dbFileName);
//                con.setAutoCommit(false);
            }
            else {
                throw new IllegalStateException("The database manager is already connected.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    public void table() throws IllegalStateException {
        try {
            if (con == null || con.isClosed()) {
                throw new IllegalStateException("The Database Manager is not connected");
            }
            String a = "create table Accounts(accountID INTEGER PRIMARY KEY AUTOINCREMENT, accountHolderName VARCHAR(50) NOT NULL UNIQUE, Password VARCHAR(30) NOT NULL, accountAmount INTEGER NOT NULL);";
            Statement statement1 = con.createStatement();
            statement1.executeUpdate(a);
            statement1.close();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    public void addAccountHolder(String name, String password, Integer accountAmount) throws IllegalStateException, IllegalArgumentException{
        try {
            String a;
            a = String.format("""
                insert into Accounts (accountHolderName, Password, accountAmount) 
                    values ('%s', '%s', %d);
                """, name, password, accountAmount);

            Statement c = con.createStatement();
//                a = "insert into Students (studentID, password) values (";
//                a += "\"" + name + "\"" + ", ";
//                a += "\"" + password + "\"" + ") ";
            c.executeUpdate(a);
//                c.close();
        }
        catch (SQLException e){
            throw new IllegalStateException(e);
        }
    }




}
