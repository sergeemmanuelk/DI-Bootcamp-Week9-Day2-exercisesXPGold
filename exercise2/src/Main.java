public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(11);
        list.insert(11);
        list.insert(11);
        list.insert(21);
        list.insert(43);
        list.insert(43);
        list.insert(60);

        System.out.print("Original List: ");
        list.display();

        list.removeDuplicates();

        System.out.print("List after removing duplicates: ");
        list.display();
    }
}