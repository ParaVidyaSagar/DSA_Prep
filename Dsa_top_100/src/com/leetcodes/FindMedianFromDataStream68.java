package com.leetcodes;

import java.util.*;

public class FindMedianFromDataStream68 {

    public static class MedianFinder {
        private PriorityQueue<Integer> maxHeap; // smaller half
        private PriorityQueue<Integer> minHeap; // larger half

        public MedianFinder() {
            maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            minHeap = new PriorityQueue<>();
        }

        public void addNum(int num) {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());

            if (maxHeap.size() < minHeap.size()) {
                maxHeap.offer(minHeap.poll());
            }
        }

        public double findMedian() {
            if (maxHeap.size() > minHeap.size()) {
                return maxHeap.peek();
            } else {
                return (maxHeap.peek() + minHeap.peek()) / 2.0;
            }
        }
    }

    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder();

        mf.addNum(1);
        mf.addNum(2);
        System.out.println("Median: " + mf.findMedian()); // 1.5

        mf.addNum(3);
        System.out.println("Median: " + mf.findMedian()); // 2.0

        mf.addNum(4);
        System.out.println("Median: " + mf.findMedian()); // 2.5
    }
}
