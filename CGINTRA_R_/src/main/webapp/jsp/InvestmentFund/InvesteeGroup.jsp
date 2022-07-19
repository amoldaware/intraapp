<%@ page language="java"%>
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<%@ include file="/jsp/SetMenuInfo.jsp" %>
<% 
String req = (String)session.getAttribute("modFlag");
if (req.equals("0"))
{
	session.setAttribute("CurrentPage","showInvesteeGroup.do?method=showInvesteeGroup");
}
else if (req.equals("1"))
{
	session.setAttribute("CurrentPage","showInvesteeGroup.do?method=showModInvesteeGroup");
}
%>
<% String modifiedInvGroup = "";%>
<body onload="investeeGrpOption()">
<html:form action="saveInvesteeGroup.do?method=saveInvesteeGroup" method="POST" enctype="multipart/form-data" focus="investeeGroup">

  <table width="100%" border="0" cellspacing="0" cellpadding="0">
  <html:errors />
    <tr> 
      <td width="20" align="right" valign="bottom"><img src="images/TableLeftTop.gif" width="20" height="31"></td>
      <td width="323" background="images/TableBackground1.gif"><img src="images/InvestmentManagementHeading.gif" width="169" height="25"></td>
      <td align="right" background="images/TableBackground1.gif"> </td>
      <td width="23" align="left" valign="bottom"><img src="images/TableRightTop.gif" width="23" height="31"></td>
    </tr>
  <tr> 
    <td width="20" background="images/TableVerticalLeftBG.gif">&nbsp;</td>
    <td colspan="2"><table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
	  <TD>			
			<DIV align="right">			
				<A HREF="javascript:submitForm('helpInvesteeGroupMaster.do?method=helpInvesteeGroupMaster')">
			    HELP</A>
			</DIV>
		</td>
	  </tr>
        <tr>
            <td > <table border="0" cellspacing="1" cellpadding="0">
                <tr> 
                  <td colspan="4" ><table width="100%" border="0" cellspacing="0" cellpadding="0">
                      <tr> 
                        <td width="25%" class="Heading">&nbsp;
						 <bean:message key="InvesteeGroupDetails" />
						</td>
                        <td align="left" valign="bottom"><img src="images/TriangleSubhead.gif" width="19" height="19"></td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                      </tr>
                      <tr> 
                        <td colspan="4" class="Heading"><img src="images/Clear.gif" width="5" height="5"></td>
                      </tr>
                    </table></td>
                </tr>
				<TR align="left">
					<TD align="left" valign="top" class="ColumnBackground">
						&nbsp;<font color="#FF0000" size="2">*</font><bean:message key="investeeGroup" />
					</TD>
					<TD align="left" class="TableData">
						<html:select property="investeeGroup" name="ifForm" onchange="investeeGrpOption(this),investeeGrpOptionSubmit1()">
							<html:option value="">Select</html:option>
							<html:options property="investeeGroups" name="ifForm"/>			
						</html:select>
					</TD>
					<TD align="left" class="ColumnBackground"><bean:message key="invGrpEnter" />
						<html:text property="newInvesteeGrp" size="20" alt="Enter" name="ifForm" maxlength="50"/>
					</TD>									
				</TR>
                <tr>
                  <td width="360" class="ColumnBackground" COLSPAN="2"> <div align="left">&nbsp;&nbsp;<font color="#FF0000" size="2">*</font>&nbsp;
                      <bean:message key="modInvesteeGroup" />
			 &nbsp;</div></td>
                	<td class="tableData" width="474" COLSPAN="2"> <div align="left"> 
<%--			  <%
			       org.apache.struts.validator.DynaValidatorActionForm form = (org.apache.struts.validator.DynaValidatorActionForm)session.getAttribute("ifForm");
			       String invGrp = (String)form.get("modInvesteeGroup");			       
			       if(((String)session.getAttribute("modifiedInvesteeGroup")) != null)
			       {
			            modifiedInvGroup = (String)session.getAttribute("modifiedInvesteeGroup");
			       }
			  %>
			  <%
			  if(modifiedInvGroup != null)
			  {
			  %>
			  <html:hidden property = "modifiedInvstGroup" name="ifForm" value="<%=modifiedInvGroup%>"/>
			  <%
			  }
			  %>--%>
			  <bean:define id="mVal" name="ifForm" property="modInvesteeGroup"/>
			  <%
			  String reqVal = (String)mVal;
			  if (request.getParameter("modInvesteeGroup")!=null)
			  {
				reqVal = (String)request.getParameter("modInvesteeGroup");
			  }
			  %>
			<html:text  property="modInvesteeGroup" size="20" value="<%=reqVal%>" alt="Investee Group" name="ifForm" maxlength="50"/>
			</div></td>
			<%
			modifiedInvGroup = "";
			%>
                </tr>
              </table>
      </table></td>
    <td width="23" background="images/TableVerticalRightBG.gif">&nbsp;</td>
  </tr>
  <tr> 
      <td width="20" align="right" valign="bottom"><img src="images/TableLeftBottom.gif" width="20" height="51"></td>
      <td colspan="2" valign="bottom" background="images/TableBackground3.gif"> 
        <div>
          <div align="center"><html:link href="javascript:submitForm('saveInvesteeGroup.do?method=saveInvesteeGroup')"><img src="images/Save.gif" alt="Ok" width="49" height="37" border="0"></html:link><html:link href="javascript:document.ifForm.reset()"><img src="images/Reset.gif" alt="Reset" width="49" height="37" border="0"></html:link></div>
      </div></td>
      <td width="23" align="right" valign="bottom"><img src="images/TableRightBottom.gif" width="23" height="51"></td>
  </tr>
</table>
</html:form>
</body>