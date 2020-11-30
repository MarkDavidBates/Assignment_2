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
}
