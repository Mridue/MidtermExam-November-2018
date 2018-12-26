package databases;

import org.testng.Assert;

public class UnitTestConnectDB {
    public static void main(String[] args) throws Exception {
        ConnectToSqlDB con = new ConnectToSqlDB();
        Assert.assertEquals(con.readDataBase("car", "info"), con.readDataBase("car", "info"));
        ConnectToMongoDB mon = new ConnectToMongoDB();
        Assert.assertEquals(mon.readUserProfileFromMongoDB(), "User");

    }
}
