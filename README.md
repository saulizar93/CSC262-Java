# CSC262-Java
Java class

In Java, Arrays and ArrayLists are different. They are both used to store a collection of elements, but their functionality is different. 
Their differences:
1. Types of elements: Arrays can only hold one type of elements (ex: int only, or String only, etc). On the other hand, ArrayLists can hold elements of any type, to include objects.
2. Size: Arrays have a fixed length, and ArrayLists can dynamically resize themselves.
3. Mutability: In Arrays, after initialization, its size and element types cannot be changed. In ArrayLists, elements can be added, removed, or modified after the ArrayList has been created.
4. Performance: Arrays are typically better performers due to their direct element access based on index. ArrayLists may take longer to account for its dynamic resizing and use of wrapper objects for elements. 
5. Generics: Arrays do not work well with generics, as you cannot create an array of a generic type. On the other hand, ArrayLists can be used with generics to create type-safe collections.
6. Usage: Arrays are used when the size of the collection is known in advance and will not change. ArrayLists are used when the size of the collection may change or when working with collections of objects or varying element types. 