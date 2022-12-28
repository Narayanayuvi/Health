package com.example.HL7.hl7templateGenerate;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@PropertySource("classpath:application.properties")
public class MyApplicationBean 
{
	
	 private long numberOfFilesToBeGenerated;
	 
	 private String filePath;
	 
	 private String fileNamePattern;
	 
	 private String fileExtension;
	 
	 public String getFileExtension() 
	 {
		return fileExtension;
	 }

	public void setFileExtension(String fileExtension)
	{
		this.fileExtension = fileExtension;
	}

	private String generationFileType;

	public long getNumberOfFilesToBeGenerated()
	{
		return numberOfFilesToBeGenerated;
	}

	public void setNumberOfFilesToBeGenerated(long numberOfFilesToBeGenerated) 
	{
		this.numberOfFilesToBeGenerated = numberOfFilesToBeGenerated;
	}

	public String getFilePath() 
	{
		return filePath;
	}

	public void setFilePath(String filePath) 
	{
		this.filePath = filePath;
	}

	public String getFileNamePattern()
	{
		return fileNamePattern;
	}

	public void setFileNamePattern(String fileNamePattern)
	{
		this.fileNamePattern = fileNamePattern;
	}

	

	public String getGenerationFileType() 
	{
		return generationFileType;
	}

	public void setGenerationFileType(String generationFileType) 
	{
		this.generationFileType = generationFileType;
	}

	
	 
	 

	
	 
	 
}
