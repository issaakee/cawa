import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/AjouterFactureServlet"})
public class AjouterFactureServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            JavaDBConnect dbConnect = new JavaDBConnect();
            
            // Récupérer les valeurs saisies dans le formulaire
            String numeroFacture = request.getParameter("numero_facture");
            String dateFacture = request.getParameter("date_facture");
            String modePaiement = request.getParameter("mode_paiement");
            String refArticle = request.getParameter("ref_article");
            String quantiteVendue = request.getParameter("quantite_vendue");
            
            // Créer la requête SQL avec des paramètres
            try (Connection con = dbConnect.getConnection();
                 PreparedStatement ps1 = con.prepareStatement("INSERT INTO facture (n_facture, mode_paiement, date_facture) VALUES (?, ?, ?)");
                 PreparedStatement ps2 = con.prepareStatement("INSERT INTO ligne_facture (ref_article, n_facture, quantite_vendue) VALUES (?, ?, ?)")) {
                
                // Définir les valeurs des paramètres pour la table "facture"
                ps1.setString(1, numeroFacture);
                ps1.setString(2, modePaiement);
                ps1.setString(3, dateFacture);
                
                // Exécuter la requête pour la table "facture"
                ps1.executeUpdate();
                
                // Définir les valeurs des paramètres pour la table "ligne_facture"
                ps2.setString(1, refArticle);
                ps2.setString(2, numeroFacture);
                ps2.setString(3, quantiteVendue);
                
                // Exécuter la requête pour la table "ligne_facture"
                ps2.executeUpdate();
                
                // Ajouter le message de succès dans la page d'accueil
                String message = "La facture et la ligne de facture ont été ajoutées avec succès.";
                request.setAttribute("message", message);
                request.getRequestDispatcher("acceill.html").forward(request, response);
            }
        } catch (SQLException ex) {
            // Gérer les erreurs liées à la base de données
            PrintWriter out = response.getWriter();
            out.print("<h1>Une erreur s'est produite lors de l'ajout de la facture et de la ligne de facture.</h1>");
            ex.printStackTrace();
        } catch (Exception ex) {
            // Gérer les autres exceptions
            PrintWriter out = response.getWriter();
            out.print("<h1>Une erreur s'est produite lors de l'ajout de la facture et de la ligne de facture.</h1>");
            ex.printStackTrace();
        }
    }
}
