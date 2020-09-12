
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class enkapsulasi{
    private String nama;
    private int umur;
    private String kelas;
public int get_umur(){//membaca umur
    return umur;
}
public String get_nama(){//membaca umur
    return nama;
}
public String get_kelas(){//membaca kelas
    return kelas;
}
public void set_umur(int umur_baru){
    umur=umur_baru;
}
public void set_nama(String nama_baru){
    nama=nama_baru;
}
public void set_kelas(String kelas_baru){
    kelas=kelas_baru;
}
}
public class main{

    public static void main(String [] args){ 
        enkapsulasi obj=new enkapsulasi();
        obj.set_nama("koko");
        obj.set_umur(18);
        obj.set_kelas("XII RPL");
        
        System.out.println("nama: "+obj.get_nama());
        System.out.println("umur: "+obj.get_umur());
        System.out.println("kelas: "+obj.get_kelas());
        
    }
}