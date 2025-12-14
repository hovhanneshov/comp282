N          CSArrayList (ms)     ArrayList (ms)      
Append:
100000     4                    2                   
250000     3                    2                   
500000     4                    19                  
1000000    6                    5

Random get:
100000     3                    2                   
250000     6                    1                   
500000     0                    1                   
1000000    0                    0

Append performance grows linearly with N for both lists.

Occasional resize operations cause brief spikes, but due to the capacity doubling, append has an amortized O(1) time-complexity.

java.util.ArrayList is slightly faster, probably due to fewer bounds/modCount checks and innate optimization of java classes.

Random access (get) is consistently O(1) for both implementations and is independent of size.