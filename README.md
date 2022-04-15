# Java-8-Advance
Lambda expression can only applicable for functional interface.
Functional interface: The interface who contains only one abstract method but can have multiple default and static method is called functional interface.
Example: 
1. Runnable - run() - no return
2. Callable - call()
3. Comparable - compareTo()
4. Comparator - compare()
In stream api
1. Consumer - accept(T t) - foreach - no return
2. Predicate - test(T t) - filter - return boolean
3. Supplier - get() - empty check for list and provide static data
4. Stream api: It is used to process list of objects.
5. map(): takes stream and return another transform stream.[a,b,c] > [A,B,C] used for one-to-one mapping
6. flatMap(): takes stream of stream and return another stream.[[1,2],[3,4]] > [1,2,3,4]

Concrete vs instance method:
1. Concreate method: not abstract
2. Instance method: not static

Optional<> is recommended to use in getter to avoid null.

Reduce: aggregating data like a+b,a-b

1. BiFunction: Real time use for BiFunction is with map.replaceAll(BiFunction).
2. BiCunsumer: Real time use for BiCunsumer is map.forEach(BiCunsumer).
3. BiPredicate: To compare and get boolean


CompleteAbleFeature:It is used for asynchronous programming in java. It is used for background task without blocking main thread.
Using this performance will be increased because multiple task is splitted in different thread. After completion execution of feature it will notify main thread then we can use it for our user.
Why CompleteAbleFeature? : There are various way to implement asynchronous programming in java like Features,ExecutorService,Callback interfaces,
Thread Pools, etc. There are some disadvantages of using Features given below:
1. It cannot be manually completed.(Not possible to complete force fully)
2. Multiple features cannot be chained together.(After execution not possible to reuse it)
3. We cannot combine multiple features together.(After completing a lot of  features we cannot back to api finally)
4. No proper exception handling mechanism.()


Executor service framework:
1. Submit(Callable) vs Execute(Runnable) in Executor service framework:
2. Submit: Return after execution of thread
3. Execute: no return

CompletableFeature:
1. runAsync:execute task in background and no return finally.
2. supplyAsync:return something

CompletableFeature chain:
1. thenApply(Function): take input return value
2. thenAccept(Consumer): take input no return
3. thenRun(Runnable): take input no return





