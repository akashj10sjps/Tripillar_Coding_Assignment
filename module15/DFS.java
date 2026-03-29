package com.tripillar_coding_assignment.module15;

import java.util.LinkedList;

public class DFS {
    static LinkedList<Integer>[] adj;

    static void DFSgraph(int v,boolean visited[]){
        visited[v]=true;
        System.out.print(v+" ");

        for(int n:adj[v]){
            if(!visited[n]){
                DFSgraph(n,visited);
            }
        }
    }

    public static void main(String[] args){
        int vertices=5;
        adj=new LinkedList[vertices];
        for(int i=0;i<vertices;i++) adj[i]=new LinkedList<>();

        adj[0].add(1);
        adj[0].add(2);
        adj[1].add(3);
        adj[2].add(4);

        boolean visited[]=new boolean[vertices];
        DFSgraph(0,visited);
    }
}
