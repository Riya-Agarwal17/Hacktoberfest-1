Programs
oops OOPs
String String
Exception Exception
Multithreading Multithreading
Collections Collections
javafx JavaFX
jsp JSP
spring Spring
Spring Boot Spring Boot
Projects Projects
interview questions Interview Questions

Java Tutorial
What is JavaHistory of JavaFeatures of JavaC++ vs JavaHello Java ProgramProgram InternalHow to set path?JDK, JRE and JVMJVM: Java Virtual MachineJava VariablesJava Data TypesUnicode SystemOperatorsKeywords
Control Statements
Java Control StatementsJava If-elseJava SwitchJava For LoopJava While LoopJava Do While LoopJava BreakJava ContinueJava CommentsJava Programs
Java Object Class
Java OOPs ConceptsNaming ConventionObject and ClassMethodConstructorstatic keywordthis keyword
Java Inheritance
Inheritance(IS-A)Aggregation(HAS-A)
Java Polymorphism
Method OverloadingMethod OverridingCovariant Return Typesuper keywordInstance Initializer blockfinal keywordRuntime PolymorphismDynamic Bindinginstanceof operator
Java Abstraction
Abstract classInterfaceAbstract vs Interface
Java Encapsulation
PackageAccess ModifiersEncapsulation
Java Array
Java Array
Java OOPs Misc
Object classObject CloningMath classWrapper ClassJava RecursionCall By Valuestrictfp keywordjavadoc toolCommand Line ArgObject vs ClassOverloading vs Overriding
Java String
Java Regex
Exception Handling
Java Inner classes
Java Multithreading
Java I/O
Java Networking
Java AWT & Events
Java Swing
JavaFX
Java Applet
Java Reflection
Java Date
Java Conversion
Java Collection
Java JDBC
Java Misc
Java New Features
RMI
Internationalization
Interview Questions
Java MCQ
JavaTpoint
Next →← Prev
Smith Number in Java
In this section, we will learn what is a smith number and also create Java programs to check if the given number is smith or not. The smith number program frequently asked in Java coding tests and academics.

Smith Number
A Smith number is a composite number whose sum of digits equals to the sum of digits of its prime factors, excluding 1. It is also known as a joke number. It is a sequence of OEIS A006753.

Sum of digits of n = Sum of digits of prime factors of n (counted with multiplicity)
Let's understand it through an example.

Smith Number Example
Example 1: Suppose, we want to check the number 85 is smith or not.

Sum of digits = 8 + 5 = 13

Prime factors of 85 is: 5,17

Sum of digits of its prime factors = 5 + 1+ 7 = 13

Compare the sum of digits with the sum of digits of its prime factors i.e. 13=13. Both are equal. Hence, the given number (85) is a smith number.

Example 2: Let's check another number 999 is smith or not.

Sum of digits = 9+ 9+9 = 27

Prime factors of 999 is: 3×3×3,37

Sum of digits of its prime factors = 3+3+3+3+7 =19

Compare the sum of digits with the sum of digits of its prime factors i.e. 27≠19. Hence, the given number (999) is not a smith number.

Smith Number in Java
Similarly, we can check other numbers also. Some other smith numbers are 4, 27, 85, 94, 121, 166, 202, 265, 274, 319, 346, 666, etc.

Steps to Find Smith Number
Read or initialize a number from the user.
Find the sum of its digits.
Find the prime factors of the given number.
Determine the sum of digits of its prime factors.
Compare the sum of digits with the sum of digits of its prime factors.
If they are equal, the given number is a smith
Else, not a smith number.
Let's implement the above steps in a Java program.

Smith Number Java Program
SmithNumberExample1.java

import java.util.*;  
public class SmithNumberExample1  
{  
//function finds the sum of digits of its prime factors  
static int findSumPrimeFactors(int n)  
{  
int i=2, sum=0;  
while(n>1)  
{  
if(n%i==0)  
{  
sum=sum+findSumOfDigit(i);  
n=n/i;  
}  
else  
{  
do  
{  
i++;  
}  
while(!isPrime(i));  
}  
}  
//returns the sum of digits of prime factors  
return sum;  
}  
//function finds the sum of digits of the given numbers  
static int findSumOfDigit(int n)  
{  
//stores the sum  
int s=0;  
while(n>0)  
{  
//finds the last digit of the number and add it to the variable s      
s=s+n%10;  
//removes the last digit from the given number  
n=n/10;  
}  
//returns the sum of digits of the number  
return s;  
}  
//function checks if the factor is prime or not  
static boolean isPrime(int k)  
{  
boolean b=true;  
int d=2;  
while(d<Math.sqrt(k))  
{  
if(k%d==0)  
{  
b=false;  
}  
d++;  
}  
return b;  
}  
//driver code  
public static void main(String args[])  
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number: ");  
//reads an integer from the user  
int n=sc.nextInt();  
//calling the user-defined function that finds the sum of digits of the given number  
int a = findSumOfDigit(n);  
//calling the user-defined function that finds the sum of prime factors  
int b = findSumPrimeFactors(n);  
System.out.println("Sum of Digits of the given number is = "+a);  
System.out.println("Sum of digits of its prime factors is = "+b);  
//compare both the sums  
if(a==b)  
//prints if above condition returns true  
System.out.print("The given number is a smith number.");  
//prints if above condition returns false  
else  
System.out.print("The given number is not a smith number.");  
}  
}  
