// basil206
public class Armstrong {
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]), temp=num, sum=0;
        while(temp>0){ int d=temp%10; sum+=d*d*d; temp/=10; }
        if(sum==num) System.out.println(num+" is Armstrong");
        else System.out.println(num+" is not Armstrong");
    }
}
