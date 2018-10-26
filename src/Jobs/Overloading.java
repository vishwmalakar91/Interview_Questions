package Jobs;

class DisplayOverloading3
{
   public void disp(char c, int num)
   {
       System.out.println("disp1");
   }
   public void disp(int num, char c)
   {
       System.out.println("disp2" );
   }
}
class Overloading
{
   public static void main(String args[])
   {
       DisplayOverloading3 obj = new DisplayOverloading3();
       obj.disp('x', 51 );
       obj.disp(52, 'y');
   }
}