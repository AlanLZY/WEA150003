package com.um;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File file = new File("./src/numbers.txt");
        int []numbers = new int[9];
        int i = 0;
        String j;
        String temp;

        while (file.exists()){
            try(Scanner fileReader = new Scanner(file)){
                j = fileReader.nextLine().
            }
            catch (IOException e){
                e.printStackTrace();
            }
            System.out.println(numbers[8]);
        }
    }
}
