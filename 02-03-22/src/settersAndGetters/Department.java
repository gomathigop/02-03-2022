package settersAndGetters;


	public class Department
	{
		
		private int deptId;
		private String deptName;
		
		public Department()
		{
			
		}

		//setter and getter methods
		public int getDeptId() {
			return deptId;
		}

		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}

		public String getDeptName() {
			return deptName;
		}

		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		
		public static void main(String[] args) {
			
			
			Department department = new Department();
			
			//set the values 
			
			department.setDeptId(2345);
			department.setDeptName("TCS");
			
			//get the values
			System.out.println(department.getDeptId());
			System.out.println(department.getDeptName());
			
		}

	}




