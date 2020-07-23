package abstractClass;

public class Main {

    public static void main(String args[]){

        MyLinkedList  list = new MyLinkedList(null);
        list.traverse(list.getRoot());
        MyLinkedList list2 = new MyLinkedList(null);


        String stringData = "Andreea Diana Caludia Maria Ioana Roxana  Adriana Oana Rodica Andreea ";
        String[] data = stringData.split(" ");
        String stringData2 = "5 7 5 3 4 8 9 1 2 3 8 5 7 0 10 11 12 33 22 55 44 99 ";
        String[] data2 = stringData2.split(" ");
        for(String s: data){
               list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());

        System.out.println("Second set of data ");
        for(String s: data2){
            list2.addItem(new Node(s));
        }
        list2.traverse(list2.getRoot());
        list2.removeItem(new Node(3));
        list2.traverse(list2.getRoot());

        list2.removeItem(new Node(5));
        list2.traverse(list2.getRoot());

        list2.removeItem(new Node(0));
        list2.removeItem(new Node(4));
        list2.removeItem(new Node(2));
        list2.traverse(list2.getRoot());

        list2.removeItem(new Node(9));
        list2.traverse(list2.getRoot());

        list2.removeItem(new Node(8));
        list2.traverse(list2.getRoot());

        list2.removeItem(new Node(1));
        list2.traverse(list2.getRoot());
    }

}
