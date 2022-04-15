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
Stream api: It is used to process list of objects.
map(): takes stream and return another transform stream.[a,b,c] > [A,B,C] used for one-to-one mapping
flarMap(): takes stream of stream and return another stream.[[1,2],[3,4]] > [1,2,3,4]

Concrete vs instance method:
Concreate method: not abstract
Instance method: not static

Optional<> is recommended to use in getter to avoid null.

Reduce: aggregating data like a+b,a-b

BiFunction: Real time use for BiFunction is with map.replaceAll(BiFunction).
BiCunsumer: Real time use for BiCunsumer is map.forEach(BiCunsumer).
BiPredicate: To compare and get boolean


CompleteAbleFeature:It is used for asynchronous programming in java. It is used for background task without blocking main thread.
Using this performance will be increased because multiple task is splitted in different thread. After completion execution of feature it will notify main thread then we can use it for our user.
Why CompleteAbleFeature? : There are various way to implement asynchronous programming in java like Features,ExecutorService,Callback interfaces,
Thread Pools, etc. There are some disadvantages of using Features given below:
1. It cannot be manually completed.(Not possible to complete force fully)
2. Multiple features cannot be chained together.(After execution not possible to reuse it)
3. We cannot combine multiple features together.(After completing a lot of  features we cannot back to api finally)
4. No proper exception handling mechanism.()


Executor service framework:
Submit(Callable) vs Execute(Runnable) in Executor service framework:
Submit: Return after execution of thread
Execute: no return

CompletableFeature:
runAsync:execute task in background and no return finally.
supplyAsync:return something

CompletableFeature chain:
thenApply(Function): take input return value
thenAccept(Consumer): take input no return
thenRun(Runnable): take input no return





