# Java 23 XOR Functions
This is a simple implementation of the logical XOR function and bitwise XOR function using the standard operations provided in Java 23. This implementation is based on a derivation of the XOR functions using the properties of the AND and OR functions.
## A Short Derivation
For a logical XOR function (denoted by $\oplus$), we expect the following logical table 
| $X$ | $Y$ | $X\oplus Y$ |
| --- | --- | ----------- |
|  0  |  0  |      0      |
|  1  |  0  |      1      |
|  0  |  1  |      1      |
|  1  |  1  |      0      |


Recall that the OR and AND functions have the following truth tables
| $X$ | $Y$ | $X\land Y$ |
| --- | --- | ---------- |
|  0  |  0  |      0     |
|  1  |  0  |      0     |
|  0  |  1  |      0     |
|  1  |  1  |      1     | 


| $X$ | $Y$ | $X\lor Y$ |
| --- | --- | --------- |
|  0  |  0  |     0     |
|  1  |  0  |     1     |
|  0  |  1  |     1     |
|  1  |  1  |     1     |


There are 2 different ways to approach constructing the XOR function using the previous tables. The first is more complicated, but probably a useful exercise for more complex functions which can't be done through the intuitive approach. 
### Method 1: By Eye
The first method is to look at the previous logic tables and think about how you can combine them to create the same table as the XOR function. If we were to use them by themselves, there isn't a clear combination using AND or OR which can produce the same results as XOR. Combining them using OR or AND would leave the last combination $X=0$ and $Y=0$ to produce the wrong value (1 instead of 0). Going further into more complex combinations within this line of thinking may be more effort than it is worth. \
 \
Instead, let's try adding a different logical function into the mix. Notice that the negation of the AND function looks like 
| $X$ | $Y$ | $\neg(X\land Y)$ |
| --- | --- | ---------------- |
|  0  |  0  |        1         |
|  1  |  0  |        1         |
|  0  |  1  |        1         |
|  1  |  1  |        0         |


If we were to use the OR function to combine $\neg(X\land Y)$ and $Y\lor Y$, this would give us an incorrect result for the XOR with $X=0$ and $Y=0$. But if were to use the AND function, we meet all the required conditions! To double check:
| $X$ | $Y$ | $\neg(X\land Y)$ | $X\lor Y$ | $\neg (X\land Y)\land (X\lor Y)$ |
| --- | --- | ---------------- | --------- | -------------------------------- |
|  0  |  0  |        1         |     0     |                0                 |
|  1  |  0  |        1         |     1     |                1                 |
|  0  |  1  |        1         |     1     |                1                 |
|  1  |  1  |        0         |     1     |                0                 |


That gives the same logical table as the XOR function! Therefore, 
$$X\oplus Y = \neg (X\land Y)\land (X\lor Y)$$

### Method 2: Intuitive Reasoning 
To intuit the solution, we have to break down what we *mean* when we say the "XOR function". The XOR between $X$ and $Y$ means that we return true if either $X$ or $Y$ is true, **and not** when both $X$ and $Y$ are true. Or to use our logical symbols, the XOR between $X$ and $Y$ means that we return true if $X\lor Y$ **AND NOT** when $X\land Y$. If we turn that "AND NOT" into logical symbols, we get our final expression 
$$X\oplus Y = (X\lor Y)\land(\neg (X\land Y))$$

## Conclusion
The final step was just translating the statement $X\oplus Y=(X\lor Y)\land (\neg(X\land Y))$. For the logical equivalent in Java, we can use && for $\land$, || for $\lor$, and ! for $\neg$. For the bitwise equivalent, we use & for $\land$, | for $\lor$, and ~ for $\neg$. \
 \
The implementation from this point on is fairly trivial and they can be viewed in the project files. There are also some sanity checks included in the main function body, to check whether the implementation produces the desired results. 
