/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalExam_TRANVOANHTU_26211229825;

/**
 *
 * @author HP
 */
public class HinhTron implements IHinhHoc{
    protected double r;
    private String name="HinhTron";
    public HinhTron(){
        
    }
    public HinhTron(double r){
        this.r=r;
    }
    public String getName(){
        return name;
    }
    public void setBanKinh(double r){
        this.r=r;
    }
    public double getBanKinh(){
        return r;
    }
    public double TinhDienTich(){
        return Math.PI*r*r;
    }
    public String toString(){
        return name+":S="+TinhDienTich();
    }
    public static void main(String[] args) {
        HinhTron a = new HinhTron(3);
        System.out.println(a);
    }
}
