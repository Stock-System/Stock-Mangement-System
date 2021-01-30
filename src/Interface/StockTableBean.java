/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author DIL-SOFT 02
 */
public class StockTableBean {
    
    private int tid;
    private String tname;
    private String tposition;
    private int sid;
    private String sname;
    private String date;
    private String requirment;
    
    public StockTableBean (int Tid, String Tname, String Tposition, int Sid, String Sname, String Date, String Requirment)
   {
       
       this.tid=Tid;
       this.tname=Tname;
       this.tposition=Tposition;
       this.sid=Sid;
       this.sname=Sname;
       this.date=Date;
       this.requirment=Requirment;
}

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTposition() {
        return tposition;
    }

  
    public void setTposition(String tposition) {
        this.tposition = tposition;
    }

 
    public int getSid() {
        return sid;
    }


    public void setSid(int sid) {
        this.sid = sid;
    }

 
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRequirment() {
        return requirment;
    }

    public void setRequirment(String requirment) {
        this.requirment = requirment;
    }
    
}
