package com.ust.essportal.Project_ESS_Portal;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ust.essportal.dto.EmployeeInfo;
import com.ust.essportal.dto.LeaveInfo;


public class MainClass {

	public static void main(String[] args) {


		int ch;
		int eID;
		String eName;
		String eType;
		String email;
		String password;
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;

		System.out.println("1.Register Employee");
		System.out.println("2.Login");
		ch = sc.nextInt();
		switch (ch) {
		case 1: {
			System.out.println("Enter employeeID=>");
			eID = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter employee Name=>");
			eName = sc.nextLine();
			System.out.println("Enter employee Type=>");
			eType = sc.nextLine();
			System.out.println("Enter employee email=>");
			email = sc.nextLine();
			System.out.println("Enter employee password=>");
			password = sc.nextLine();

			EmployeeInfo ei = new EmployeeInfo();
			ei.setEmployee_ID(eID);
			ei.setEmployee_Name(eName);
			ei.setEmployee_Type(eType);
			ei.setEmail(email);
			ei.setPassword(password);

			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();

			try {
				et.begin();
				em.persist(ei);
				System.out.println("Registered Successfully");
				et.commit();
			} catch (Exception e) {
				et.rollback();
				e.printStackTrace();
			} finally {
				em.close();
			}

		} // case1
			break;
		case 2: {
			System.out.println("Enter employee id and password=>");
			eID = sc.nextInt();
			sc.nextLine();
			password = sc.nextLine();
			EmployeeInfo ei = new EmployeeInfo();
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			EmployeeInfo ei1 = em.find(EmployeeInfo.class, eID);
			boolean b = em.contains(ei1);
			String pass = ei1.getPassword();
			if (b) {
				if (pass == password) {
					System.out.println("Login failed");
				} else {
					System.out.println("Login successfully");

					String type = ei1.getEmployee_Type();
					System.out.println(type);
					if (type.equals("manager")) {
						System.out.println("1.Show all leaves");
						System.out.println("2.Approve/Reject Leave");
						ch = sc.nextInt();
						switch (ch) {
						case 1: {
							
							emf = Persistence.createEntityManagerFactory("TestPersistence");
							em = emf.createEntityManager();
							String query = " from LeaveInfo";
							Query query1 = em.createQuery(query);
							List<LeaveInfo> result=query1.getResultList();
							
							  System.out.println("EmployeeId"+"   "+"Leave date"+"   "+"Leave Status   ");
							  for(LeaveInfo leave:result) {
							  System.out.println(leave.getEmpId()+"        "+ leave.getDate()+"        "+leave.
							  getLeave_Status()); }
						}
							break;
						case 2:{
							emf=Persistence.createEntityManagerFactory("TestPersistence");
							em=emf.createEntityManager();
							et=em.getTransaction();
							et.begin();
							System.out.println("Enter id to update status");
							int id=sc.nextInt();
							sc.nextLine();
							System.out.println("Enter status");
							String stat=sc.nextLine();
							LeaveInfo li1=em.find(LeaveInfo.class, id);
							li1.setLeave_Status(stat);
							em.persist(li1);
							et.commit();
						}
							break;
						default:
							System.out.println("Wrong Choice");

						}
					}else {
						
						System.out.println("1.Show all leaves");
						System.out.println("2.request new leaves");
						ch=sc.nextInt();
						switch(ch) {
						case 1:{
							emf=Persistence.createEntityManagerFactory("TestPersistence");
							em=emf.createEntityManager();
							int eid=ei1.getEmployee_ID();
							LeaveInfo li=em.find(LeaveInfo.class, eid);
							System.out.println(li.getEmpId());
							System.out.println(li.getDate());
							System.out.println(li.getLeave_Status());
						}
							break;
						case 2:{
							emf = Persistence.createEntityManagerFactory("TestPersistence");
							em = emf.createEntityManager();
							et=em.getTransaction();
							System.out.println("Enter id");
							int empId=sc.nextInt();
							sc.nextLine();
							System.out.println("Enter date");
							String date=sc.nextLine();
							LeaveInfo li=new LeaveInfo();
							et.begin();
							li.setEmpId(empId);
							li.setDate(date);
							em.persist(li);
							et.commit();
						}
							break;
							default:System.out.println("Wrong choice");
						}
					}
				}
			} else {
				System.out.println("User doesn't exist");
			}
		}
			break;
		default:
			System.out.println("Wrong choice");
		}
	

	

	}

}
