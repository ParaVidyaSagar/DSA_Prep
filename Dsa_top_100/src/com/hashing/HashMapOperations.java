package com.hashing;

import java.util.HashMap;
import java.util.Map;
/*
 HashMap (and Map) Methods
Basic Operations
● HashMap<K, V>() - Constructor creates empty map
● HashMap<K, V>(Map<? extends K, ? extends V> m) - Constructor with map
● size() - Returns number of key-value mappings
● isEmpty() - Checks if map contains no mappings
● put(K key, V value) - Associates key with value
● get(Object key) - Returns value for key or null
● getOrDefault(Object key, V defaultValue) - Returns value or default
● remove(Object key) - Removes mapping for key
● clear() - Removes all mappings
Checking Map Contents
● containsKey(Object key) - True if map contains key
● containsValue(Object value) - True if map maps to value
Bulk Operations
● putAll(Map<? extends K, ? extends V> m) - Copies all mappings
● putIfAbsent(K key, V value) - Adds mapping if key not present
Map Views
● keySet() - Returns Set view of keys
LinkedIn: Japneet Sachdeva
● values() - Returns Collection view of values
● entrySet() - Returns Set view of mappings
Java 8+ Enhancements
● forEach(BiConsumer<? super K, ? super V> action) - Performs action for each entry
● replaceAll(BiFunction<? super K, ? super V, ? extends V> function) - Replaces all values
● compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) - Computes value
● computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) - If key absent
● computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) - If key present
● merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) - Merges values 
 */
public class HashMapOperations {
	public static void main(String[] args) {
        // Basic Constructor
        HashMap<Integer, String> map1 = new HashMap<>();
        System.out.println("Initial map1: " + map1);

        // put() - Add key-value pairs
        map1.put(1, "Java");
        map1.put(2, "Python");
        map1.put(3, "C++");
        System.out.println("After put: " + map1);

        // putIfAbsent()
        map1.putIfAbsent(2, "Rust");  // Will not replace
        map1.putIfAbsent(4, "Go");    // Will insert
        System.out.println("After putIfAbsent: " + map1);

        // get() and getOrDefault()
        System.out.println("Get key 3: " + map1.get(3));
        System.out.println("Get key 5 with default: " + map1.getOrDefault(5, "Not Found"));

        // size() and isEmpty()
        System.out.println("Size of map1: " + map1.size());
        System.out.println("Is map1 empty? " + map1.isEmpty());

        // containsKey() and containsValue()
        System.out.println("Contains key 2? " + map1.containsKey(2));
        System.out.println("Contains value 'Java'? " + map1.containsValue("Java"));

        // remove()
        map1.remove(1);
        System.out.println("After remove key 1: " + map1);

        // clear() example
        HashMap<Integer, String> tempMap = new HashMap<>(map1); // for restore
        map1.clear();
        System.out.println("After clear(): " + map1);
        map1.putAll(tempMap); // restore
        System.out.println("After restore with putAll(): " + map1);

        // Constructor with another Map
        Map<Integer, String> map2 = new HashMap<>(map1);
        map2.put(5, "Kotlin");
        System.out.println("\nmap2 (constructed from map1): " + map2);

        // Map views: keySet(), values(), entrySet()
        System.out.println("Keys: " + map2.keySet());
        System.out.println("Values: " + map2.values());
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Java 8+ forEach()
        System.out.println("\nforEach:");
        map2.forEach((key, value) -> System.out.println(key + ": " + value));

        // Java 8+ replaceAll()
        map2.replaceAll((key, value) -> value.toUpperCase());
        System.out.println("After replaceAll (uppercase): " + map2);

        // Java 8+ compute()
        map2.compute(3, (key, value) -> value + "-LANG");
        System.out.println("After compute key 3: " + map2);

        // computeIfAbsent()
        map2.computeIfAbsent(6, key -> "Swift");
        System.out.println("After computeIfAbsent key 6: " + map2);

        // computeIfPresent()
        map2.computeIfPresent(2, (key, value) -> value + "-PRO");
        System.out.println("After computeIfPresent key 2: " + map2);

        // merge()
        map2.merge(5, "Script", (oldVal, newVal) -> oldVal + "+" + newVal);
        System.out.println("After merge key 5: " + map2);
    }
}
