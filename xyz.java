class xyz
{
    class abc
    {
       void show()
        {
            System.out.println("Hello");
        }
    }


    public static void main(String ar[])
    {
        xyz a1= new xyz();
        xyz.abc x1= a1.new abc();
        x1.show();
    }        
}