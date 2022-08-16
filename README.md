# test-word-frequency
Brief gist of Word Frequency Coding Exercise

First to find the words frequency I need to get each and every word alone  
So , used the split function to split the words in the string and get the String array of words that I need to memorize the previous count of each word 
As i goes from one word to other so I used hashmap to record the count of each word and looped over the array 
By that i can get the count of each word 
I stored in the hashmap because hashmap uses set interface to store the keys then it has the values in the ascending oder of the keys so then I add those map entries in to the list to sort it according to the values 
Then I used Collections.sort() to sort the values of the list 
I used LinkedHashMap to store the sorted values from the list and because LinkedHashmap stores the entires in the oder which I need it will be in the sorted oder only then I displayed the sortedMap.
