class AyamGoreng {
    private String ayam;
    private int tepung;
    private int minyak;
    
    public void setAyam(String ayamBaru) {
        ayam = ayamBaru;
    }

    public String getAyam() {
        return ayam;
    }

    public void setTepung(int tepungBaru) {
        tepung = tepungBaru;
    }

    public int getTepung() {
        return tepung;
    }

    public void setMinyak(int minyakBaru) {
        if (minyakBaru >= 0) {
            minyak = minyakBaru;
        } else {
            System.out.println("Minyak habis.");
        }
    }

    public int getMinyak() {
        return minyak;
    }
  }

public class App {
    public static void main(String[] args) {

        AyamGoreng ayamGoreng1 = new AyamGoreng();
        AyamGoreng ayamGoreng2 = new AyamGoreng();
        
        ayamGoreng1.setAyam("Paha Ayam");
        ayamGoreng1.setTepung(100);
        ayamGoreng1.setMinyak(50);

        ayamGoreng2.setAyam("Dada Ayam");
        ayamGoreng2.setTepung(150);
        ayamGoreng2.setMinyak(75);

        System.out.println("Data Pesanan Ayam Goreng 1:");
        System.out.println("Ayam: " + ayamGoreng1.getAyam());
        System.out.println("Tepung: " + ayamGoreng1.getTepung());
        System.out.println("Minyak: " + ayamGoreng1.getMinyak() + " ml");

        System.out.println("Data Pesanan Ayam Goreng 2:");
        System.out.println("Ayam: " + ayamGoreng2.getAyam());
        System.out.println("Tepung: " + ayamGoreng2.getTepung());
        System.out.println("Minyak: " + ayamGoreng2.getMinyak() + " ml");
    }
}
