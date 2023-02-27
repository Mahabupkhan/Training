import java.util.Scanner;
//start : 12.10
class NumToWords{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String[] ones={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine",
		"","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
		String[] tens={"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		String[] hundreds={"","One hundred","Two hundred","Three hundred","Four hundred","Five hundred","Six hundred",
		"Seven hundred","Eight hundred","Nine hundred"};
		System.out.println("Enter the number : ");
		int num=scan.nextInt();
		if(num==0){
			System.out.println("Zero");
		return;
		}
		int value=100;
		while(num>0){
			if(num>=11 && num<=19){
				num=num%10;
				System.out.print(ones[num+10]);
				return;
			}
			int quotient=num/value;
			if(value==100)
			System.out.print(hundreds[quotient]+" ");
			else if(value==10){
				System.out.print(tens[quotient]+" ");
			}
			else	
				System.out.print(ones[quotient]+" ");
			num=num%value;
			value=value/10;
			
		}
		//end : 12.35
	}
}