<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" import="javax.*"%>
<%response.sendRedirect("/product/display/list.shtml?keyword="+URLEncoder.encode("瑜伽服","UTF-8"));%>

