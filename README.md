# Video_Frames_Complexity

Comlexity calculations of video frames


For the purposes of our task, we will set a very narrow criterion for de-duplication : just the filenames.

Below is how the filenames are represented ARRAY[] = [11, 21, 21, 33, 40, 40, 40, 50, 50]

Below is the expected output after de-duplication ARRAY[] = [11, 21, 33, 40, 50]

Please do not forget to notice the reduced size of the output array.

Also, please be reminded that you cannot use library functions in Java to per- form the de-duplication operation. Doing so would straight up result in a score of Zero !

You will solve the problem in two ways:-

1. Implement the function in such a way that your solution solves the problem with  *O* ( *n* ) time complexity and  *O* ( *n* ) space complexity. Here, *n *is the length of the list of input integers (array)
2.  In a separate implementation, improve the solution in (1) in such a way that your solution solves the problem with  *O* ( *n* ) time com- plexity but stays within the bounds of  *O* (1) space complexity. Here, *n *is the length of the list of input integers (array) as well.
