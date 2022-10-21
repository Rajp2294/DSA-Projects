𝐁𝐮𝐢𝐥𝐝𝐢𝐧𝐠 𝐒𝐤𝐲 𝐒𝐜𝐫𝐚𝐩𝐩𝐞𝐫:

Write a program to analyze the construction process, to avoid manual work and errors.






      We are an architect firm, who is working on building a skyscraper, in Mumbai. 
      The construction is in such a way that the floors will be constructed in other factories and they will be assembled. 
      All the sizes will be distinct.
            The skyscraper needs to be constructed in N days with the following conditions :
            a) Every day a floor is constructed in a separate factory of distinct size.
            b) The floor with the larger size must be placed at the bottom of the building.
            c) The floor with the smaller size must be placed at the top of the building.

            Input:
            First Line: contains the total floors N in the building
            Second Line onwards: Contains N inputs in which the ith integer denotes the size of the floor that 
                                  will be given to architect by factories on the ith day.


            Output:
            You are required to print N lines. Print the size of the floor in descending order, which can be assembled.
            If no floor can be assembled on the ith day, leave the line empty.
           
           𝐓𝐞𝐬𝐭 𝐂𝐚𝐬𝐞 𝟏:
                  enter the total no of floors in the building
                  10
                  enter the floor size given on day : 1
                  1
                  enter the floor size given on day : 2
                  2
                  enter the floor size given on day : 3
                  3
                  enter the floor size given on day : 4
                  8
                  enter the floor size given on day : 5
                  9
                  enter the floor size given on day : 6
                  10
                  enter the floor size given on day : 7
                  4
                  enter the floor size given on day : 8
                  5
                  enter the floor size given on day : 9
                  7
                  enter the floor size given on day : 10
                  6
                  The order of construction is as follows
                  Day: 1
                  Day: 2
                  Day: 3
                  Day: 4
                  Day: 5
                  Day: 6
                  10 9 8
                  Day: 7
                  Day: 8
                  Day: 9
                  7
                  Day: 10
                  6 5 4 3 2 1
            
Note: A floor cannot be assembled in the building until all floors larger in size are placed.







-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

𝐓𝐫𝐚𝐧𝐬𝐚𝐜𝐭𝐢𝐨𝐧 𝐌𝐚𝐧𝐚𝐠𝐞𝐦𝐞𝐧𝐭 𝐟𝐨𝐫 𝐌𝐍𝐂:







    You are working in an MNC, which manages the Transactions, where only BST is used as a Data Structure. 
    The company stores all the data of transactions in BST such that the tree isalways a complete BST.
    
    A new business requirement has arrived where the BST should not contain any left node.
    You are required to modify the existing BST and display the node values present in ascending
    order.


![image](https://user-images.githubusercontent.com/93505635/197202078-f6175ea7-54bd-4089-8b6f-680c3cad3a6c.png)





𝐎𝐮𝐭𝐩𝐮𝐭
10 30 50 55 60
