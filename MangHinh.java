/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalExam_TRANVOANHTU_26211229825;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList; 
import java.util.Scanner; 
/**
 *
 * @author HP
 */
public class MangHinh {
    ArrayList<HinhTron> d = new ArrayList<HinhTron>(); 
    public void DocFile(String tenFile){
        try{
            File f = new File(tenFile);
            if(f.exists()){
                Scanner read = new Scanner(f);
                while(read.hasNext()){
                   Scanner line = new Scanner(read.nextLine());
                   double a,b,r;
                   r=line.nextDouble();
                   if(line.hasNextDouble()){
                       a=line.nextDouble();
                       if(line.hasNextDouble()){
                           b=line.nextDouble();
                           d.add(new HiinhHopChuNhat(a,b,r));
                       }else{
                           d.add(new HinhChuNhat(a,r));
                       }
                   }else{
                       d.add(new HinhTron(r));
                   }
                }
            }else System.out.println(" Khong ton tai file");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    //ghi file:
     public void XuatFile(String tenFile,ArrayList<HinhTron> b){
        try{
            File f = new File(tenFile);
            if(!f.exists()){
                PrintStream out = new PrintStream(f);
                for(HinhTron x:b){
                    if(x instanceof HinhChuNhat){
                        out.println(((HinhChuNhat) x).getCanh2()+" "+((HinhChuNhat) x).getCanh1());
                    }else if (x instanceof HiinhHopChuNhat){
                        out.println(((HiinhHopChuNhat) x).getCanh1()+" "+((HiinhHopChuNhat) x).getCanh2()+" "+((HiinhHopChuNhat) x).getChieucao());
                    }else{
                        out.println(x.getBanKinh());
                    }
                }
                out.close();
            }else{
                System.out.println("FILE DA TON TAI");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    //xuat:
    public void xuat(String nd){
        System.out.println(nd);
        for(HinhTron x: d)
            System.out.println("    "+x);
    }
    //get list
    ArrayList<HinhTron> getList() {
       return d;
    }
    public void output(){
        xuat("Mang Ban Dau:");
    }
    //sap xep tang dan dien tich
    public void SxTangDan(){
        HinhTron x;
        for(int i=0; i<d.size()-1; i++)
            for(int j=i+1; j<d.size(); j++)
                if(d.get(i).TinhDienTich()>d.get(j).TinhDienTich()){
                     x = d.get(i);
                     d.set(i,d.get(j));
                     d.set(j, x);
                }
    }
    //hinh tron dien tich lon nhat
    public HinhTron maxDienTich(){
       HinhTron x =null;
       double max = 0;
       for(HinhTron y:d){
           if(y instanceof HinhChuNhat){
               if(max<y.TinhDienTich()){
                   max=y.TinhDienTich();
                   x=y;
               }
           }
       }
       return x;
    }
    //them moii
    public boolean themMoi(HinhTron x){
//        for(HinhTron y:d){
//            if(y instanceof HiinhHopChuNhat){
//                if(((HiinhHopChuNhat) y).getCanh1()==((HiinhHopChuNhat) x).getCanh1() &&((HiinhHopChuNhat) y).getCanh2() ==((HiinhHopChuNhat) y).getCanh2() && ((HiinhHopChuNhat) y).getChieucao()==((HiinhHopChuNhat) y).getChieucao()){
//                    return false;
//                }
//            }else if (y instanceof HinhChuNhat) {
//                if(((HinhChuNhat) y).getCanh1()== ((HinhChuNhat) x).getCanh1() && ((HinhChuNhat) y).getCanh2() ==((HinhChuNhat) x).getCanh2() ){
//                    return false;
//                }
//            }else{
//               if(y.getBanKinh()==x.getBanKinh()){
//                   return false;
//               }
//            }
//        }
        d.add(x);
        return true;
    }
    public static void main(String[] args) {
        MangHinh a = new MangHinh();
        a.DocFile("C:\\Users\\HP\\Desktop\\CS311\\src\\main\\java\\FinalExam_TRANVOANHTU_26211229825\\text.txt");
        a.output();
    }
}
