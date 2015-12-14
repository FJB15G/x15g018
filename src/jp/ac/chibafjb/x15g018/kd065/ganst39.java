package jp.ac.chibafjb.x15g018.kd065;

public class ganst39 {

	public static void main(String[] args) {
		int[]a = {5,10,15};
		int m;
		m = a.length;
		int[]b;
		b = new int[a.length];
		
		for(int i=0;m>i;m--){
			b[i] = a[m-1];
			System.out.println("b["+(m-1)+"] = "+b[i]);
		}

	}

}
