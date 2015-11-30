package jp.ac.chibafjb.x15g018.kd061;

public class ganst35 {

	public static void main(String[] args) {
		int[] a;
		a = new int[2];
		a[0] = 10;
		a[1] = 20;
		int work;
		work = a[0];
		a[0] = a[1];
		a[1] = work;
		System.out.println("test[0] = "+a[0]);
		System.out.println("test[1] = "+a[1]);
	}

}
