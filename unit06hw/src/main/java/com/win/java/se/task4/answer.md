<h1 align = "center">Task 4. Collections usage</h1>
<table align = "center"  border="1">
   <tr align = "center">
      <td><b> </b></td>
      <td><b>Main Functionality</b></td>
      <td><b>Examples</b></td>
   </tr>
   <tr>
      <td>Set</td>
      <td>A Set is a Collection that cannot contain duplicate elements. It models the mathematical set abstraction. The Set interface contains only methods inherited from Collection and adds the restriction that duplicate elements are prohibited. Set also adds a stronger contract on the behavior of the equals and hashCode operations, allowing Set instances to be compared meaningfully even if their implementation types differ. Two Set instances are equal if they contain the same elements.
      </td>
      <td align="justify">Collection that has to not contain any duplicates.</td>
   </tr>
   <tr>
      <td>
         List
      </td>
      <td>
      A List is an ordered Collection. Lists may contain duplicate elements. In addition to the operations inherited from Collection, the List interface includes operations for the following:<br><br>  
          Positional access — manipulates elements based on their numerical position in the list. This includes methods such as get, set, add, addAll, and remove.<br>
          Search — searches for a specified object in the list and returns its numerical position. Search methods include indexOf and lastIndexOf.<br>
          Iteration — extends Iterator semantics to take advantage of the list's sequential nature. The listIterator methods provide this behavior.<br>
          Range-view — The sublist method performs arbitrary range operations on the list.
      </td>
      <td align="justify">
         Collection that has to contain a sequence of elements that may be duplicated.
      </td>
   </tr>
   <tr>
      <td>
         Queue
      </td>
      <td>
      A Queue is a collection for holding elements prior to processing. Besides basic Collection operations, queues provide additional insertion, removal, and inspection operations.
      </td>
      <td align="justify">
         Collection that holds elements waiting to be processed.
      </td>
   </tr>
   <tr>
      <td>Map</td>
      <td>
      A Map is an object that maps keys to values. A map cannot contain duplicate keys: Each key can map to at most one value. It models the mathematical function abstraction. The Map interface includes methods for basic operations (such as put, get, remove, containsKey, containsValue, size, and empty), bulk operations (such as putAll and clear), and collection views (such as keySet, entrySet, and values). 
      </td>
      <td>
      Collection that contains non-duplicate data associatated with individual keys. For instance, a phonebook.
      </td>
   </tr>
</table>