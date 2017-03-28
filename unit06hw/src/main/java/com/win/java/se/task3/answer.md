```java
class MedicalStaff{}
class Doctor extends MedicalStaff{}
class Nurse extends MedicalStaff{}
class HeadDoctor extends Doctor{}
```

<h1 align = "center">Task 3. References involving collections</h1>
<table border="1">
	<tr align = "center">
		<td><b>Action</b></td>
		<td><b>Correct</b></td>
		<td><b>Incorrect</b></td>
	</tr>
	<tr>
		<td>Doctor doctor1 = new Doctor();</td>
		<td>[+]</td>
		<td>[ ]</td>
	</tr>
	<tr>
		<td>Doctor doctor2 = new MedicalStaff();</td>
		<td>[ ]</td>
		<td>[+]</td>
	</tr>
	<tr>
		<td>Doctor doctor3 = new HeadDoctor();</td>
		<td>[+]</td>
		<td>[ ]</td>
	</tr>
	<tr>
		<td>Object object1 = new HeadDoctor();</td>
		<td>[+]</td>
		<td>[ ]</td>
	</tr>
	<tr>
		<td>HeadDoctor doctor5 = new Object();</td>
		<td>[ ]</td>
		<td>[+]</td>
	</tr>
	<tr>
		<td>Doctor doctor6 = new Nurse();</td>
		<td>[ ]</td>
		<td>[+]</td>
	</tr>
	<tr>
		<td>Nurse nurse = new Doctor();</td>
		<td>[ ]</td>
		<td>[+]</td>
	</tr>
	<tr>
		<td>Object object2 = new Nurse();</td>
		<td>[+]</td>
		<td>[ ]</td>
	</tr>
	<tr>
		<td colspan="4" align = "center"> </td>
	</tr>
	<tr>
		<td>List&lt;Doctor&gt; list1= new ArrayList&lt;Doctor&gt;();</td>
		<td>[+]</td>
		<td>[ ]</td>
	</tr>
	<tr>
		<td>List&lt;MedicalStaff&gt; list2 = new ArrayList&lt;Doctor&gt;();</td>
		<td>[ ]</td>
		<td>[+]</td>
	</tr>
	<tr>
		<td>List&lt;Doctor&gt; list3 = new ArrayList&lt;MedicalStaff&gt;();</td>
		<td>[ ]</td>
		<td>[+]</td>
	</tr>
	<tr>
		<td>List&lt;Object&gt; list4 = new ArrayList&lt;Doctor&gt;();</td>
		<td>[ ]</td>
		<td>[+]</td>
	</tr>
	<tr>
		<td>List&lt;Object&gt; list5 = new ArrayList&lt;Object&gt;();</td>
		<td>[+]</td>
		<td>[ ]</td>
	</tr>
</table>