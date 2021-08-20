package merinalexpackage;

import java.util.ArrayList;

class Mergeclass{
	void Merge(int[]l1,int l2[]) {
		ArrayList<Integer> l3 = new ArrayList<>();
        int i=0;int j=0;
     while (i< l1.length && j<l2.length){
         if(l1[i]<l2[j]){
             l3.add(l1[i]);
             i++;
             }
         else if(l2[j]<l1[i]){
             l3.add(l2[j]);
             j++;
             
         }
         else if(l2[j]==l1[i]){
             l3.add(l1[i]);
             l3.add(l2[j]);
             i++;j++;
             
         }
             
         }
     
    while(i>=l1.length && j<l2.length){
        l3.add(l2[j]);
        j++;
    }
        while(j>=l2.length && i<l1.length){
        l3.add(l1[i]);
        i++;
        }
        System.out.println(l3);
	}
	
}
public class MergeTwoSortedlists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mergeclass p=new Mergeclass();
		int a[]= {1,2,4};
		int b[]= {1,3,4};
		p.Merge(a,b);
	}

}
