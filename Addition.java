class Addition
{
    void sum(int a, int b)
    {
        int d= a+b;
        System.out.println("addition number:" +d);
    }
    void sum(int a,int b,int c)
    {
        int d= a+b+c;
        System.out.println("addition three number:" +d);
    }
    public static void main(String args[])
    {
        Addition obj=new Addition();
        obj.sum(30, 40);
        obj.sum(20, 30, 40);

    }
}
    

    

