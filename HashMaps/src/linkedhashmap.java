LinkedHashMap in Java
LinkedHashMap is just like HashMap with an additional feature of maintaining an order of elements inserted into it. HashMap provided the advantage of quick insertion, search and deletion but it never maintained the track and order of insertion which the LinkedHashMap provides where the elements can be accessed in their insertion order. Few important features of LinkedHashMap are as follows:

A LinkedHashMap contains values based on the key. It implements the Map interface and extends HashMap class.
It contains only unique elements (See this for details)..
It may have one null key and multiple null values (See this for details).
It is same as HashMap with additional feature that it maintains insertion order. For example, when we ran the code with HashMap, we got different oder of elements (See this).
Declaration:

LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
Constructors in LinkedHashMap:
The LinkedHashMap accepts five types of constructors:

LinkedHashMap(): This is used to construct a default LinkedHashMap constuctor.
LinkedHashMap(int capacity): It is used to initialize a particular LinkedHashMap with a specified capacity.
LinkedHashMap(Map m_a_p): It is used to initialize a particular LinkedHashMap with the elements of the specified map.
LinkedHashMap(int capacity, float fillRatio): It is used to initialize both the capacity and fill ratio for a LinkedHashMap.
LinkedHashMap(int capacity, float fillRatio, boolean Order): This constructor is also used to initialize both the capacity and fill ratio for a LinkedHashMap along with whether to follow the insertion order or not.
True is passed for last access order.
False is passed for insertion order.
Basic Operations of LinkedHashMap class:

filter_none
edit
play_arrow

brightness_4
// Java program to demonstrate working of LinkedHashMap 
import java.util.*; 
  
public class BasicLinkedHashMap 
{ 
    public static void main(String a[]) 
    { 
        LinkedHashMap<String, String> lhm = 
                       new LinkedHashMap<String, String>(); 
        lhm.put("one", "practice.geeksforgeeks.org"); 
        lhm.put("two", "code.geeksforgeeks.org"); 
        lhm.put("four", "quiz.geeksforgeeks.org"); 
  
        // It prints the elements in same order  
        // as they were inserted     
        System.out.println(lhm); 
  
        System.out.println("Getting value for key 'one': " 
                                       + lhm.get("one")); 
        System.out.println("Size of the map: " + lhm.size()); 
        System.out.println("Is map empty? " + lhm.isEmpty()); 
        System.out.println("Contains key 'two'? "+  
                                  lhm.containsKey("two")); 
        System.out.println("Contains value 'practice.geeks"
        +"forgeeks.org'? "+ lhm.containsValue("practice"+ 
        ".geeksforgeeks.org")); 
        System.out.println("delete element 'one': " +  
                           lhm.remove("one")); 
        System.out.println(lhm); 
    } 
} 
Output:
{one=practice.geeksforgeeks.org, two=code.geeksforgeeks.org, 
                                  four=quiz.geeksforgeeks.org}
Getting value for key 'one': practice.geeksforgeeks.org
Size of the map: 3
Is map empty? false
Contains key 'two'? true
Contains value 'practice.geeksforgeeks.org'? true
delete element 'one': practice.geeksforgeeks.org
{two=code.geeksforgeeks.org, four=quiz.geeksforgeeks.org}
Methods in LinkedHashMap:

void clear(): This method is used to remove all the mappings from the map.
boolean containsKey(Object key): This method is used to returns true if a specified element is mapped by one or more keys.
Object get(Object key): The method is used to retrieve or fetch the value mapped by the specified key.
protected boolean removeEldestEntry(Map.Entry eldest): The method is used to return true when the map removes its eldest entry from the map.
entrySet​(): This method returns a Set view of the mappings contained in this map.
forEach​(BiConsumer<K,V> action): This method Performs the given action for each entry in this map until all entries have been processed or the action throws an exception.
getOrDefault​(Object key, V defaultValue): This method returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
keySet​(): This method returns a Set view of the keys contained in this map.
removeEldestEntry​(Map.Entry<K,V> eldest): This method returns true if this map should remove its eldest entry.
replaceAll​(BiFunction<K,V> function): This method replaces each entry’s value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.
values​(): This method returns a Collection view of the values contained in this map.
collectionjava
