<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<sx:head />
</head>
<body>
	<s:form action="MoviedetailsAction" method="post">
		<s:textfield label="Movie Id" name="movieId" />
		<s:textfield label="Movie name" name="movieName" />
		<sx:datetimepicker name="movieReleaseDate" displayFormat="dd-MMM-yyyy" label="Select Date"/>
		<s:textfield label="Director" name="movieDirector" />
		<s:textfield label="Producer" name="movieProducer" />
		<s:textfield label="MOvie Type" name="movieType" />
		<s:textfield label="Music Director" name="movieMusicDirector" />
		<s:textfield label="Status" name="movieStatus" />
		<s:submit/>
	</s:form>

</body>
</html>