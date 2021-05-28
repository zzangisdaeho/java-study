package run;

public class Uppercase {
	public static void main(String[] args) {
		
		String toSwitch = "SELECT\r\n" + 
				"                MAX(Gen_Rpa_Process_Status.first_Reg_Dtm) \r\n" + 
				"            FROM\r\n" + 
				"                Gen_Rpa_Process genRpaProcess   \r\n" + 
				"            LEFT JOIN\r\n" + 
				"                Gen_Rpa_Project genRpaProject WITH genRpaProcess.rpa_Project_Id = genRpaProject.rpa_Project_Id   \r\n" + 
				"            LEFT JOIN\r\n" + 
				"                Gen_Rpa_Process_Status genRpaProcessStatus WITH genRpaProcess.rpa_Process_Id = genRpaProcessStatus.rpa_Process_Id   \r\n" + 
				"            LEFT JOIN\r\n" + 
				"                Gen_Rpa_Process_Task genRpaProcessTask WITH genRpaProcess.rpa_Process_Id = genRpaProcessTask.rpa_Process_Id   \r\n" + 
				"            LEFT JOIN\r\n" + 
				"                Gen_Rpa_Task genRpaTask WITH genRpaTask.rpa_Task_Id = genRpaProcessTask.rpa_Task_Id   \r\n" + 
				"            LEFT JOIN\r\n" + 
				"                Gen_System genSystem WITH genRpaTask.system_Id = genSystem.system_Id \r\n" + 
				"            GROUP BY\r\n" + 
				"                gen_Rpa_Project.rpa_Project_Id,\r\n" + 
				"                gen_Rpa_Process.rpa_Process_Code,\r\n" + 
				"                gen_Rpa_Process.rpa_Process_Id,\r\n" + 
				"                gen_Rpa_Process_Task.rpa_Process_Task_Id,\r\n" + 
				"                gen_System.system_Id";
		
		String changed = toSwitch.toUpperCase();
		
		System.out.println(changed);
	}

}
