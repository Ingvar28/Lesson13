package ru.nosov;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }

    private static void searchAddresses() {
        new Thread("search-address") {
            public void run() {
                try {
                    String queryUrl = RequestGeneration.generateQuery();
                    String jsonData = ServerRequest.requestData(queryUrl);
                    List<Place> places = extractPlaces(jsonData);
                    downloadListener.onDownload(places);
                } catch (Exception ex) {
                    downloadListener.onError();
                }
            }
        }.start();


}
