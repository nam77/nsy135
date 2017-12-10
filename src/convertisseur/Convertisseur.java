package convertisseur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modeles.Temperature;

/**
 * Servlet implementation class Convertisseur
 */
@WebServlet(description = "convertisseur de temperature", urlPatterns = { "/convertisseur" })
public class Convertisseur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Convertisseur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 *Methode Get permet d'afficher le formulaire
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String maValue = "/convinput.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(maValue);
		dispatcher.forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	  /**
     * Méthode Post: on affiche la conversion
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                    throws ServletException, IOException {
            // On devrait récuperer la valeur saisie par l'utilisateur
            String valCelsius = request.getParameter("celsius");

            if (valCelsius.isEmpty()) {
                    // Pas de valeur: il faudrait afficher un message, etc.
                    valCelsius = "20";
            }

            // Action: appliquons le convertisseur. Espérons que valCelsius représente
            // bien un nombre, sinon...
            Temperature temp = new Temperature(Double.valueOf(valCelsius));
            // Enregistrons l'objet dans la requête
            request.setAttribute("temperature", temp);

            // Transfert à la vue
            String maVue = "/convoutput.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(maVue);
            dispatcher.forward(request,response);
    }

}
