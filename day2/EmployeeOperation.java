package day2;

// Replacve with Server Code 

public class EmployeeOperation {
	
	// replace with Database
	Employee arr[] = new Employee[1000];
	// collection unlimitted data
	int index = 0;
	
	// method in Server to save Employee
	public boolean insertEmployee(Employee e)
	{
		// replace SQL insert Query
		arr[index++] = e;
		return true;
	}
	
								//	102
	public Employee getEmployeeByID(int searchId)
	{
		for (int i = 0; i < index; i++) {
		
			//   null.getEmployeeID();
			if(arr[i].getEmployeeId() == searchId)
			{
				return arr[i];
			}
		}
		return null; // if no match
	}


	public Employee[] getArr() {
		return arr;
	}


	public void setArr(Employee[] arr) {
		this.arr = arr;
	}


	public int getIndex() {
		return index;
	}


	public void setIndex(int index) {
		this.index = index;
	}
	
	
	

}
