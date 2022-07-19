<%@ page language="java"%>
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>
<% session.setAttribute("CurrentPage","helpDebentureDetails.do");%>
<%@ include file="/jsp/SetMenuInfo.jsp" %>

<TABLE width="725" border="0" cellpadding="0" cellspacing="0">
<html:errors />

<form>
<table width="680" border="0" cellspacing="0" cellpadding="0" align="center">
<TR> 
			<TD width="20" align="right" valign="bottom"><IMG src="images/TableLeftTop.gif" width="20" height="31"></TD>
			<TD background="images/TableBackground1.gif"></TD>
			<TD width="20" align="left" valign="bottom"><IMG src="images/TableRightTop.gif" width="23" height="31"></TD>
		</TR>
		<TR>
			<TD width="20" background="images/TableVerticalLeftBG.gif">&nbsp;</TD>
			
	
			
			<td width="713"><table width="606" border="0" cellspacing="1" cellpadding="0">
          <tr> 
            <td colspan="2" width="700"><table width="604" border="0" cellspacing="0" cellpadding="0">
									<TD width="31%" class="Heading"><bean:message key="enterDebenturesDetails" /></TD>
									<TD><IMG src="images/TriangleSubhead.gif" width="19" height="19"></TD>
											</TR>
											<TR>
												<TD colspan="3" class="Heading"><IMG src="images/Clear.gif" width="5" height="5"></TD>
											</TR>

										</TABLE>
									</TD> 

								</TR>   
          </tr>
          <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp; Investment Reference Number
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">&nbsp;
												Select investment reference number form the combo box.
		  </TD>
          </tr>
		  
		   <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp; Investee 
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">&nbsp;
												Select investee name form the combo box.
		  </TD>
          </tr>
		  
		   <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp; Maturity Type
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">&nbsp;
										Select maturity type from the combo box.
		  </TD>
          </tr>
		   <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp; Rating
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">&nbsp;
										Select rating from the combo box for the instrument.
		  </TD>
          </tr>

		  <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp; Debenture Name
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">&nbsp;
												Enter the name of the debenture.
		  </TD>
          </tr>
		  
		  <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp; Face Value
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">&nbsp;
												Enter the face value of the instrument.
		  </TD>
          </tr>
		  
		   <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp; No.Of Securities
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">&nbsp;
										Enter the number of securities for the instrument.
		  </TD>
          </tr>
		
		  <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp; Folio Number
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">&nbsp;
										Enter the folio number of the instrument.
		  </TD>
          </tr>
		
		 <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp; Certificate Number
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">&nbsp;
										Enter the certificate number of the instrument.
		  </TD>
          </tr>
		
		  <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp; Cost of Purchase
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">&nbsp;
										Enter the cost of purchase of the instrument.
		  </TD>
          </tr>
		
		  <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp; Coupon Rate
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">&nbsp;
										Enter the coupon rate.
		  </TD>
          </tr>
		
		  <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp; Tenure Type
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">&nbsp;
										Select an option for tenure type and enter the value.
		  </TD>
          </tr>
		  
		  <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp; Date of Investment
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">&nbsp;
										Enter the date of investment made.
		  </TD>
          </tr>
		
		  <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp; Maturity amount
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">&nbsp;
										Enter the maturity amount for the investment made.
		  </TD>
          </tr>
		
		  <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp; Maturity Date
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">&nbsp;
										Enter the maturity date for the investment.
		  </TD>
          </tr>
		
          <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp; Call/Put Option
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">&nbsp;
										Select an option for call/put.
		  </TD>
          </tr>
	
		  <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp; Call/Put Duration
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">&nbsp;
										Enter the value for call/put duration in months.
		  </TD>
          </tr>

		  <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp; Debenture Features
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">&nbsp;
										Enter the debenture features whether they are redeemable/non-redeemable, cumuative/non-cumulative, convertible/non-convertible.
		  </TD>
          </tr>
							<TR align="center" valign="baseline" >
						<td colspan="2" width="700">
						<DIV align="center">
						<A href="javascript:history.back()">
						<IMG src="images/Back.gif" alt="Save" width="49" height="37" border="0">
						</A>								
						</DIV>
						</TR>
				</TABLE>
			</TD>
			<TD width="20" background="images/TableVerticalRightBG.gif">
				&nbsp;
			</TD>
		</TR>
		<TR>
			<TD width="20" align="right" valign="top">
				<IMG src="images/TableLeftBottom1.gif" width="20" height="15">
			</TD>
			<TD background="images/TableBackground2.gif">
				&nbsp;
			</TD>
			<TD width="20" align="left" valign="top">
				<IMG src="images/TableRightBottom1.gif" width="23" height="15">
			</TD>
		</TR>
	</form>
</TABLE>

