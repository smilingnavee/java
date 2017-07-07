public class Genome_Chain {
	private int find_sum(){
		int input[]= {3,6,1,8,9,3,9,5,7,1,4};
		int sum = 0;
		int prev_min = -1;
		for(int i = 0; i<input.length-5+1;i++){
						
			if (prev_min != -1 && prev_min == input[i+0] || prev_min ==input[i+1] ||prev_min ==input[i+2] ||prev_min ==input[i+3] ||prev_min ==input[i+4] ) {
				continue;
			}
			
			int this_min = input[i+0];
			if (this_min>input[i+1])
				this_min= input[i+1];
			if (this_min>input[i+2])
				this_min= input[i+2];
			if (this_min>input[i+3])
				this_min= input[i+3];
			if (this_min>input[i+4])
				this_min= input[i+4];
			
			if (prev_min == -1) {
				prev_min = this_min;
				sum = this_min;
			} else {
				prev_min = this_min;
				sum = sum+this_min;
			}		 		
		}
		return sum;
	}
	public static void main(String args[]){
		Genome_Chain cc = new Genome_Chain();
        System.out.println(cc.find_sum());
    }
}
