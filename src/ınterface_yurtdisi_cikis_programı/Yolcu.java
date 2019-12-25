
package ınterface_yurtdisi_cikis_programı;

import java.util.Scanner;

public class Yolcu implements Yurt_disi_kuralları{
    
    private  int Harc;
    private  boolean Siyasiyasak;
    private boolean Vizedurum;
    
    public Yolcu(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Yatırdığınız harç bedeli:");
        this.Harc=scanner.nextInt();
        scanner.nextLine();
        System.out.println("yurt dışı yasağınız bulunuyormu(evet yada hayır):");
        String cevap;
        cevap=scanner.nextLine();
        
        if (cevap.equals("evet")) {
            
            this.Siyasiyasak=true;
            
        }else{
            this.Siyasiyasak=false;
        }
        System.out.println("Vizeniz varmı(evet yada hayır):");
        String cevap2=scanner.nextLine();
        if (cevap2.equals("evet")) {
            this.Vizedurum=true;
            
        }else{
            this.Vizedurum=false;
        }
        
    }

    @Override
    public boolean yurtdisi_harci() {
        if (this.Harc<15) {
            
            System.out.println("lütfen yurt dışı harcınızı tam yatırınız...");
            return  false;
        }else{
            System.out.println("yurt dışı harcı işlemi taman.");
            return true;
        }
    }

    @Override
    public boolean siyasi_yasak() {
        if (this.Siyasiyasak==true) {
            
            System.out.println("siyasi yasağınız bulunuyor çıkış işlemi yapamazsınız");
            return false;
            
        }else{
            System.out.println("siyasi yasğınız bulunmuyor");
            return true;
        }
    }

    @Override
    public boolean vize_durumu() {
        if (this.Vizedurum==true) {
            System.out.println("vize işlemleriniz tamam ");
            return true;
        }else{
            System.out.println("vizeniz bitmiştir yenilemeniz gerekir");
            return false;
        }
        
    }
    
}
