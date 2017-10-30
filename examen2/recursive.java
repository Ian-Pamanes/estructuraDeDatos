public class Main {

	public int factorial(int n) {
		if(n == 0) return 1;
		return n*(factorial(n-1));
	}

	public int bunnyEars(int bunnies) {
		return ((bunnies == 0) ? 0 : bunnyEars(bunnies-1) + 2 );
	}


	public int fibonacci(int n) {
		return (((n == 0) ? 0 : (n == 1) ? 1 : ((fibonacci(n-1) + fibonacci(n-2)))));
	}
	
	public int bunnyEars2(int bunnies) {
  		return ((bunnies == 0) ? 0 : (bunnies % 2 == 0) ? 3 + bunnyEars2(bunnies - 1) : 2 + bunnyEars2(bunnies - 1));
	}
	
	public int triangle(int rows) {
		  return ((rows == 0) ? 0 : triangle(rows-1) + rows );
		}

	public int sumDigits(int n) {
		  return ((n < 100) ? ((n/10) + (n%10)) : (sumDigits(n/10) + (n%10)));
		}

	public int count7(int n) {
		  if(n< 100){
		    if(n % 10 == 7){
		      return ((n / 10 == 7) ? 2 : 1 );
		    }
		    else{
		      return ((n / 10 == 7) ? 1 : 0 );
		      }
		  }
		  else{
		      return ((n % 10 == 7) ? count7(n/10) + 1 : count7(n/10));
		  }
		}
	
		public static int count8(int n) {
			System.out.println(n);
			if(n< 100){
				if(n % 10 == 8 ){
					return ((n / 10 == 8) ? 3 : 1 );
				}
				else{
					return ((n / 10 == 8) ? 1 : 0 );
				}
			}
			else{
				if((n % 10 == 8)){
					if (count8((n/10))%10 == 8){
						return (count8(n/10) + 2);
					}
					else{
						return (count8(n/10) + 1);
					}
				}
				else{
					return (count8(n/10));
				}
			}
		}
		
		public String changeXY(String str) {
			
			return "x"  ;
		}




	
	


	public static void main(String[] args) {
		count8(8088);
	}
}