package day2;

public class Addition {
	
	 static void add(int...numbers)
	    {
	        int sum = 0;
	        for(int num:numbers)
	        {
	            if(sum !=0){
	                System.out.print("+");
	            }
	            sum+=num;
	            System.out.print(num);
	        }
	        System.out.println("="+sum);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(1,2,3,4,5);
	}

}
