package abstractClass;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root == null){
            this.root = item;
            return  true;
        }
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = (currentItem.compareTo(item));
            if (comparison< 0){
                // item is greater move to right if it;s possible
                if(currentItem.next() != null){
                    currentItem= currentItem.next();
                }else{
                    // no next insert at the end of the list
                    currentItem.setNext(item).setPrevious(currentItem);
                    return true;
                }
            }
            else if (comparison >0 ){
                // item is less, insert before
                if (currentItem.previous() != null){
                    currentItem.previous().setNext(item);
                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);

                }else{
                    // the node to the previous is the root
                    item.setNext(this.root);
                    this.root.setPrevious(item);
                    this.root= item;

                }
                return true;
            }
            else{
                   // equal
                System.out.println(item.getValue() + " already exist");
                return false;
            }
        }
         return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null){
            System.out.println("Deleting item :" + item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(item);
            if (comparison == 0 ){
                //Found an item to delete
                if (currentItem == this.root){
                    this.root = currentItem.next();
                }else{
                    currentItem.previous().setPrevious(currentItem.next());
                    if (currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return  true;
            }
            else if(comparison < 0){
                currentItem =  currentItem.next();
            }
            else{
                // comparison is greater >0
                // we are at the item greater than the one to be deleted
                //item is not in the list
                return  false;
            }
        }
        //We have reach the end of the list without finding th item
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null){
            System.out.println("List is empty");
        }else {
            while (root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }


    }
}
