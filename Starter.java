import java.io.*;
import java.util.Scanner;

public class Starter {
          public void Start()throws IOException {
                    int Times = 5;
                                        while(Times > 0){
                                                            Operator Operators = new Operator();
                                                            System.out.println("Enter any of the alphabets to perform one of the Operations \n\n \t\t Enter A for Addition \n\n \t\t M for Mutiplication \n\n \t\tD for division \n\n \t\t P for Modulus \n\n \t\t S for Subtraction \n\n \t\t");
                                                            // InputStreamReader read = new InputStreamReader(System.in);
                                                            //  BufferedReader Input = new BufferedReader(read);
                                                            Scanner Input = new Scanner(System.in);
                                                            String Operation = Input.nextLine();
                                                            // System.out.println(Operation);
                                                            if(Operation.equals("A") || Operation.equals("a")){
                                                                                System.out.println("Enter the Two numbers for Addition Operation\n\n Enter the first number \n\n\t\t");
                                                                                int Number1 = Integer.parseInt(Input.nextLine());
                                                                                System.out.println("\n\n Enter the second number \n\n\t\t");
                                                                                int Number2 = Integer.parseInt(Input.nextLine());
                                                                               System.out.println(Operators.Add(Number1, Number2));
                                                                               byte End = Input.nextByte();
                                                                               if(End == 1){

                                                                               }else{
                                                                                                    Times = 0;
                                                                               }
                                                            }else if(Operation.equals("S") || Operation.equals("s")){
                                                                                System.out.println("Enter the Two numbers for Subtraction Operation\n\n Enter the first number \n\n\t\t");
                                                                                int Number1 = Integer.parseInt(Input.nextLine());
                                                                                System.out.println("\n\n Enter the second number \n\n\t\t");
                                                                                int Number2 = Integer.parseInt(Input.nextLine());
                                                                               System.out.println(Operators.Subtract(Number1, Number2));
                                                                               byte End = Input.nextByte();
                                                                               if(End == 1){

                                                                               }else{
                                                                                                    Times = 0;
                                                                               }
                                                            }else if(Operation.equals("P") || Operation.equals("p")){
                                                                                System.out.println("Enter the Two numbers for Modulus Operation\n\n Enter the first number \n\n\t\t");
                                                                                double Number1 = Integer.parseInt(Input.nextLine());
                                                                                System.out.println("\n\n Enter the second number \n\n\t\t");
                                                                                double Number2 = Integer.parseInt(Input.nextLine());
                                                                               System.out.println(Operators.Modulus(Number1, Number2));
                                                                               byte End = Input.nextByte();
                                                                               if(End == 1){

                                                                               }else{
                                                                                                    Times = 0;
                                                                               }
                                                            }else if(Operation.equals("M") || Operation.equals("m")){
                                                                                System.out.println("Enter the Two numbers for Multiplication Operation\n\n Enter the first number \n\n\t\t");
                                                                                int Number1 = Integer.parseInt(Input.nextLine());
                                                                                System.out.println("\n\n Enter the second number \n\n\t\t");
                                                                                int Number2 = Integer.parseInt(Input.nextLine());
                                                                               System.out.println(Operators.Multiply(Number1, Number2));
                                                                               byte End = Input.nextByte();
                                                                               if(End == 1){

                                                                               }else{
                                                                                                    Times = 0;
                                                                               }
                                                            }else if(Operation.equals("D") || Operation.equals("d")){
                                                                                System.out.println("Enter the Two numbers for Division Operation\n\n Enter the first number which should be the numerator\n\n\t\t");
                                                                                double Number1 = Integer.parseInt(Input.nextLine());
                                                                                System.out.println("\n\n Enter the second number which should be the denominator\n\n\t\t");
                                                                                double Number2 = Integer.parseInt(Input.nextLine());
                                                                                System.out.println(Operators.Divide(Number1, Number2) + "\n\n");
                                                                                System.out.println("Enter 1 to start again or any other key to terminate the operation \n\n");
                                                                                byte End = Input.nextByte();
                                                                               if(End == 1){

                                                                               }else{
                                                                                                    Times = 0;
                                                                               }
                                                            }else{
                                                                                System.out.println("\n\n\t\tOperation not found, please press enter to try again");
                                                            }

                                                              }
          }          
}
