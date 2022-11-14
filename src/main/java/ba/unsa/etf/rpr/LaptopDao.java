package ba.unsa.etf.rpr;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileNotFoundException;
public interface LaptopDao {


    public void dodajLaptopUListu(Laptop laptop);
    public void dodajLaptopUFile(Laptop laptop) throws FileNotFoundException,IOException;
    public Laptop  getLaptop(String procesor);
     ArrayList<Laptop> vratiPodatkeIzDatoteke() throws FileNotFoundException, IOException;
    public void napuniListu(ArrayList<Laptop> laptopi);
}
