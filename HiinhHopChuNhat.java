/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalExam_TRANVOANHTU_26211229825;

/**
 *
 * @author HP
 */
public class HiinhHopChuNhat extends HinhTron{
    protected double canh2,chieucao;
    private String name="HinhHopChuNhat";

    public HiinhHopChuNhat() {
    }

    public HiinhHopChuNhat(double canh2, double chieucao, double r) {
        super(r);
        this.canh2 = canh2;
        this.chieucao = chieucao;
    }
    public String getName(){
        return name;
    }
    public double getCanh1(){
        return super.getBanKinh();
    }
    public void setCanh2(double canh2){
        this.canh2=canh2;
    }
    public double getCanh2(){
        return canh2;
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }

    public double TinhDienTich() {
        return (super.getBanKinh()*canh2)*2*chieucao;
    }     
    public String toString(){
        return name+":S="+TinhDienTich();
    }
}
