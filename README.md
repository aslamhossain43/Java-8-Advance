# Java-8-Advance
Lambda expression can only applicable for functional interface.  
Functional interface: The interface who contains only one abstract method but can have multiple default and static method is called functional interface.
## Example: 
1. Runnable - run() - no return, not throw checked exception
2. Callable - call() - return, throw checked exception
3. Comparable - compareTo() - used to sort collection elements. on the basis of a single element, Collections.sort(List)
4. Comparator - compare() - used to sort collection elements. on the basis of multiple elements, Collections.sort(List, Comparator)  
5. Consumer - accept(T t) - foreach - no return
6. Predicate - test(T t) - filter - return boolean
7. Supplier - get() - empty check for list and provide static data
8. Stream api: It is used to process list of objects.
9. map(): takes stream and return another transform stream.[a,b,c] > [A,B,C] used for one-to-one mapping
10. flatMap(): takes stream of stream and return another stream.[[1,2],[3,4]] > [1,2,3,4]  


## CompleteAbleFeature:  
It is used for asynchronous programming in java. It is used for background task without blocking main thread.
Using this performance will be increased because multiple task is splitted in different thread. After completion execution of feature it will notify main thread then we can use it for our user.
## Why CompleteAbleFeature?  
There are various way to implement asynchronous programming in java like Features,ExecutorService,Callback interfaces, Thread Pools, etc.  
### There are some disadvantages of using Features given below:
1. It cannot be manually completed.
2. Multiple features cannot be chained together.
3. We cannot combine multiple features together.
4. No proper exception handling mechanism.

CompletableFeature:
1. runAsync: execute task in background and no return finally.
2. supplyAsync: return something

## All the the methods in the CompletableFuture API has two variants - One which accepts an Executor as an argument and one which doesn’t

CompletableFeature chain/callback methods:
1. thenApply(Function): take input return value
2. thenAccept(Consumer): take input no return
3. thenRun(Runnable): take input no return


Executor service framework:
1. Submit(Callable) vs Execute(Runnable) in Executor service framework:
2. Submit: Return after execution of thread
3. Execute: no return







