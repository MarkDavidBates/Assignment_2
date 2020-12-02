public class Lists<L> {


    public IndividualNode<L> head = null;

    public void addElement(L e){
        IndividualNode<L> ln = new IndividualNode<>();
        ln.setContents(e);
        ln.next = head;
        head = ln;
    }

    public void clearAll(){ //resets all lists
        head = null;
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

    public void deleteAllPolis() {
        head = null;
    }
}
