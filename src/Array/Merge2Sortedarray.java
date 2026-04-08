package Array;

public class Merge2Sortedarray {
    public static void main(String[] args) {
        int[] a = {2,5,6,8,20};
        int[] b = {1,3,4,5,7,8};

        int[] c = new int[a.length+b.length];
        for(int ele : c) System.out.print(ele+" ");
        System.out.println();
        merge(c,a,b);
        for(int ele : c) System.out.print(ele+" ");
        System.out.println();
    }
    private static void merge(int[] c, int[] a, int[] b) {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k] = a[i];
                i++;
            }
            else{
                c[k] = b[j];
                j++;
            }
            k++; // isko andr bhi likh skte the dono i aur j ++ wale sath pr joki ye common isiliye niche bhi likh skte h
        }
        if(i==a.length) {// a array khatam --> b ke bache hue ele lelo!!
            while (j < b.length) {
                c[k++] = b[j++];
            }
        }
        if(j==b.length) {// b array khatam --> a ke bache hue ele lelo!!
            while (i < a.length) {
                c[k++] = a[i++];
            }
        }
    }
}
