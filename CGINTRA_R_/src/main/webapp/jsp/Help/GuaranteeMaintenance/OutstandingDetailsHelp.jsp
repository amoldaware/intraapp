<%@ page language="java"%>
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>
<% session.setAttribute("CurrentPage","helpOutstandingDetails.do");%>
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
												<TD width="31%" class="Heading"><bean:message key="outstandingDetailHeaderNew" /></TD>
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
											&nbsp;Borrower ID 
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">
										This Displays the Borrower Id For which the Outstanding is present.
		  </TD>
          </tr>
          <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp;Borrower Name 
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">
										This Displays the Borrower Name For which the Outstanding is present.
		  </TD>
          </tr>

		  <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp;CGPAN Number
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">
										This Displays the CGPAN For which the Outstanding is present.
		  </TD>							
          </tr>
		  	  
		  <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp;Scheme
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">
										This Displays the Scheme under which the CGPAN is covered.
		  </TD>							
          </tr>

		  <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp;Sanctioned Amount
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">
										This Displays the Sanctioned Amount for the CGPAN.
		  </TD>							
          </tr>
		  
		  <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp;Amount
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">
										This Displays the Outstanding Principal Amount For the CGPAN. You can also enter new Outstanding amounts or modify the existing one.If the Outstanding Date is entered then Outstanding Amounts is mandatory.
		  </TD>							
          </tr>

		  <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp;Interest/Commision
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">
										This Displays the Outstanding Interest/Commision Amount For the CGPAN. You can also enter new Outstanding amounts or modify the existing one.If the Outstanding Date is entered then Outstanding Amounts is mandatory.
		  </TD>							
          </tr>

		  
		  <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp;As On Date
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">
										This Displays the Outstanding Date for the CGPAN. You can also enter the new Date for the Amount Entered or modify the existing one. If the Outstanding Amounts is entered then Outstanding date is mandatory.
		  </TD>							
          </tr>
							

		  <tr>
		  <TD width="20%" align="left" valign="top" class="ColumnBackground">
										<DIV align="left">
											&nbsp;Total Outstanding Amount
										</DIV>
									</TD>
           <TD width="27%" align="left" valign="top" class="TableData">
										This calculate and displays the total Outstanding Amount for the  CGPAN.
		  </TD>							
          </tr>
							
		
						<TR align="center" valign="baseline" >
						<td colspan="2" width="700">
						<DIV align="center">
						<A  HREF="javascript:history.back()">	
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
