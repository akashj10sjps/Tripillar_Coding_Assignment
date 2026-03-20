package com.tripillar_coding_assignment.module12;

import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueueSolution {
    public static void main(String[] args) {
        Queue<String> printerQueue=new LinkedList<>();
        System.out.println("Adding jobs to the printer queue");
        printerQueue.add("document 1");
        printerQueue.add("Photo");
        printerQueue.add("document 2");
        System.out.println("Current queue is :"+printerQueue);
        while (!printerQueue.isEmpty()) {
            System.out.println("Next Job: "+printerQueue.peek());
            String currentJob=printerQueue.poll();
            System.out.println("Printing :"+currentJob+"...Done");
        }
        if(printerQueue.isEmpty()){
            System.out.println("all jobs completed .Printer Queue is empty");
        }
    }
}
