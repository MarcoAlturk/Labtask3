package org.example;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ObtainKeyTreeMap.ObtainKeyTreeMapMain();
        CopyMappingsTreeMap.CopyMappingsTreeMapMain();
        LeastAndGreatestKeyTreeMap.LeastAndGreatestKeyTreeMapMain();
        DisplayValuesLessThanGivenKey.DisplayValuesLessThanGivenKeyMain();

        TestStack stack = new TestStack(10);
        stack.push(50);
        stack.push(10);
        stack.push(100);
        stack.push(200);
        stack.push(600);
        stack.push(1);
        stack.push(-100);
        stack.push(50);
        stack.push(8);
        stack.push(100);

        stack.print();
        stack.peek();
        stack.pop();
        System.out.println("----------");
        stack.print();

        System.out.println("-----------");

        QueueDemo q = new QueueDemo(10);
        q.enqueue(695);
        q.enqueue(17);
        q.enqueue(100);
        q.enqueue(5);
        q.print();
        q.dequeue();
        q.print();
        System.out.println("-----------");

        MyLinkedList list = new MyLinkedList();
        list.insertAtLast(10);
        list.insertAtFirst(5);
        list.insertAtLast(20);
        list.insertAnywhere(15, 2);
        System.out.println("List after insertions: " + list.viewLL());

        list.deleteFirst();
        System.out.println("List after deleting first: " + list.viewLL());

        list.deleteLast();
        System.out.println("List after deleting last: " + list.viewLL());

        list.deleteAnywhere(1);
        System.out.println("List after deleting at position 1: " + list.viewLL());

        boolean found = list.searchNode(15);
        System.out.println("Is 15 in the list? " + found);

        Set<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(3);
        hashSet1.add(5);
        hashSet1.add(6);
        hashSet1.add(7);
        hashSet1.add(8);
        hashSet1.add(9);
        hashSet1.add(10);

        Set<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(7);
        hashSet2.add(8);
        hashSet2.add(11);

        HashSetCompare.HashSetCompareMain(hashSet1, hashSet2);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        // Given number to compare
        int givenNumber = 35;

        LessThanNumTreeSet.LessThanNumTreeSetMain(numbers, givenNumber);

        PriorityQueue<Integer> originalQueue = new PriorityQueue<>();
        originalQueue.add(15);
        originalQueue.add(30);
        originalQueue.add(20);
        originalQueue.add(9);
        originalQueue.add(18);
        originalQueue.add(25);

        PriorityQueueExample.PriorityQueueExampleMain(originalQueue);

        LinkedHashSet<Cinema> cinemas = new LinkedHashSet<>();
        cinemas.add(new Cinema("Action", 8.2, 150.5, "Christopher Nolan", "2018"));
        cinemas.add(new Cinema("Drama", 7.9, 130.0, "David Fincher", "2017"));
        cinemas.add(new Cinema("Action", 9.0, 205.7, "Quentin Tarantino", "2019"));
        cinemas.add(new Cinema("Fantasy", 8.5, 180.4, "Peter Jackson", "2014"));

        // Sort by Genre
        List<Cinema> sortedByGenre = new ArrayList<>(cinemas);
        Collections.sort(sortedByGenre, new Cinema.GenreComparator());
        System.out.println("Sorted by Genre:");
        sortedByGenre.forEach(System.out::println);

        // Find the movie that made the highest profit using custom comparator
        Cinema highestProfit = Collections.max(cinemas, Comparator.comparingDouble(Cinema::getRevenue));
        System.out.println("Movie with highest profit: " + highestProfit);

        // Sort by Year
        List<Cinema> sortedByYear = new ArrayList<>(cinemas);
        Collections.sort(sortedByYear, new Cinema.YearComparator());
        System.out.println("Sorted by Year:");
        sortedByYear.forEach(System.out::println);

        // Find the total revenue of all the years using a for-loop
        double totalRevenue = 0;
        for (Cinema cinema : cinemas) {
            totalRevenue += cinema.getRevenue();
        }
        System.out.println("Total Revenue of All Years: " + totalRevenue);

        // SORTING

//        int[] array = {12, 11, 13, 5, 6, 7};
//        System.out.println("Given Array");
//
//
//        MergeSort ob = new MergeSort();
//        ob.sort(array, 0, array.length - 1);
    }
}