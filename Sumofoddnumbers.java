package player;

public class Sumofoddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=20;
int sum=0;
for(int i=0;i<n;i++){
	if(i%2!=0){
		System.out.println(i);
		//sum=sum+i;
	}
	sum=sum+i;
}
System.out.println(sum);
if(sum%2!=0){
	System.out.println("Sum is ODD");
}
	}

}
