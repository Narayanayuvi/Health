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
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import com.example.implementationHelper.Variables;
import com.example.implementationHelper.DateMethods;
import com.example.implementationHelper.DifferentLists;
import com.example.implementationHelper.EnumClass;
import com.example.implementationHelper.StringGenerationMethod;
import com.example.implementationHelper.EnumClass.AdmissionType;
import com.example.implementationHelper.EnumClass.FamilyName;
import com.example.implementationHelper.EnumClass.FirstName;
import com.example.implementationHelper.EnumClass.Gender;
import com.example.implementationHelper.EnumClass.MartialStatus;
import com.example.implementationHelper.EnumClass.MiddleName;
import com.example.implementationHelper.EnumClass.Religion;

public class ORU_01 {

	static DifferentLists dL = new DifferentLists();

	static Variables v = new Variables();

	public static void generateOru(String filePath, String fileNamePattern,String fileExtension,long numberOfFilesToBeGenerated) throws IOException {
		// TODO Auto-generated method stub
		Random random_method = new Random();
		dL.addList5();
		ArrayList<String> l5 = dL.getL5();
		
		v.setSetId(1);

		v.setPre("P");

		v.setTotalCount(0);

		v.setS("00000");

		v.setEmp("E");

		v.setIdnumber(100001);

		int setId = v.getSetId();

//		String pre = v.getPre();

		int totalCount = v.getTotalCount();

		String s = v.getS();

		String emp = v.getEmp();

		int Idnumber = v.getIdnumber();

		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());

		ve.init();
		VelocityContext context = new VelocityContext();
		Template t = ve.getTemplate("templates/ORU.vm");

		String s1 = StringGenerationMethod.getRandomNumberString9();
		String s2 = StringGenerationMethod.getRandomNumberString4();
		String s3 = StringGenerationMethod.getRandomNumberString7();
		String s4 = s1.substring(0, 1) + "." + s1.substring(1, 4) + "." + s1.substring(4, 6) + "." + s1.substring(6, 8)
				+ s1.substring(8) + s2 + s3.substring(0) + "." + s3.substring(1, 3) + "." + s3.substring(3, 7);
		context.put("sendingCode", s4);

		String s5 = StringGenerationMethod.getRandomNumberString9();
		String s6 = StringGenerationMethod.getRandomNumberString4();
		String s7 = StringGenerationMethod.getRandomNumberString4();
		String s8 = s5.substring(0, 1) + "." + s5.substring(1, 3) + "." + s5.substring(3, 6) + "." + s5.substring(6, 7)
				+ "." + s5.substring(7) + s6.substring(0, 4) + "." + s6.substring(0, 1) + "." + s6.substring(1, 3) + "."
				+ s6.substring(3);
		context.put("sendingCode2", s8);

		// Random random_method = new Random();
		
		for (int counter = 1; counter <= numberOfFilesToBeGenerated; counter++)

		{
			context.put("setId", setId);
			setId++;
			EnumClass.FamilyName fn1 = FamilyName.randomFirstName();
			context.put("docFamilyName", fn1);
			EnumClass.FirstName firn1 = FirstName.randomFirstName();
			context.put("docGivenname", firn1);
			EnumClass.MiddleName mn1 = MiddleName.randomMiddleName();
			context.put("docMiddleName", mn1);

			EnumClass.FamilyName PD1 = FamilyName.randomFirstName();
			context.put("PD_FN", PD1);
			EnumClass.FirstName PD2 = FirstName.randomFirstName();
			context.put("PD_FIN", PD2);
			EnumClass.MiddleName PD3 = MiddleName.randomMiddleName();
			context.put("PD_MN", PD3);

			EnumClass.FamilyName fn4 = FamilyName.randomFirstName();
			context.put("FamilyName", fn4);
			EnumClass.FirstName firn4 = FirstName.randomFirstName();
			context.put("Name", firn4);
			EnumClass.MiddleName mn4 = MiddleName.randomMiddleName();
			context.put("secondName", mn4);

			EnumClass.Gender gen = Gender.randomGender();
			context.put("gender", gen);
			EnumClass.MartialStatus ms = MartialStatus.randomMartialStatus();
			context.put("martialStatus", ms);
			EnumClass.Religion reg = Religion.randomReligion();
			context.put("Religion", reg);

			String patVisitId = StringGenerationMethod.getRandomNumberString4();
			context.put("patientId", patVisitId);

			EnumClass.AdmissionType at = AdmissionType.randomAdmissionType();
			context.put("AdmissionType", at);

			String visitNumber = StringGenerationMethod.getRandomNumberString7();
			visitNumber = s + visitNumber;
			context.put("visitNumber", visitNumber);

			context.put("IdNumber", Idnumber);
			Idnumber++;
			String doId = StringGenerationMethod.getRandomNumberString();
			context.put("docId", doId);

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

			if (hh.length() == 1) {
				hh = "0" + hh;
			}
			if (mm.length() == 1) {
				mm = "0" + mm;
			}
			if (ss.length() == 1) {
				ss = "0" + ss;
			}
			if (hh1.length() == 1) {
				hh1 = "0" + hh1;
			}
			if (mm1.length() == 1) {
				mm1 = "0" + mm1;
			}
			if (ss1.length() == 1) {
				ss1 = "0" + ss1;
			}
			if (hh2.length() == 1) {
				hh2 = "0" + hh2;
			}
			if (mm2.length() == 1) {
				mm2 = "0" + mm2;
			}
			if (ss2.length() == 1) {
				ss2 = "0" + ss2;
			}

			LocalDate dateOfBirth = DateMethods.dateGenerator();
			String s9 = dateOfBirth.toString();
			String admitDate1[] = s9.split("-", 3);
			int yy5 = Integer.parseInt(admitDate1[0]);
			int mm5 = Integer.parseInt(admitDate1[1]);
			int dd5 = Integer.parseInt(admitDate1[2]);

			LocalDate messageTime = DateMethods.dateGenerator(yy5, mm5, dd5);
			// String s21 = messageTime.toString();

			s8 = messageTime.toString();
			String messageTime1[] = s8.split("-", 3);

			int yy4 = Integer.parseInt(messageTime1[0]);
			int mm4 = Integer.parseInt(messageTime1[1]);
			int dd4 = Integer.parseInt(messageTime1[2]);

			LocalDate AdmitDate = DateMethods.dateGenerator4(yy5, mm5, dd5, yy4, mm4, dd4);
			// System.out.println(System.out.println(dd4););

			// ATBBZWCnuSwgQeqNr2vjBdXsUW8C00A86818

			String dnum1 = StringGenerationMethod.getRandomNumberString5();
			context.put("dNum", dnum1);
			String mesTime = messageTime.toString() + hh + mm + ss;

			String employeeId = emp + StringGenerationMethod.getRandomNumberString();
			context.put("employeeId", employeeId);

			mesTime = mesTime.replaceAll("[^a-zA-Z0-9]", "");
			context.put("messageTime", mesTime);

			String dateBirth = dateOfBirth.toString();
			// context.put("dateBirth2", dateBirth);

			dateBirth = dateBirth.replaceAll("[^a-zA-Z0-9]", "");
			context.put("dob", dateBirth);

			String admitTime = AdmitDate.toString() + hh + mm + ss;
			admitTime = admitTime.replaceAll("[^a-zA-Z0-9]", "");
			context.put("AdmitTime", admitTime);
			String obsTime = AdmitDate.toString() + hh1 + mm1 + ss1;
			obsTime = obsTime.replaceAll("[^a-zA-Z0-9]", "");
			context.put("observationTime", obsTime);
			context.put("obTime", obsTime);

			String resultTime = AdmitDate.toString() + hh2 + mm2 + ss2;
			resultTime = resultTime.replaceAll("[^a-zA-Z0-9]", "");
			context.put("resultTime", resultTime);
			context.put("analyTime", resultTime);
			context.put("analysisTime", resultTime);

			String expAdmit = AdmitDate.toString().replaceAll("[^a-zA-Z0-9]", "");
			String expDischarge = AdmitDate.toString().replaceAll("[^a-zA-Z0-9]", "");

			context.put("orderDate", resultTime);
//			context.put("expDischarge", expDischarge);
//			context.put("admit", admitTime);
//
//			context.put("sigDate", expDischarge);
//			context.put("illdATE", admitTime);
//			context.put("adjustCode", expDischarge);

			String placeHold = StringGenerationMethod.getRandomNumberString9();
			context.put("placeOrder", placeHold);

			EnumClass.FamilyName fn5 = FamilyName.randomFirstName();
			context.put("FamName", fn5);
			EnumClass.FirstName firn5 = FirstName.randomFirstName();
			context.put("name", firn5);
			EnumClass.MiddleName mn5 = MiddleName.randomMiddleName();
			context.put("middleName", mn5);

			String id2 = StringGenerationMethod.getRandomNumberString9() + "5";
			context.put("id", id2);

			String pd1 = StringGenerationMethod.getRandomNumberString9() + "3";
			context.put("PD_ID", pd1);

			StringWriter w = new StringWriter();

			t.merge(context, w);


			String path = filePath + fileNamePattern + counter + "." + fileExtension;
			//String path = "C:\\\\Users\\\\AnmolGoel\\\\Desktop\\\\Payloads19122022\\\\ORU\\\\" + "payLoad" + counter+"."+ "hl7";


			

				FileOutputStream fos = new FileOutputStream(path);
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
				bw.write(w.toString().trim());
				bw.newLine();
				// for obx segment
				// OBX|1|TX|$description1|1|$
				// OBX|1|NUM|Sodium Level^Sodium Level||137|mEq/L^mEq/L|136-145^136^145||||Auth (Verified)|||240212281750|||^^^WELLTOWN MEMORIAL AU480
				
				int num = StringGenerationMethod.getRandomNumber(10, 16);
				
				for(int i =1;i<=num;i++) {
					
				int des = random_method.nextInt(l5.size());
				String ans = "OBX|" + i + l5.get(des)+"^^^WELLTOWN MEMORIAL AU480";
				bw.write(ans);
				bw.newLine();		
				}
				bw.close();
				
		
		
			

		}

	}
}
