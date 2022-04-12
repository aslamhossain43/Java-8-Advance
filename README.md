# Java-8-Advance
Lambda expression can only applicable for functional interface.
Functional interface: The interface who contains only one abstract method but can have multiple default and static method is called functional interface.
Example: 
1. Runnable - run()
2. Callable - call()
3. Comparable - compareTo()
4. Comparator - compare()
In stream api
1. Consumer - accept(T t) - foreach
2. Predicate - test(T t) - filter
3. Supplier - get() - empty check forlist
Stream api: It is used to process list of objects.
map(): takes stream and return another transform stream.[a,b,c] > [A,B,C] used for one-to-one mapping
flarMap(): takes stream of stream and return another stream.[[1,2],[3,4]] > [1,2,3,4]

Concrete vs instance method:
Concreate method: not abstract
Instance method: not static

Optional<> is recommended to use in getter to avoid null.

Reduce: aggregating data like a+b,a-b




