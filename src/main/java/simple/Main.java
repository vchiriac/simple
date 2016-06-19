package simple;

import sort.QuickSort;

public class Main {

    public static void main(String[] args) {

        QuickSort q = new QuickSort(15);
        System.out.println("Before Sort <<<<<<<<<<<<<<<<<<<<<");
        q.print();
        q.quicksort();
        System.out.println("After Sort > > > > > > > > > > > >");
        q.print();
        System.out.println("=======+============+=======+============+=======+============");
        QuickSort q2=new QuickSort(125);
        System.out.println("Before Sort <<<<<<<<<<<<<<<<<<<<<");
        q2.print();
        q2.quicksort();
        System.out.println("After Sort > > > > > > > > > > > >");
        q2.print();
        System.out.println("=======+============+=======+============+=======+============");
        QuickSort q3=new QuickSort(5);
        System.out.println("Before Sort <<<<<<<<<<<<<<<<<<<<<");
        q3.print();
        q3.quicksort();
        System.out.println("After Sort > > > > > > > > > > > >");
        q3.print();
    }
}
