/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalExam_TRANVOANHTU_26211229825;

/**
 *
 * @author HP
 */
public class HinhChuNhat extends HinhTron{
    protected double canh2;
    private String name="HinhChuNhat";
    public HinhChuNhat(){
        
    }
    public HinhChuNhat(double canh1 ,double canh2){
        super(canh1);
        this.canh2=canh2;
    }
    public String getName(){
        return name;
    }
    public void setCanh2(double canh2){
        this.canh2=canh2;
    }
    public double getCanh1(){
        return super.getBanKinh();
    }
    public double getCanh2(){
        return canh2;
    }
    public double TinhDienTich(){
        return super.getBanKinh()*canh2;
    }
    public String toString(){
        return name+":S="+TinhDienTich();
    }
    public static void main(String[] args) {
        HinhChuNhat a = new HinhChuNhat(4,3);
        System.out.println(a);
    }
}
