//Source file: F:\\CGTSI\\Design\\DesignModel\\com\\cgtsi\\claim\\ClaimDetail.java

package com.cgtsi.claim;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;


/**
 * This class holds the values required to be displayed while approving.
 */
public class ClaimDetail implements Serializable
{
   private String mliId;
   private String mliName;
   private String borrowerId;
   private String ssiUnitName;
   private String claimRefNum;
   private double approvedAppAmt;
   private java.util.Date npaDate;
   private String npaDateStr;
   private String reasonForTurningNPA;
   private java.util.Date dtOfNPAReportedToCGTSI;
   private String dtOfNPAReportedToCGTSIStr;
   private double outstandingAmntAsOnNPADate;
   private java.util.Date dateOfIssueOfRecallNotice;
   private String dateOfIssueOfRecallNoticeStr;
   private double appliedClaimAmt;
   private String decision;
   private String comments;
   private String standardRemarks;
   private double eligibleClaimAmt = 0.0;
   private String cgclan;
   private double approvedClaimAmount;
   private boolean systemDecisionIfEligibleClaim;
  /*
   * Vector of HashMaps. Each HashMap will contain CGPAN wise information.
   */
   private Vector cgpanDetails;
   private Vector danSummary;
   private boolean hasLockInPeriodExpired;
   private java.util.Date clmApprvdDt;
   //added by sukumar@path for capturing claim submitted date on 04-08-2009
   private java.util.Date clmSubmittedDt;
   
   private double totalTCOSAmountAsOnNPA;
   private double totalWCOSAmountAsOnNPA;
   private String whichInstallemnt;
   private String totalAmtPayNow;
   private String clmStatus;
   // tcDetails is a Vector of HashMap
   private Vector tcDetails;
   private Vector wcDetails;
   private String createdModifiedBy;
   private String forwaredToUser;
 //added legalForum,legalForumName,legalSuitNumber,legalLocation,legalFilingDate and dateofReceipt  by sukumar@path on 31-08-2009 for providing the legal details
    private  String legalForum;
    private String legalForumName;
    private String legalSuitNumber;
    private  String legalLocation;
    private java.util.Date legalFilingDate;
    private java.util.Date dateofReceipt;
    
    private double asfDeductableforTC;
    private double asfDeductableforWC;
    private double tcClaimEligibleAmt;
    private double wcClaimEligibleAmt;
    private double tcFirstInstallment;
    private double wcFirstInstallment;
    private double tcApprovedAmt;
    private double wcApprovedAmt;
    private double tcOutstanding;
    private double wcOutstanding;
    private double tcrecovery;
    private double wcrecovery;
    
    private String womenOperated;
    
    private double serviceFee;
    
    private String nerFlag ="N";
   
    
    private String typeofActivity;
    
    private String schemeName;
    
    private String stateName;
    private String Handicraft;
     private String DcHandicraft;
  
    private String zoneName;
    private String branchName;
    private java.util.Date claimLodgmentDate;
    
   private double claimDecRecvdAmt;
    private double claimForwdAmt;
   
   private String claimDecRecvdflag;
   private java.util.Date claimDecRecvdDt;
    private java.util.Date claimForwardedDt;
    private java.util.Date claimRejectedDt;
    private java.util.Date claimApprovedDt;
    private String cgpan;
    private double claimApprovedAmount;
    private double claimAppliedAmt;
    private String clmDeclRecvdFlag;
    private Date clmDeclRecvdDt;
    
    private double totalGuarnteAmt;
    
    private double totgrandTotal;
    public String returnRemarks;
    
    private double totGrandClmApprovedAmt;
    
    private String returnRemark;
    private double tckkCessDed;
    private double wckkCessDed;
    


	private double tcSerTaxDed;
    private double wcSerTaxDed;
    
  

	private double tcSwbhaCessDed;
    private double wcSwbhaCessDed;
    
 
    public String getAppRemarks() {
		return appRemarks;
	}

	public void setAppRemarks(String appRemarks) {
		this.appRemarks = appRemarks;
	}

	public String getClaimRetdT() {
		return claimRetdT;
	}

	public void setClaimRetdT(String claimRetdT) {
		this.claimRetdT = claimRetdT;
	}

	private String appRemarks;
    private String claimRetdT;
    
    
    public String getReturnRemark() {
		return returnRemark;
	}

	public void setReturnRemark(String returnRemark) {
		this.returnRemark = returnRemark;
	}

	private String claimRemarks;
    
    private Date clamQryDate;
    
    private Date tempClosedDate;
    
    
    private String clmQryRefNumber;
    
    
    private Date claimReplyRecvdDate;
    
    private Date replyInwardDt;
    
    
    private String replyInwardId;
    
    
    private Date claimReturnDate;
    
    private Date claimWithDrawnDate;
    
    
    private String claimRetRemarks;
    
    private Date tempRejectedDate;
    
    private Date tempRejOrRejDt;
    
    private Date lastActionTakenDt;
    
  
private Map danSummaryReportDetails = new HashMap();

   public ClaimDetail()
   {

   }
   
   /**
   * 
   * @return womenOperated
   */
   
   
   public String getWomenOperated()
   {
    return this.womenOperated;
   }
   /**
   * 
   * @param womenOperated
   */
   
   
   public void setWomenOperated(String womenOperated)
   {
    this.womenOperated= womenOperated;
   }
   public double getTckkCessDed() {
	return tckkCessDed;
}

public void setTckkCessDed(double tckkCessDed) {
	this.tckkCessDed = tckkCessDed;
}

public double getWckkCessDed() {
	return wckkCessDed;
}

public void setWckkCessDed(double wckkCessDed) {
	this.wckkCessDed = wckkCessDed;
}

public double getTcSerTaxDed() {
	return tcSerTaxDed;
}

public void setTcSerTaxDed(double tcSerTaxDed) {
	this.tcSerTaxDed = tcSerTaxDed;
}

public double getWcSerTaxDed() {
	return wcSerTaxDed;
}

public void setWcSerTaxDed(double wcSerTaxDed) {
	this.wcSerTaxDed = wcSerTaxDed;
}

public double getTcSwbhaCessDed() {
	return tcSwbhaCessDed;
}

public void setTcSwbhaCessDed(double tcSwbhaCessDed) {
	this.tcSwbhaCessDed = tcSwbhaCessDed;
}

public double getWcSwbhaCessDed() {
	return wcSwbhaCessDed;
}

public void setWcSwbhaCessDed(double wcSwbhaCessDed) {
	this.wcSwbhaCessDed = wcSwbhaCessDed;
}

/**
   * 
   * @return tcApprovedAmt
   */
public double getTcApprovedAmt()
{
 return this.tcApprovedAmt;
}
/**
   * 
   * @param tcApprovedAmt
   */
public void setTcApprovedAmt(double tcApprovedAmt)
{
 this.tcApprovedAmt = tcApprovedAmt;
}
/**
   * 
   * @return wcApprovedAmt
   */
public double getWcApprovedAmt()
{
 return this.wcApprovedAmt;
}
/**
   * 
   * @param wcApprovedAmt
   */
public void setWcApprovedAmt(double wcApprovedAmt)
{
 this.wcApprovedAmt = wcApprovedAmt;
}
  
/**
   * 
   * @return tcOutstanding
   */
public double getTcOutstanding()
{
 return this.tcOutstanding;
}
/**
   * 
   * @param tcOutstanding
   */
public void setTcOutstanding(double tcOutstanding)
{
 this.tcOutstanding = tcOutstanding;
}
/**
   * 
   * @return wcOutstanding
   */
public double getWcOutstanding()
{
  return this.wcOutstanding;
}
/**
   * 
   * @param wcOutstanding
   */
public void setWcOutstanding(double wcOutstanding)
{
 this.wcOutstanding = wcOutstanding;
}
/**
   * 
   * @return tcrecovery
   */
public double getTcrecovery()
{
 return this.tcrecovery;
}
/**
   * 
   * @param tcrecovery
   */
public void setTcrecovery(double tcrecovery){
  this.tcrecovery = tcrecovery;
}
/**
   * 
   * @return wcrecovery
   */
public double getWcrecovery()
{
 return this.wcrecovery;
}
/**
 * @param wcrecovery
 */
public void setWcrecovery(double wcrecovery)
{
 this.wcrecovery = wcrecovery;
}
/**
   * 
   * @return tcClaimEligibleAmt
   */
public double getTcClaimEligibleAmt()
{
 return this.tcClaimEligibleAmt;
}
/**
   * 
   * @param tcClaimEligibleAmt
   */
public void setTcClaimEligibleAmt(double tcClaimEligibleAmt)
{
 this.tcClaimEligibleAmt = tcClaimEligibleAmt;
}
/**
   * 
   * @return wcClaimEligibleAmt
   */
public double getWcClaimEligibleAmt()
{
 return this.wcClaimEligibleAmt;
}
/**
   * 
   * @param wcClaimEligibleAmt
   */
public void setWcClaimEligibleAmt(double wcClaimEligibleAmt)
{
 this.wcClaimEligibleAmt = wcClaimEligibleAmt;
}

/**
   * 
   * @return tcFirstInstallment
   */
public double getTcFirstInstallment()
{
 return this.tcFirstInstallment;
}
/**
   * 
   * @param tcFirstInstallment
   */
public void setTcFirstInstallment(double tcFirstInstallment)
{
 this.tcFirstInstallment = tcFirstInstallment;
}
/**
   * 
   * @return wcFirstInstallment
   */
public double getWcFirstInstallment()
{
 return this.wcFirstInstallment;
}
/**
   * 
   * @param wcFirstInstallment
   */
public void setWcFirstInstallment(double wcFirstInstallment)
{
 this.wcFirstInstallment = wcFirstInstallment;
}
/**
   * 
   * @return asfDeductableforTC
   */
public double getAsfDeductableforTC()
{
 return this.asfDeductableforTC;
}
/**
   * 
   * @param asfDeductableforTC
   */
public void setAsfDeductableforTC(double asfDeductableforTC)
{
 this.asfDeductableforTC = asfDeductableforTC;
}
/**
   * 
   * @return asfDeductableforWC
   */
public double getAsfDeductableforWC()
{
 return this.asfDeductableforWC;
}
/**
   * 
   * @param asfDeductableforWC
   */
public void setAsfDeductableforWC(double asfDeductableforWC)
{
 this.asfDeductableforWC = asfDeductableforWC;
}
   /**
   * 
   * @return serviceFee
   */
   public double getServiceFee()
   {
    return this.serviceFee;
   }
   /**
   * 
   * @param serviceFee
   */
   public void setServiceFee(double serviceFee){
    this.serviceFee = serviceFee;
   }
/**
   * 
   * @return dateofReceipt
   */
public java.util.Date getDateofReceipt()
{
 return this.dateofReceipt;
}
/**
   * 
   * @param DateofReceipt
   */
public void setDateofReceipt(java.util.Date dateofReceipt)
{
 this.dateofReceipt = dateofReceipt;
}
   /**
   * 
   * @return legalFilingDate
   */
public java.util.Date getLegalFilingDate()
{
 return this.legalFilingDate;
}
/**
   * 
   * @param legalFilingDate
   */
public void setLegalFilingDate(java.util.Date legalFilingDate)
{
 this.legalFilingDate = legalFilingDate;
}
/**
   * 
   * @return legalLocation
   */
public String getLegalLocation()
{
 return this.legalLocation;
}
/**
   * 
   * @param legalSuitNumber
   */
public void setLegalLocation(String legalLocation)
{
 this.legalLocation = legalLocation;
}
/**
   * 
   * @return legalSuitNumber
   */
public String getLegalSuitNumber()
{
 return this.legalSuitNumber;
}
/**
   * 
   * @param legalSuitNumber
   */
public void setLegalSuitNumber(String legalSuitNumber)
{
 this.legalSuitNumber = legalSuitNumber;
}
/**
   * 
   * @return legalForumName
   */
public String getLegalForumName()
{
 return this.legalForumName;
}
/**
   * 
   * @param legalForumName
   */
public void setLegalForumName(String legalForumName)
{
 this.legalForumName = legalForumName;
}
/**
   * 
   * @return legalForum
   */
public String getLegalForum()
{
 return this.legalForum;
}
/**
   * 
   * @param legalForum
   */
public void setLegalForum(String legalForum)
{
 this.legalForum = legalForum;
}

 public Map getDanSummaryReportDetails()
	{
		return this.danSummaryReportDetails;
	}
/**
   * 
   * @param danSummaryReportDetails
   */
public void setDanSummaryReportDetails(Map danSummaryReportDetails)
	{
		this.danSummaryReportDetails = danSummaryReportDetails;
	}
/**
   * 
   * @param key
   * @return 
   */
	public Object getDanSummaryReportDetails(String key)
	{
		return this.danSummaryReportDetails.get(key);
	}
	public void setDanSummaryReportDetails(String key, Object value)
	{
		this.danSummaryReportDetails.put(key,value);
	}

   /**
    * Access method for the mliId property.
    *
    * @return   the current value of the mliId property
    */
   public String getMliId()
   {
      return mliId;
   }

   /**
    * Sets the value of the mliId property.
    *
    * @param aMliId the new value of the mliId property
    */
   public void setMliId(String aMliId)
   {
      mliId = aMliId;
   }

   public String getBorrowerId()
   {
	   return borrowerId;
   }

   public void setBorrowerId(String bid)
   {
	   borrowerId = bid;
   }

   /**
    * Access method for the claimRefNum property.
    *
    * @return   the current value of the claimRefNum property
    */
   public String getClaimRefNum()
   {
      return claimRefNum;
   }

   /**
    * Sets the value of the claimRefNum property.
    *
    * @param aClaimRefNum the new value of the claimRefNum property
    */
   public void setClaimRefNum(String aClaimRefNum)
   {
      claimRefNum = aClaimRefNum;
   }

   /**
    * Access method for the npaDate property.
    *
    * @return   the current value of the npaDate property
    */
   public java.util.Date getNpaDate()
   {
      return npaDate;
   }

   /**
    * Sets the value of the npaDate property.
    *
    * @param aNpaDate the new value of the npaDate property
    */
   public void setNpaDate(java.util.Date aNpaDate)
   {
      npaDate = aNpaDate;
   }

   /**
    * Access method for the appliedClaimAmt property.
    *
    * @return   the current value of the appliedClaimAmt property
    */
   public double getAppliedClaimAmt()
   {
      return appliedClaimAmt;
   }

   /**
    * Sets the value of the appliedClaimAmt property.
    *
    * @param aAppliedClaimAmt the new value of the appliedClaimAmt property
    */
   public void setAppliedClaimAmt(double aAppliedClaimAmt)
   {
      appliedClaimAmt = aAppliedClaimAmt;
   }

   /**
    * Access method for the decision property.
    *
    * @return   the current value of the decision property
    */
   public String getDecision()
   {
      return decision;
   }

   /**
    * Sets the value of the decision property.
    *
    * @param aDecision the new value of the decision property
    */
   public void setDecision(String aDecision)
   {
      decision = aDecision;
   }

   /**
    * Access method for the comments property.
    *
    * @return   the current value of the comments property
    */
   public String getComments()
   {
      return comments;
   }

   /**
    * Sets the value of the comments property.
    *
    * @param aReason the new value of the comments property
    */
   public void setComments(String acomments)
   {
      comments = acomments;
   }

   /**
    * Access method for the eligibleClaimAmt property.
    *
    * @return   the current value of the eligibleClaimAmt property
    */
    public double getEligibleClaimAmt()
    {
         return eligibleClaimAmt;
    }

   /**
    * Sets the value of the eligibleClaimAmt property.
    *
    * @param eligibleClaimAmt the new value of the eligibleClaimAmt property
    */
    public void setEligibleClaimAmt(double eligibleClaimAmt)
    {
         this.eligibleClaimAmt = eligibleClaimAmt;
    }

    public double getOutstandingAmntAsOnNPADate()
	{
	         return outstandingAmntAsOnNPADate;
	}

    public void setOutstandingAmntAsOnNPADate(double amount)
    {
	         outstandingAmntAsOnNPADate = amount;
    }

    public double getApplicationApprovedAmount()
    {
		return approvedAppAmt;
	}

	public void setApplicationApprovedAmount(double aapprovedAppAmt)
	{
		approvedAppAmt = aapprovedAppAmt;
	}

	public String getCGCLAN()
	{
		return cgclan;
	}

	public void setCGCLAN(String acgclan)
	{
		cgclan = acgclan;
	}

	public double getApprovedClaimAmount()
	{
		return approvedClaimAmount;
	}

	public void setApprovedClaimAmount(double amount)
	{
		approvedClaimAmount = amount;
	}

	public boolean getSystemDecision()
	{
		return this.systemDecisionIfEligibleClaim;
	}

	public void setSystemDecision(boolean flag)
	{
		this.systemDecisionIfEligibleClaim = flag;
	}

	public String getMliName()
	{
		return this.mliName;
	}

	public void setMliName(String name)
	{
		mliName = name;
	}

	public String getSsiUnitName()
	{
		return this.ssiUnitName;
	}

	public void setSsiUnitName(String name)
	{
		ssiUnitName = name;
	}

	public java.util.Date getDtOfNPAReportedToCGTSI()
	{
		return this.dtOfNPAReportedToCGTSI;
	}

	public void setDtOfNPAReportedToCGTSI(java.util.Date date)
	{
        dtOfNPAReportedToCGTSI = date;
	}

	public String getReasonForTurningNPA()
	{
		return this.reasonForTurningNPA;
	}

	public void setReasonForTurningNPA(String reason)
	{
		this.reasonForTurningNPA = reason;
	}

	public java.util.Date getDateOfIssueOfRecallNotice()
	{
		return this.dateOfIssueOfRecallNotice;
	}

	public void setDateOfIssueOfRecallNotice(java.util.Date date)
	{
		dateOfIssueOfRecallNotice = date;
	}



public Vector getDanSummary()
	{
		return this.danSummary;
	}

	public void setDanSummary(Vector dtls)
	{
          this.danSummary = dtls;
	}

	public Vector getCgpanDetails()
	{
		return this.cgpanDetails;
	}

	public void setCgpanDetails(Vector dtls)
	{
          this.cgpanDetails = dtls;
	}

	public boolean getHasLockInPeriodExpired()
	{
		return this.hasLockInPeriodExpired;
	}

	public void setHasLockInPeriodExpired(boolean flag)
	{
		this.hasLockInPeriodExpired = flag;
	}
//rajuk
	  //added by rajuk
	
	

    private String iseligact;
    private String iseligactcomm;
    private String whetcibildone;
    private String whetcibildonecomm;
    private String isrataspercgs;
    private String isrataspercgscomm;
    private String isthirdcollattaken;
    private String isthirdcollattakencomm;
    private String isnpadtasperguid;
    private String isnpadtasperguidcomm;
    private String isclmoswrtnpadt;
    private String isclmoswrtnpadtcomm;
    private String whetseriousdeficinvol;
    private String whetseriousdeficinvolcomm;
    private String whetmajordeficinvolvd;
    private String whetmajordeficinvolvdcomm;
    private String whetdeficinvolbystaff;
    private String whetdeficinvolbystaffcomm;
    private String isinternratinvestgrad;
    private String isinternratinvestgradcomm;
    private String isallrecinclmform;
    private String isallrecinclmformcomm;
    
	
	private String userid;
	private String firstname;
	private String lastname;
	private String designation;
	private String mlinameSeal;
	private String DateofClaim;
	private String place;
	
	private String  gstNo; //rajuk
	private String stateCode;
    
    public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}


    public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
    

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getMlinameSeal() {
		return mlinameSeal;
	}

	public void setMlinameSeal(String mlinameSeal) {
		this.mlinameSeal = mlinameSeal;
	}

	public String getDateofClaim() {
		return DateofClaim;
	}

	public void setDateofClaim(String dateofClaim) {
		DateofClaim = dateofClaim;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
    
    
    public String getIseligact() {
		return iseligact;
	}

	public void setIseligact(String iseligact) {
		this.iseligact = iseligact;
	}

	public String getIseligactcomm() {
		return iseligactcomm;
	}

	public void setIseligactcomm(String iseligactcomm) {
		this.iseligactcomm = iseligactcomm;
	}

	public String getWhetcibildone() {
		return whetcibildone;
	}

	public void setWhetcibildone(String whetcibildone) {
		this.whetcibildone = whetcibildone;
	}

	public String getWhetcibildonecomm() {
		return whetcibildonecomm;
	}

	public void setWhetcibildonecomm(String whetcibildonecomm) {
		this.whetcibildonecomm = whetcibildonecomm;
	}

	public String getIsrataspercgs() {
		return isrataspercgs;
	}

	public void setIsrataspercgs(String isrataspercgs) {
		this.isrataspercgs = isrataspercgs;
	}

	public String getIsrataspercgscomm() {
		return isrataspercgscomm;
	}

	public void setIsrataspercgscomm(String isrataspercgscomm) {
		this.isrataspercgscomm = isrataspercgscomm;
	}

	public String getIsthirdcollattaken() {
		return isthirdcollattaken;
	}

	public void setIsthirdcollattaken(String isthirdcollattaken) {
		this.isthirdcollattaken = isthirdcollattaken;
	}

	public String getIsthirdcollattakencomm() {
		return isthirdcollattakencomm;
	}

	public void setIsthirdcollattakencomm(String isthirdcollattakencomm) {
		this.isthirdcollattakencomm = isthirdcollattakencomm;
	}

	public String getIsnpadtasperguid() {
		return isnpadtasperguid;
	}

	public void setIsnpadtasperguid(String isnpadtasperguid) {
		this.isnpadtasperguid = isnpadtasperguid;
	}

	public String getIsnpadtasperguidcomm() {
		return isnpadtasperguidcomm;
	}

	public void setIsnpadtasperguidcomm(String isnpadtasperguidcomm) {
		this.isnpadtasperguidcomm = isnpadtasperguidcomm;
	}

	public String getIsclmoswrtnpadt() {
		return isclmoswrtnpadt;
	}

	public void setIsclmoswrtnpadt(String isclmoswrtnpadt) {
		this.isclmoswrtnpadt = isclmoswrtnpadt;
	}

	public String getIsclmoswrtnpadtcomm() {
		return isclmoswrtnpadtcomm;
	}

	public void setIsclmoswrtnpadtcomm(String isclmoswrtnpadtcomm) {
		this.isclmoswrtnpadtcomm = isclmoswrtnpadtcomm;
	}

	public String getWhetseriousdeficinvol() {
		return whetseriousdeficinvol;
	}

	public void setWhetseriousdeficinvol(String whetseriousdeficinvol) {
		this.whetseriousdeficinvol = whetseriousdeficinvol;
	}

	public String getWhetseriousdeficinvolcomm() {
		return whetseriousdeficinvolcomm;
	}

	public void setWhetseriousdeficinvolcomm(String whetseriousdeficinvolcomm) {
		this.whetseriousdeficinvolcomm = whetseriousdeficinvolcomm;
	}

	public String getWhetmajordeficinvolvd() {
		return whetmajordeficinvolvd;
	}

	public void setWhetmajordeficinvolvd(String whetmajordeficinvolvd) {
		this.whetmajordeficinvolvd = whetmajordeficinvolvd;
	}

	public String getWhetmajordeficinvolvdcomm() {
		return whetmajordeficinvolvdcomm;
	}

	public void setWhetmajordeficinvolvdcomm(String whetmajordeficinvolvdcomm) {
		this.whetmajordeficinvolvdcomm = whetmajordeficinvolvdcomm;
	}

	public String getWhetdeficinvolbystaff() {
		return whetdeficinvolbystaff;
	}

	public void setWhetdeficinvolbystaff(String whetdeficinvolbystaff) {
		this.whetdeficinvolbystaff = whetdeficinvolbystaff;
	}

	public String getWhetdeficinvolbystaffcomm() {
		return whetdeficinvolbystaffcomm;
	}

	public void setWhetdeficinvolbystaffcomm(String whetdeficinvolbystaffcomm) {
		this.whetdeficinvolbystaffcomm = whetdeficinvolbystaffcomm;
	}

	public String getIsinternratinvestgrad() {
		return isinternratinvestgrad;
	}

	public void setIsinternratinvestgrad(String isinternratinvestgrad) {
		this.isinternratinvestgrad = isinternratinvestgrad;
	}

	public String getIsinternratinvestgradcomm() {
		return isinternratinvestgradcomm;
	}

	public void setIsinternratinvestgradcomm(String isinternratinvestgradcomm) {
		this.isinternratinvestgradcomm = isinternratinvestgradcomm;
	}

	public String getIsallrecinclmform() {
		return isallrecinclmform;
	}

	public void setIsallrecinclmform(String isallrecinclmform) {
		this.isallrecinclmform = isallrecinclmform;
	}

	public String getIsallrecinclmformcomm() {
		return isallrecinclmformcomm;
	}

	public void setIsallrecinclmformcomm(String isallrecinclmformcomm) {
		this.isallrecinclmformcomm = isallrecinclmformcomm;
	}

    
    //
	
	
	
	
	
	//rajuk

/**
   * 
   * @return 
   */
public java.util.Date getClmSubmittedDt()
	{
		return this.clmSubmittedDt;
	}
/**
   * 
   * @param date
   */
	public void setClmSubmittedDt(java.util.Date date)
	{
		this.clmSubmittedDt = date;
	}


	public java.util.Date getClmApprvdDt()
	{
		return this.clmApprvdDt;
	}

	public void setClmApprvdDt(java.util.Date date)
	{
		this.clmApprvdDt = date;
	}

	public double getTotalTCOSAmountAsOnNPA()
	{
		return this.totalTCOSAmountAsOnNPA;
	}

	public void setTotalTCOSAmountAsOnNPA(double amount)
	{
		this.totalTCOSAmountAsOnNPA = amount;
	}

	public double getTotalWCOSAmountAsOnNPA()
	{
		return this.totalWCOSAmountAsOnNPA;
	}

	public void setTotalWCOSAmountAsOnNPA(double amount)
	{
		this.totalWCOSAmountAsOnNPA = amount;
	}

	public String getWhichInstallemnt()
	{
		return this.whichInstallemnt;
	}

	public void setWhichInstallemnt(String flag)
	{
		this.whichInstallemnt = flag;
	}

	public String getDateOfIssueOfRecallNoticeStr()
	{
		return this.dateOfIssueOfRecallNoticeStr;
	}

	public void setDateOfIssueOfRecallNoticeStr(String aStr)
	{
        this.dateOfIssueOfRecallNoticeStr = aStr;
	}

	public String getNpaDateStr()
	{
		return this.npaDateStr;
	}

	public void setNpaDateStr(String aStr)
	{
		this.npaDateStr = aStr;
	}

	public String getDtOfNPAReportedToCGTSIStr()
	{
		return this.dtOfNPAReportedToCGTSIStr;
	}

	public void setDtOfNPAReportedToCGTSIStr(String aStr)
	{
		this.dtOfNPAReportedToCGTSIStr = aStr;
	}

	public String getTotalAmtPayNow()
	{
		return this.totalAmtPayNow;
	}

	public void setTotalAmtPayNow(String amnt)
	{
		this.totalAmtPayNow = amnt;
	}

	public String getClmStatus()
	{
		return this.clmStatus;
	}

	public void setClmStatus(String status)
	{
		this.clmStatus = status;
	}

	public Vector getTcDetails()
	{
		return this.tcDetails;
	}

	public void setTcDetails(Vector dtl)
	{
		this.tcDetails = dtl;
	}

	public Vector getWcDetails()
	{
		return this.wcDetails;
	}

	public void setWcDetails(Vector dtl)
	{
		this.wcDetails = dtl;
	}

	public String getCreatedModifiedBy()
	{
		return this.createdModifiedBy;
	}

	public void setCreatedModifiedBy(String id)
	{
		this.createdModifiedBy = id;
	}


	public String getForwaredToUser()
	{
		return this.forwaredToUser;
	}

	public void setForwaredToUser(String id)
	{
		this.forwaredToUser = id;
	}


  public void setTypeofActivity(String typeofActivity)
  {
    this.typeofActivity = typeofActivity;
  }


  public String getTypeofActivity()
  {
    return typeofActivity;
  }


  public void setSchemeName(String schemeName)
  {
    this.schemeName = schemeName;
  }


  public String getSchemeName()
  {
    return schemeName;
  }


  public void setStandardRemarks(String standardRemarks)
  {
    this.standardRemarks = standardRemarks;
  }


  public String getStandardRemarks()
  {
    return standardRemarks;
  }


  public void setStateName(String stateName)
  {
    this.stateName = stateName;
  }


  public String getStateName()
  {
    return stateName;
  }


  public void setNerFlag(String nerFlag)
  {
    this.nerFlag = nerFlag;
  }


  public String getNerFlag()
  {
    return nerFlag;
  }

        public void setHandicraft(String handicraft) {
            this.Handicraft = handicraft;
        }

        public String getHandicraft() {
            return Handicraft;
        }

        public void setDcHandicraft(String dcHandicraft) {
            this.DcHandicraft = dcHandicraft;
        }

        public String getDcHandicraft() {
            return DcHandicraft;
        }
        
        private double asfRefundableForTC;
        private double asfRefundableForWC;
        private String refundFlag;

    public void setAsfRefundableForTC(double asfRefundableForTC) {
        this.asfRefundableForTC = asfRefundableForTC;
    }

    public double getAsfRefundableForTC() {
        return asfRefundableForTC;
    }

    public void setAsfRefundableForWC(double asfRefundableForWC) {
        this.asfRefundableForWC = asfRefundableForWC;
    }

    public double getAsfRefundableForWC() {
        return asfRefundableForWC;
    }

    public void setRefundFlag(String refundFlag) {
        this.refundFlag = refundFlag;
    }

    public String getRefundFlag() {
        return refundFlag;
    }
    
    private String recommendation;
    private String recommendationData;


    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendationData(String recommendationData) {
        this.recommendationData = recommendationData;
    }

    public String getRecommendationData() {
        return recommendationData;
    }
    private String rejectionReason;

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }
    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setClaimLodgmentDate(Date claimLodgmentDate) {
        this.claimLodgmentDate = claimLodgmentDate;
    }

    public Date getClaimLodgmentDate() {
        return claimLodgmentDate;
    }

    public void setClaimDecRecvdAmt(double claimDecRecvdAmt) {
        this.claimDecRecvdAmt = claimDecRecvdAmt;
    }

    public double getClaimDecRecvdAmt() {
        return claimDecRecvdAmt;
    }

    public void setClaimDecRecvdflag(String claimDecRecvdflag) {
        this.claimDecRecvdflag = claimDecRecvdflag;
    }

    public String getClaimDecRecvdflag() {
        return claimDecRecvdflag;
    }

    public void setClaimDecRecvdDt(Date claimDecRecvdDt) {
        this.claimDecRecvdDt = claimDecRecvdDt;
    }

    public Date getClaimDecRecvdDt() {
        return claimDecRecvdDt;
    }

    public void setClaimForwardedDt(Date claimForwardedDt) {
        this.claimForwardedDt = claimForwardedDt;
    }

    public Date getClaimForwardedDt() {
        return claimForwardedDt;
    }

    public void setClaimRemarks(String claimRemarks) {
        this.claimRemarks = claimRemarks;
    }

    public String getClaimRemarks() {
        return claimRemarks;
    }

    public void setClaimRejectedDt(Date claimRejectedDt) {
        this.claimRejectedDt = claimRejectedDt;
    }

    public Date getClaimRejectedDt() {
        return claimRejectedDt;
    }

    public void setClaimApprovedDt(Date claimApprovedDt) {
        this.claimApprovedDt = claimApprovedDt;
    }

    public Date getClaimApprovedDt() {
        return claimApprovedDt;
    }

    public void setCgpan(String cgpan) {
        this.cgpan = cgpan;
    }

    public String getCgpan() {
        return cgpan;
    }

    public void setClaimApprovedAmount(double claimApprovedAmount) {
        this.claimApprovedAmount = claimApprovedAmount;
    }

    public double getClaimApprovedAmount() {
        return claimApprovedAmount;
    }

    public void setClaimForwdAmt(double claimForwdAmt) {
        this.claimForwdAmt = claimForwdAmt;
    }

    public double getClaimForwdAmt() {
        return claimForwdAmt;
    }

    public void setClaimAppliedAmt(double claimAppliedAmt) {
        this.claimAppliedAmt = claimAppliedAmt;
    }

    public double getClaimAppliedAmt() {
        return claimAppliedAmt;
    }

    public void setClmDeclRecvdFlag(String clmDeclRecvdFlag) {
        this.clmDeclRecvdFlag = clmDeclRecvdFlag;
    }

    public String getClmDeclRecvdFlag() {
        return clmDeclRecvdFlag;
    }

    public void setClmDeclRecvdDt(Date clmDeclRecvdDt) {
        this.clmDeclRecvdDt = clmDeclRecvdDt;
    }

    public Date getClmDeclRecvdDt() {
        return clmDeclRecvdDt;
    }

    public void setClamQryDate(Date clamQryDate) {
        this.clamQryDate = clamQryDate;
    }

    public Date getClamQryDate() {
        return clamQryDate;
    }

    public void setClmQryRefNumber(String clmQryRefNumber) {
        this.clmQryRefNumber = clmQryRefNumber;
    }

    public String getClmQryRefNumber() {
        return clmQryRefNumber;
    }

    public void setReplyInwardDt(Date replyInwardDt) {
        this.replyInwardDt = replyInwardDt;
    }

    public Date getReplyInwardDt() {
        return replyInwardDt;
    }

    public void setReplyInwardId(String replyInwardId) {
        this.replyInwardId = replyInwardId;
    }

    public String getReplyInwardId() {
        return replyInwardId;
    }

    public void setClaimReturnDate(Date claimReturnDate) {
        this.claimReturnDate = claimReturnDate;
    }

    public Date getClaimReturnDate() {
        return claimReturnDate;
    }

    public void setClaimRetRemarks(String claimRetRemarks) {
        this.claimRetRemarks = claimRetRemarks;
    }

    public String getClaimRetRemarks() {
        return claimRetRemarks;
    }

    public void setTotalGuarnteAmt(double totalGuarnteAmt) {
        this.totalGuarnteAmt = totalGuarnteAmt;
    }

    public double getTotalGuarnteAmt() {
        return totalGuarnteAmt;
    }

    public void setTotgrandTotal(double totgrandTotal) {
        this.totgrandTotal = totgrandTotal;
    }

    public double getTotgrandTotal() {
        return totgrandTotal;
    }

    public void setTotGrandClmApprovedAmt(double totGrandClmApprovedAmt) {
        this.totGrandClmApprovedAmt = totGrandClmApprovedAmt;
    }

    public double getTotGrandClmApprovedAmt() {
        return totGrandClmApprovedAmt;
    }

    public void setClaimWithDrawnDate(Date claimWithDrawnDate) {
        this.claimWithDrawnDate = claimWithDrawnDate;
    }

    public Date getClaimWithDrawnDate() {
        return claimWithDrawnDate;
    }

    public void setClaimReplyRecvdDate(Date claimReplyRecvdDate) {
        this.claimReplyRecvdDate = claimReplyRecvdDate;
    }

    public Date getClaimReplyRecvdDate() {
        return claimReplyRecvdDate;
    }

    public void setTempClosedDate(Date tempClosedDate) {
        this.tempClosedDate = tempClosedDate;
    }

    public Date getTempClosedDate() {
        return tempClosedDate;
    }

    public void setTempRejectedDate(Date tempRejectedDate) {
        this.tempRejectedDate = tempRejectedDate;
    }

    public Date getTempRejectedDate() {
        return tempRejectedDate;
    }

    public void setTempRejOrRejDt(Date tempRejOrRejDt) {
        this.tempRejOrRejDt = tempRejOrRejDt;
    }

    public Date getTempRejOrRejDt() {
        return tempRejOrRejDt;
    }

    public void setLastActionTakenDt(Date lastActionTakenDt) {
        this.lastActionTakenDt = lastActionTakenDt;
    }

    public Date getLastActionTakenDt() {
        return lastActionTakenDt;
    }
    
    public void setReturnRemarks(String returnRemarks)
    {
        this.returnRemarks = returnRemarks;
    }

    public String getReturnRemarks()
    {
        return returnRemarks;
    
    }
}
