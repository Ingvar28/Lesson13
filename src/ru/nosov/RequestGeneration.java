package ru.nosov;

import javax.annotation.PostConstruct;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Scanner;


public class RequestGeneration {

    private static String queryURL;
    private static String query;



    public static String generateQuery() {

        try {
            queryURL += "\"" + scan() + "\"";
//        System.out.println("Before Encoding: " + queryURL);
            queryURL = URLEncoder.encode(queryURL, "UTF-8");
//        System.out.println("After Encoding: " + queryURL);
        } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
        }
        return queryURL;
    }

    public static String scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите поисковой запрос для WiKi");
        query = scanner.nextLine();
        return query;
    }
}
