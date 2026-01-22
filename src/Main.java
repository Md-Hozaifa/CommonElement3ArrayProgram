//This program is used to find out the common element from the three array.
//But array should be sorted .


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Declared and Initialized array
        int arr1[]={2,4,8,10};
        int arr2[]={2,3,4,8,10,16};
        int arr3[]={2,8,10,40};


//        Using collection to add common element from the list
        ArrayList<Integer> arrayList=new ArrayList<>();

//        Declared pointer to point element in the array.
        int x=0,y=0,z=0;

//        lgoic to find out the common element

        while (x<arr1.length && y<arr2.length && z<arr3.length){


            if(arr1[x]==arr2[y] && arr2[y]==arr3[z]){
                arrayList.add(arr1[x]);
                x++;
                y++;
                z++;
            }
            else if(arr1[x]<arr2[y]){
                x++;

            }
            else if(arr2[y]<arr3[z]){
                y++;
            }else {
                z++;
            }
        }

        System.out.println("Common Element are :"+arrayList);
    }
}