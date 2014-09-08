package edu.gwss.ics3u.aryan.lib;

public class AryanArrayUtil implements ArrayUtilities {
    //main used for testing
    public static void main(String[] args) {
        AryanArrayUtil aau = new AryanArrayUtil();

        int[] data = new int[]{21, 5, 6, 0, 9, 12, 43, 32, 15, 4};
        
        int[][] data2D = {
            {5, 1, 3},
            {2, 8, 2}
        };

        String[] names = new String[]{"Fred", "Aryan", "Zebra", "Aaron"};
        aau.displayArray(names);
        aau.binarySearch(names, "Zebra");
        aau.displayArray(names);
    }

    /**
     * This method creates an exact duplicate of the original array.
     * @param data This is the original array that gets copied.
     * @return returns a duplicate of the array. 
     */
    public int[] copyArray(int[] data) {
        int[] copyData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            copyData[i] = (data[i]);
        }
        return copyData;
    }

    public int[][] copyArray(int[][] data) {
        int[][] copyData = new int[data.length][];
        for (int i = 0; i < data.length; i++) {
            int[] copyRow = new int[data[i].length];
            for (int j = 0; j < copyRow.length; j++) {
                copyRow[j] = data[i][j];
            }
            copyData[i] = copyRow;
        }
        return copyData;
    }

    public double[] copyArray(double[] data) {
        double[] copyData = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            copyData[i] = (data[i]);
        }
        return copyData;
    }

    public double[][] copyArray(double[][] data) {
        double[][] copyData = new double[data.length][];
        for (int i = 0; i < data.length; i++) {
            double[] copyRow = new double[data[i].length];
            for (int j = 0; j < copyRow.length; j++) {
                copyRow[j] = data[i][j];
            }
            copyData[i] = copyRow;
        }
        return copyData;
    }

    public String[] copyArray(String[] data) {
        String[] copyData = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            copyData[i] = (data[i]);
        }
        return copyData;
    }

    public String[][] copyArray(String[][] data) {
        String[][] copyData = new String[data.length][];
        for (int i = 0; i < data.length; i++) {
            String[] copyRow = new String[data[i].length];
            for (int j = 0; j < copyRow.length; j++) {
                copyRow[j] = data[i][j];
            }
            copyData[i] = copyRow;
        }
        return copyData;
    }

    /**
     * Displays the given array as a readable output. 
     * @param data This is the array that is going to be displayed. 
     */
    public void displayArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
        System.out.println();
    }

    public void displayArray(double[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public void displayArray(String[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public void displayArray(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + ", ");
            }
            System.out.println("");
        }
    }

    public void displayArray(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + ", ");
            }
            System.out.println("");
        }
    }

    public void displayArray(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + ", ");
            }
            System.out.println("");
        }
    }

    /**
     * This method swaps the position of 2 different values in an array. 
     * @param data This is the array that contains the 2 values that will be swapped. 
     * @param i This is the index of the first variable.
     * @param j This is the index of the second variable. 
     */
    public void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void swap(int[][] data, int rowI, int colI, int rowJ, int colJ) {
        int temp = data[rowI][colI];
        data[rowI][colI] = data[rowJ][colJ];
        data[rowJ][colJ] = temp;
    }

    public void swap(double[] data, int i, int j) {
        double temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void swap(double[][] data, int rowI, int colI, int rowJ, int colJ) {
        double temp = data[rowI][colI];
        data[rowI][colI] = data[rowJ][colJ];
        data[rowJ][colJ] = temp;
    }

    public void swap(String[] data, int i, int j) {
        String temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void swap(String[][] data, int rowI, int colI, int rowJ, int colJ) {
        String temp = data[rowI][colI];
        data[rowI][colI] = data[rowJ][colJ];
        data[rowJ][colJ] = temp;
    }

    /**
     * 
     * @param data
     */
    public void bubbleSort(int[] data) {
        int dataLength = data.length;

        for (int pass = 0; pass < dataLength; pass++) {
            for (int index = 1; index < (dataLength - pass); index++) {

                if (data[index - 1] > data[index]) {
                    swap(data, index - 1, index);
                }
            }
        }

    }

    public void selectionSort(int[] data) {

        for (int pass = 0; pass < data.length - 1; pass++) {
            int indexOfMin = pass;
            for (int index = pass + 1; index < data.length - pass; index++) {
                if (data[indexOfMin] < data[index]) {
                    indexOfMin = index;
                }
            }
            if (indexOfMin != pass) {
                swap(data, pass, indexOfMin);
            }
        }
    }

    public void bubbleSort(double[] data) {
        int dataLength = data.length;

        for (int pass = 0; pass < dataLength; pass++) {
            for (int index = 1; index < (dataLength - pass); index++) {

                if (data[index - 1] > data[index]) {
                    swap(data, index - 1, index);
                }
            }
        }
    }

    public void selectionSort(double[] data) {
        for (int pass = 0; pass < data.length - 1; pass++) {
            int indexOfMin = pass;
            for (int index = pass + 1; index < data.length - pass; index++) {
                if (data[indexOfMin] < data[index]) {
                    indexOfMin = index;
                }
            }
            if (indexOfMin != pass) {
                swap(data, pass, indexOfMin);
            }
        }
    }

    public void selectionSort(String[] data) {
        for (int pass = 0; pass < data.length; pass++) {
            int indexOfMin = pass;
            for (int i = pass + 1; i < data.length; i++) {
                double compareNumber = data[i].compareTo(data[indexOfMin]);
                if (compareNumber < 0) {
                    indexOfMin = i;
                }
            }
            if (indexOfMin != pass) {
                swap(data, pass, indexOfMin);
            }
        }
    }

    /**
     * This method goes through and compares the search value with array values until it finds the same value then returns the index. If it doesn't find it returns -1. 
     * @param data An array of double values. 
     * @param searchValue Value that is being searched for in the array.
     * @return returns the index of the search value in data. If it is not found it returns -1. 
     */
    public int linearSearch(double[] data, double searchValue) {
        int location = -1;
        for (int row = 0; row < data.length; row++) {
            if (searchValue == data[row]) {
                location = row;
                row = data.length;
            }
        }
        return location;

    }

    public void binarySearch(double[] data, int searchValue) {
        int index;
        index = findMidPoint(data, searchValue);
        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not Found");
        }
    }

    static int findMidPoint(double[] data, int searchValue) {
        int midPt;
        int left = 0;
        int right = data.length - 1;
        while (left <= right) {
            midPt = (left + right) / 2;
            if (data[midPt] == searchValue) {
                return midPt;
            } else if (data[midPt] < searchValue) {
                left = midPt + 1;
            } else {
                right = midPt - 1;
            }
        }
        return -1;
    }

    public int linearSearch(int[] data, int searchValue) {
        int location = -1;
        for (int row = 0; row < data.length; row++) {

            if (searchValue == data[row]) {
                location = row;
                row = data.length;
            }

        }

        return location;
    }

    public void binarySearch(int[] data, int searchValue) {
        int index;
        index = findMidPoint(data, searchValue);
        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not Found");
        }
    }

    static int findMidPoint(int[] data, int find) {
        int midPt;
        int left = 0;
        int right = data.length - 1;
        while (left <= right) {
            midPt = (left + right) / 2;
            if (data[midPt] == find) {
                return midPt;
            } else if (data[midPt] < find) {
                left = midPt + 1;
            } else {
                right = midPt - 1;
            }
        }
        return -1;
    }

    public int linearSearch(String[] data, String searchValue) {
        int location = -1;
        for (int index = 0; index < data.length; index++) {

            if (searchValue == (data[index])) {
                location = index;
                index = data.length;
            }

        }

        return location;
    }

    public int findIndexOfMaximumValue(double[] data) {
        int indexMax = 0;
        double maxValue = data[0];
        for (int i = 1; i < data.length; i++) {

            if (data[i] > maxValue) {
                indexMax = i;
                maxValue = data[i];
            }
        }
        return indexMax;
    }

    public int findMinimumValue(int[] data) {
        int min = data[0];
        for (int i = 1; i < data.length; i++) {

            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;

    }

    public double findMinimumValue(double[] data) {
        double min = data[0];
        for (int i = 1; i < data.length; i++) {

            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    public int findIndexOfMinimumValue(int[] data) {
        int indexMin = data[0];
        for (int i = 1; i < data.length; i++) {

            if (data[i] < indexMin) {
                indexMin = i;
            }
        }
        return indexMin;
    }

    public int findIndexOfMinimumValue(double[] data) {
        int indexMin = 0;
        for (int i = 1; i < data.length; i++) {

            if (data[i] < indexMin) {
                indexMin = i;
            }
        }
        return indexMin;
    }

    public int findMaximumValue(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {

            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public double findMaximumValue(double[] data) {
        double max = data[0];
        for (int i = 1; i < data.length; i++) {

            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public int findMinimumValue(int[][] data) {
        int minValue = findMinimumValue(data[0]);
        for (int row = 1; row < data.length; row++) {
            int rowMin = findMinimumValue(data[row]);
            if (rowMin < minValue) {
                minValue = rowMin;
            }

        }
        return minValue;
    }

    public int findMinimumValue(int[][] data, int indexOfColumn) {
        int indexMinValue = 0;
        for (int row = 1; row < data.length; row++) {
            if (data[row][indexOfColumn] < data[indexMinValue][indexOfColumn]) {
                indexMinValue = row;
            }

        }
        return indexMinValue;
    }

    public int findMaximumValue(int[][] data, int indexOfColumn) {
        int indexMaxValue = 0;
        for (int row = 1; row < data.length; row++) {
            if (data[row][indexOfColumn] > data[indexMaxValue][indexOfColumn]) {
                indexMaxValue = row;
            }

        }
        return indexMaxValue;
    }

    public double findMinimumValue(double[][] data) {
        double minValue = findMinimumValue(data[0]);
        for (int row = 1; row < data.length; row++) {
            double rowMin = findMinimumValue(data[row]);
            if (rowMin < minValue) {
                minValue = rowMin;
            }

        }
        return minValue;
    }

    public int findIndexOfMinimumValue(int[][] data) {
        int minValue = findMinimumValue(data[0]);
        int minIndex = findIndexOfMinimumValue(data[0]);
        for (int row = 1; row < data.length; row++) {
            int rowMin = findMinimumValue(data[row]);
            if (rowMin < minValue) {
                minValue = rowMin;
                minIndex = findIndexOfMinimumValue(data[row]);
            }

        }
        return minIndex;
    }

    public int findIndexOfMinimumValue(double[][] data) {
        double minValue = findMinimumValue(data[0]);
        int minIndex = findIndexOfMinimumValue(data[0]);
        for (int row = 1; row < data.length; row++) {
            double rowMin = findMinimumValue(data[row]);
            if (rowMin < minValue) {
                minValue = rowMin;
                minIndex = findIndexOfMinimumValue(data[row]);
            }

        }
        return minIndex;
    }

    public double findAverage(int[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum / data.length;

    }

    public double findAverage(int[][] data, int colToAverage) {
        double sum = 0;
        for (int student = 0; student < data.length; student++) {
            sum = sum + data[student][colToAverage];
        }
        return sum / data.length;

    }

    public double findAverage(double[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {

            sum = sum + data[i];
        }
        return sum / data.length;
    }

    public double findAverage(int[][] data) {
        int numOfValues = 0;
        double rowSum = 0;
        for (int row = 0; row < data.length; row++) {
            rowSum = findSum(data[row]) + rowSum;

            numOfValues = numOfValues + data[row].length;
        }
        return rowSum / numOfValues;
    }

    public double findAverage(double[][] data) {
        int numOfValues = 0;
        double rowSum = 0;
        for (int row = 0; row < data.length; row++) {
            rowSum = findSum(data[row]) + rowSum;

            numOfValues = numOfValues + data[row].length;
        }
        return rowSum / numOfValues;

    }

    public double findSum(int[] data) {
        double sum = 0;
        for (int i = 1; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum;
    }

    public double findSum(double[] data) {
        double sum = 0;
        for (int i = 1; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum;
    }

    public double findSum(int[][] data) {
        int numOfValues = 0;
        double rowSum = 0;
        for (int row = 0; row < data.length; row++) {
            rowSum = findSum(data[row]) + rowSum;

            numOfValues = numOfValues + data[row].length;
        }
        return rowSum;
    }

    public double findSum(double[][] data) {
        int numOfValues = 0;
        double rowSum = 0;
        for (int row = 0; row < data.length; row++) {
            rowSum = findSum(data[row]) + rowSum;

            numOfValues = numOfValues + data[row].length;
        }
        return rowSum;
    }

    public int findMaximumValue(int[][] data) {
        int maxValue = findMaximumValue(data[0]);
        for (int row = 1; row < data.length; row++) {
            int rowMax = findMaximumValue(data[row]);
            if (rowMax > maxValue) {
                maxValue = rowMax;
            }

        }
        return maxValue;
    }

    public double findMaximumValue(double[][] data) {
        double maxValue = findMaximumValue(data[0]);
        for (int row = 1; row < data.length; row++) {
            double rowMax = findMaximumValue(data[row]);
            if (rowMax > maxValue) {
                maxValue = rowMax;
            }

        }
        return maxValue;
    }

    public int findIndexOfMaximumValue(int[][] data) {
        int maxValue = findMaximumValue(data[0]);
        int maxIndex = findIndexOfMaximumValue(data[0]);
        for (int row = 1; row < data.length; row++) {
            int rowMax = findMaximumValue(data[row]);
            if (rowMax > maxValue) {
                maxValue = rowMax;
                maxIndex = findIndexOfMinimumValue(data[row]);
            }

        }
        return maxIndex;
    }

    public int findIndexOfMaximumValue(double[][] data) {
        double maxValue = findMaximumValue(data[0]);
        int maxIndex = findIndexOfMaximumValue(data[0]);
        for (int row = 1; row < data.length; row++) {
            double rowMax = findMaximumValue(data[row]);
            if (rowMax > maxValue) {
                maxValue = rowMax;
                maxIndex = findIndexOfMinimumValue(data[row]);
            }

        }
        return maxIndex;
    }

    public void bubbleSort(String[] data) {
        String temp;
        for (int pass = 0; pass < data.length; pass++) {
            for (int i = 0; i < data.length - 1 - pass; i++) {
                double compareNumber = data[i].compareTo(data[i + 1]);
                if (compareNumber > 0) {
                    temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                }
            }
        }
    }


    public void binarySearch(String[] data, String searchValue) {
        int index;
        index = findMidPoint(data, searchValue);
        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not Found");
        }
    }

    static int findMidPoint(String[] data, String searchValue) {
        int midPoint;
        int left = 0;
        int right = data.length - 1;

        while (left <= right) {
            midPoint = (left + right) / 2;
            double compareNumber = data[midPoint].compareTo(searchValue);
            if (compareNumber == 0) {
                return midPoint;
            } else if (compareNumber < 0) {
                left = midPoint + 1;
            } else {
                right = midPoint - 1;
            }
        }
        return -1;
    }

    public int findIndexOfMaximumValue(int[] data) {
        int indexMax = 0;
        int maxValue = data[0];
        for (int i = 1; i < data.length; i++) {

            if (data[i] > maxValue) {
                indexMax = i;
                maxValue = data[i];
            }
        }
        return indexMax;
    }

}
