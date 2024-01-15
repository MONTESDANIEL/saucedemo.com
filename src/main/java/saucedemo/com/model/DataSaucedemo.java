package saucedemo.com.model;

public class DataSaucedemo {
    public String struser;
    public String strpassw;

    public DataSaucedemo(String struser, String strpassw) {
        this.struser = struser;
        this.strpassw = strpassw;
    }

    public String getStruser() {
        return struser;
    }

    public void setStruser(String struser) {
        this.struser = struser;
    }

    public String getStrpassw() {
        return strpassw;
    }

    public void setStrpassw(String strpassw) {
        this.strpassw = strpassw;
    }
}
