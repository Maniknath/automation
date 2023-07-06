package testing;

public class M {
	
	
	public void getData(int a){
		
		if(a%2==0){
			System.out.println("It's an Even number");
		}
		else{
			System.out.println("Its an odd number");
		}
	}
	
	public void printData(){
		//For Loop
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
		
		//While loops
		int i=1;
		while(i<=10){
			System.out.println(i);
			i++;
		}
		
		//Do While
		
		int j=1;
		do{
			System.out.println(j);
			j++;
		}while(j<=10);
	
		//Array
		
		
	}
	
	public void mDataPrint(){
		//Array
		
		int a[] = {100,300,200,600,700};
		for(int z : a){
			System.out.println(z);
		}
	}
	
	
}



