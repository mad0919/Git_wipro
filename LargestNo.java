class LargestNo{
    
    public static int largest(int a[], int total)
    {
        for(int i=0; i<total ;i++)
        {
          for(int j=i+1; j<total; j++)
            {
                if(a[i]>a[j])
                {
                  int temp;
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
                }
            }
          }
        return(a[total-1]);
    }
    
    public static void main (String[] args) {
      
       int a[]={1,5,3,6,8,2};
       
       System.out.println("Largest no is " +largest(a,6));
       
       
    }
}