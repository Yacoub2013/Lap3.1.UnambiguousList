package UnambiguousList;

public class CustomLinkedList implements CustomList {
    private Node head;


    //   1. добавление значения в начало списка:
    @Override
    public void addToStart(Integer date) {
        if (head == null) {
            add(date);
        } else {
            Node temp = new Node(date);
            temp.next = head;
            head = temp;
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
        int temp = head.date;
        head = head.next;
        return temp;
    }


    //    4. добавление значения в конец списка;
    @Override

    public void add(Integer date) {
        if (head == null) {
            head = new Node(date);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(date);
        }
    }

    // 5.извлечение значения из конца списка без его удаления;
    @Override
    public Integer getToLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.date;
    }


    // 6.извлечение значения из конца списка с удалением;
    @Override
    public Integer getEndDeleteToLast() {
        if (head.next == null) {
            int temp = head.date;
            head = null;
            return temp;
        }

        Node newNode = head;
        while (newNode.next.next != null) {
            newNode = newNode.next;
        }
        int value = newNode.next.date;
        newNode.next = null;
        return value;
    }


    //  7.определение, содержит ли список заданное значение, или нет;
    @Override
    public boolean validity(Integer date) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.date == date) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //  8.определение, является ли список пустым, или нет;
    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    //  9.печать всех значений списка;
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node temp = head;
        while (temp != null) {
            sb.append(temp.date);
            if (temp.next != null) {
                sb.append(", ");
            }
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }


    //    10.*удаление заданного значения из списка; если значения в списке нет, то ничего происходить не должно;
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

    @Override
    public void print() {

    }


    private static class Node {
        Integer date; // мы не сможем работать с премитивами поэтому мы используем Integer.
        Node next;

        Node(Integer date) {
            this.date = date;

        }
    }


}













