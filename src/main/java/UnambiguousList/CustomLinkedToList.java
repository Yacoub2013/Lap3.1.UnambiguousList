package UnambiguousList;

public class CustomLinkedToList implements CustomList {
    private Node head;
    private Node tail;

    public static class Node {
        Integer date;
        Node next;
        Node previous;

        public Node(Integer date, Node previous, Node next) {
            this.date = date;
            this.next = next;
            this.previous = previous;


        }

    }

    //   1. добавление значения в начало списка:
    @Override
    public void addToStart(Integer date) {
        if (head == null) {
            head = tail = new Node(date, null, null);
        } else {
            Node temp = new Node(date, null, head);
            head.previous = temp;
            head = head.previous;
        }
    }

    //    2.извлечение значения из начала списка без его удаления из списка:
    @Override
    public Integer getFirst() {

        return head != null ? head.date : null;

    }

    //    3. извлечение значения из начала списка с удалением из списка;
    @Override
    public Integer getAndFirstFirst() {
        if (head == null) {
            return null;
        } else {
            int temp = head.date;
            head = head.next;
            return temp;
        }
    }

    //    4. добавление значения в конец списка;
    @Override
    public void add(Integer date) {
        if (head == null) {
            head = tail = new Node(date, null, null);
        } else {
            tail.next = new Node(date, tail, null);
            tail = tail.next;
        }

    }

    // 5.извлечение значения из конца списка без его удаления;
    @Override
    public Integer getToLast() {
        return tail.date;
    }


    // 6.извлечение значения из конца списка с удалением;
    @Override
    public Integer getEndDeleteToLast() {
        if (head == null) {
            return null;
        } else {
            int temp = tail.date;
            tail = tail.previous;
            tail.next = null;
            return temp;
        }
    }

    //  7.определение, содержит ли список заданное значение, или нет;
    @Override
    public boolean validity(Integer date) {
        if (head != null) {
            Node temp = head;
            while (temp != null) {
                if (temp.date.equals(date)) {
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }


    //  8.определение, является ли список пустым, или нет;
    @Override
    public boolean isEmpty() {
        if(head == null){
         return true;
        }else{
            return false ;
        }

    }

    //  9.печать всех значений списка;
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder("[");
//        Node temp = head;
//        while (temp != null) {
//            sb.append(temp.date);
//            if (temp.next != null) {
//                sb.append(", ");
//            }
//            temp = temp.next;
//        }
//        sb.append("]");
//        return sb.toString();
//    }



    //    10.*удаление заданного значения из списка; если значения в списке нет, то ничего проис-
//      ходить не должно;
    @Override
    public void remove(Integer date) {
        if (head != null) {
           Node temp = head;
           Node previous = head;
            while (temp != null) {
                if (temp.date.equals(date)) {
                    if (temp.equals(head)) {
                        head = previous = temp = head.next;
                        continue;
                    } else {
                        previous.next = temp.next;
                        temp = temp.next;
                    }
                }
                previous = temp;

                temp = temp != null ? temp.next : null;
            }
        }
    }

    // 11. добавление всех значений заданного массива в начало списка; порядок значений должен сохраняться — первое значение массива должно стать первым значением списка;
        public void addToAllHeadR(Integer[] array) {
            if (array != null && array.length > 0) {
                for (int i = array.length - 1; i >= 0; i--) {
                    addToStart(array[i]);
                }
            }
        }
//   12. добавление всех значений заданной коллекции в начало списка с сохранением порядка;
        public void addToAllHead(Iterable<Integer> iterable){
            if (iterable != null) {
                for (Integer date : iterable) {
                    addToStart(date);
                }
        }
        }

// 13.добавление всех значений заданного массива/коллекции (два метода) в конец списка ссохранением порядка;
public void addToAllTail(Iterable<Integer> iterable){
    if (iterable != null) {
        for (Integer date : iterable) {
            add(date);
        }
    }
}
    public void addToAllTailR(Integer[] array){
        if (array != null) {
            for (Integer date : array) {
                add(date);
            }
        }
    }

// 14.печать всех значений списка в обратном порядке ;
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node temp = tail;
        while (temp != null) {
            sb.append(temp.date);
            if (temp.previous != null) {
                sb.append(", ");
            }
            temp = temp.previous;
        }
        sb.append("]");
        return sb.toString();
    }


















    @Override
    public void print() {
        System.out.println(toString());
    }






    }




