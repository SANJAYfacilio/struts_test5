package login;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
public class user extends ActionSupport{

    private String uname;
    private String upass;
    private String place,mob,dept,gen,name,edu;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getUpass() {
        return upass;
    }
    public void setUpass(String upass) {
        this.upass = upass;
    }
    public Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "19-Jun-02");
        return con;
    }
    public String execute()
    {
        if ("".equals(uname) || "".equals(upass))
            return "loginerror";
        else
        {
             try
                {
                    Connection cn = connect();
                    Statement st = cn.createStatement();
                     ResultSet rs=st.executeQuery("select * from login");
                     System.out.println("CONNECTED");
                     while(rs.next())
                        {
                            if(uname.equals(rs.getString(1)) && upass.equals(rs.getString(2)))
                            {
                                System.out.println("SUCCESSFULLY LOGGED IN");
                                return "success";
                            }
                        }

                    return "loginerror";
                }
             catch (Exception e) {
                 e.printStackTrace();
                 System.out.println("NOT CONNECTED");
                 return "error";
             }
        }
    }
    public String display()
    {

        try
        {
            Connection cn = connect();
            Statement st = cn.createStatement();
            System.out.println("MODIFIED");
            ResultSet rs=st.executeQuery("select * from login where USER = '"+uname+"';");
            rs.next();
            System.out.println("NAME : "+ rs.getString(1)+"\nPLACE : "+ rs.getString(4)+"\nMOBILE : "+ rs.getString(3)+"\nGENDER : "+ rs.getString(6)+"\nEDUCATION : "+ rs.getString(5)+"\nDEPARTMENT : "+ rs.getString(7));
            place = rs.getString(4);
            mob = rs.getString(3);
            gen = rs.getString(6);
            dept =rs.getString(7);
            edu = rs.getString(5);
            name = rs.getString(8);

            System.out.println("______"+place+"-"+mob+"-"+gen+"-"+dept+"-"+edu+"-"+name);
            return "success";
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("NOT CONNECTED");
            return "error";
        }
    }
    public String setmodify()
    {

        try
        {
            Connection cn = connect();
            Statement st = cn.createStatement();
            System.out.println("MODIFIED");
            ResultSet rs=st.executeQuery("select * from login where USER = '"+uname+"';");
            rs.next();
            System.out.println("NAME : "+ rs.getString(1)+"\nPLACE : "+ rs.getString(4)+"\nMOBILE : "+ rs.getString(3)+"\nGENDER : "+ rs.getString(6)+"\nEDUCATION : "+ rs.getString(5)+"\nDEPARTMENT : "+ rs.getString(7));
            place = rs.getString(4);
            mob = rs.getString(3);
            gen = rs.getString(6);
            dept =rs.getString(7);
            edu = rs.getString(5);
            name = rs.getString(8);
            setDept(dept);getDept();
            setEdu(edu);getEdu();
            setGen(gen);getGen();
            setMob(mob);getMob();
            setPlace(place);getPlace();
            setName(name);getName();
            return "success";
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("NOT CONNECTED");
            return "error";
        }}
        public String modify() {
            try {
                Connection cn = connect();
                Statement st = cn.createStatement();
                System.out.println("MODIFIED");
                //uname = getUname();
                String query1 = "UPDATE login SET  place = '"+place+"',mobile= '"+mob+"',dept='"+dept+"', gender = '"+ gen +"', name = '"+name+"' ,education = '"+edu+"' WHERE USER = '"+uname+"';" ;
                System.out.println(query1);
                st.executeUpdate(query1);
                return "success";
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("NOT CONNECTED");
                return "error";
            }
        }
}
