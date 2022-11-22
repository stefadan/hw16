package com.fasttrackit.firstSpring;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CountryReader {
    protected static List<Country> readFileBuffered() throws IOException, IOException {
        System.out.println("Buffered read:");
        String line;
        int i=0;
        ArrayList<Country> result = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader
        ("C:\\AFastTrack\\Proiecte\\firstSpring\\src\\main\\resources\\countries2.txt"));
        while ((line = bufferedReader.readLine()) != null) {
            i++;
            //System.out.println(i+" "+line);
            result.add(quoteFromLine(i, line));
        }
        //System.out.println("size="+result.size());
        return result;
    }

    private static Country quoteFromLine(int i, String line) {
        String token5 = "";
        String[] tokens = line.split(Pattern.quote("|"));
        //System.out.println(i+" "+tokens[0]+" "+tokens[1]+" "+tokens[2]+" "+tokens[3]+" "+tokens[4]);
        //System.out.println("lungimea "+tokens.length);

        if (tokens.length == 6){
            token5 = tokens[5];
        }
        return new Country(i, tokens[0], tokens[1],
                        Long.valueOf(tokens[2]).longValue(),
                        Integer.valueOf(tokens[3]).intValue(),
                        tokens[4], token5);
            }
    }


