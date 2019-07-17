 ArrayList<Integer> arr = new ArrayList<Integer>(n);
 where n is the size 
 if you dont wnat to give the size then its ok
 Methods in Java ArrayList:

forEach​(Consumer action): Performs the given action for each element of the Iterable until all 
                     elements have been processed or the action throws an exception.
retainAll​(Collection c): Retains only the elements in this list that are contained in the specified collection.
removeIf​(Predicate filter): Removes all of the elements of this collection that satisfy the given predicate.
contains​(Object o): Returns true if this list contains the specified element.
remove​(int index): Removes the element at the specified position in this list.
remove​(Object o): Removes the first occurrence of the specified element from this list, if it is present.
get​(int index): Returns the element at the specified position in this list.
subList​(int fromIndex, int toIndex): Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
spliterator​(): Creates a late-binding and fail-fast Spliterator over the elements in this list.
set​(int index, E element): Replaces the element at the specified position in this list with the specified element.
size​(): Returns the number of elements in this list.
removeAll​(Collection c): Removes from this list all of its elements that are contained in the specified collection.
ensureCapacity​(int minCapacity): Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.
listIterator​(): Returns a list iterator over the elements in this list (in proper sequence).
listIterator​(int index): Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list.
isEmpty​(): Returns true if this list contains no elements.
removeRange​(int fromIndex, int toIndex): Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
void clear(): This method is used to remove all the elements from any list.
void add(int index, Object element): This method is used to insert a specific element at a specific position index in a list.
void trimToSize(): This method is used to trim the capacity of the instance of the ArrayLis to the list’s current size.
int indexOf(Object O): The
index the first occurrence of a specific element is either returned, or -1 in case the element is not in the list.
int lastIndexOf(Object O): The index the last occurrence of a specific element is either returned, or -1 in case the element is not in the list.
Object clone(): This method is used to return a shallow copy of an ArrayList.
Object[] toArray(): This method is used to return an array containing all of the elements in the list in correct order.
Object[] toArray(Object[] O): It is also used to return an array containing all of the elements in this list in the correct order same as the previous method.
boolean addAll(Collection C): This method is used to append all the elements from a specific collection to the end of the mentioned list, in such a order that the values are returned by the specified collection’s iterator.
boolean add(Object o): This method is used to append a specificd element to the end of a list.
boolean addAll(int index, Collection C): Used to insert all of the elements starting at the specified position from a specific collection into the mentioned list.
