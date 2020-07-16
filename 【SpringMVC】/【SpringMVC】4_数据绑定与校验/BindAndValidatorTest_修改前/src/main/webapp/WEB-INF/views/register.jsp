<%@ page language = "java" contentType = "text/html; charset = UTF-8"
    pageEncoding = "UTF-8"%>
<!DOCTYPE html>
<!-- 由于使用了 Spring MVC 的表单标签库，因此声明 taglib 指令 -->
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<html>
    <head>
        <meta http-equiv = "Content-Type" content = "text/html; charset = UTF-8">
        <title>register page</title>
    </head>
    
	<body>
        <div id = "global">
            <!-- form 表单中的 modelAttribute = "user" 绑定了一个 JavaBean 对象 -->
            <form:form modelAttribute = "user" method = "post" action = "register">
                <fieldset>
                    <legend>register</legend>
                    <p>
                        <label>name:</label>
                        <form:input path = "username" />
                    </p>
                    <p>
                        <label>password:</label>
                        <form:password path = "password" />
                    </p>
                    <p>
                        <label>age:</label>
                        <form:input path = "age" />
                    </p>
                    <p>
                        <label>phone:</label>
                        <form:input path = "phone" />
                    </p>
                    <p>
                        <label>email:</label>
                        <form:input path = "email" />
                    </p>
                    <p id = "buttons">
                        <input id = "submit" type = "submit" value = "register"> <input
                            id = "reset" type = "reset" value = "reset">
                    </p>
                </fieldset>
            </form:form>
        </div>
    </body>
</html>