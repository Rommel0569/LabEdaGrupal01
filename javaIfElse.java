public class javaIfElse {
  public static void main(String[] args) {
   
if (condition) {
  // block of code to be executed if the condition is true
}

if (20 > 18) {
  System.out.println("20 is greater than 18");
}
int x = 20;
int y = 18;
if (x > y) {
  System.out.println("x is greater than y");
}
int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// Outputs "Good evening."


//example
int time = 22;
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// Outputs "Good evening."
////short Hand if ..else
int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}

int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);
  }
}