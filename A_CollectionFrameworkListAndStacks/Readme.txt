1.Java Collection Framework
2.Java Collection Interface
3.Java List Interface
4.Java Arraylist
5.Java LinkedList
6.Java Vector
7.Java Stack

It provides <set of interfaces> and <classes> to implement various data structures and
algorithms.

These interfaces include several methods to perform different operations
and collections.


Collection
    ^
    | <- List
    | <- Set   <- SortedSet
    | <- Queue <- Deque


Map <- SortedMap

Iterator <- ListIterator


Java Collection Interface

Collection interface includes various methods that can be used to perform different
operations on objects.

int size()                 -> Returns number of element in collection
Boolean isEmpty()          -> Returns true if collection contains no elements
boolean contains(Object o) -> Returns true if collection contains specified elements
boolean add(E e)           -> Adds the specific element to collection if it is present
boolean remove(Object o)   -> Removes a single element from the collection if it is present
boolean containsAll(Collecti0on<> c) -> Returns true if the collection contains all the
                                        elements of the specified collection
boolean addAll(Collection<> c) -> Adds all elements from the specified collection to the collection
boolean removeAll(Collection<> c) -> Removes all elements in the collection that are also contained
                                     in the specified collection
boolean retainAll(Collectio<> c) -> Removes all elements from the collection that are not present
                                    in the specified collection
void clear() -> Removes all elements from the collection
Object[] toArray() : Returns an array containing all elements in the collection


Java List interface :

The list interface extends the collection interface.
It adds method that are specific to lists, which are ordered collections that allow
duplicate elements.

Here are some methods that are present in the list interface but not in the collection
interface :


List (Interface)
|<-ArrayList  (Class)
|<-LinkedList (Class)
|<-A_CollectionFrameworkListAndStacks.C_Stack      (Class)
|<-Vector     (Class)


Note : Why we use these classes because we cannot create object of interface so we use these
       classes



List innterface specific methods :
get(int index)
set(int index, E element)
add(int index, E element)
remove(int index)


Java  ArrayList :

It is a Dynamic array it allow us to create resizable array it can automatically
adjusts their capacity when we add or remove elements. Hence they are also known as dynamic array.

The array has certain capacity when capacity reached arraylist creates a new larger array
and copies the element from old to new one. This process is transparent to user.

However this resizinng operation lead to perfromance overhead.
for resizing - size * 3/2


Java LinkedList :

This LinkedList class of java collections framework provides the functionality
of the linked list data structure.

Elements in linkedlist are not stored in sequence.
Internal working is same as Linkedlist.
Instead they are scattered and connected through links(Prev and Next)


Java Vector:

Vector class synchronizes each individual operation.
To support Multithreading.
Lock - operation - release in each operation
It is less efficient as compare to arraylist because of overhead of lock and release
In arraylist method are not synchronized



Java A_CollectionFrameworkListAndStacks.C_Stack:

It is type of lifo data structure.
Elements are added to top and removed from top of stack
void push()
E pop()
E peek()
boolean empty()



