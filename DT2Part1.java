import java.sql.*;

class DevTech2Part1{
    public static void main (String args[]){
        try{
            Connection dbCxn=DriverManager.getConnection(
                "jdbc:mysql://localhost:53326/BoatsAndSailrs","root","dev_pair2"
            );
            String boatQuery = "select * from Boat";
            System.out.println(boatQuery);
            Statement selectFromBoat=dbCxn.createStatement();
            ResultSet rsBoat = selectFromBoat.executeQuery(boatQuery);
            while(rsBoat.next()){
                System.out.println(rsBoat.getInt(1)
                + " " + rsBoat.getString(2)
                + " " + rsBoat.getString(3)
                + " " + rsBoat.getFloat(4)
                );
            }
            dbCxn.close();
        }catch(Exception e){ System.out.println(e);}
    }
}