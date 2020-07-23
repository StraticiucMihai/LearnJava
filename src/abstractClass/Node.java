package abstractClass;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rigthLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rigthLink = item;

        return this.rigthLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;

        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null)
        {
            return ((String)super.getValue()).compareTo(item.getValue().toString());
        }
        else {
            return -1;
        }


    }
}
