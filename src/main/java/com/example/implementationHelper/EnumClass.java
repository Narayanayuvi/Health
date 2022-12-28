package com.example.implementationHelper;

import java.util.Random;

public class EnumClass 
{

	private static final Random PRNG = new Random();

	public enum AdmissionType 
	{
		A, E, L, R;

		public static AdmissionType randomAdmissionType() 
		{
			AdmissionType[] directions = values();
			return directions[PRNG.nextInt(directions.length)];
		}

}

	public enum PatientClass 
	{
		B, E, I, O, P, R;

		public static PatientClass randomPatientClass()
		{
			PatientClass[] directions = values();
			return directions[PRNG.nextInt(directions.length)];
		}
	}

	public enum MiddleName
	{
		Liam, Noah, Oliver, Elijah, Benjamin, Lucas, Henry, Mason, Ethan;

		public static MiddleName randomMiddleName() 
		{
			MiddleName[] directions = values();
			return directions[PRNG.nextInt(directions.length)];
		}
	}

	public enum FirstName 
	{
		Jacob, Logan, Jackson, Levi, Sebastian, Mateo, Jack, Owen, Theodore, Aiden;

		public static FirstName randomFirstName() 
		{
			FirstName[] directions = values();
			return directions[PRNG.nextInt(directions.length)];
		}
	}

	public enum FamilyName
	{
		SMITH, JOHNSON, WILLIAMS, BROWN, JONES, GARCIA, MILLER, DAVIS, RODRIGUEZ, MARTINEZ;

		public static FamilyName randomFirstName()
		{
			FamilyName[] directions = values();
			return directions[PRNG.nextInt(directions.length)];
		}
	}

	public enum AllergySeverity 
	{
		MI, MO, SV;

		public static AllergySeverity randomAllergySeverity()
		{
			AllergySeverity[] directions = values();
			return directions[PRNG.nextInt(directions.length)];
		}
	}

	public enum MartialStatus 
	{
		A, // Seperated
		B, // Unmarried
		C, // Common law
		D, // Divorced
		E, // Legally Separated
		G, // Living together
		I, // Interlocutory
		M, // Married
		N, // Annulled
		O, // Other
		P, // Domestic partner
		R, // Registered domestic partner
		S, // Single
		T, // Unreported
		U, // Unknown
		W; // Widowed

		public static MartialStatus randomMartialStatus()
		{
			MartialStatus[] directions = values();
			return directions[PRNG.nextInt(directions.length)];
		}
	}

	public enum Availabilty 
	
	{
		AU, DI, DO, IN, IP, LA, PA;

		public static Availabilty randomAS() 
		{
			Availabilty[] directions = values();
			return directions[PRNG.nextInt(directions.length)];
		}
	}

	public enum avail 
	{
		AV, CA, OB, UN;

		public static avail randomAS()
		{
			avail[] directions = values();
			return directions[PRNG.nextInt(directions.length)];
		}
	}

	public enum Gender 
	{
		F, M, O, U;

		public static Gender randomGender() 
		{
			Gender[] directions = values();
			return directions[PRNG.nextInt(directions.length)];
		}
	}

	public enum Religion 
	{

		ABC, // Christian: American Baptist Church
		AGN, // Agnostic
		AME, // Christian: African Methodist Episcopal Zion
		AMT, // Christian: African Methodist Episcopal
		ANG, // Christian: Anglican
		AOG, // Christian: Assembly of God
		ATH, // Atheist
		BAH, // Baha'i
		BAP, // Christian: Baptist
		BMA, // Buddhist: Mahayana
		BOT, // Buddhist: Other
		BTA, // Buddhist: Tantrayana
		BTH, // Buddhist: Theravada
		BUD, // Buddhist
		CAT, // Christian: Roman Catholic
		CFR, // Chinese Folk Religionist
		CHR, // Christian
		CHS, // Christian: Christian Science
		CMA, // Christian: Christian Missionary Alliance
		CNF, // Confucian
		COC, // Christian: Church of Christ
		COG, // Christian: Church of God
		COI, // Christian: Church of God in Christ
		COL, // Christian: Congregational
		COM, // Christian: Community
		COP, // Christian: Other Pentecostal
		COT, // Christian: Other
		CRR, // Christian: Christian Reformed
		EOT, // Christian: Eastern Orthodox
		EPI, // Christian: Episcopalian
		ERL, // Ethnic Religionist
		EVC, // Christian: Evangelical Church
		FRQ, // Christian: Friends
		FWB, // Christian: Free Will Baptist
		GRE, // Christian: Greek Orthodox
		HIN, // Hindu
		HOT, // Hindu: Other
		HSH, // Hindu: Shaivites
		HVA, // Hindu: Vaishnavites
		JAI, // Jain
		JCO, // Jewish: Conservative
		JEW, // Jewish
		JOR, // Jewish: Orthodox
		JOT, // Jewish: Other
		JRC, // Jewish: Reconstructionist
		JRF, // Jewish: Reform
		JRN, // Jewish: Renewal
		JWN, // Christian: Jehovah's Witness
		LMS, // Christian: Lutheran Missouri Synod
		LUT, // Christian: Lutheran
		MEN, // Christian: Mennonite
		MET, // Christian: Methodist
		MOM, // Christian: Latter-day Saints
		MOS, // Muslim
		MOT, // Muslim: Other
		MSH, // Muslim: Shiite
		MSU, // Muslim: Sunni
		NAM, // Native American
		NAZ, // Christian: Church of the Nazarene
		NOE, // Nonreligious
		NRL, // New Religionist
		ORT, // Christian: Orthodox
		OTH, // Other
		PEN, // Christian: Pentecostal
		PRC, // Christian: Other Protestant
		PRE, // Christian: Presbyterian
		PRO, // Christian: Protestant
		QUA, // Christian: Friends
		REC, // Christian: Reformed Church
		REO, // Christian: Reorganized Church of Jesus Christ-LDS
		SAA, // Christian: Salvation Army
		SEV, // Christian: Seventh Day Adventist
		SHN, // Shintoist
		SIK, // Sikh
		SOU, // Christian: Southern Baptist
		SPI, // Spiritist
		UCC, // Christian: United Church of Christ
		UMD, // Christian: United Methodist
		UNI, // Christian: Unitarian
		UNU, // Christian: Unitarian Universalist
		VAR, // Unknown
		WES, // Christian: Wesleyan
		WMC;// Christian: Wesleyan Methodist

		public static Religion randomReligion()
		{
			Religion[] directions = values();
			return directions[PRNG.nextInt(directions.length)];

		}

	}

	public enum Relationship 
	{
		Father, Mother, Brother, Sister, Friend, Aunt, Uncle, other;

		public static Relationship randomRelationship() {
			Relationship[] directions = values();
			return directions[PRNG.nextInt(directions.length)];

		}

	}

}
