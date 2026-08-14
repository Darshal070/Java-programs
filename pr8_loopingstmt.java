class pr8_loopingstmt{
    public static void main(String[] args) {

        //Reverse 
        for (int i=15; i>=1; i--) {
            System.out.println(i);
        }

        //Even
        for (int j=1;j<=10;j++) {
            if(j%2==0){
                System.out.println(j);
            }
        }

        //sum
        int sum=0;
        for (int s=1; s<=5; s++ ){   
        sum=sum+s;
        System.out.println(sum);
        }

        //fact
        int fact=1;
        for (int f=1; f<=5; f++){  
        fact=fact*f;
        System.out.println(fact);
        }

        //pattern using nested for loop
        for(int p=1; p<=4; p++)
        {
            for(int n=1; n<=4; n++){
            System.out.print(p);
            }
        System.out.println();
        }

        
         for(int a=1; a<=4; a++)
        {
            for(int b=1; b<=a; b++){
            System.out.print(a);
            }
        System.out.println();
        }


         for(int x=4; x>=1; x--)
        {
            for(int z=1; z<=4; z++){
            System.out.print(x);
            }
        System.out.println();
        }
    }
}