package jp.ac.chibafjb.x15g018.kd072;

public class ganst41 {

	public static void main(String[] args) {
		int x[] = {1,2,3};
		int m = 3;
		m = x.length; 
		int y[] = {7,8};
		int n = 2;
		n = y.length;
		int[] z;
		z = new int[m+n];
		for(int i=0;i<m;i++){
			z [i] = x [i];
		}
		for(int i=0;i<n;i++){
			z[m-1+i] = y[i];
		}
		System.out.print("z[] = ");
		for(int i=0;i<z.length-4;i++){
			System.out.print("{"+z[i]);
		}
		for(int i=0;i<z.length-1;i++){
			System.out.print(","+z[i]);
		}
		System.out.print("}");
	}

}
