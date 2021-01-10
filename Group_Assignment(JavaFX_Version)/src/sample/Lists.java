package sample;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Lists<L> {


    public IndividualNode<L> head = null;

    public void addElement(L p){
        IndividualNode<L> ln = new IndividualNode<>();
        ln.setContents(p);
        ln.next = head;
        head = ln;
    }

    public String printList(String list){
        IndividualNode current = head;
        String fullList = list + "\n";

        while(current != null){
            list += current.getContents() + "\n";
            current = current.next;
        }
        return list;
    }

    public String listPoliticians(){
        if(head == null){
            return "no politicians found...";
        }
        else{
            String listOfPolis = "";
            for(IndividualNode temp = head; temp != null; temp = temp.next){
                listOfPolis = listOfPolis + temp + temp.getContents() + ": " + "\n";
            }
            return listOfPolis;
        }
    }

    public String listElections(){
        if(head == null){
            return "no elections found...";
        }
        else{
            String listOfElections = "";
            for(IndividualNode temp = head; temp != null; temp = temp.next){
                listOfElections = listOfElections + temp + temp.getContents() + ": " + "\n";
            }
            return listOfElections;
        }
    }

    public void deleteAll() {
        head = null;
    }

    /*public int deleteElection(){
        IndividualNode temp = head;
        int i = 0;
        while(i < head && temp !=null){
            temp = temp.next;
            i++;
        }
        if (temp!=null && temp.next!=null){
            temp.next=temp.next.next;
        }
        return i;
    }*/


    public void load() throws Exception{
        XStream xstream = new XStream(new DomDriver());
        ObjectInputStream is = xstream.createObjectInputStream(new FileReader("data.xml"));
        head = (IndividualNode<L>) is.readObject();
        is.close();
    }

    public void save() throws Exception{
        XStream xstream = new XStream(new DomDriver());
        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("data.xml"));
        out.writeObject(head);
        out.close();
    }
}
