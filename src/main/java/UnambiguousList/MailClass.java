package UnambiguousList;


import java.util.LinkedList;
import java.util.List;


public class MailClass {
    public static void main(String[] args) {
//    CustomLinkedList list = new CustomLinkedList();
       CustomLinkedToList list = new CustomLinkedToList();
          list.addToStart(15);
          list.addToStart(25);
          list.addToStart(45);
          list.add(7);
          list.add(11);
          list.add(13);
          list.add(54);
          list.add(7);
          list.remove(25);
          list.remove(7);

        Integer[] num1=new Integer[] {100,200,300,400,500};
        list.addToAllHeadR(num1);
        list.print();

        List num2 = new LinkedList();
        num2.add(2);
        num2.add(3);
        num2.add(4);
        num2.add(5);
        list.addToAllHead(num2);
        list.print();



        List num3 = new LinkedList();
        num3.add(2000);
        num3.add(3000);
        num3.add(4000);
        num3.add(5000);
        list.addToAllTail(num3);
        list.print();

        Integer[] num4=new Integer[] {111,211,311,411,511};
        list.addToAllTailR(num4);
        list.print();

        CustomLinkedToList num7= new CustomLinkedToList();
        num7.add(99999);
        num7.add(888888);
        num7.add(7777777);
        list.absorbingTheListToHead(num7);




        CustomLinkedToList num6= new CustomLinkedToList();
        num6.add(99999);
        num6.add(888888);
        num6.add(7777777);
        list.absorbingTheListToTail(num6);



//        System.out.println("First element= "+ list.getFirst());
//        System.out.println("Last element= "+ list.getToLast());
//        System.out.println("Get and delete first element= "+ list.getAndFirstFirst());
//        System.out.println("Get and delete last element= "+list.getEndDeleteToLast());
//        System.out.println("Validate = "+list.validity(15));
//        System.out.println("isEmpty = "+list.isEmpty());

          System.out.println(list);


    }
}
