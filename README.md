# CodingQuest12172019
Coding Questions 12/17/2019

1/ Create a function to print the duplicates in a list of strings
public void findDuplicates(List<String> strings){};
  
  - Method: create a hash set use to store duplicates. Use a loop to loop through the list. Check the hash set. If the string is in the hash set then print it out. If not then add it to the hash set.
  ![alt text](https://github.com/trung-luu-enhance/CodingQuest12172019/blob/master/Screen%20Shot%202019-12-17%20at%203.31.26%20PM.png?raw=true)
  ![alt text](https://github.com/trung-luu-enhance/CodingQuest12172019/blob/master/Screen%20Shot%202019-12-17%20at%203.31.55%20PM.png?raw=true)
  
2/ Create function to check if the string is a palindrome without using string.reverse() method
public boolean checkPalindrome(String word){};  

  - Method: use a for loop to loop through the string. Check the i and size - i position if they are different. If yes the return false. If the loop is completed, this mean that the string is a palindrome.
  ![alt text](https://github.com/trung-luu-enhance/CodingQuest12172019/blob/master/Screen%20Shot%202019-12-17%20at%203.28.42%20PM.png?raw=true)
  
3/ Create a function that will print:
     "fizz" is the number is divisible by 3
     "buzz" is the number is divisible by 5
     "fizzbuzz" is the number is divisible by both
   
  - Method: use an if else statement. If the target is divisible by 15 then print out fizzbuzz. Else if it is divisible by 3, print out fizz. The same for 5, print out buzz.
  
  ![alt text](https://github.com/trung-luu-enhance/CodingQuest12172019/blob/master/Screen%20Shot%202019-12-17%20at%203.27.05%20PM.png?raw=true)
