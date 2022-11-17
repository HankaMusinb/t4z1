package ba.unsa.etf.rpr;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class LaptopDaoXMLFile implements LaptopDao {
    private File file;
    private ArrayList<Laptop> laptopi;

    public LaptopDaoXMLFile(){
        laptopi = new ArrayList<>();
        file = new File("zadatak4.xml");
    }

    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) throws IOException {
        laptopi.add(laptop);
        ObjectMapper xmlmapper = new XmlMapper();
        String izlaz = xmlmapper.writeValueAsString(laptopi);
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(izlaz.getBytes());
        fos.close();

    }

    @Override
    public Laptop getLaptop(String procesor) {
        for(Laptop x: laptopi){
            if(x.getProcesor().equals(procesor)) return x;
        }
        throw new NeodgovarajuciProcesorException("Laptop s navedenim procesorom ne postoji");
    }

    @Override
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() throws FileNotFoundException, IOException {
       ArrayList lista = new ArrayList();
       try {
           lista = (new ObjectMapper()).readValue(file, new TypeReference<ArrayList>() {

           });
       }catch (IOException izuzetak){
           izuzetak.printStackTrace();
       }
       return lista;
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {
        this.laptopi = laptopi;

    }
}
