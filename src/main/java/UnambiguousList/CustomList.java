package UnambiguousList;

public interface CustomList {
    void addToStart(Integer date);
    Integer getFirst();
    Integer getAndFirstFirst();
    void add(Integer date);
    Integer getToLast();
    Integer getEndDeleteToLast();
    boolean validity(Integer date);
    boolean isEmpty ();
    String toString();
    void remove(Integer date);
    void print();

}
