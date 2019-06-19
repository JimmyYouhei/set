# set

##	Introduction 
This is my own Set class that is written by me by using either Array List or Linked List. The purpose is to learn more about Set 
##	Version: 
-	It is written by using IntelliJ IDEA Community Edition 2019.1.3 x64
-	JDK version 11
##	How to install:
If you use IntelliJ IDEA use new -> Project From Version Control -> Git and paste https://github.com/JimmyYouhei/set.git
##	How to use: 
-	Using the Main class to run and test any method 
-	Then you can use either the SetArrayList class or the SetLinkedList: 
    -	contain(int n): return a Boolean that the set contain the integer or not 
    -	add(int n): add the integer to the set if not already added . If already added return a Duplicate Exception
    -	remove(int n): remove the integer n from the set
    -	count(): return the size of the set
    -	union(Set a , Set b): union and return a new set
    -	intersection(set a , set b): intersection and return a new set
    -	difference(set a , set b): difference and return a new set
    -	symmetric difference (set a , set b): symmetric difference and return a new set
##	Note:
-	Due to the class is written purely for learning purpose so very little Exception handle is expected 
-	The DuplicationException class is written to make a custom exception to reflect the proper name of the exception
-	The add method when duplication is detected,  use exception instead of using return false like the set in java. This is intended to practice throwing and handle exception at a same time
##	License 
[MIT License](https://github.com/JimmyYouhei/set/blob/master/LICENSE)
