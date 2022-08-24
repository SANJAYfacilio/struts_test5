package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class createuser {
    private String uname1;
    private String upass1;
    private String NAME;
    private String PLACE;
    private String MOBILE;
    private String GENDER;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getPLACE() {
        return PLACE;
    }

    public void setPLACE(String PLACE) {
        this.PLACE = PLACE;
    }

    public String getMOBILE() {
        return MOBILE;
    }

    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    public void setDEPARTMENT(String DEPARTMENT) {
        this.DEPARTMENT = DEPARTMENT;
    }

    public String getEDUCATION() {
        return EDUCATION;
    }

    public void setEDUCATION(String EDUCATION) {
        this.EDUCATION = EDUCATION;
    }

    private String DEPARTMENT;
    private String EDUCATION;
    public String getUname1() {
        return uname1;
    }

    public void setUname1(String uname1) {
        this.uname1 = uname1;
    }

    public String getUpass1() {
        return upass1;
    }

    public void setUpass1(String upass1) {
        this.upass1 = upass1;
    }

   public String execute()
   {

       String query1= "insert into login values('"+uname1+"','"+ upass1 +"','"+MOBILE+"','"+PLACE+"','"+EDUCATION+"','"+GENDER+"','"+DEPARTMENT+"','"+NAME+"');";
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","19-Jun-02");
           Statement st = con.createStatement();
           System.out.println("CONNECTED");
           st.execute(query1);
           System.out.println(query1+"INSERTED");
           return "success";
       }
       catch (Exception e) {
           e.printStackTrace();
           System.out.println("NOT CONNECTED");
           return "error";
       }
   }
}
