package adresar;

public class Záznam {
    private String jmeno, prijmeni, fotka;
    private boolean jemuz;
    private int stav;
    private Emaily emaily;

    public void predstavSe() {
        System.out.println("Výpis aktivního záznamu:");
        System.out.println("jméno: "+this.jmeno);
        System.out.println("příjmení: "+this.prijmeni);
        System.out.print("pohlaví: ");
        if (this.jemuz)
            System.out.println("muž");
        else
            System.out.println("žena");
        System.out.print("stav: ");
        switch (stav) {
            case 0: System.out.println("svobodný");
                break;
            case 1: System.out.println("ženatý/vdaná");
                break;
            case 2: System.out.println("rozvedený");
                break;
            default: System.out.println("neznámý");
                break;
        }
        System.out.println("e-maily: TODO");
        System.out.println();
    }
    
    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getFotka() {
        return fotka;
    }

    public void setFotka(String fotka) {
        this.fotka = fotka;
    }

    public boolean isJemuz() {
        return jemuz;
    }

    public void setJemuz(boolean jemuz) {
        this.jemuz = jemuz;
    }

    public int getStav() {
        return stav;
    }

    public void setStav(int stav) {
        this.stav = stav;
    }

    public Emaily getEmaily() {
        return emaily;
    }

    public void setEmaily(Emaily emaily) {
        this.emaily = emaily;
    }
    
    
}
