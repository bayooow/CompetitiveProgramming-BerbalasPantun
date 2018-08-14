package BerbalasPantun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Bayu Aji Firmansyah on 2018
 */

public class BerbalasPantun {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer jumlahAnakPerKelas = Integer.parseInt(br.readLine());

        Integer a [] =  Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt).toArray(Integer[]::new);

        Integer b [] =  Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt).toArray(Integer[]::new);

        Integer hasil [] = new Integer[(int) Math.pow(jumlahAnakPerKelas,2)];
        int counter =0;
        for(Integer i : a){
            for(Integer ii : b){
                hasil[counter]= i + ii;
                counter++;
            }
        }
        System.out.println(Arrays.stream(hasil)
                .mapToInt(Integer::intValue)
                .sum());
    }


}
