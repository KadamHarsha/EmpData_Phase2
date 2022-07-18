import java.sql.Date;

	public class EmpDetails {
		
		private String EMPLOYEE_ID;
		private String EMPLOYEE_NAME;
		//private String LAST_NAME;
		private String EMAIL;
		private String PHONE_NUMBER;
		private String HIRE_DATE;
		private String JOB_ID;
		private String SALARY;
		private String COMMISSION_PCT;
		private String MANAGER_ID;
		private String DEPARTMENT_ID;
		//private Date record_insDate;
		
		public String getEmployee_Id() {
			return EMPLOYEE_ID;
		}
		public void setEmployee_Id(String EMPLOYEE_ID) {
			this.EMPLOYEE_ID = EMPLOYEE_ID;
		}
		public String getEmployee_Name() {
			return EMPLOYEE_NAME;
		}
		public void setEmployee_Name(String EMPLOYEE_NAME) {
			this.EMPLOYEE_NAME = EMPLOYEE_NAME;
		}
		public String getEmail() {
			return EMAIL;
		}
		public void setEmail(String EMAIL) {
			this.EMAIL = EMAIL;
		}
		public String getPhone_number() {
			return PHONE_NUMBER;
		}
		public void setPhone_number(String PHONE_NUMBER) {
			this.PHONE_NUMBER = PHONE_NUMBER;
		}
		public String getHire_Date() {
			return HIRE_DATE;
		}
		public void setHire_Date(String HIRE_DATE) {
			this.HIRE_DATE = HIRE_DATE;
		}
		public String getJob_Id() {
			return JOB_ID;
		}
		public void setJob_Id(String JOB_ID) {
			this.JOB_ID = JOB_ID;
		}
		public String getSalary() {
			return SALARY;
		}
		public void setSalary(String SALARY) {
			this.SALARY = SALARY;
		}
		public String getCommission_Pct() {
			return COMMISSION_PCT;
		}
		public void setCommission_Pct(String COMMISSION_PCT) {
			this.COMMISSION_PCT = COMMISSION_PCT;
		}
		public String getManager_Id() {
			return MANAGER_ID;
		}
		public void setManager_Id(String MANAGER_ID) {
			this.MANAGER_ID = MANAGER_ID;
		}
		public String getDepartment_Id() {
			return DEPARTMENT_ID;
		}
		public void setDepartment_Id(String DEPARTMENT_ID) {
			this.DEPARTMENT_ID = DEPARTMENT_ID;
		}
		/*public Date getRecord_insDate() {
			return record_insDate;
		}
		public void setRecord_insDate(Date record_insDate) {
			this.record_insDate = record_insDate;
		}*/
	}
