package pachet1;
import pachet1.MyClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        File input = new File("C:\\Users\\User\\IdeaProjects\\Project1-testare_software\\src\\pachet1\\examen.in");
        FileWriter outputWriter = new FileWriter("C:\\Users\\User\\IdeaProjects\\Project1-testare_software\\src\\pachet1\\examen.out");
        Scanner scanner = new Scanner(input);
        Integer N = Integer.parseInt(scanner.nextLine());

        ArrayList<Integer>results = new ArrayList<>();
        String[] line = scanner.nextLine().split(" ");
        System.out.println(line.length);
        for(Integer i = 0; i < N; i++){
            results.add(Integer.parseInt(line[i]));
        }

        for(Integer i = 0; i < N; i++){
            System.out.println("result["+i+"] = "+ results.get(i));
        }

        MyClass findRealResults = new MyClass();
        String finalResults = findRealResults.find(N, results);
        outputWriter.write(String.valueOf(finalResults));

        outputWriter.close();
        scanner.close();
    }
}
