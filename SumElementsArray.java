package com.company;
class get
{
    static  int [] arr ={15,6,18,4,74};
    public static int SumElement()
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
        return sum;
    }
}
public class SumElementsArray {
    public static void main(String[] args) {
            get g = new get();
        System.out.println("The Sum of element is "+g.SumElement());
    }
}
