<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page language="java"%>
<%@ page import="java.util.ArrayList"%>
<%@page import ="java.text.SimpleDateFormat"%>

<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<%@ include file="/jsp/SetMenuInfo.jsp" %>
<% session.setAttribute("CurrentPage","dcHandloomReport.do?method=dcHandloomReport");%>
<%SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");%>
<%@page import ="java.text.DecimalFormat"%>
<%DecimalFormat decimalFormat = new DecimalFormat("#########0.0##");%>

<TABLE width="800" border="0" cellpadding="0" cellspacing="0">
	<html:errors />
	<html:form action="dcHandloomReport.do?method=dcHandloomReport" method="POST" enctype="multipart/form-data">
		<TR> 
			<TD width="20" align="right" valign="bottom"><IMG src="images/TableLeftTop.gif" width="20" height="31"></TD>
			<TD background="images/TableBackground1.gif"><IMG src="images/ReportsHeading.gif" width="121" height="25"></TD>
			<TD width="20" align="left" valign="bottom"><IMG src="images/TableRightTop.gif" width="23" height="31"></TD>
		</TR>
		<TR>
			<TD width="20" background="images/TableVerticalLeftBG.gif">&nbsp;</TD>
			<TD>
				<TABLE width="100%" border="0" align="left" cellpadding="0" cellspacing="0">
					<TR>
						<TD>
							<TABLE width="100%" border="0" cellspacing="1" cellpadding="1">
								<TR>
									<TD colspan="13"> 
										<TABLE width="100%" border="0" cellpadding="0" cellspacing="0">
											<tr>
                          <td colspan="6" class="Heading1" align="center"><u>Credit Guarantee Fund Trust for Micro and Small Enterprises&nbsp;</u></td>
                      </tr>
                      <tr> <td colspan="6">&nbsp;</td></tr>
                      
                      <TR>
												<TD width="18%" class="Heading">DC-Handloom Report Details</TD>
												<td class="Heading" width="40%">&nbsp;<bean:message key="from"/> <bean:write  name="rsForm" property="dateOfTheDocument26"/>&nbsp;<bean:message key="to"/> <bean:write  name="rsForm" property="dateOfTheDocument27"/></td>
                        <TD><IMG src="images/TriangleSubhead.gif" width="19" height="19"></TD>
											</TR>
											<TR>
												<TD colspan="3" class="Heading"><IMG src="images/Clear.gif" width="5" height="5"></TD>
											</TR>
        			</TABLE>
									</TD>

									<TR>
                  <td width="3%" align="left" valign="top" class="ColumnBackground">
                  <bean:message key="sNo"/></td><TD width="10%" align="left" valign="top" class="ColumnBackground">
								   <bean:message key="mliID" />
									</TD>
									<TD width="10%" align="left" valign="top" class="ColumnBackground">
										<bean:message key="bankName" />
									</TD>
									<TD width="10%" align="left" valign="top" class="ColumnBackground">
									 <bean:message key="zoneName" />
									</TD>
									<TD width="10%" align="left" valign="top" class="ColumnBackground">
										<bean:message key="CBbranchName" />
									</TD>
									
									<TD width="10%" align="left" valign="top" class="ColumnBackground">
									 <bean:message key="unitNameExisting" />
									</TD>
									<TD width="15%" align="left" valign="top" class="ColumnBackground">
										<bean:message key="cgpanNumber" />
									</TD>
                  <TD width="10%" align="right" valign="top" class="ColumnBackground">
										<bean:message key="approvedAmount" />
									</TD>
                                  
									<TD width="10%" align="left" valign="top" class="ColumnBackground">
										<bean:message key="status" />
									</TD>                  
									<TD width="15%" align="left" valign="top" class="ColumnBackground">
									 Handloom Flag
									</TD>
                  <TD width="15%" align="left" valign="top" class="ColumnBackground">
									 Handloom Reimbursement Flag
									</TD>
                                                                              <TD width="10%" align="left" valign="top" class="ColumnBackground">
										Weaver Credit Scheme
									</TD>
                  <TD width="10%" align="left" valign="top" class="ColumnBackground">
										<bean:message key="dateOfDisbursement" />
									</TD>
						      <TD width="20%" align="left" valign="top" class="ColumnBackground">
									 <bean:message key="cpguaranteeissuedate" />
									</TD>  
									</TR>	
	
								<%
										double amount = 0;
										double totalAmount = 0;
									%>

									<tr>
								<logic:iterate name="rsForm" id="object" property="danRaised" indexId="index">
               	<%
									     com.cgtsi.reports.GeneralReport danReport = (com.cgtsi.reports.GeneralReport)object;
							  %>
										<TR>
                      <td align="left" valign="top" class="ColumnBackground1"><%=Integer.parseInt(index+"")+1%></td>
                      <TD width="10%" align="left" valign="top" class="ColumnBackground1">						
											<%= danReport.getMemberId() %>
               			</TD>
											<TD width="10%" align="left" valign="top" class="ColumnBackground1">						
											<%=danReport.getBankName()%> 
											</TD>
											<TD width="10%" align="left" valign="top" class="ColumnBackground1">						
											<%   String zoneName =  danReport.getZoneName();
                     	if((zoneName == null)||(zoneName.equals("")))
                      {
                       %>
                       <%=""%>
                       <% } else
											{
											%>
											<%=zoneName%>
											<%
											}
                      %> 
											</TD>
											<TD width="10%" align="left" valign="top" class="ColumnBackground1">						
											
                      	<%String branchName= danReport.getName();
											if((branchName == null)||(branchName.equals("")))
											{
											%>
											<%=""%>
											<%
											}
											else
											{
											%>
											<%=branchName%>
											<%
											}
											%>
											</TD>
                      
											
											<TD width="10%" align="left" valign="top" class="ColumnBackground1">	
                      <%String unitName= danReport.getSsiName();
											if((unitName == null)||(unitName.equals("")))
											{
											%>
											<%=""%>
											<%
											}
											else
											{
											%>
											<%=unitName%>
											<%
											}
											%>
											</TD>
											<TD width="15%" align="left" valign="top" class="ColumnBackground1">						
											<%= danReport.getCgpan() %>
             				</TD>
                    
                     <TD width="10%" align="left" valign="top" class="ColumnBackground1">						
											<%=danReport.getAmount()%> 
											</TD>
                      
                  <TD width="15%" align="left" valign="top" class="ColumnBackground1">						
											<%=danReport.getStatus()%>
									</TD>
                  <TD width="15%" align="left" valign="top" class="ColumnBackground1">						
											<%=danReport.getType()%>
									</TD>   
                  <TD width="15%" align="left" valign="top" class="ColumnBackground1">						
											<%=danReport.getSubject()%>
									</TD>  
                                                                        <TD width="15%" align="left" valign="top" class="ColumnBackground1">						
											<%=danReport.getAppWeaverCreditScheme()%>
									</TD>  
                    <TD width="10%" align="left" valign="top" class="ColumnBackground1">						
											 <% java.util.Date disbursementDt=danReport.getDateOfTheDocument1();
													String disbursementDate = null;
													if(disbursementDt != null)
													{
														 disbursementDate=dateFormat.format(disbursementDt);
													}
													else
													{
														 disbursementDate = "";
													}
											%>
											<%=disbursementDate%>
			             </TD>
                   <TD width="10%" align="left" valign="top" class="ColumnBackground1">						
											 <% java.util.Date issuedDt=danReport.getDateOfTheDocument();
													String issuedDate = null;
													if(issuedDt != null)
													{
														 issuedDate=dateFormat.format(issuedDt);
													}
													else
													{
														 issuedDate = "";
													}
											%>
											<%=issuedDate%>
			             </TD>
             					</TR>
											</logic:iterate>
        			     
									</TABLE>
						</TD>
					</TR>
					<TR >
						<TD height="20" >
							&nbsp;
						</TD>
					</TR>
					<TR >
						<TD align="center" valign="baseline" >
							<DIV align="center">
								<A href="javascript:submitForm('dcHandloomInput.do?method=dcHandloomInput')">
									<IMG src="images/Back.gif" alt="Back" width="49" height="37" border="0">
                  </A>	
                  <A href="javascript:printpage()">
                  <IMG src="images/Print.gif" alt="Print" width="49" height="37" border="0">
								 </A>             
        					<!-- <IMG src="images/Print.gif" alt="Print" width="49" height="37" border="0"></A> -->
								
							</DIV>
						</TD>
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
	</html:form>
</TABLE>

