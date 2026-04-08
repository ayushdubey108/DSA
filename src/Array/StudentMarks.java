package Array;

public class StudentMarks {
    public static void main(String[] args) {
       int[] marks= {100,90,85,21,7,99,14};
       for(int i=0;i<marks.length;i++){
           if(marks[i]<35)
               System.out.print(i+" ");
       }
    }
}
