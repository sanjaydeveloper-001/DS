**Sort Array 8.1**

Sort the array elements in descending order according to their frequency of occurrence

Input Format

11
2 2 3 4 5 12 2 3 3 3 12

Constraints

5<=n<=20 -100<=a[i]<=100

Output Format

3 3 3 3 2 2 2 12 12 4 5

Sample Input 0

10
3 3 2 2 2 5 5 5 8 7
Sample Output 0

2 2 2 5 5 5 3 3 7 8


**Method**
After set the Frequency, 
Create a infinite loop without range while(true) ;
Traverse a frequency array and take the max element and max index
Again Traverse the Frequency array adn print the max index;
