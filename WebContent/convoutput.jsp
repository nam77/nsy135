 <%@ page language="java" contentType="text/html; charset=UTF-8"
      pageEncoding="UTF-8"%>

 <html>
  <head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>Résultat de la conversion</title>
 </head>
 <body>

      <p>Vous avez demandé la conversion en Fahrenheit de la valeur en
              Celsius ${requestScope.temperature.celsius}</p>
      <p>
              <b>Et le résultat est: ${requestScope.temperature.fahrenheit}
                      degrés Fahrenheit </b>!
      </p>
 </body>
</html>