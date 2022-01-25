class Armstrong{

	public static void main(String args[]){

	
	int n=153,r,sum=0,temp;

			
	temp=n;

	while(n>0){
		r=n%10;
		sum=sum+(r*r*r);
		n=n/10;
		}
	
	if(temp==sum)

	System.out.println(temp + " is armstrong number");

	else

	System.out.println(temp + " is not armstrong number");

	}





}