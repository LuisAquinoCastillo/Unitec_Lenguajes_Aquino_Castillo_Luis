/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author Luis Abraham Aquino
 */
public class Direccion {
    private int id;
    private long cp;
    private String calle;
    private String municipio;
    
    Direccion(){
    }
    Direccion(long cp,String calle,String municipio,int id){
        this.cp=cp;
        this.calle=calle;
        this.municipio=municipio;
        this.id=id;
    }

    public long getCp() {
        return cp;
    }

    public void setCp(long cp) {
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
