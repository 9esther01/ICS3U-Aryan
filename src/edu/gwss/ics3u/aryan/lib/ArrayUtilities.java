package edu.gwss.ics3u.aryan.lib;

/**
 * @author Mr. Muir; 2013-14
 */
public interface ArrayUtilities {
    
    abstract int[] copyArray( int[] data );
    abstract int[][] copyArray( int[][] data );
    abstract double[] copyArray( double[] data );
    abstract double[][] copyArray( double[][] data );    
    abstract String[] copyArray( String[] data );
    abstract String[][] copyArray( String[][] data );
    
    abstract void displayArray( int[] data );
    abstract void displayArray( double[] data );
    abstract void displayArray( String[] data );

    abstract void displayArray( int[][] data );
    abstract void displayArray( double[][] data );
    abstract void displayArray( String[][] data );
    
    abstract void swap( int[] data, int i, int j);
    abstract void swap( int[][] data, int rowI, int colI, int rowJ, int colJ );

    abstract void swap( double[] data, int i, int j);
    abstract void swap( double[][] data, int rowI, int colI, int rowJ, int colJ );
    
    abstract void swap( String[] data, int i, int j);
    abstract void swap( String[][] data, int rowI, int colI, int rowJ, int colJ );
    
    abstract void bubbleSort( int[] data );
    abstract void selectionSort( int[] data );
    
    
    abstract void bubbleSort( double[] data );
    abstract void selectionSort( double[] data );
    
    abstract void bubbleSort( String[] data );
    abstract void selectionSort( String[] data );
    
    abstract int linearSearch( int[] data, int searchValue);
    abstract void binarySearch( int[] data, int searchValue );
    
    abstract int linearSearch( double[] data, double searchValue);
    abstract void binarySearch( double[] data, int searchValue);
    
    abstract int linearSearch(String[] data, String searchValue);
    abstract void binarySearch( String[] data, String searchValue );
    
    abstract int findMaximumValue( int[] data );
    abstract double findMaximumValue( double[] data );
    
    abstract int findIndexOfMaximumValue( int[] data );
    abstract int findIndexOfMaximumValue( double[] data );
    
    abstract int findMinimumValue( int[] data );
    abstract double findMinimumValue( double[] data );
    
    abstract int findIndexOfMinimumValue( int[] data );
    abstract int findIndexOfMinimumValue( double[] data );
    
    abstract int findMaximumValue( int[][] data );
    abstract double findMaximumValue( double[][] data );
    
    abstract int findIndexOfMaximumValue( int[][] data );
    abstract int findIndexOfMaximumValue( double[][] data );
    
    abstract int findMinimumValue( int[][] data );
    abstract double findMinimumValue( double[][] data );
    
    abstract int findIndexOfMinimumValue( int[][] data );
    abstract int findIndexOfMinimumValue( double[][] data );
    
    abstract double findAverage( int[] data );
    abstract double findAverage( double[] data );
    abstract double findAverage( int[][] data );
    abstract double findAverage( double[][] data );
 
    abstract double findSum( int[] data );
    abstract double findSum( double[] data );
    abstract double findSum( int[][] data );
    abstract double findSum( double[][] data );

}
