package SDE_Sheet_Apna.Graph;

import java.util.*;
import java.util.Scanner;

public class Flood_Fill_LeetCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of vertices ");
        int vertices=sc.nextInt();
        System.out.println("Enter no of edges");
        int edge=sc.nextInt();
        int adj[][]=new int[vertices][];
        System.out.println("Enter no "+ edge+" edges");
        for (int i=0;i<vertices;i++) {
            adj[i] = new int[edge];
            for (int j = 0; j < edge; j++) {
                int value = sc.nextInt();
                adj[i][j] = value;
            }
        }

        int i=sc.nextInt();
        int j=sc.nextInt();
        int color= sc.nextInt();
        int arr[][]=new Flood_Fill_LeetCode().floodFill(adj,i,j,color);
        System.out.println(Arrays.deepToString(arr));
    }
    public int[][] floodFill(int[][] img, int sr, int sc, int c) {
        int srcColor=img[sr][sc];
        if (srcColor == c) {
            return img;
        }
        dfs(img,srcColor,c,sr,sc);
        return img;
    }
    public void dfs(int arr[][],int k,int key,int i,int j)
    {
        if(i<0||i>=arr.length||j<0||j>=arr[0].length)
        {
            return;
        }
        if(k!=arr[i][j])
        {
            return;
        }
        arr[i][j]=key;
        dfs(arr,k,key,i+1,j);
        dfs(arr,k,key,i-1,j);
        dfs(arr,k,key,i,j+1);
        dfs(arr,k,key,i,j-1);
    }
    public int[][] floodFill1(int[][] image, int sr, int sc, int color) {
        int source_color = image[sr][sc];
        if(source_color == color)
            return image;
        dfs(image,source_color,color,sr,sc);
        return image;
    }
    public void dfs1(int[][] image,int source_color,int color,int sr,int sc)
    {
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length)
        {
            return;
        }
        if(source_color != image[sr][sc])
        {
            return;
        }
        image[sr][sc] = color;
        dfs1(image,source_color,color,sr+1,sc);
        dfs1(image,source_color,color,sr-1,sc);
        dfs1(image,source_color,color,sr,sc+1);
        dfs1(image,source_color,color,sr,sc-1);
    }
}
