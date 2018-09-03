- 1. What is the type of lambda expression ?
- 2. Can I put lambda in a variable ?
- 3. Is lambda an object ?

**********************************************************************************************

-> Answer to the 1 question ::
Functional interface

 - Functional interface is a interface with only one abstract method

 Examples of functional interface ::

      ** Runnable -> run()

      ** Comparator -> compare(t1, t2)

      ** FileFilter -> filter(File)

 Method of the Object class does not count (As object call is parent call of all class)

 Its optional to add @FunctionalInterface

***********************************************************************************************
 -> Answer to the 2 question ::
YES

 Can be taken as a method parameter and returned by a method

 Java_Lambda_2.java is a example of the lambda expression as variable

****************************************************************************************************

-> Answer to the 3 question ::
A COMPLEX NO

 - 1.7 and below

      ** Comparator<String> compare = new Comparator<String>(String str1, String str2){

           @override

           public boolean compare(String s1, String s2){

              return Integer.compare(s1.getLength(), s2.getLength());

           }
      };

- 1.8 using Lambda expression

      ** Comparator<String> compare8 = (String str1, String s2) -> {

           return Integer.compare(str1.length(), s2.length());

         }

  NOTE:  Using lambda expression in java 8, the new keyword is not used. Hence a new memory block is not allotted. Which makes
  it less expensive then the older implementation of java. Lambda is an object without identity

*************************************************************************************************