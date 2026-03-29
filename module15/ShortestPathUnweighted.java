package com.tripillar_coding_assignment.module15;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathUnweighted {
    static LinkedList<Integer>[] adj;

    static void shortest(int start){
        int dist[]=new int[adj.length];
        Arrays.fill(dist,-1);

        Queue<Integer> q=new LinkedList<>();
        dist[start]=0;
        q.add(start);

        while(!q.isEmpty()){
            int node=q.poll();

            for(int n:adj[node]){
                if(dist[n]==-1){
                    dist[n]=dist[node]+1;
                    q.add(n);
                }
            }
        }

        for(int i=0;i<dist.length;i++){
            System.out.println(start+" to "+i+" = "+dist[i]);
        }
    }

    public static void main(String[] args){
        int v=5;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++) adj[i]=new LinkedList<>();
        adj[0].add(1);
        adj[0].add(2);
        adj[1].add(3);
        adj[2].add(4);
        shortest(0);
    }
}
