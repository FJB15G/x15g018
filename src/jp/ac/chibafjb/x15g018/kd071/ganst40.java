package jp.ac.chibafjb.x15g018.kd071;

public class ganst40 {

	public static void main(String[] args) {
		int data[] = {100,200,300,0};
		int k = data.length-1;
		for(int i=0;i<data.length-1;i++){
			data[k] = data[k-1];
			k = k - 1;
		}
		for(int i=0;i<data.length;i++)
		System.out.println("data["+(i)+"] = "+data[i]);
		}
	}


