package com.bridgelabz.classes;
import java.util.Arrays;
import com.bridgelabz.utility.Utility;
public class Binaryset
{
public static void main(String[] args)
{
			//String[] wordslist;
			Utility u = new Utility();
			String s=u.getFileText("abc.txt");
			s = s.trim();
			String wordslist[]=s.split(" ");

		for(int i=0;i<wordslist.length;i++)
		{
		System.out.print(wordslist[i]+" ");
		}
			System.out.print("enter the word to be searched :");
			String search=u.inputString(); 
			int index= u.binarySearch(wordslist,search);
		if(index==-1)
			{
			System.out.println("entered word is not there in file ");
			} 	
			else 	
			{
			System.out.println("entered word at index="+(index));
			}
			




}
}
