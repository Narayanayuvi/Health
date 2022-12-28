package com.example.HL7.hl7templateGenerate;

import com.example.HL7.hl7templateGenerate.MyApplicationBean;
import com.example.implementFiles.ADT;
import com.example.implementFiles.MDM_01;
import com.example.implementFiles.ORU_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class Hl7TemplateGenerateApplication  implements CommandLineRunner
{
	

@Autowired
MyApplicationBean MyAppBean;
	
	public static void main(String[] args)
	{
	  SpringApplication.run(Hl7TemplateGenerateApplication.class, args);
	  
	}

	@Override
	public void run(String... args) throws Exception
	{
		// TODO Auto-generated method stub	
		long numberOfFilesToBeGenerated = MyAppBean.getNumberOfFilesToBeGenerated(); //10
		String filePath = MyAppBean.getFilePath(); 
		String fileNamePattern = MyAppBean.getFileNamePattern();//payLoad
		String fileExtension = MyAppBean.getFileExtension();//hl7
		String GenerationFileType = MyAppBean.getGenerationFileType();//ADT
		
		
		// IMPLEMENTATION ->
		// IF RESULTtYPE = ADT or ORU OR MDM
		// a.generateAdt();
		if(GenerationFileType.equalsIgnoreCase( "ADT"))
		{
			ADT.generateAdt(filePath, fileNamePattern, fileExtension, numberOfFilesToBeGenerated);
		}
		else if(GenerationFileType.equalsIgnoreCase( "ORU")) 
		{
			ORU_01.generateOru(filePath, fileNamePattern, fileExtension, numberOfFilesToBeGenerated);
		}
		else if(GenerationFileType.equalsIgnoreCase( "MDM"))
		{
			MDM_01.generateMdm(filePath, fileNamePattern, fileExtension, numberOfFilesToBeGenerated);
		}
		else 
		{
			System.out.println("Please enter ADT or ORU or MDM in the .properties file");
		}
		
	}
	
	

}
