//Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
//Hint =>
//Define an array of 10 integer elements and take user input for the student's age.
//Loop through the array using the length property and for the element of the array check If the age is a negative number print an invalid age and if 18 or above, print The student with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote.
import java.util.Scanner;
class VoteEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int students = sc.nextInt();
        int[] age = new int[students];
        System.out.println("Enter the ages of all the " + students + " Students");
        for(int i =0 ; i< students; i++){
            age[i] = sc.nextInt();
        }
        for(int i=0; i<age.length; i++){
            if (age[i] < 0) {
                System.out.println("Invalid age");
            } else if(age[i] >= 18){
                System.out.println("Student with age " + age[i] + " is eligible to vote");
            } else {
                System.out.println( "Student with age " + age[i] + " Not eligible to vote");
            }
            sc.close();
        }
    }
}