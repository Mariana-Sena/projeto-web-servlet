<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

body{
padding-top: 300px;
text-align:center;
}
h1 {
    padding-top: 0px;
    text-align: center;
    color: #000000;
}
p{
    text-align: center;
    color: #000000;
    font-size: 18px;
    
}
 a{text-decoration: none;}  
        a:link{color:blue; 
        font-size: 18px;
        font-type:bold;
        }
        a:hover{color:#CD5C5C;}
        
div {
max-width: 400px;
    margin: 0 auto;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0 4px 30px #B0E0E6;
    background-color: #FFE4E1;

}
</style>
</head>
<body>
<div>
    <%
    try {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String pais = request.getParameter("pais");
        String tel = request.getParameter("tel");

        if (nome == null || nome.isEmpty() || email == null || email.isEmpty() || pais == null || pais.isEmpty() || tel == null || tel.isEmpty()) {
            throw new Exception("Nenhum campo pode ser nulo.");
        } else {
            session.setAttribute("nome", nome);
            session.setAttribute("email", email);
            session.setAttribute("pais", pais);
            session.setAttribute("tel", tel);
            out.println("Os campos foram inseridos com sucesso.");
        }
    } catch (Exception e) {
        request.setAttribute("exception", e);
        request.getRequestDispatcher("erros.jsp").forward(request, response);
    }
%>
    %>
    <br>
        <a href="formulario.jsp">Tentar novamente</a>
    <br>
    	<a href="index.jsp">Voltar para a página inicial</a>
    	</div>
</body>
</html>