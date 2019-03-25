package kh.itstep.java.les8;

import kh.itstep.java.les7.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CSVExample {
    private List<Person> people = new ArrayList<>();

    private List<Person> readFile(String path) {
        List<Person> persons = new ArrayList<>();
        FileReader fr = null;
        try {
            fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line="";
            while((line = br.readLine()) != null) {
                //todo: parse line
                String values[] = line.split(",");
//                persons.add(new Person(values));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (fr != null) fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return persons;
    }

    private void writeToFile(List<Person> persons) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("lines1.txt");
            for (Person person : persons) {
//                fw.write(person.toCSV());
            }
        } catch (IOException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fw != null) fw.close();
            } catch (IOException ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {

    }
}
