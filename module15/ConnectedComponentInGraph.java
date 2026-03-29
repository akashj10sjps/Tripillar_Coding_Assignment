package com.tripillar_coding_assignment.module15;

import java.util.LinkedList;

public class ConnectedComponentInGraph {
    static LinkedList<Integer>[] adj;

    static void DFS(int v,boolean visited[]){
        visited[v]=true;

        for(int n:adj[v]){
            if(!visited[n]){
                DFS(n,visited);
            }
        }
    }

    public static void main(String[] args){
        int v=6;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++) adj[i]=new LinkedList<>();

        adj[0].add(1);
        adj[1].add(0);
        adj[2].add(3);
        adj[3].add(2);

        boolean visited[]=new boolean[v];
        int count=0;
        for(int i=0;i<v;i++){
            if(!visited[i]){
                DFS(i,visited);
                count++;
            }
        }
        System.out.println("Connected components = "+count);
    }
}
