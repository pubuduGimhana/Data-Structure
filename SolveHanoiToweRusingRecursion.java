package DataStructure;

public class SolveHanoiToweRusingRecursion {
    
    // Recursive function to solve Tower of Hanoi puzzle
    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        // Base case: if there's only one disk, move it from source to destination
        if (n == 1) {
            System.out.println("Move the disk 1 from " + source + " to " + destination);
            return;
        }
        
        // Move top n-1 disks from source to auxiliary, using destination as auxiliary
        solveHanoi(n - 1, source, destination, auxiliary);
        
        // Move the nth disk from source to destination
        System.out.println("Move the disk " + n + " from " + source + " to " + destination);
        
        // Move the n-1 disks from auxiliary to destination, using source as auxiliary
        solveHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        solveHanoi(n, 'A', 'B', 'C'); // A, B, and C are names of the rods
    }
}

