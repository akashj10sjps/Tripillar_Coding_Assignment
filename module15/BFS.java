package com.tripillar_coding_assignment.module15;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    int V;
    LinkedList<Integer>[] adj;
    BFS(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++)
            adj[i] = new LinkedList<>();
    }
    void addEdge(int u,int v){
        adj[u].add(v);
        adj[v].add(u);
    }
    void BFS(int start){
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);
        while(!q.isEmpty()){
            int node = q.poll();
            System.out.print(node + " ");
            for(int neighbor : adj[node]){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
    }
    public static void main(String[] args){
        BFS g = new BFS(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        System.out.println("BFS Traversal:");
        g.BFS(0);
    }
}
