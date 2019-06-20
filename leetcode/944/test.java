package test;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AbstractDocument.LeafElement;

public class test {
	public static void main(String[] args) {
		String[] A = {"cba",
					  "daf",
					  "ghi"};
		String[] A2 = {"zyx","wvu","tsr"};
		String[] A3 = {"a","b"};
		String[] A4 = {"rrjk",
					   "furt",
					   "guzm"};
		System.out.println(minDeletionSize(A));
		System.out.println(minDeletionSize(A2));
		System.out.println(minDeletionSize(A4));
		System.out.println(minDeletionSize(A3));
		
	}
    public static int minDeletionSize(String[] A) {
        int sum = 0;
        int len = A[0].length();
        if(len < 2) {
        	return 0;
        }
        for(int i = 0;i < len;i++) {
        	for(int j = 0;j < A.length - 1;j++) {
        		if(A[j].charAt(i) > A[j+1].charAt(i)) {        			
        			sum++;
        			break;
        		}
        	}
        }
    
        return sum;
    }
}

/*
其實是計算有多少個非降序列：
輸入：[“zyxa”，“wvub”，“tsrc”]可以轉換成
z y x a
w v u b
t s r c
這樣的矩陣，然後看它每一列是否從上到下為降序，
例如0,1,2列為非降序，3列為降序
是降序則記錄它的列序號，並刪掉。
輸出有幾個這樣的降序列。

就是問每一列上的元素是不是遞增的，遞增的就不能刪，不是遞增的就可以刪，問有多少列元素的順序不是遞增的

JAVA 实现：题目描述花里胡哨，字符串数组其实就是二维字符数组，要求每一列都是"非降序"，可以理解为前面的数大于后面的数即不符合条件，需要删除。
*/
