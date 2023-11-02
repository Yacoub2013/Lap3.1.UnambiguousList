package UnambiguousList;

public class MailClass {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.addToStart(15);
        list.addToStart(25);
        list.add(7);
        list.add(11);
        list.add(54);
        list.remove(7);

        System.out.println("First element= "+ list.getFirst());
        System.out.println("Last element= "+ list.getToLast());
        System.out.println("Get and delete first element= "+ list.getAndFirstFirst());
        System.out.println("Get and delete last element= "+list.getEndDeleteToLast());
        System.out.println("Validate = "+list.validity(15));
        System.out.println("isEmpty = "+list.isEmpty());
;
      System.out.println(list);

    }
}
