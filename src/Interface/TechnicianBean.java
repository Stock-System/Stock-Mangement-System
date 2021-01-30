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
public class TechnicianBean {
   private int id;
   private String name;
   private int pno;
   private String address;
   private String position;
   private byte[] photo;
   
   public TechnicianBean(int tid, String tname, int tpno, String taddress, String tposition, byte [] photo)
   {
       
       this.id=tid;
       this.name=tname;
       this.pno=tpno;
       this.address=taddress;
       this.position=tposition;
       this.photo=photo;
}

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }


    public void setPosition(String position) {
        this.position = position;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

}
