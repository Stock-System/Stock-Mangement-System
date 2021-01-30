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
public class SparePartDeatilsBean {
    
    private int id;
    private String name;
    private int qty;
    private byte[] photo;
    
    public SparePartDeatilsBean(int sid, String sname, int sqty, byte [] photo)
   {
       
       this.id=sid;
       this.name=sname;
       this.qty=sqty;
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
    
    
    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.setPhoto(photo);
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


    
}

