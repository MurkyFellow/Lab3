/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructureslab3;

import java.util.Scanner;

/**
 *
 * @author 000728303
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(100);
        int m = sc.nextInt();
        while (m!=0){
            stack.push(m);
            m = sc.nextInt();
        }
        while(!stack.isEmpty()){
            int p = stack.pop();
            System.out.printf("%d", p);
        }
        System.out.println();
    }
}
