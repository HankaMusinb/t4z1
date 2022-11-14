package ba.unsa.etf.rpr;
import java.io.Serializable;
import java.util.Objects;

public class Laptop implements Serializable {
    private String brend;
    private String model;
    private Double cijena;
    private Integer ram;
    private Integer hdd;
    private Integer ssd;
    private String procesor;
    private String grafickaKartica;
    private Double velicinaEkrana;

    public Laptop(String brend, String model, Double cijena, Integer ram, Integer hdd, Integer ssd, String procesor, String grafickaKartica, Double velicinaEkrana) {
        this.brend = brend;
        this.model = model;
        this.cijena = cijena;
        this.ram = ram;
        this.hdd = hdd;
        this.ssd = ssd;
        this.procesor = procesor;
        this.grafickaKartica = grafickaKartica;
        this.velicinaEkrana = velicinaEkrana;
    }

    public Laptop(String lenovo, String ideaPad, String s, String nvidia, int hdd, double v, int i, int i1, int i2) {

    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", cijena=" + cijena +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", ssd=" + ssd +
                ", procesor='" + procesor + '\'' +
                ", grafickaKartica='" + grafickaKartica + '\'' +
                ", velicinaEkrana=" + velicinaEkrana +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.cijena, cijena) == 0 && Double.compare(laptop.velicinaEkrana, velicinaEkrana) == 0 && ram == laptop.ram && hdd == laptop.hdd && ssd == laptop.ssd && Objects.equals(brend, laptop.brend) && Objects.equals(model, laptop.model) && Objects.equals(procesor, laptop.procesor) && Objects.equals(grafickaKartica, laptop.grafickaKartica);
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getCijena() {
        return cijena;
    }

    public void setCijena(Double cijena) {
        this.cijena = cijena;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public Integer getSsd() {
        return ssd;
    }

    public void setSsd(Integer ssd) {
        this.ssd = ssd;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getGrafickaKartica() {
        return grafickaKartica;
    }

    public void setGrafickaKartica(String grafickaKartica) {
        this.grafickaKartica = grafickaKartica;
    }

    public Double getVelicinaEkrana() {
        return velicinaEkrana;
    }

    public void setVelicinaEkrana(Double velicinaEkrana) {
        this.velicinaEkrana = velicinaEkrana;
    }
}
