package com.bs.loop;

public class Search {


    private void binarySearch(int[] input, int search) {

        int low = 0;
        int high = input.length - 1;
        int middle = (low + high) / 2;


        while (low <= high) {
            if (search < input[middle]) {
                high = middle - 1;
            } else if (search > input[middle]) {
                low = middle + 1;
            } else {
                System.out.printf("search term found in the location %d \n", middle);
                break;
            }
            middle = (low + high) / 2;

        }

    }


    public static void main(String[] args) {

        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int searchTerm = 5;

        Search search = new Search();
        search.binarySearch(sortedArray, searchTerm);

    }
}
