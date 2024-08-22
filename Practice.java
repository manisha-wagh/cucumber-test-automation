public class Practice {

    

    public static void main(String [] args){
    
    int num = 121;
    int temp=num;
    int rev=0, rem;
    // for(int i=num; i>0; i=i/10)
    while(temp!=0)
    {
        rem=temp%10;
        rev=rev*10+rem;
        temp=temp/10;
    }
    
    if(num==rev)
    {
        System.out.println("It is palindrome number");
    }
    }
    }
