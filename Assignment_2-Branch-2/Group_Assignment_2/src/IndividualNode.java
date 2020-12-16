public class IndividualNode<N> {

    public IndividualNode<N> next = null;
    public N contents;

    public N getContents() {
        return contents;
    }

    public void setContents(N c) {
        this.contents = c;
    }
}
