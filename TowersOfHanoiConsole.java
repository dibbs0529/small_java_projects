
/*
   This applet lists the steps in the solution of the
   TowersOfHanoi problem, for a given number of disks.
   It is meant as an example of recursion.
*/

public class TowersOfHanoiConsole extends ConsoleApplet {
   
   public void program() {
   
      int N;  // The number of disks in the original stack,
              //   as specified by the user.
   
      console.putln("This applet will list the steps in the solution of");
      console.putln("the Towers of Hanoi problem.  You can specify the");
      console.putln("number of disks to be moved.  Try it for small numbers");
      console.putln("of disks, like 1, 2, 3, and 4.");
      console.putln();
      console.putln("How many disks are to be moved from Stack 0 to Stack 1?");
      console.putln();
      console.put("? ");
      
      N = console.getInt();
      
      console.putln();
      console.putln();
      
      TowersOfHanoi(N, 0, 1, 2);  // Print the solution.
   
   } // end program()
   

  void TowersOfHanoi(int disks, int from, int to, int spare) {
          // Solve the problem of moving the number of disks specified
          // by the first parameter from the stack specified by the 
          // second parameter to the stack specified by the third 
          // parameter.  The stack specified by the fourth parameter 
          // is avaialable for use as a spare.
      if (disks == 1) {
            // There is only one disk to be moved.  Just move it.
         console.putln("Move a disk from stack number "
                  + from + " to stack number " + to);
      }
      else {
            // Move all but one disk to the spare stack, then
            // move the bottom disk, then put all the other
            // disks on top of it.
         TowersOfHanoi(disks-1, from, spare, to);
         console.putln("Move a disk from stack number "
                  + from + " to stack number " + to);
         TowersOfHanoi(disks-1, spare, to, from);
      }
   }
   
   
} // end class TowersOfHanoiConsole.
