public class Exercise5
{
   // draw four triangles
   public static void main( String args[] )
   {
      int row; // the row position
      int column; // the column position
      int space; // number of spaces to print
 
      // first triangle
      /* Write code to display the first triangle. Use nested for loops. The 
         outer loop should control which row of asterisks is being displayed.
         The inner loop should display one asterisk at a time. */
      for(row = 1; row <= 10; row++)
      {
            for(column = 1; column <= 10; column++)
            {
                System.out.println("*");
            }
           
      }
      
}
}