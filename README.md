1. what is the type of lambda expression
2. can I put lambda in a variable
3. is lambda expression is an object


*** Answer for the 1 question ***
 -> it is a functional interface
    -> Functional interface is a interface with only one abstract method
 Examples of functional interface ::
      ** Runnable -> run()
      ** Comparator -> compare(t1, t2)
      ** FileFilter -> filter(File)
 Method of the Object class does not count (As object call is parent call of all class)
 Its optional to add @FunctionalInterface


*** Answer for the 2 question ***
 YES
 Can be taken as a method parameter and returned by a method
 Above java code is a example of the lambda expression as variable