package day49_Collections_continue;

import java.util.*;

public class SetPractices {

    public static void main(String[] args) {

        Set<Integer> hashSet= new HashSet<>();
        hashSet.addAll(Arrays.asList(10,20,200,300,50));
        hashSet.addAll(Arrays.asList(10,20,200,300,50));
        hashSet.addAll(Arrays.asList(10,20,200,300,50));
        hashSet.addAll(Arrays.asList(null,null,null));

        System.out.println(hashSet);

        Set<Integer> linkedHashSet= new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10,20,200,300,50));
        linkedHashSet.addAll(Arrays.asList(10,20,200,300,50));
        linkedHashSet.addAll(Arrays.asList(10,20,200,300,50));
        linkedHashSet.addAll(Arrays.asList(null,null,null));

        System.out.println(linkedHashSet);

        Set<Integer> treeSet=new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,20,200,300,50));
        treeSet.addAll(Arrays.asList(10,20,200,300,50));
        treeSet.addAll(Arrays.asList(10,20,200,300,50));
        // treeSet.addAll(Arrays.asList(null,null,null)); NullPointerException

        System.out.println(treeSet);
    }

}
