Frequency Array Linked List (7-8-2025)

* Traverse a given array and take max element 
* then Create a Frequency array with the size o f Max+1 
* Traverse a input array and take the element, set the frequency using the element index ;

arr = [3,4,3,4,1,2,3,1,2,4,6,3]

n = 12 

max = 6 

create a array length = max +1 ;

fre = [0,0,0,0,0,0,0];

for(int i=0; i<n; i++){
	fre[arr[i]] ++;
}

