package com.example.implementFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.VelocityException;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.HL7.hl7templateGenerate.MyApplicationBean;
import com.example.implementationHelper.*;
import com.example.implementationHelper.EnumClass.AdmissionType;
import com.example.implementationHelper.EnumClass.FamilyName;
import com.example.implementationHelper.EnumClass.FirstName;
import com.example.implementationHelper.EnumClass.Gender;
import com.example.implementationHelper.EnumClass.MartialStatus;
import com.example.implementationHelper.EnumClass.MiddleName;
import com.example.implementationHelper.EnumClass.PatientClass;
import com.example.implementationHelper.EnumClass.Relationship;
import com.example.implementationHelper.EnumClass.Religion;


@Component
public class ADT 
{
	
	
	public final String ADMIT_NUMBER_PREFIX = "P";
	public final String EMPLOYEE_ID_PREFIX = "E";
	public final String VISIT_NUMBER_PREFIX = "00000";
	
	
	@Autowired
	MyApplicationBean MyAppBean;
	

	
	
	
	public static void generateAdt(String filePath,String fileNamePattern,String fileExtension,long numberOfFilesToBeGenerated)throws VelocityException, IOException 
	{
				
				
		DifferentLists dL = new DifferentLists();

		Variables v = new Variables();
		
		v.setAl(1);

		v.setAuthorId(2125);

		v.setSetId(1);

		v.setPre("P");

		v.setTotalCount(0);

		v.setS("00000");

		v.setEmp("E");

		v.setIdnumber(100001);

		int al = v.getAl();
		int authorId = v.getAuthorId();
		int setId = v.getSetId();
		String pre = v.getPre();

		int totalCount = v.getTotalCount();
		String s = v.getS();
		String emp = v.getEmp();
		int Idnumber = v.getIdnumber();

		Random random_method = new Random();

		dL.addList();
		ArrayList<String> l = dL.getL();

		dL.addList1();
		ArrayList<String> l1 = dL.getL1();

		dL.addList2();
		ArrayList<String> l2 = dL.getL2();

		dL.addList3();
		ArrayList<String> l3 = dL.getL3();

		dL.addList4();
		ArrayList<String> l4 = dL.getL4();
		
		dL.addList6();
		ArrayList<String> l6 = dL.getL6();
		
		dL.addList7();
		ArrayList<String> l7 = dL.getL7();
		
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());

		ve.init();
		VelocityContext context = new VelocityContext();
		Template t = ve.getTemplate("templates/ADT_A08_02.vm");

		// SenderCode
		String s1 = StringGenerationMethod.getRandomNumberString9();
		String s2 = StringGenerationMethod.getRandomNumberString4();
		String s3 = StringGenerationMethod.getRandomNumberString7();
		String s4 = s1.substring(0, 1) + "." + s1.substring(1, 4) + "." + s1.substring(4, 6) + "." + s1.substring(6, 8)
				+ s1.substring(8) + s2 + s3.substring(0) + "." + s3.substring(1, 3) + "." + s3.substring(3, 7);
		for (int counter = 1; counter <= numberOfFilesToBeGenerated; counter++)

		{
			context.put("alinfo", al);
			al++;
			context.put("authorId", authorId);
			authorId++;
			context.put("SetId", setId);
			setId++;
			EnumClass.FamilyName fn1 = FamilyName.randomFirstName();
			// FamilyName fn1 = FamilyName.randomFirstName();
			context.put("docFamilyName", fn1);
			EnumClass.FirstName firn1 = FirstName.randomFirstName();
			// FirstName firn1 = FirstName.randomFirstName();
			context.put("docgivenName", firn1);
			EnumClass.MiddleName mn1 = MiddleName.randomMiddleName();
			// MiddleName mn1 = MiddleName.randomMiddleName();
			context.put("docMiddleName", mn1);
			EnumClass.FamilyName fn2 = FamilyName.randomFirstName();
			// FamilyName fn2 = FamilyName.randomFirstName();
			context.put("GuarantorFamilyName", fn2);
			EnumClass.FirstName firn2 = FirstName.randomFirstName();
			// FirstName firn2 = FirstName.randomFirstName();
			context.put("GuarantorGivenName", firn2);
			EnumClass.MiddleName mn2 = MiddleName.randomMiddleName();
			// MiddleName mn2 = MiddleName.randomMiddleName();
			context.put("GuarantorMiddleName", mn2);
			EnumClass.FamilyName fn3 = FamilyName.randomFirstName();
			// FamilyName fn3 = FamilyName.randomFirstName();
			context.put("RelativeFamilyName", fn3);
			EnumClass.FirstName firn3 = FirstName.randomFirstName();
			// FirstName firn3 = FirstName.randomFirstName();
			context.put("RelativeGivenName", firn3);
			EnumClass.MiddleName mn3 = MiddleName.randomMiddleName();
			// MiddleName mn3 = MiddleName.randomMiddleName();
			context.put("RelativeMiddleName", mn3);
			EnumClass.FamilyName fn4 = FamilyName.randomFirstName();
			// FamilyName fn4 = FamilyName.randomFirstName();
			context.put("FamilyName", fn4);
			EnumClass.FirstName firn4 = FirstName.randomFirstName();
			// FirstName firn4 = FirstName.randomFirstName();
			context.put("Name", firn4);
			EnumClass.MiddleName mn4 = MiddleName.randomMiddleName();
			// MiddleName mn4 = MiddleName.randomMiddleName();
			context.put("middleName", mn4);
			EnumClass.FamilyName fn5 = FamilyName.randomFirstName();
			// FamilyName fn5 = FamilyName.randomFirstName();
			context.put("famName1", fn5);
			EnumClass.FirstName firn5 = FirstName.randomFirstName();
			// FirstName firn5 = FirstName.randomFirstName();
			context.put("GivenName1", firn5);
			EnumClass.MiddleName mn5 = MiddleName.randomMiddleName();
			// MiddleName mn5 = MiddleName.randomMiddleName();
			context.put("SecondName1", mn5);

			EnumClass.Gender gender = Gender.randomGender();
			// gender = Gender.randomGender();
			context.put("gender", gender);

			EnumClass.MartialStatus martialStatus = MartialStatus.randomMartialStatus();
			// martialStatus = MartialStatus.randomMartialStatus();
			context.put("martialStatus", martialStatus);
			EnumClass.Religion religion = Religion.randomReligion();
			// religion = Religion.randomReligion();
			context.put("Religion", religion);
			String doId = StringGenerationMethod.getRandomNumberString();
			context.put("docId", doId);
			String preAdmitNum = pre + StringGenerationMethod.getRandomNumberString();
			context.put("preAdmitNum", preAdmitNum);
			// GuarantorNumber
			// PV IDENTIFIER
			// REASON FOR ADMIT
			// zipcode
			String zpcode = StringGenerationMethod.getRandomNumberString5();
			context.put("zipCode", zpcode);
			String patVisitId = StringGenerationMethod.getRandomNumberString4();
			context.put("PatientId", patVisitId);

			EnumClass.AdmissionType at = AdmissionType.randomAdmissionType();
			// AdmissionType at = AdmissionType.randomAdmissionType();
			context.put("AdmissionType", at);

			EnumClass.PatientClass pc = PatientClass.randomPatientClass();
			// PatientClass pc = PatientClass.randomPatientClass();
			context.put("PatientClass", pc);
			// visitNumber
			String visitNumber = StringGenerationMethod.getRandomNumberString7();
			visitNumber = s + visitNumber;
			context.put("visitNumber", visitNumber);
			// relationship
			EnumClass.Relationship re = Relationship.randomRelationship();
			// Relationship re = Relationship.randomRelationship();
			context.put("relationship", re);

			context.put("SendingF", s4);
			// EmployeeId
			String employeeId = emp + StringGenerationMethod.getRandomNumberString();
			context.put("employeeId", employeeId);
			// IDnumber in PID
			context.put("idNumber", Idnumber);
			Idnumber++;

			int minh = 1;
			int maxh = 22;
			int minm = 1;
			int maxm = 58;
			int mins = 1;
			int maxs = 58;
			Random random = new Random();
			int hour = random.nextInt(maxh + minh) + minh;
			int min = random.nextInt(maxm + minm) + minm;
			int sec = random.nextInt(maxs + mins) + mins;
			String hh = Integer.toString(hour);
			String mm = Integer.toString(min);
			String ss = Integer.toString(sec);
			int hour1 = hour + 1;
			int min1 = min + 1;
			int sec1 = sec + 1;
			String hh1 = Integer.toString(hour1);
			String mm1 = Integer.toString(min1);
			String ss1 = Integer.toString(sec1);
			int hour2 = hour - 1;
			int min2 = min - 1;
			int sec2 = sec - 1;
			String hh2 = Integer.toString(hour2);
			String mm2 = Integer.toString(min2);
			String ss2 = Integer.toString(sec2);

			if (hh.length() == 1) 
			{
				hh = "0" + hh;
			}
			if (mm.length() == 1)
			{
				mm = "0" + mm;
			}
			if (ss.length() == 1)
			{
				ss = "0" + ss;
			}
			if (hh1.length() == 1)
			{
				hh1 = "0" + hh1;
			}
			if (mm1.length() == 1) 
			{
				mm1 = "0" + mm1;
			}
			if (ss1.length() == 1) 
			{
				ss1 = "0" + ss1;
			}
			if (hh2.length() == 1)
			{
				hh2 = "0" + hh2;
			}
			if (mm2.length() == 1)
			{
				mm2 = "0" + mm2;
			}
			if (ss2.length() == 1) 
			{
				ss2 = "0" + ss2;
			}

			// date
			LocalDate dateOfBirth = DateMethods.dateGenerator();
			String s9 = dateOfBirth.toString();
			String admitDate1[] = s9.split("-", 3);
			int yy5 = Integer.parseInt(admitDate1[0]);
			int mm5 = Integer.parseInt(admitDate1[1]);
			int dd5 = Integer.parseInt(admitDate1[2]);

			LocalDate messageTime = DateMethods.dateGenerator(yy5, mm5, dd5);
			String s8 = messageTime.toString();

			s8 = messageTime.toString();
			String messageTime1[] = s8.split("-", 3);

			int yy4 = Integer.parseInt(messageTime1[0]);
			int mm4 = Integer.parseInt(messageTime1[1]);
			int dd4 = Integer.parseInt(messageTime1[2]);

			LocalDate AdmitDate = DateMethods.dateGenerator4(yy5, mm5, dd5, yy4, mm4, dd4);
			// System.out.println(System.out.println(dd4););

			String dnum1 = StringGenerationMethod.getRandomNumberString5();
			context.put("dNum", dnum1);
			String mesTime = messageTime.toString() + hh + mm + ss;

			mesTime = mesTime.replaceAll("[^a-zA-Z0-9]", "");
			context.put("messageTime", mesTime);

			String dateBirth = dateOfBirth.toString();
			context.put("dateBirth2", dateBirth);

			dateBirth = dateBirth.replaceAll("[^a-zA-Z0-9]", "");
			context.put("dateOfBirth", dateBirth);

			String admitTime = AdmitDate.toString() + hh + mm + ss;
			admitTime = admitTime.replaceAll("[^a-zA-Z0-9]", "");
			context.put("AdmitTime", admitTime);
			String dischargeTIME = AdmitDate.toString() + hh1 + mm1 + ss1;
			dischargeTIME = dischargeTIME.replaceAll("[^a-zA-Z0-9]", "");
			context.put("dischargeTime", dischargeTIME);
			String expAdmit = AdmitDate.toString().replaceAll("[^a-zA-Z0-9]", "");
			String expDischarge = AdmitDate.toString().replaceAll("[^a-zA-Z0-9]", "");

			context.put("expAdmit", expAdmit);
			context.put("expDischarge", expDischarge);
			context.put("admit", admitTime);

			context.put("sigDate", expDischarge);
			context.put("illdATE", admitTime);
			context.put("adjustCode", expDischarge);

			int index = random_method.nextInt(l.size());
			String eve = l.get(index);
			context.put("eveReason", eve);
//			int index1 = random_method.nextInt(l1.size());
//			context.put("ob1", l1.get(index1));
//			int index2 = random_method.nextInt(l1.size());
//			context.put("ob2", l1.get(index2));
//			int index4 = random_method.nextInt(l1.size());
//			context.put("ob4", l1.get(index4));
//			int index5 = random_method.nextInt(l1.size());
//			context.put("ob5", l1.get(index5));
//			int index6 = random_method.nextInt(l1.size());
//			context.put("ob6", l1.get(index6));
//			int index7 = random_method.nextInt(l1.size());
//			context.put("ob7", l1.get(index7));
//			int index8 = random_method.nextInt(l1.size());
//			context.put("ob8", l1.get(index8));
//			int index9 = random_method.nextInt(l1.size());
//			context.put("ob9", l1.get(index9));
//			int index10 = random_method.nextInt(l1.size());
//			context.put("ob10", l1.get(index10));

			int ind = random_method.nextInt(l2.size());
			String awe = l2.get(ind);
			context.put("description", awe);

			int ind1 = random_method.nextInt(l2.size());
			String awe1 = l2.get(ind1);
			context.put("description1", awe1);

			int ind3 = random_method.nextInt(l2.size());
			String awe3 = l2.get(ind3);
			context.put("description2", awe3);

			int ind4 = random_method.nextInt(l2.size());
			String awe4 = l2.get(ind4);
			context.put("description3", awe4);

			int ind5 = random_method.nextInt(l2.size());
			String awe5 = l2.get(ind5);
			context.put("description4", awe5);

			int ind6 = random_method.nextInt(l2.size());
			String awe6 = l2.get(ind6);
			context.put("description5", awe6);

			int ind7 = random_method.nextInt(l2.size());
			String awe7 = l2.get(ind7);
			context.put("description6", awe7);

			int ind8 = random_method.nextInt(l2.size());
			String awe8 = l2.get(ind8);
			context.put("description7", awe8);

			int ind9 = random_method.nextInt(l2.size());
			String awe9 = l2.get(ind9);
			context.put("description8", awe9);

			int ind2 = random_method.nextInt(l3.size());
			String aw = l3.get(ind2);
			context.put("location", aw);

			int all = random_method.nextInt(l4.size() - 1);
			String awq = l4.get(all);
			context.put("allergy", awq);

			StringWriter w = new StringWriter();

			t.merge(context, w);


			String path = filePath + fileNamePattern + counter + "." + fileExtension;
			//String path =  "C:\\\\Users\\\\AnmolGoel\\\\Desktop\\\\Payloads19122022\\\\ADT\\\\" + "payLoad" + counter+"."+ "hl7";
			File fout = new File(path);
			FileOutputStream fos = new FileOutputStream(fout);

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			bw.write(w.toString().trim());
			bw.newLine();


			int num = StringGenerationMethod.getRandomNumber(1,11 );
			int num2 = 	StringGenerationMethod.getRandomNumber(num+1, 25);
			for (int i = 1; i <= num; i++) {
				int des = random_method.nextInt(l6.size());


				String ans = "OBX|" + i + "|ST|" + l6.get(des) ;
				bw.write(ans);
				bw.newLine();

			}
			for (int i = num+1; i <= num2; i++) {
				int des = random_method.nextInt(l7.size());


				String ans = "OBX|" + i + "|TX|" + l7.get(des) ;
				bw.write(ans);
				bw.newLine();

			}
			
			String a = "AL1|1||"+ awq + "|^^||";
			bw.write(a);
			bw.newLine();
			
		//	DG1|1||$description|||F|||||||||||||
			int num3 = 	StringGenerationMethod.getRandomNumber(1, 9);
			for (int i = 1; i <= num3; i++) {
				int des = random_method.nextInt(l2.size());


				String ans = "DG1|" + i +"||"+ l2.get(des) + "|||F|||||||||||||" ;
				bw.write(ans);
				bw.newLine();

			}
			
			String gt = "GT1|1||"+ fn2+ "^" + mn2+"^"+firn2+"^"+"||8 CORABEL LN^^NEPENTHE^CA^54904^USA|(408)-355-9426^ihatetheborg@yahoo.com||23530408|||Self||||||^^^^||||||||||||||||||||||||||||||||||||||";
			bw.write(gt);
			bw.newLine();
			
			String in = "IN1|1|SFP-001^SFRETIREMENT/SC-231-427/Admiral/SFR|SC-231-427|STARFLEET RETIREMENT|PO BOX 568^^SAN FRANCISCO^CA^54952-0568|^|(408)-814-9155|295-55-3593||||24020101|||C1|RIKER^WILLIAM^T^|Self|23530408|8 CORABEL LN^^NEPENTHE^CA^54904^USA^|||1|||Y|24021229||||||||||SC-231-427|||||||M|||||";
			bw.write(in);
			bw.newLine();
			
			bw.close();
			
						}

	}

	
}
