<%@ page language="java"%>
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>
<%@ include file="/jsp/SetMenuInfo.jsp" %>
<% session.setAttribute("CurrentPage","showExposureInput.do?method=showExposureInput");%>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0">
	<html:errors />
	<html:form action="showExposureSummary.do?method=showExposureSummary" method="POST">
		<TR> 
			<TD width="20" align="right" valign="bottom"><IMG src="images/TableLeftTop.gif" width="20" height="31"></TD>
			<TD background="images/TableBackground1.gif"><IMG src="images/RiskManagementHeading.gif" width="121" height="25"></TD>
			<TD width="20" align="left" valign="bottom"><IMG src="images/TableRightTop.gif" width="23" height="31"></TD>
		</TR>
		<TR> 
			<TD width="20" background="images/TableVerticalLeftBG.gif">&nbsp;</TD>
			<TD>
				<TABLE width="100%" align="left" border="0" cellspacing="0" cellpadding="0">
					<TR>
						<TD>
							<TABLE width="100%" border="0" cellspacing="1" cellpadding="0">
								<TR>
									<TD align="right" colspan="4">
										<A href="showExposureHelp.do">HELP</A>
									</TD>
								</TR>
								<TR> 
									<TD colspan="4">
										<TABLE width="100%" border="0" cellspacing="0" cellpadding="0">
											<TR> 
												<TD width="25%" height="19" class="Heading">&nbsp;
													<bean:message key="exposureInputHeading" />
												</TD>
												<TD><IMG src="images/TriangleSubhead.gif" width="19" height="19"></TD>
											</TR>
											<TR> 
												<TD colspan="3" class="Heading"><IMG src="images/Clear.gif" width="5" height="5"></TD>
											</TR>
										</TABLE>
									</TD>
								</TR>
								<TR> 
									<TD width="25%" class="ColumnBackground">
										<DIV align="left"> &nbsp;
											<bean:message key="scheme" name="rmForm" />
										</DIV>
									</TD>
									<TD class="TableData" width="25%">
										<DIV align="left">
											<html:select property="scheme" name="rmForm">
												<html:option value="">Select </html:option>
												<html:options name="rmForm" property="schemeList" />
											</html:select>
						                </DIV>
									</TD>
									<TD class="ColumnBackground" width="25%" > &nbsp;
										<bean:message key="state" name="rmForm" />
									</TD>
									<TD class="TableData" width="25%">
										<html:select property="state" name="rmForm" multiple="true">
											<html:option value="ALL">All </html:option>
											<html:options name="rmForm" property="statesList" />
										</html:select>
									</TD>
								</TR>
								<TR> 
									<TD class="ColumnBackground" width="25%" > &nbsp;
										<bean:message key="mli" name="rmForm" />
									</TD>
									<TD class="TableData" width="25%">
										<html:select property="mli" name="rmForm" multiple="true">
												<html:option value="ALL">All </html:option>
												<html:options name="rmForm" property="mliList" />
										</html:select>
									</TD>
									<TD width="25%" class="ColumnBackground">
										<DIV align="left"> &nbsp;
											<bean:message key="industry" name="rmForm" />
										</DIV>
									</TD>
									<TD class="TableData" width="25%">
										<DIV align="left">
										<html:select property="industry" name="rmForm" multiple="true">
											<html:option value="ALL">All </html:option>
											<html:options name="rmForm" property="industryList" />
										</html:select>
						                </DIV>
									</TD>
									
								</TR>
								<TR> 
									<TD class="ColumnBackground" width="25%" > &nbsp;
										<bean:message key="gender" name="rmForm" />
									</TD>
									<TD class="TableData" width="25%">
										<html:select property="gender" name="rmForm" multiple="true">
											<html:option value="A">All </html:option>
											<html:option value="M">Male </html:option>
											<html:option value="F">Female </html:option>
										</html:select>
									</TD>
									<TD width="25%" class="ColumnBackground">
										<DIV align="left"> &nbsp;
											<bean:message key="socialCategory" name="rmForm" />
										</DIV>
									</TD>
									<TD class="TableData" width="25%">
										<DIV align="left">
											<html:select property="socialCategory" name="rmForm" multiple="true">
											<html:option value="ALL">All </html:option>
											<html:options name="rmForm" property="socialCategoriesList" />
										</html:select>
						                </DIV>
									</TD>
									
								</TR>
							</TABLE>
						</TD>
					</TR>
					<TR >
						<TD align="center" valign="baseline" >
							<DIV align="center">
								<A href="javascript:submitForm('showExposureSummary.do?method=showExposureSummary')">
									<IMG src="images/OK.gif" alt="OK" width="49" height="37" border="0"></A>
								<A href="javascript:document.rmForm.reset()">
									<IMG src="images/Reset.gif" alt="Cancel" width="49" height="37" border="0"></A>
								<A href="subHome.do?method=getSubMenu&menuIcon=<%=session.getAttribute("menuIcon")%>&mainMenu=<%=session.getAttribute("mainMenu")%>">
									<IMG src="images/Cancel.gif" alt="Cancel" width="49" height="37" border="0"></A>
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