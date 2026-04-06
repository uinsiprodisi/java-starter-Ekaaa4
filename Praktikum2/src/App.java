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

        AyamGoreng ayamGoreng = new AyamGoreng();
        
        ayamGoreng.setAyam("Ayam KFC");
        ayamGoreng.setTepung(100);
        ayamGoreng.setMinyak(50);

        System.out.println("Ayam: " + ayamGoreng.getAyam());
        System.out.println("Tepung: " + ayamGoreng.getTepung());
        System.out.println("Minyak: " + ayamGoreng.getMinyak() + " ml");
    }
}
