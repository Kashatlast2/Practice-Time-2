package JavaFundamentals;

import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

import java.util.Arrays;
import java.util.Scanner; 

public class Main {

    public static void main(final String[] args) {
      
    	final int SZ = 62;

        YearTotal yearTotal = new YearTotal();

        System.out.println(yearTotal);

        int[] ages = { 45, 33, 12, 26, 55 };

        YearTotal[] array = new YearTotal[SZ];
        array[0] = new YearTotal(10.0, 1955, 12.3);
        array[1] = new YearTotal(20.0, 1975, 22.0);

        System.out.println(array[0]);
        System.out.println(array[1]);

        YearTotal [] yearTotals = new YearTotal[SZ];

        int size = 0;
        String header = "";


        try {
            File file = new File("src/test/resources/csv_files/yearly.csv");
            Scanner fileIn = new Scanner(file);
            header = fileIn.nextLine();
            while (fileIn.hasNextLine()) {
                String data = fileIn.nextLine();
                String [] strArray = data.split(",");
                yearTotals [size] = new YearTotal(Double.parseDouble(strArray[0]),
                Integer.parseInt(strArray[1]),
                Double.parseDouble(strArray[2]));
                System.out.println(data);
                size++;
            }
            fileIn.close();
        } catch (FileNotFoundException e) {
            System.out.println("Failed to read the file...");
            e.printStackTrace();

        }
        System.out.println(size);
        System.out.println("Size of array:" + yearTotals.length);
        Arrays.sort(yearTotals);

        try{
            PrintStream fileStream = new PrintStream(new File("sorted.csv"));
            fileStream.println(header);
            for (YearTotal yearTotal2 : yearTotals) {
                fileStream.println(yearTotal2.toCSV());
                
            }
            fileStream.close();
        } catch(IOException e) {
            System.out.println("Failed to write");
        }
    }

}