package com.tit.stringbuffer;

public class ComparePerformance {
    public static long timeTakenByStringBuilder(StringBuilder stringBuilder){
        long start_Time = System.nanoTime();
        for(int i =1;i<=1000000;i++){
            stringBuilder.append("Hello");
        }
        long end_Time = System.nanoTime();

        return end_Time-start_Time;
    }

    public static long timeTakenByStringBuffer(StringBuffer stringBuffer){
        long start_Time = System.nanoTime();
        for(int i =1;i<=1000000;i++){
            stringBuffer.append("Hello");
        }
        long end_Time = System.nanoTime();

        return end_Time-start_Time;
    }

    public static boolean comparePerformance(long timeTakenBy_StringBuilder, long timeTakenBy_StringBuffer){
        if(timeTakenBy_StringBuilder>timeTakenBy_StringBuffer){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
     StringBuilder sb1 = new StringBuilder();
     StringBuffer sb2 = new StringBuffer();

     long timeTakenBy_StringBuilder = timeTakenByStringBuilder(sb1);
     long timeTakenBy_StringBuffer = timeTakenByStringBuffer(sb2);

     System.out.println("Time taken By StringBuilder "+ timeTakenBy_StringBuilder);
     System.out.println("Time taken By StringBuffer "+ timeTakenBy_StringBuffer);

     System.out.println(comparePerformance(timeTakenBy_StringBuilder, timeTakenBy_StringBuffer));

    }
}
